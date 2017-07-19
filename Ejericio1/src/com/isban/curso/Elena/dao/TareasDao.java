package com.isban.curso.Elena.dao;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.isban.curso.Elena.model.Tareas;




public class TareasDao {

	private Map< Integer, Tareas> tareas;
	
	//constructor, podemos o no inicializarlo
	

	public TareasDao() {
		tareas = new HashMap< Integer, Tareas>();
		
		tareas.put(0, new Tareas(Integer.valueOf(0),1,"Cantar",new Date(),new Date(),"Baja",true));
		tareas.put(1, new Tareas(1,1,"Bailar",new Date(),new Date(),"Baja",false));
	}
	
	
		
	public List<Tareas> getAlltareas () {
		
		List<Tareas> listaTareas = new ArrayList<Tareas>();
		
		for (Map.Entry<Integer, Tareas> entry : tareas.entrySet())
		{
			listaTareas.add(entry.getValue());				
		}

		return listaTareas;
		
	}
	
	public Tareas getTareas(Integer id){
		return tareas.get(id);
	}
	
	public Boolean setTareas(Tareas ejercicio) {
		tareas.put(ejercicio.id,ejercicio );
		return true;		
	}
	
	public List<Tareas> deleteTareas(Integer id){
		tareas.remove(id);
		return getAlltareas();
	}
	
	public String getAllEjercicios(){
		List<Tareas> listaEjercicio = getAlltareas();
		String ejercicio = "";
		
		for (Tareas e : listaEjercicio){
			ejercicio= ejercicio + e.getTarea() +" , ";
		}
		return ejercicio;
	}
	
	public String recortaTareas() {
		List<Tareas> listaEjercicio = getAlltareas();
		
		String ejercicio= "";
		
		for (Tareas e : listaEjercicio){
			if ( e.getTarea().length() >=40){
			
				ejercicio = ejercicio + " , " + e.getTarea().substring(0, 39) + "...";
						
			}else{
				ejercicio = ejercicio + " , "  +e.getTarea();
			}
		
		}
		return ejercicio;
				
	}
	
	
}
