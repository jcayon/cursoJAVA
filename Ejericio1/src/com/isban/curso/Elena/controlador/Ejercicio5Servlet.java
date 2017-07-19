package com.isban.curso.Elena.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.jdt.internal.compiler.batch.Main;

import com.isban.curso.Elena.Utils.Utils;
import com.isban.curso.Elena.dao.TareasDao;
import com.isban.curso.Elena.model.Tareas;

/**
 * Servlet implementation class Ejercicio5Servlet
 */
@WebServlet("/Ejercicio5Servlet")
public class Ejercicio5Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private TareasDao listaTareaServ; // creamos una variable listaTareas para el servlet 
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio5Servlet() {
        super();
        listaTareaServ = new TareasDao();  // como queremos que cada vez que se inicialice  la llamada contenga la lista la metemos en el constructor
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// la cockie que queremos controlar es "user".
		// como las Cookie con arrays, se guardan varias hacemos un for para recorer todas las que existan 
		//si la encontramos le damos a una variable el valor true y hacemos un break porque puede haber un monton.
		
		Cookie[] cookies = request.getCookies();
		
		boolean hayCookies = false;
		
		for(int i=0; i < cookies.length; i++) {
            Cookie thisCookies = cookies[i];
           
		if (thisCookies.getName().equals("user") ){
			
			hayCookies = true;
			
			break;
			
		} 
		}
		
		// si existen las cookies vamos a la pagina ("pages/main.jsp")
		
		if (hayCookies){
			
			HttpSession sesion = request.getSession(true);
			
		 String prioridaddesesion = (String) sesion.getAttribute("prioridad"); 
			
			if (prioridaddesesion!=(null)){
				
				prioridaddesesion = (String) sesion.getAttribute("prioridad"); 
							
			} else {
				prioridaddesesion="a";
			}
			
			request.setAttribute("prioridaddefecto", prioridaddesesion);
			
			
		 request.setAttribute("listaTareasRequest", listaTareaServ.getAlltareas()); 
		 RequestDispatcher rd=request.getRequestDispatcher("pages/main.jsp");   
		 rd.forward(request, response);  
		 
		 // el dispatcher va siempre con el forwar	
		 
		 
		// si no existen la cooky vamos a la pagina ("pages/login.html")
		 
		 // si lo pusieramos como 
		 //  RequestDispatcher rd=request.getRequestDispatcher("pages/login.html");   
		// rd.forward(request, response);  
		// me pondria el contenido de ese html en la url asociada 
		 
		//  @WebServlet("/Ejercicio5Servlet")
		 
		} else {
		 response.sendRedirect("pages/login.html");
		 // queremos redireccionar la pagina;
		 } 
		
		}
		
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
					
		String nombreTarea = request.getParameter("tarea");
		String numerodias = request.getParameter("dias");
		String prioridad = request.getParameter("prioridad");
		String operacion = request.getParameter("operacion");
		String idtarea = request.getParameter("idTarea");
		
		
		// Guardamos el ultimo valor de prioridad 
		
		HttpSession sesion = request.getSession(true);		
		
		String prioridaddefecto = (String) sesion.getAttribute("prioridad");
		request.setAttribute("prioridaddefecto", prioridaddefecto);
		
		// si usamos el boton de añadir
			
		if (operacion.equals("Add")){
		
		Tareas nuevatarea = new Tareas(listaTareaServ.getAlltareas().size(), 1, nombreTarea,
				new Date(), Utils.sumarDiasFechaDate(Integer.decode(numerodias)), Utils.MuestraPalabra(prioridad.charAt(0)), false );
		listaTareaServ.setTareas(nuevatarea);
		} 
		
		// si usamos el boton de borrar
				
		if (operacion.equals("Delete")){
		
		
		listaTareaServ.deleteTareas(Integer.decode(idtarea));
		}
			
		// sea  borrar o añadir tenemos que volver a mostrar la lista 
		// y dispachar a la pagina que queremos y (+)
		// (+) forward
		
		request.setAttribute("listaTareasRequest", listaTareaServ.getAlltareas()); 
				
		
		RequestDispatcher rd=request.getRequestDispatcher("pages/main.jsp");   
		rd.forward(request, response);  
	}

}
