<%@ page session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>


<petclinic:layout pageName="facturas">
	<h2>Facturas</h2>
	<table id="facturasTable" class="table table-striped">
		<thead>
			<tr>
				<th>Cliente</th>
				<th>Fecha de emisión</th>
				<th>Fecha de vencimiento</th>
				<th>Precio total sin IVA</th>
				<th>IVA</th>
				<th>Precio total con IVA</th>
				<th>Pagada</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${facturas}" var="factura">
				<tr>
					<td><c:out value="${factura.cliente.dni}" /></td>
					<td><c:out value="${factura.fechaEmision}" /></td>
					<td><c:out value="${factura.fechaVencimiento}" /></td>
					<td><c:out value="${factura.precioTotalSinIva}" /></td>
					<td><c:out value="${factura.iva}" /></td>
					<td><c:out value="${factura.precioTotalConIva}" /></td>
					<td><c:out value="${factura.pagado}" /></td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</petclinic:layout>