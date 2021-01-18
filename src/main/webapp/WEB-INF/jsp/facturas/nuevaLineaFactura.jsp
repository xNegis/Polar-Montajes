<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>


<petclinic:layout pageName="nuevaLineaFactura">

     <form:form modelAttribute="lineaFactura" class="form-horizontal" id="add-lineaFactura-form" actions="/factura/nuevaLineaFactura/${facturaId}"  > 
        <div class="form-group has-feedback">

            <petclinic:inputField label="cantidad" name="Cantidad"/>
            <petclinic:inputField label="descripcion" name="Descripcion"/>
            <petclinic:inputField label="precioUnitario" name="precioUnitario"/>
            <petclinic:inputField label="servicio" name="Servicio"/>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">         
                        <button class="btn btn-default" type="submit">Crear Linea Factura a la factura <c:out value="${facturaId}"></c:out></button>
            </div>
        </div>
     </form:form> 

</petclinic:layout>