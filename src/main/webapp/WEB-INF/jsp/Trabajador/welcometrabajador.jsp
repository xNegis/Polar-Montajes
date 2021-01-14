<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> 

<petclinic:layout pageName="homeworker">
    <h2>¡Bienvenidos a la página de Polar Montajes!</h2>
    <sec:authorize access="hasAuthority('trabajador')">
		<h3>TUS DATOS COMO TRABAJADOR</h3>
		
		
		<p>Nombre: ${usuario.firstName} ${usuario.lastName} </p>
		<p>Telefono: ${usuario.telefono} </p>
		<p>Correo electronico: ${usuario.email} </p>
		<p>Dni: ${usuario.dni} </p>
		<p>Dirección: ${usuario.direccion} </p>
		
	</sec:authorize>
	
	 <sec:authorize access="hasAuthority('gerente')">
		<h3>TUS DATOS COMO TRABAJADOR</h3>
		
		
		<p>Nombre: ${usuario.firstName} ${usuario.lastName} </p>
		<p>Telefono: ${usuario.telefono} </p>
		<p>Correo electronico: ${usuario.email} </p>
		<p>Dni: ${usuario.dni} </p>
		<p>Dirección: ${usuario.direccion} </p>
		
	</sec:authorize>
    <div class="row">
       
    </div>
</petclinic:layout>
