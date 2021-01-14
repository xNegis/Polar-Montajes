<%@ page session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script type="text/javascript" src="/WEB-INF/js/function.js"></script>


<petclinic:layout pageName="facturas">
<table id="myTable" class="table table-striped"" >
			<thead>
				<tr>
					<th>Cantidad</th>
					<th>Descripcion</th>
					<th>Precio unidad</th>
					<th>ID del servicio que representa</th>
					<th>
					<button type="button" class="btn btn-default" onclick="addRow()">
						Añadir fila
					</button></th>
					<th>
					<button type="button" class="btn btn-default" onclick="deleteRow()">
						Eliminar fila
					</button></th>
				</tr>
				</thead>
				<tbody>
				</tbody>
			</table>
			
			<button id="lineasFacturacion" class="btn btn-default" onclick="enviarLineasFactura()">
			Insertar lineas de la factura
		</button>
</petclinic:layout>

<script>
			function addRow() {
				var table = document.getElementById("myTable");
				var row = table.insertRow();
				var cell1 = row.insertCell(0);
				var cell2 = row.insertCell(1);
				var cell3 = row.insertCell(2);
				var cell4 = row.insertCell(3);
				var i = table.rows.length - 1;
				cell1.innerHTML = '<input type="text" id="cantidad' + i + '" name="cantidad" pattern="[0-9]"/>';
				cell2.innerHTML = '<input type="text" id="descripcion' + i + '" name="descripcion"/>';
				cell3.innerHTML = '<input type="text" id="precioUnitario' + i + '" name="precioUnitario" pattern="[0-9]"/>';
				cell4.innerHTML = '<input type="text" id="oid_s' + i + '" name="OID_S" placeholder="Id numérico" pattern="[0-9]"/>';
			}

			function deleteRow() {
				var tabla = document.getElementById("myTable");
				var nFilas = tabla.rows.length;
				if (nFilas != 1)
					tabla.deleteRow(nFilas - 1);
			}

			function enviarLineasFactura() {
				var numeroFilas = document.getElementById("myTable").rows.length;
				if (numeroFilas > 1) {
					var i;
					for ( i = 1; i < numeroFilas; i++) {
						var lineaFactura = {
								cantidad : $("#cantidad" + i).val(),
								descripcion : $("#descripcion" + i).val(),
								precioUnitario : $("#precioUnitario" + i).val(),
								precioTotal : $("#precioTotal" + i).val(),
								oid_s : $("#oid_s" + i).val(),
								fila : i}
						$.post("crearLineaFactura.do", {
							JSON.stringify(lineaFactura);
						}, function(data) {
							alert(data);
						});

					}
				}

			}
		</script>