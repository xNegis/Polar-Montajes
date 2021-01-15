<%@ page session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>
    
<petclinic:layout pageName="Vacaciones">

 
	<h2>PeriodoVacaciones</h2>
	
		
		<table id="VacacionesTable" class="table table-striped">
		<thead>
			<tr>
				<th>Tipo</th>
				<th>Fecha Inicio</th>
				<th>Fecha Fin</th>
				<th>Estado</th>
					
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${periodovacaciones}" var="vacaciones">
		<tr>
					<td><c:out value="${vacaciones.vacaciones} " /></td>
					<td><c:out value="${vacaciones.fechaInicio}" /></td>
					<td><c:out value="${vacaciones.fechaFin}" /></td>
					<td><c:out value="${vacaciones.estado}" /></td>
					
						
				</tr>
				
		</c:forEach>
		</tbody>
		</table>

				
		
	   	
     
</petclinic:layout>