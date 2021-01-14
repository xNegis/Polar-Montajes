<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>


<petclinic:layout pageName="nuevanomina">

     <form:form modelAttribute="nomina" class="form-horizontal" id="add-pilot-form" actions="/nuevanomina"  > 
        <div class="form-group has-feedback">

            <petclinic:inputField label="Dni trabajador" name="trabajador.dni"/>
            <petclinic:inputField label="Horas Trabajadas" name="horasTrabajadas"/>
            <petclinic:inputField label="Horas Extras" name="horasExtra"/>
            <petclinic:inputField label="Precio Hora" name="precioHora"/>
            <petclinic:inputField label="Precio Hora Extra" name="precioHoraExtra"/>
            <petclinic:inputField label="Retenciones" name="retenciones"/>
           
           
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">         
                        <button class="btn btn-default" type="submit">Crear trabajador</button>
            </div>
        </div>
     </form:form> 

</petclinic:layout>