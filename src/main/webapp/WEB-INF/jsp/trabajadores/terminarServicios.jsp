<%@ page session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	

<petclinic:layout pageName="terminarServicios">

<form:form modelAttribute="servicio" class="form-horizontal" id="terminarServicio-form" actions="/terminarServicio"  > 
        <div class="form-group has-feedback">

            <petclinic:selectField label="Id del servicio" name="id"  names="${servicios}" size="5"/>
            <petclinic:inputField label="Horas empleadas" name="tiempoEmpleado"/>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">         
                        <button class="btn btn-default" type="submit">Finalizar Servicio</button>
            </div>
        </div>
     </form:form> 
	
</petclinic:layout>