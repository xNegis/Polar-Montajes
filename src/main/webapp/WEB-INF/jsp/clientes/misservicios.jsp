<%@ page session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>


<petclinic:layout pageName="misfacturas">
	<h2>
		Mis servicios
	</h2>
	
	<c:if test="${servicios.size() == 0}">
	<h2>¡No hay servicios asociados! :<(</h2>
	</c:if>
	
	<c:if test="${servicios.size() > 0}">

	<table id="facturasTable" class="table table-striped">
		<thead>
			<tr>
				<th>ID</th>
				<th>Tiempo Empleado</th>
				<th>Fecha Inicio</th>
				<th>Fecha Fin</th>
				<th>Tipo Servicio</th>
				<th>Cliente</th>
				<th>Trabajador</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${servicios}" var="servicio">
				<tr>
					<td><c:out value="${servicio.id}" /></td>
					<td><c:out value="${servicio.tiempoEmpleado}" /></td>
					<td><c:out value="${servicio.fechaInicio}" /></td>
					<td><c:out value="${servicio.fechaFin}" /></td>
					<td><c:out value="${servicio.tipoServicio}" /></td>
					<td><c:out value="${servicio.cliente.firstName} ${servicio.cliente.lastName}" /></td>
					<td><c:out value="${servicio.trabajador.firstName} ${servicio.trabajador.lastName}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
		</c:if>
</petclinic:layout>