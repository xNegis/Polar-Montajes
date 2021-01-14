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
				<th>Pedido</th>
				<th>Fecha Pedido</th>
				<th>Proveedor</th>
				<th>Precio</th>
			
				
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${pedidos}" var="pedido">
				<tr>
					<td><c:out value="${pedido.id}" /></td>
					<td><c:out value="${pedido.fecha}" /></td>
					<td><c:out value="${pedido.proveedor.nombre}" /></td>
					<td><c:out value="${pedido.precio}" /></td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
		<spring:url value="/pedidos/pedidosEligeProveedor" var="leagueUrl">
						</spring:url> <a class="button" href="${fn:escapeXml(leagueUrl)}">Crear nuevo pedido</a> 
</petclinic:layout>