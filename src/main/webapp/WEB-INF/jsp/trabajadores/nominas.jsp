<%@ page session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<petclinic:layout pageName="nóminas">
	<h2>
		Nóminas de trabajadores
	</h2>


<table id="facturasTable" class="table table-striped">
		<thead>
			<tr>
				<th>sueldoNeto</th>
				<th>sueldoBruto</th>
				<th>retenciones</th>
				<th>horasTrabajadas</th>
				<th>horasExtra</th>
				<th>precioHora</th>
				<th>precioHoraExtra</th>
				<th>mesAño</th>
				<th>Trabajador</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${nominas}" var="nomina">
				<tr>
					<td><c:out value="${nomina.sueldoNeto}" /></td>
					<td><c:out value="${nomina.sueldoBruto}" /></td>
					<td><c:out value="${nomina.retenciones}" /></td>
					<td><c:out value="${nomina.horasTrabajadas}" /></td>
					<td><c:out value="${nomina.horasExtra}" /></td>
					<td><c:out value="${nomina.precioHora}" /></td>
					<td><c:out value="${nomina.precioHoraExtra}" /></td>
					<td><c:out value="${nomina.mesAño}" /></td>
					<td><c:out value="${nomina.trabajador.firstName} ${nomina.trabajador.lastName}" /></td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
		<spring:url value="/nuevanomina" var="leagueUrl">
						</spring:url> <a  class="button" href="${fn:escapeXml(leagueUrl)}">Crear nueva nómina</a> 
</petclinic:layout>