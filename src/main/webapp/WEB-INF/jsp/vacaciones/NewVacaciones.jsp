<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="vacas">


	<h3> Solicitar Periodo Vacaciones Nuevo</h3>
		
		  
		
		 	<form:form modelAttribute="team" class="form-horizontal" id="add-pilot-form" actions="/leagues/{leagueId}/teams/new" > 
        <div class="form-group has-feedback">
        	<input type="hidden" name="trabajador" value="${trabajadorId}"/>
            <petclinic:inputField label="fechaInicio" name="fechaInicio" />
			 <petclinic:inputField  label="fechaInicio" name="fechaFin"/>

     <div class="control-group"> 
				<petclinic:selectField name="vacaciones" label="Vacaciones" names="${listaVacaciones}" size="4" />
			</div>
	                        <button class="btn btn-default" type="submit">Add Teams</button>

        </div>
     </form:form>   

</petclinic:layout>