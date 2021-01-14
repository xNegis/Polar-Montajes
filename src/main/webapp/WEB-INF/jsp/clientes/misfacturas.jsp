<%@ page session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>


<petclinic:layout pageName="misfacturas">
	<h2>
		Mis facturas
	</h2>
	
	<c:if test="${facturas.size() == 0}">
	<h2>¡No hay facturas para tí! </h2>
	</c:if>
	
	<c:if test="${facturas.size() > 0}">

	<table id="facturasTable" class="table table-striped">
		<thead>
			<tr>
				<th>ID</th>
				<th>Fecha Emision</th>
				<th>Fecha vencimiento</th>
				<th>IVA</th>
				<th>Tipo de pago</th>
				<th>Total con iva</th>
				<th>Total sin iva</th>
				<th>Pagada</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${facturas}" var="factura">
				<tr>
					<td><c:out value="${factura.id}" /></td>
					<td><c:out value="${factura.fechaEmision}" /></td>
					<td><c:out value="${factura.fechaVencimiento}" /></td>
					<td><c:out value="${factura.iva}" /></td>
					<td><c:out value="${factura.pago}" /></td>
					<td><c:out value="${factura.precioTotalConIva}" /></td>
					<td><c:out value="${factura.precioTotalSinIva}" /></td>
					<td><c:out value="${factura.pagado}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
		</c:if>
</petclinic:layout>