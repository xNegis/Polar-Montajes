<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>


<petclinic:layout pageName="nuevoservicio">

     <form:form modelAttribute="servicio" class="form-horizontal" id="add-pilot-form" actions="/nuevoservicio"  > 
        <div class="form-group has-feedback">

				<div class="control-group">
                    <petclinic:selectField name="tipoServicio" label="Tipo de servicio " names="${tipos}" size="3"/>
                </div>            
                <petclinic:inputField label="DNI cliente" name="cliente.dni"/>
           
           
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">         
                        <button class="btn btn-default" type="submit">Dar de alta servicio</button>
            </div>
        </div>
     </form:form> 

</petclinic:layout>