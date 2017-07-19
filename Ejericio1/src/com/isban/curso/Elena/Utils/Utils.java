package com.isban.curso.Elena.Utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.isban.curso.Elena.excepcion.ExcepcionFormato;




	 
public class Utils {	
	

	//declaro las variables que voy a usar de caracter publico 
	//swicht no podemos usar String pero si con cualquier numero y char
	
	//el equal es para objetos de la misma clase. 
	// si es char podemos tenemos que poner ==
	//mejor poner primero string y luego la variable para evitar el caso del null
	
	
public static String MuestraPalabra (char  Letra){
	 String Palabra = "";
	 String Mensaje="La opcion no es correcta";
		try{	
	switch (Letra) {
			case 'a' :
				 Palabra="Alta";break;
			case 'b' :
				 Palabra="Media"; break;	
			case 'c' :
				 Palabra="Baja"; break;
			 
		default:
			throw new ExcepcionFormato(Mensaje);
		}
	} catch (ExcepcionFormato  exc){
		
	}
	return Palabra;	
}

public static boolean  ValidarTelefono (String Telefono, String TipoTelefono) throws ExcepcionFormato  {
	 String Mensaje="La opcion no es correcta";
	
	// La longitud de ambos vale 9
	// la comprobacion se puede realizar directamente en el return
	
	
    String Prefijo=Telefono.substring(0,1);
	
	
					
	if ( "Movil".equals(TipoTelefono) && Telefono.length()== (9)) {	 			
				
				if ("6".equals(Prefijo) || "7".equals(Prefijo)) {
					return true;
				}
				
		
	} else if	( "Fijo".equals(TipoTelefono) && Telefono.length() ==(9) )  {	
			
			if ("9".equals(Prefijo) || ("8".equals(Prefijo) && !(Telefono.substring(0, 2).equals("80") && !Telefono.substring(0, 3).equals("800")))) {
					return true;
				}
		
			
	}

	throw new ExcepcionFormato(Mensaje);
} 



public String sumarDiasFecha(Integer dia){
	Calendar fechafutura = new GregorianCalendar();
	SimpleDateFormat ftime = new SimpleDateFormat("dd-MM-yyyy");
	fechafutura.add(Calendar.DATE, dia);
	String fecha = ftime.format(fechafutura.getTime());
	return fecha;
	
}

public static Date sumarDiasFechaDate(Integer dia){
	Calendar fechafutura = new GregorianCalendar();
	fechafutura.add(Calendar.DATE, dia);
	Date fecha = fechafutura.getTime();
	return fecha;
	
}


}


// ejercicio del cuadrado:
// definimos una variable integer es objeto un int no lo es (mejor usar integer)
//ejercicios de los primos : Concatenar los numeros que van saliendo en un array.


// excepciones son clases que contienen posibles errores que tenga tu programa




			

