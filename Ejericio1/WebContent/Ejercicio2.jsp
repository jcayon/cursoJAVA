<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.isban.curso.Elena.dao.*, com.isban.curso.Elena.model.*, java.util.Date;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
TareasDao ejercicio = new TareasDao();
UsuarioDao cliente = new UsuarioDao();
%>
<h1> Muestra Lista de usuarios  </h1>
<p> Mostramos todos los usuarios en una lista Met(1):   <%=cliente.getAllUsuarios()%></p>
<p> Mostramos todos los usuarios en una lista Met(2):   <%=cliente.getAllUsuarios(true)%></p>
<p>  <p>
<p> Obtener el primer usuario:  <%=cliente.getUsuario(0)%></p>
<p> ¿Se ha introducido correctamente el usuario nuevo? <%=cliente.setUsuario(new Usuario(3,"Fran","zzzz"))%></p>
<p> Mostramos todos los usuarios de la lista actualizada Met(1):   <%=cliente.getAllUsuarios()%></p>
<p> Mostramos todos los usuarios en una lista actualizada Met(2):   <%=cliente.getAllUsuarios(true)%></p>
<p> Mostramos todos los usuarios en una lista de nombre:   <%=cliente.getAllNombres()%></p>
<p>  <p>
<p>  <p>
<p>  <p>
<h1> Muestra Lista de tareas </h1>
<p> Mostramos todos las tareas en una lista:   <%=ejercicio.getAlltareas ()%></p>
<p> Obtener la primera tarea:  <%=ejercicio.getTareas(0)%></p>
<p> ¿Se ha introducido correctamente la tarea nueva?: <%=ejercicio.setTareas(new Tareas(3,33,"recitar",new Date(),new Date(),"MAx", true))%></p>
<p> Mostramos  la nueva lista de tareas:   <%=ejercicio.getAlltareas ()%></p>
<p> Mostramos todos los usuarios en una lista de nombre:   <%=ejercicio.getAllEjercicios()%></p>
</body>
</html>