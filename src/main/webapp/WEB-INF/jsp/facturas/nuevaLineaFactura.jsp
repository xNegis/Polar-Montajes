<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>


<petclinic:layout pageName="nuevaLineaFactura">

     <form:form modelAttribute="lineaPedido" class="form-horizontal" id="add-pilot-form" actions="/pedidos/nuevoPedido/nuevaLineaPedido/${pedidoId}"  > 
        <div class="form-group has-feedback">

            <petclinic:inputField label="cantidad" name="producto.id"/>
            <petclinic:inputField label="descripcion" name="descripcion"/>
            <petclinic:inputField label="precioUnitario" name="precio"/>
            <petclinic:inputField label="Cantidad" name="cantidad"/>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">         
                        <button class="btn btn-default" type="submit">Crear Linea pedido al pedido <c:out value="${pedidoId}"></c:out></button>
            </div>
        </div>
     </form:form> 

</petclinic:layout>