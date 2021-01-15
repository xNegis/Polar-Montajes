<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<%@ page import="org.springframework.samples.petclinic.model.Estado" %>

<petclinic:layout pageName="vacas1">

<h2>PeriodoVacaciones</h2>
	
	
		
		<table id="VacacionesTable1" class="table table-striped">
		<thead>
			<tr>
				<th>Trabajador</th>
				<th>Tipo</th>
				<th>Fecha Inicio</th>
				<th>Fecha Fin</th>
				<th>Estado</th>
				<th> Acciones</th>
					
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${periodovacaciones}" var="vacaciones">
		<c:if test="${vacaciones.estado == Estado.DENEGADA}">
		<tr style="background-color:#fa6055;">
					<td><c:out value="${vacaciones.trabajador.firstName} ${vacaciones.trabajador.lastName}" /></td>
					<td><c:out value="${vacaciones.vacaciones}" /></td>
					<td><c:out value="${vacaciones.fechaInicio}" /></td>
					<td><c:out value="${vacaciones.fechaFin}" /></td>
					<td><c:out value="${vacaciones.estado}" /></td>
					<td> </td>
				</tr>
				</c:if>
				
				<c:if test="${vacaciones.estado == Estado.ACEPTADA}">
		<tr style="background-color:#77e868;">
					<td><c:out value="${vacaciones.trabajador.firstName} ${vacaciones.trabajador.lastName}" /></td>
					<td><c:out value="${vacaciones.vacaciones}" /></td>
					<td><c:out value="${vacaciones.fechaInicio}" /></td>
					<td><c:out value="${vacaciones.fechaFin}" /></td>
					<td><c:out value="${vacaciones.estado}" /></td>
					<td> </td>
					
				</tr>
				</c:if>
				
		<c:if test="${vacaciones.estado == Estado.PENDIENTE}">
		<tr style="background-color:#fffa66;" >
					<td><c:out value="${vacaciones.trabajador.firstName} ${vacaciones.trabajador.lastName}" /></td>
					<td><c:out value="${vacaciones.vacaciones}" /></td>
					<td><c:out value="${vacaciones.fechaInicio}" /></td>
					<td><c:out value="${vacaciones.fechaFin}" /></td>
					<td><c:out value="${vacaciones.estado}" /></td>
					
					<td>
						<spring:url value="/trabajador/periodoVacaciones/{periodoId}/aceptado" var="pilotUrl">
							<spring:param name="periodoId" value="${vacaciones.id}" />
						</spring:url> <a href="${fn:escapeXml(pilotUrl)}">Aceptar</a>
						
						<spring:url value="/trabajador/periodoVacaciones/{periodoId}/denegado" var="DenegarUrl">
							<spring:param name="periodoId" value="${vacaciones.id}" />
						</spring:url> <a href="${fn:escapeXml(DenegarUrl)}">Denegar</a>
						
					</td>
					
						
				</tr>
				</c:if>
				
				
		</c:forEach>
		</tbody>
		</table>

				
		
	   	

</petclinic:layout>