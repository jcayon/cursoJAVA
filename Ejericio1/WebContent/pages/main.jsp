<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="es">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="description" content="">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<link rel="stylesheet" type="text/css" href="resources/css/main.css">
		<link rel="stylesheet" type="text/css" href="resources/vendor/bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="resources/vendor/bootstrap/css/bootstrap-theme.min.css">
		
	</head>
	<body> 
		<section id="todoList">
			<div class="inputBlock">
				<h1>ToDo List</h1>
				<form action="Ejercicio5Servlet" method="post" class="form-inline text-center">
					<div class="input-group clean" id="taskInput">
			        	<input type="text" name="tarea" placeholder="Write your task"  class="form-control">
	                    <span class="input-group-addon remove">
	                    	<span class="glyphicon glyphicon-remove"></span>
	                    </span>
	                </div>
			        <div class="input-group number" id="numberInput">
			        	<input type="number" name="dias" placeholder="Write days" class="form-control">
	                    <span class="input-group-addon remove">
	                    	<span class="glyphicon glyphicon-remove"></span>
	                    </span>
	                </div>
			        <div class="input-group priority" id="priorityInput">
		                <select name="prioridad" class="form-control">
		            <!--  <option selected="selected" value="${sesion.prioridaddefecto}">${sesion.nombreprioridad}</option> -->
						  <option selected="selected" value="a">Alta</option>
						  <option value="b">Media</option>
						  <option value="c">Baja</option>
						</select>
	                </div>
	                <input type="hidden" name="operacion" value="Add">
					<input class="btn btn-default" type="submit" value="Add">
				</form>
			</div>
			<div class="resultBlock">
			<!-- ********************************************************************************************* -->
			<!-- c:forEach son los bucles for en jstl -->
				<c:forEach items="${listaTareasRequest}" var="tarea">
					<form action="Ejercicio5Servlet" method="post">
						<div class="bloqueTarea bs-callout bs-callout-${tarea.prioridad}" id="bloque1"><!--id = IDTarea -->
							<div class="checkbox">
								<label for="tarea1">
									<input type="checkbox" class="tarea" id="tarea1">  ${tarea.tarea}
								</label>
							</div>
							<p class="fecha"> <fmt:formatDate value="${tarea.fechalimite}" pattern="yyyy-MM-dd" /></p>
							<input type="hidden" name="idTarea" value="${tarea.id}">
							<input type="hidden" name="operacion" value="Delete">
							<input class="btn btn-default" type="submit" value="Delete">
						</div>
					</form>
				</c:forEach> 
				<!-- ********************************************************************************************* -->
				<div class="numeroTareas text-center">
					<p> ${fn:length(listaTareasRequest)} Items</p>
				</div>
			</div>
		</section>
		<section id="listaContactos">
			<div class="inputBlock">
				<h1>Contactos:</h1>
				<form  class="form-inline text-center">
					<div class="input-group clean" id="contactInput">
			        	<input type="text" name="name" placeholder="Write the name"  class="form-control">
	                    <span class="input-group-addon remove">
	                    	<span class="glyphicon glyphicon-remove"></span>
	                    </span>
	                </div>
			        <div class="input-group clean" id="phoneInput">
			        	<input type="number" name="phone" placeholder="Write the phone number" class="form-control">
	                    <span class="input-group-addon remove">
	                    	<span class="glyphicon glyphicon-remove"></span>
	                    </span>
	                </div>
					<input class="btn btn-default" type="submit" value="Add">
				</form>
			</div>
			<div class="resultBlock">
				<div class="fichaContacto" data-id="1">
					<div class="herramientas">
						<a class="modifica" href="" data-toggle="modal" data-target="#modificaModal"><span class="glyphicon glyphicon-pencil"></span></a>
						<a class="borra" href=""><span class="glyphicon glyphicon-remove"></span></a>
					</div>
					<div class="imagen">
						<img alt="imagenContacto" src="resources/images/unknownContact.png">
					</div>
					<div class="datos">
					    <p><strong>Nombre:</strong> Filomeno García</p>
					    <p><strong>Telefono:</strong> 612345678</p>					    
					</div>
				</div>
				<div class="fichaContacto" data-id="2">
					<div class="herramientas">
						<a class="modifica" href="" data-toggle="modal" data-target="#modificaModal"><span class="glyphicon glyphicon-pencil"></span></a>
						<a class="borra" href=""><span class="glyphicon glyphicon-remove"></span></a>
					</div>
					<div class="imagen">
						<img alt="imagenContacto" src="resources/images/unknownContact.png">
					</div>
					<div class="datos">
					    <p><strong>Nombre:</strong> Eustaquio Hernandez</p>
					    <p><strong>Telefono:</strong> 612345679</p>					    
					</div>
				</div>
				<div class="fichaContacto" data-id="3">
					<div class="herramientas">
						<a class="modifica" href="" data-toggle="modal" data-target="#modificaModal"><span class="glyphicon glyphicon-pencil"></span></a>
						<a class="borra" href=""><span class="glyphicon glyphicon-remove"></span></a>
					</div>
					<div class="imagen">
						<img alt="imagenContacto" src="resources/images/unknownContact.png">
					</div>
					<div class="datos">
					    <p><strong>Nombre:</strong> Miguel Jimenez</p>
					    <p><strong>Telefono:</strong> 612345680</p>					    
					</div>
				</div>
				<div class="fichaContacto" data-id="4">
					<div class="herramientas">
						<a class="modifica" href="" data-toggle="modal" data-target="#modificaModal"><span class="glyphicon glyphicon-pencil"></span></a>
						<a class="borra" href=""><span class="glyphicon glyphicon-remove"></span></a>
					</div>
					<div class="imagen">
						<img alt="imagenContacto" src="resources/images/unknownContact.png">
					</div>
					<div class="datos">
					    <p><strong>Nombre:</strong> Filomeno García</p>
					    <p><strong>Telefono:</strong> 612345678</p>					    
					</div>
				</div>
			</div>
		</section>

		<div class="modal fade" id="modificaModal">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title">Edita el contacto:</h4>
					</div>
					<div class="modal-body">
						<form  class="form-inline text-center">
							<div class="input-group clean" id="contactInput">
					        	<input type="text" name="name" placeholder="Write the name"  class="form-control" value="Filomeno García">
			                    <span class="input-group-addon remove">
			                    	<span class="glyphicon glyphicon-remove"></span>
			                    </span>
			                </div>
					        <div class="input-group clean" id="phoneInput">
					        	<input type="number" name="phone" placeholder="Write the phone number" class="form-control" value="612345678">
			                    <span class="input-group-addon remove">
			                    	<span class="glyphicon glyphicon-remove"></span>
			                    </span>
			                </div>
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="button" class="btn btn-primary">Save changes</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<!-- /.modal -->

		<script src="resources/vendor/jquery/jquery-1.11.1.min.js"></script>
		<script src="resources/vendor/bootstrap/js/bootstrap.min.js"></script>
		<script src="resources/js/main.js"></script>
	</body>
</html>