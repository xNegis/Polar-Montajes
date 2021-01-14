<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>


<petclinic:layout pageName="leagues">

     <form:form modelAttribute="trabajador" class="form-horizontal" id="add-pilot-form" actions="/trabajadores/nuevoTrabajador"  > 
        <div class="form-group has-feedback">

            <petclinic:inputField label="Dni trabajador" name="dni"/>
            <petclinic:inputField label="Nombre" name="firstName"/>
            <petclinic:inputField label="Apellidos" name="lastName"/>
            <petclinic:inputField label="Correo" name="email"/>
            <petclinic:inputField label="Direccion" name="direccion"/>
            <petclinic:inputField label="Telefono" name="telefono"/>
           
           
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">         
                        <button class="btn btn-default" type="submit">Crear trabajador</button>
            </div>
        </div>
     </form:form> 

</petclinic:layout>