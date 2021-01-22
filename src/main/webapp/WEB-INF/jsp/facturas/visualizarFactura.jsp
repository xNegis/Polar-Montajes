<%@ page session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>


<petclinic:layout pageName="facturas">
	<h2>Factura: <c:out value="${factura.id}" /> </h2>
	<table id="facturasTable" class="table table-striped">
		<thead>
			<tr>
				<th>Cliente</th>
				<th>Fecha de emisión</th>
				<th>Fecha de vencimiento</th>
				<th>Precio total sin IVA</th>
				<th>IVA</th>
				<th>Precio total con IVA</th>
			</tr>
		</thead>
		<tbody>
			
				<tr>
					<td><c:out value="${factura.cliente.dni}" /></td>
					<td><c:out value="${factura.fechaEmision}" /></td>
					<td><c:out value="${factura.fechaVencimiento}" /></td>
					<td><c:out value="${factura.precioTotalSinIva}" /></td>
					<td><c:out value="${factura.iva}" /></td>
					<td><c:out value="${factura.precioTotalConIva}" /></td>
					
					<c:if test="${factura.pagado} == false">
					<td><spring:url
							value="/facturas/pagarFactura/{facturaId}"
							var="putOnSaleUrl">
							<spring:param name="facturaId" value="${factura.id}" />
						</spring:url> <a href="${fn:escapeXml(putOnSaleUrl)}">Pagar factura</a></td>
					</c:if>
				</tr>
		</tbody>
	</table>
	
	
	<table id="lineasFacturasTable" class="table table-striped">
		<thead>
			<tr>
				<th>Unidades</th>
				<th>Descripcion</th>
				<th>Precio unitario</th>
				<th>Precio total </th>
				<th>Servicio al que corresponde </th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${lineasFactura}" var="lineaFactura">
				<tr>
					<td><c:out value="${lineaFactura.cantidad}" /></td>
					<td><c:out value="${lineaFactura.descripcion}" /></td>
					<td><c:out value="${lineaFactura.precioUnitario}" /></td>
					<td><c:out value="${lineaFactura.precioUnitario * lineaFactura.cantidad}" /></td>
					<td><c:out value="${lineaFactura.servicio.id}" /></td>
				</tr>
				</c:forEach>
		</tbody>
	</table>
</petclinic:layout>