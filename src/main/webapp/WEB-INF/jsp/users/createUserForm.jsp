<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="owners">
    <h2>
      New user
    </h2>
    <form:form modelAttribute="user" class="form-horizontal" id="add-owner-form">
        <div class="form-group has-feedback">
            <petclinic:inputField label="Nombre y apellidos" name="username"/>
            <petclinic:inputField label="DNI" name="dni"/>
            <petclinic:inputField label="Contraseña" name="password"/>
            <input type="text" id="lname" name="lname" placeholder="Confirmar contraseña"><br><br>
            <input type="text" id="lname" name="lname" placeholder="Telefono"><br><br>
            <input type="text" id="lname" name="lname" placeholder="Correo"><br><br>
            <input type="text" id="lname" name="lname" placeholder="Direccion"><br><br>
            <input type="text" id="lname" name="lname" placeholder="Codigo Postal"><br><br>
        </div>
        
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
            
                        <button class="btn btn-default" type="submit">Registrarme</button>
                
            </div>
        </div>
    </form:form>
    
   
    
</petclinic:layout>
