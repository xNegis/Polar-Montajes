<%@ page session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<petclinic:layout pageName="facturas">
	<form:form method="POST" 
          action="/spring-mvc-xml/addEmployee" modelAttribute="factura">
             <table>
<!--                 <tr> -->
<%--                     <td><form:label path="precioTotalSinIva">precioTotalSinIva</form:label></td> --%>
<%--                     <td><form:input path="precioTotalSinIva"/></td> --%>
<!--                 </tr> -->
<!--                 <tr> -->
<%--                     <td><form:label path="iva">iva</form:label></td> --%>
<%--                     <td><form:input path="iva"/></td> --%>
<!--                 </tr> -->
<!--                 <tr> -->
<%--                     <td><form:label path="precioTotalConIva"> --%>
<%--                       precioTotalConIva</form:label></td> --%>
<%--                     <td><form:input path="precioTotalConIva"/></td> --%>
<!--                 </tr> -->
<!--                  <tr> -->
<%--                     <td><form:label path="pago"> --%>
<%--                       pago</form:label></td> --%>
<%--                     <td><form:input path="pago"/></td> --%>
<!--                 </tr> -->
                
                 <tr>
                    <td><form:label path="fechaEmision">
                      Fecha de emision</form:label></td>
                    <td><form:input path="fechaEmision"/></td>
                </tr>
                
                 <tr>
                    <td><form:label path="fechaVencimiento">
                      Fecha de vencimiento</form:label></td>
                    <td><form:input path="fechaVencimiento"/></td>
                </tr>
                
                
                 <tr>
                    <td><form:label path="cliente">
                      Cliente</form:label></td>
                    <td><form:input path="cliente"/></td>
                </tr>
                
                 <tr>
                    <td><form:label path="trabajador">
                      Trabajador</form:label></td>
                    <td><form:input path="trabajador"/></td>
                </tr>
            </table>
        </form:form>

</petclinic:layout>