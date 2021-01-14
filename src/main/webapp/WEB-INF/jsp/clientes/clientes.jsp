<%@ page session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>


<petclinic:layout pageName="clientes">
	<h2>
		Cliente
	</h2>
	<table id="clientesTable" class="table table-striped">
		<thead>
			<tr>
				<th>DNI</th>
				<th>Nombre</th>
				<th>Apellidos</th>
				<th>Teléfono</th>
				<th>Correo</th>
				<th>Dirección</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${clientes}" var="cliente">
				<tr>
					<td><c:out value="${cliente.dni}" /></td>
					<td><c:out value="${cliente.firstName}" /></td>
					<td><c:out value="${cliente.lastName}" /></td>
					<td><c:out value="${cliente.telefono}" /></td>
					<td><c:out value="${cliente.correo}" /></td>
					<td><c:out value="${cliente.direccion}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</petclinic:layout>