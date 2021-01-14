<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> 

<petclinic:layout pageName="homeclient">
    <h2>¡Bienvenidos a la página de Polar Montajes!</h2>
    <sec:authorize access="hasAuthority('cliente')">
		<h3>TUS DATOS COMO CLIENTE</h3>
		
		
		<p>Nombre: ${usuario.firstName} ${usuario.lastName} </p>
		<p>Telefono: ${usuario.telefono} </p>
		<p>Correo electronico: ${usuario.correo} </p>
		<p>Dni: ${usuario.dni} </p>
		<p>Dirección: ${usuario.direccion} </p>
		
	</sec:authorize>
    <div class="row">
       
    </div>
</petclinic:layout>
