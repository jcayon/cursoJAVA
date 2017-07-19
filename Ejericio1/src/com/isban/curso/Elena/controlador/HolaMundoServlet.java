package com.isban.curso.Elena.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HolaMundoServlet") 
public class HolaMundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HolaMundoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

//Ejemplo 1:
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter salida = response.getWriter();
//		salida.println("Hola Mundo!1");
  		    	   
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); // indica que mi response.mandara un tipo de contexto Html
		 PrintWriter salida = response.getWriter();
		 salida.println(GeneradorHTML.generar());
	  		    	   
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}



//HTTPServlet class
//doGet(), for HTTP GET requests
//doPost(), for HTTP POST requests
//doPut(), for HTTP PUT requests
//doDelete(), for HTTP DELETE requests


//request	es el objeto con la información recibida desde el browser
//response	es el objeto que contendrá la información que enviaremos como respuesta al browser
//out	es un objeto Writer que podemos utilizar para enviar Html (o cualquier clase de contenido) al browser
//session	este objeto mantiene datos entre llamadas del mismo usuario.
//application	este objeto mantiene datos durante toda la vida de la aplicación
