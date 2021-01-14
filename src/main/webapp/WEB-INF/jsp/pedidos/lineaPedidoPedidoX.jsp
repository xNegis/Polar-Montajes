<%@ page session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<petclinic:layout pageName="misfacturas">
	<h2>
		Lineas del pedido 
	</h2>


	<table id="facturasTable" class="table table-striped">
		<thead>
			<tr>
				<th>Producto</th>
				<th>Descripcion</th>
				<th>Cantidad</th>
				<th>Precio Unitario</th>
				<th>Precio Total</th>
			
				
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${pedidos}" var="pedido">
				<tr>
					<td><c:out value="${pedido.producto.name}" /></td>
					<td><c:out value="${pedido.descripcion}" /></td>
					<td><c:out value="${pedido.cantidad}" /></td>
					<td><c:out value="${pedido.producto.precio}" /></td>
					<td><c:out value="${pedido.producto.precio*pedido.cantidad}" /></td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
		<spring:url value="/trabajadores/nuevoTrabajador" var="leagueUrl">
						</spring:url> <a class="button" href="${fn:escapeXml(leagueUrl)}">Crear nuevo pedido</a> 
</petclinic:layout>