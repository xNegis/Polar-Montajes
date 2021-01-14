-- One admin user, named admin1 with password 4dm1n and authority admin
INSERT INTO users(username,password,enabled) VALUES ('admin1','4dm1n',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (1,'admin1','admin');
-- One owner user, named owner1 with password 0wn3r
INSERT INTO users(username,password,enabled) VALUES ('owner1','0wn3r',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (2,'owner1','owner');
-- One vet user, named vet1 with password v3t
INSERT INTO users(username,password,enabled) VALUES ('vet1','v3t',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (3,'vet1','veterinarian');

-- Usuario de antcammar4 como owner
INSERT INTO users(username,password,enabled) VALUES ('antcammar4','123456',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (4,'antcammar4','admin');
-- Usuario de serrojjim como owner
INSERT INTO users(username,password,enabled) VALUES ('serrojjim','123456',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (5,'serrojjim','admin');
-- Usuario de aleruijur como owner
INSERT INTO users(username,password,enabled) VALUES ('aleruijur','aleale',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (6,'aleruijur','admin');
-- Usuario de migniearj como owner
INSERT INTO users(username,password,enabled) VALUES ('migniearj','miguesnow',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (7,'migniearj','admin');
-- Usuario de alvcorcas como owner
INSERT INTO users(username,password,enabled) VALUES ('alvcorcas','1eB@6!XYUYe6c33&',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (8,'alvcorcas','admin');
-- Usuario de martorsan13 como owner
INSERT INTO users(username,password,enabled) VALUES ('martorsan13','mariano',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (9,'martorsan13','admin');


-- Usuario de martorsan13 como owner
INSERT INTO users(username,password,enabled) VALUES ('12378321F','gerente',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (10,'12378321F','gerente');
-- Usuario de martorsan13 como owner
INSERT INTO users(username,password,enabled) VALUES ('12312321F','cliente',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (11,'12312321F','cliente');
-- Usuario de martorsan13 como owner
INSERT INTO users(username,password,enabled) VALUES ('13412321F','trabajador',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (12,'13412321F','trabajador');

INSERT INTO trabajador(id,first_name,last_name,dni, email, direccion, telefono, es_gerente) VALUES(1,'Antonio','Campuzano','13412321F','email@hotmail.es','Calle Monzon','636558541',false);
INSERT INTO trabajador(id,first_name,last_name,dni, email, direccion, telefono, es_gerente) VALUES(2,'Sergio','Rojas','12312521F','email@hotmail.es','Calle Monzon','636558541',false);
INSERT INTO trabajador(id,first_name,last_name,dni, email, direccion, telefono, es_gerente) VALUES(3,'Miguel','Nieva','12312821F','email@hotmail.es','Calle Monzon','636558541',false);
INSERT INTO trabajador(id,first_name,last_name,dni, email, direccion, telefono, es_gerente) VALUES(4,'Mariano','Torrado','12412321F','email@hotmail.es','Calle Monzon','636558541',false);
INSERT INTO trabajador(id,first_name,last_name,dni, email, direccion, telefono, es_gerente) VALUES(5,'Alvaro','Cortes','12378321F','email@hotmail.es','Calle Monzon','636558541',true);

INSERT INTO cliente(id,first_name,last_name, correo, direccion, dni,telefono) VALUES(1,'Cliente','1','email@hotmail.es','Calle Monzon','12312321F','636558541');
INSERT INTO cliente(id,first_name,last_name, correo, direccion, dni,telefono) VALUES(2,'Cliente','2','email@hotmail.es','Calle Monzon','12315361F','636558541');
INSERT INTO cliente(id,first_name,last_name, correo, direccion, dni,telefono) VALUES(3,'Cliente','3','email@hotmail.es','Calle Monzon','12312421F','636558541');
INSERT INTO cliente(id,first_name,last_name, correo, direccion, dni,telefono) VALUES(4,'Cliente','4','email@hotmail.es','Calle Monzon','12372921F','636558541');
INSERT INTO cliente(id,first_name,last_name, correo, direccion, dni,telefono) VALUES(5,'Cliente','5','email@hotmail.es','Calle Monzon','12316521F','636558541');


INSERT INTO proveedor(id,correo_electronico,direccion,nombre,telefono) VALUES(1,'email@hotmail.es','Calle Monzon','Proveedor1','636558541');
INSERT INTO proveedor(id,correo_electronico,direccion,nombre,telefono) VALUES(2,'email@hotmail.es','Calle Monzon','Proveedor2','636558541');
INSERT INTO proveedor(id,correo_electronico,direccion,nombre,telefono) VALUES(3,'email@hotmail.es','Calle Monzon','Proveedor3','636558541');
INSERT INTO proveedor(id,correo_electronico,direccion,nombre,telefono) VALUES(4,'email@hotmail.es','Calle Monzon','Proveedor4','636558541');
INSERT INTO proveedor(id,correo_electronico,direccion,nombre,telefono) VALUES(5,'email@hotmail.es','Calle Monzon','Proveedor5','636558541');

INSERT INTO periodo_vacaciones(id,fecha_inicio, fecha_fin, vacaciones, trabajador) VALUES (1,'2020-08-16','2020-08-26', 'VERANO', 1);
INSERT INTO periodo_vacaciones(id,fecha_inicio, fecha_fin, vacaciones, trabajador) VALUES (2,'2020-06-12','2020-06-22', 'VERANO', 2);
INSERT INTO periodo_vacaciones(id,fecha_inicio, fecha_fin, vacaciones, trabajador) VALUES (3,'2020-04-09','2020-04-19', 'VERANO', 3);
INSERT INTO periodo_vacaciones(id,fecha_inicio, fecha_fin, vacaciones, trabajador) VALUES (4,'2020-02-23','2020-03-03', 'VERANO', 4);

INSERT INTO nomina(id,sueldo_neto,sueldo_bruto,retenciones,horas_trabajadas,horas_extra,precio_hora,precio_hora_extra,mes_año,trabajador) VALUES (1,2300,2500,0.12,200,30,12,15,'05-2020',1);
INSERT INTO nomina(id,sueldo_neto,sueldo_bruto,retenciones,horas_trabajadas,horas_extra,precio_hora,precio_hora_extra,mes_año,trabajador) VALUES (2,2300,2500,0.12,200,30,12,15,'05-2020',2);
INSERT INTO nomina(id,sueldo_neto,sueldo_bruto,retenciones,horas_trabajadas,horas_extra,precio_hora,precio_hora_extra,mes_año,trabajador) VALUES (3,2300,2500,0.12,200,30,12,15,'05-2020',3);
INSERT INTO nomina(id,sueldo_neto,sueldo_bruto,retenciones,horas_trabajadas,horas_extra,precio_hora,precio_hora_extra,mes_año,trabajador) VALUES (4,2300,2500,0.12,200,30,12,15,'05-2020',4);
INSERT INTO nomina(id,sueldo_neto,sueldo_bruto,retenciones,horas_trabajadas,horas_extra,precio_hora,precio_hora_extra,mes_año,trabajador) VALUES (5,2300,2500,0.12,200,30,12,15,'05-2020',5);

INSERT INTO factura(id,precio_total_sin_iva,iva,precio_total_con_iva,pago,fecha_vencimiento,fecha_emision,pagado,cliente,trabajador) VALUES (1,203.2,0.21,300.2,'EFECTIVO','2020-09-09','2020-08-09',true,1,1);
INSERT INTO factura(id,precio_total_sin_iva,iva,precio_total_con_iva,pago,fecha_vencimiento,fecha_emision,pagado,cliente,trabajador) VALUES (2,203.2,0.21,300.2,'EFECTIVO','2020-09-09','2020-08-09',true,2,2);
INSERT INTO factura(id,precio_total_sin_iva,iva,precio_total_con_iva,pago,fecha_vencimiento,fecha_emision,pagado,cliente,trabajador) VALUES (3,203.2,0.21,300.2,'EFECTIVO','2020-09-09','2020-08-09',true,3,3);
INSERT INTO factura(id,precio_total_sin_iva,iva,precio_total_con_iva,pago,fecha_vencimiento,fecha_emision,pagado,cliente,trabajador) VALUES (4,203.2,0.21,300.2,'EFECTIVO','2020-09-09','2020-08-09',true,4,4);
INSERT INTO factura(id,precio_total_sin_iva,iva,precio_total_con_iva,pago,fecha_vencimiento,fecha_emision,pagado,cliente,trabajador) VALUES (5,203.2,0.21,300.2,'EFECTIVO','2020-09-09','2020-08-09',true,5,5);

INSERT INTO servicio(id,tiempo_empleado,fecha_inicio,fecha_fin,tipo_servicio,cliente,trabajador) VALUES (1,23.5,'2020-05-24','2020-05-24','MANTENIMIENTO',1,1);
INSERT INTO servicio(id,tiempo_empleado,fecha_inicio,fecha_fin,tipo_servicio,cliente,trabajador) VALUES (2,23.5,'2020-05-24','2020-05-24','MANTENIMIENTO',2,1);
INSERT INTO servicio(id,tiempo_empleado,fecha_inicio,fecha_fin,tipo_servicio,cliente,trabajador) VALUES (3,23.5,'2020-05-24','2020-05-24','MANTENIMIENTO',3,1);



INSERT INTO linea_factura(id,cantidad,descripcion,precio_unitario,servicio,factura) VALUES(1,34,'bonito y barato',4.0,1,1);
INSERT INTO linea_factura(id,cantidad,descripcion,precio_unitario,servicio,factura) VALUES(2,34,'bonito y barato',4.0,2,1);
INSERT INTO linea_factura(id,cantidad,descripcion,precio_unitario,servicio,factura) VALUES(3,34,'bonito y barato',4.0,3,1);

INSERT INTO pedido(id,fecha,precio,pagado,trabajador,proveedor) VALUES(1,'2020-05-16',23.4,true,1,1);
INSERT INTO pedido(id,fecha,precio,pagado,trabajador,proveedor) VALUES(2,'2020-05-16',23.4,true,1,1);
INSERT INTO pedido(id,fecha,precio,pagado,trabajador,proveedor) VALUES(3,'2020-05-16',23.4,true,1,2);
INSERT INTO pedido(id,fecha,precio,pagado,trabajador,proveedor) VALUES(4,'2020-05-16',23.4,true,1,3);
INSERT INTO pedido(id,fecha,precio,pagado,trabajador,proveedor) VALUES(5,'2020-05-16',23.4,true,1,4);
INSERT INTO pedido(id,fecha,precio,pagado,trabajador,proveedor) VALUES(6,'2020-05-16',23.4,true,1,5);
INSERT INTO pedido(id,fecha,precio,pagado,trabajador,proveedor) VALUES(7,'2020-05-16',23.4,true,1,5);
INSERT INTO pedido(id,fecha,precio,pagado,trabajador,proveedor) VALUES(8,'2020-05-16',23.4,true,1,5);

INSERT INTO producto(id,name,precio) VALUES(1,'arandelas',2.5);
INSERT INTO producto(id,name,precio) VALUES(2,'tornillos',3);
INSERT INTO producto(id,name,precio) VALUES(3,'tuercas',4.5);
INSERT INTO producto(id,name,precio) VALUES(4,'cables',1.5);


INSERT INTO linea_pedido(id,cantidad,descripcion,pedido,producto) VALUES(1,4,'descripcion',1,1);
INSERT INTO linea_pedido(id,cantidad,descripcion,pedido,producto) VALUES(2,2,'descripcion',2,2);
INSERT INTO linea_pedido(id,cantidad,descripcion,pedido,producto) VALUES(3,5,'descripcion',3,3);
INSERT INTO linea_pedido(id,cantidad,descripcion,pedido,producto) VALUES(4,7,'descripcion',3,4);
INSERT INTO linea_pedido(id,cantidad,descripcion,pedido,producto) VALUES(5,1,'descripcion',2,1);



















INSERT INTO vets VALUES (1, 'James', 'Carter');
INSERT INTO vets VALUES (2, 'Helen', 'Leary');
INSERT INTO vets VALUES (3, 'Linda', 'Douglas');
INSERT INTO vets VALUES (4, 'Rafael', 'Ortega');
INSERT INTO vets VALUES (5, 'Henry', 'Stevens');
INSERT INTO vets VALUES (6, 'Sharon', 'Jenkins');

INSERT INTO specialties VALUES (1, 'radiology');
INSERT INTO specialties VALUES (2, 'surgery');
INSERT INTO specialties VALUES (3, 'dentistry');

INSERT INTO vet_specialties VALUES (2, 1);
INSERT INTO vet_specialties VALUES (3, 2);
INSERT INTO vet_specialties VALUES (3, 3);
INSERT INTO vet_specialties VALUES (4, 2);
INSERT INTO vet_specialties VALUES (5, 1);

INSERT INTO types VALUES (1, 'cat');
INSERT INTO types VALUES (2, 'dog');
INSERT INTO types VALUES (3, 'lizard');
INSERT INTO types VALUES (4, 'snake');
INSERT INTO types VALUES (5, 'bird');
INSERT INTO types VALUES (6, 'hamster');

INSERT INTO owners VALUES (1, 'George', 'Franklin', '110 W. Liberty St.', 'Madison', '6085551023', 'owner1');
INSERT INTO owners VALUES (2, 'Betty', 'Davis', '638 Cardinal Ave.', 'Sun Prairie', '6085551749', 'owner1');
INSERT INTO owners VALUES (3, 'Eduardo', 'Rodriquez', '2693 Commerce St.', 'McFarland', '6085558763', 'owner1');
INSERT INTO owners VALUES (4, 'Harold', 'Davis', '563 Friendly St.', 'Windsor', '6085553198', 'owner1');
INSERT INTO owners VALUES (5, 'Peter', 'McTavish', '2387 S. Fair Way', 'Madison', '6085552765', 'owner1');
INSERT INTO owners VALUES (6, 'Jean', 'Coleman', '105 N. Lake St.', 'Monona', '6085552654', 'owner1');
INSERT INTO owners VALUES (7, 'Jeff', 'Black', '1450 Oak Blvd.', 'Monona', '6085555387', 'owner1');
INSERT INTO owners VALUES (8, 'Maria', 'Escobito', '345 Maple St.', 'Madison', '6085557683', 'owner1');
INSERT INTO owners VALUES (9, 'David', 'Schroeder', '2749 Blackhawk Trail', 'Madison', '6085559435', 'owner1');
INSERT INTO owners VALUES (10, 'Carlos', 'Estaban', '2335 Independence La.', 'Waunakee', '6085555487', 'owner1');

INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (1, 'Leo', '2010-09-07', 1, 1);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (2, 'Basil', '2012-08-06', 6, 2);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (3, 'Rosy', '2011-04-17', 2, 3);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (4, 'Jewel', '2010-03-07', 2, 3);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (5, 'Iggy', '2010-11-30', 3, 4);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (6, 'George', '2010-01-20', 4, 5);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (7, 'Samantha', '2012-09-04', 1, 6);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (8, 'Max', '2012-09-04', 1, 6);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (9, 'Lucky', '2011-08-06', 5, 7);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (10, 'Mulligan', '2007-02-24', 2, 8);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (11, 'Freddy', '2010-03-09', 5, 9);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (12, 'Lucky', '2010-06-24', 2, 10);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (13, 'Sly', '2012-06-08', 1, 10);

INSERT INTO visits(id,pet_id,visit_date,description) VALUES (1, 7, '2013-01-01', 'rabies shot');
INSERT INTO visits(id,pet_id,visit_date,description) VALUES (2, 8, '2013-01-02', 'rabies shot');
INSERT INTO visits(id,pet_id,visit_date,description) VALUES (3, 8, '2013-01-03', 'neutered');
INSERT INTO visits(id,pet_id,visit_date,description) VALUES (4, 7, '2013-01-04', 'spayed');


