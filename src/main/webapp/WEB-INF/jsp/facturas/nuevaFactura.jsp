<%@ page session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<petclinic:layout pageName="misfacturas">
	<h2>Lineas de la factura</h2>


	<table id="facturasTable" class="table table-striped">
		<thead>
			<tr>
				<th>Cantidad</th>
				<th>Descripcion</th>
				<th>Precio Unitario</th>
				<th>Precio Total</th>
				<th>Servicio al que corresponde</th>


			</tr>
		</thead>
		<tbody>
			<c:forEach items="${lf}" var="l">
				<tr>
					<td><c:out value="${l.cantidad}" /></td>
					<td><c:out value="${l.descripcion}" /></td>
					<td><c:out value="${l.precioUnitario}" /></td>
					<td><c:out value="${l.precioUnitario * l.cantidad}" /></td>
					<td><c:out value="${l.servicio.id}" /></td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
	<spring:url value="/facturas/nuevaLineaFactura/{facturaId}" var="leagueUrl">
	<spring:param name="facturaID" value="${facturaId}" />
	</spring:url>
	<a class="button" href="${fn:escapeXml(leagueUrl)}">Crear nueva
		linea factura</a>
	<spring:url value="/factura/nuevaLineaFactura" var="leagueUrl">
	</spring:url>
	<a class="button" href="${fn:escapeXml(leagueUrl)}">Terminar factura</a>


</petclinic:layout>