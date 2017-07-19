<%@page contentType="text/html; charset=utf-8" import="com.isban.curso.Elena.Utils.Utils"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Utils Letra = new Utils();
%>
<h1> Ejercicio 1a: </h1>
<p> Opcion a :  <%=Letra.MuestraPalabra('a')%></p>
<p> Opcion b:  <%=Letra.MuestraPalabra('b')%></p>
<p> Opcion c:  <%=Letra.MuestraPalabra('c')%></p>


<%
Utils Telefono = new Utils();
%>
<h1> Ejercicio 1b: </h1>
<p> Telefono Movil, 1232 : <%=Telefono.ValidarTelefono("1232","Movil")%></p>
<p> Telefono Movil 123456789 : <%=Telefono.ValidarTelefono("123456789","Movil")%></p>
<p> Telefono Fijo 923456789 : <%=Telefono.ValidarTelefono("923456789","Fijo")%></p>
<p> Telefono Fijo 800456789 : <%=Telefono.ValidarTelefono("800456789","Fijo")%></p>
<p> Telefono Fijo 808456789: <%=Telefono.ValidarTelefono("808456789","Fijo")%></p>
<p> Telefono Movil 608456789 : <%=Telefono.ValidarTelefono("608456789","Movil")%></p>
<p> Telefono Movil 708456789: <%=Telefono.ValidarTelefono("708456789","Movil")%></p>
<p> Telefono Movil 908456789: <%=Telefono.ValidarTelefono("908456789","Movil")%></p>


<h1> Fecha de hoy mas 5 dias  </h1>
<%
Utils cita = new Utils();
%>
<p> Cita del medico: <%=cita.sumarDiasFecha(5)%></p>
</body>
</html>


