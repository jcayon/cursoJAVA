package com.isban.curso.Elena.dao;

import java.util.*;

import com.isban.curso.Elena.model.Usuario;

public class UsuarioDao {

	
	// para crear un mapa ponemos MAP<valor asociado, Objeto> nombreObjetomapa
	// no se puede instanciar una clase abstracta que son las genericas por ello intanciaremos una "especial"
	
	private Map< Integer, Usuario> usuarios;
		
	//constructor, podemos o no inicializarlo
	
	public UsuarioDao() {
		usuarios = new HashMap< Integer, Usuario>();
		usuarios.put(0, new Usuario(0, "Elena", "xxxxxx" ));
		usuarios.put(1, new Usuario(1, "Angela", "yyyyy" ));
	}
	
	// con get obtenemos datos de una lista y con put los introduciomos
	// solo funciona bien si la clave del mapa esta ordenado de manera  1, 2, 3, ....
	
	public List<Usuario> getAllUsuarios() {
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		for (int i = 0; i < usuarios.size(); i++) {
			listaUsuario.add(usuarios.get(i));
		}
		return listaUsuario;
	}
	
	//los pares clave valor de un mapa son Entry
	//polimorfismo ejemplo 
	//funciona bien indepenmdientemente de que la key del mapa no sea consecutiva ejemplo: 1,2,5,6...
	
	public List<Usuario> getAllUsuarios(boolean tick) {
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		
		//usuarios.entrySet() devuelve el par clave y valor
		//usuarios.Value() devuelve el segundo atributo
		//usuarios.keySet() devuelve la clave
		
			for (Map.Entry<Integer, Usuario> entry : usuarios.entrySet())
				{
				listaUsuario.add(entry.getValue());				
				}
	return listaUsuario;
	
	}
	
	// lista solo de los nombres que son contenidos en el mapa usuarios.
		 	
	public String getAllNombres(){
		List<Usuario> listaNombres = getAllUsuarios(true);
		String nombre = "";
		
		for (Usuario u : listaNombres){
			nombre= nombre+u.getNombre()+" , ";
		}
		return nombre;
	}
		
		
	public Usuario getUsuario(Integer id) {
		return usuarios.get(id);
	}
		
	public Boolean setUsuario(Usuario cliente) {
		usuarios.put(cliente.getId(), cliente);
		return true;
	}


	
	
	
	// excepciones se heredan de la clase exception ( Try / catch ... finally ( se ejecuta siempre vaya por try o catch)) 
	
	//ejemplo para introducir el formato en el punto 4.6.3
	
	
	
}
