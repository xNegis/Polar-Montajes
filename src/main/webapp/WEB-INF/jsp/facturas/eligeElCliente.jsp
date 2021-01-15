<%@ page session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<petclinic:layout pageName="facturas">

<form:form modelAttribute="cliente" class="form-horizontal" id="add-cliente-form" method="post" actions="/creacionFactura"  > 
        <div class="form-group has-feedback">
            <petclinic:inputField label="DNI del cliente" name="dni"/>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">         
                        <button class="btn btn-default" type="submit">Comenzar creación de la factura</button>
            </div>
        </div>
     </form:form> 





</petclinic:layout>
