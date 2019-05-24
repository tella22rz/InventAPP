--proveedores
insert into proveedor values ('22553241F', 'Valencia', 'Calle Mayor nº54', 'proveedor1@proveedores.com', 'proveedor1', '22553241F', 971545485);
insert into proveedor values ('44332241J', 'Zaragoza', 'Calle Menor nº33', 'proveedor2@proveedores.com', 'proveedor2', '44332241J', 976323452);

--articulos
insert into articulo values (00001, 'false', 'Melon de Valencia', '1.99', '2.50', 50, 'fruta', 45,'22553241F');

--cliente
insert into cliente values ('15514845G', 'Perez Torralba', 'Zaragoza', 'Calle No Tan Mayor Nº44', 'perez@perez.com', 'Manuel', 976748596);

--forma de pago
insert into forma_de_pago values (1, 'Tarjeta');
insert into forma_de_pago values (2, 'Efectivo');

--factura
insert into factura values (015081, '15514845G', 'Empleado Empleado Empleado', 'true', '2019-05-20 10:05:51', 1);

--detalles factura
insert into detalles_factura values (00001, 015081, 20, 0, 21, 2.50);

--devolucion
insert into devolucion values (0001, 20, 00001, 015081, '2019-05-21 12:43:25');

--usuario administrador
insert into Usuario values (1, true, 'Admin Admin', 'admin', 'admin@admin.com', 'Admin', 'admin');

--usuario empleado
insert into Usuario values (2, false, 'Empleado Empleado', 'empleado', 'empleado@empleado.com', 'Empleado', 'empleado');

