<%@ page session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<petclinic:layout pageName="misfacturas">
	<h2>
		Lista trabajadores
	</h2>


	<table id="facturasTable" class="table table-striped">
		<thead>
			<tr>
				<th>DNI</th>
				<th>Nombre</th>
				<th>Apellidos</th>
				<th>Direccion</th>
				<th>Telefono</th>
				<th>Correo</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${trabajadores}" var="trabajador">
				<tr>
					<td><c:out value="${trabajador.dni}" /></td>
					<td><c:out value="${trabajador.firstName}" /></td>
					<td><c:out value="${trabajador.lastName}" /></td>
					<td><c:out value="${trabajador.direccion}" /></td>
					<td><c:out value="${trabajador.telefono}" /></td>
					<td><c:out value="${trabajador.email}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
		<spring:url value="/trabajadores/nuevoTrabajador" var="leagueUrl">
						</spring:url> <a class="button" href="${fn:escapeXml(leagueUrl)}">Crear nuevo trabajador</a> 
</petclinic:layout>