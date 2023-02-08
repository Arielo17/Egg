select codigo_oficina, ciudad from oficina;
select ciudad, telefono from oficina where pais = "España";
select nombre, apellido1, apellido2 from empleado where codigo_jefe = 7;
select puesto, nombre, apellido1, apellido2, email from empleado where codigo_jefe is null;
select codigo_empleado, nombre, apellido1, apellido2, puesto from empleado where puesto <> "Representante Ventas";
select nombre_cliente from cliente where pais = "Spain";
select distinct estado from pedido;
select distinct codigo_cliente from pedido where (estado = "Entregado" and year(fecha_pedido) = 2008);
	select distinct codigo_cliente from pedido where (estado = "Entregado" and date_format(fecha_pedido,"%Y") = 2008);
    select distinct codigo_cliente from pedido where (estado = "Entregado" and 
		fecha_pedido like "2008%");
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido where fecha_entrega>fecha_esperada;
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido 
	where adddate(fecha_esperada, interval -2 day) > fecha_entrega; 
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido 
	where datediff(fecha_esperada,fecha_entrega)>2;
select * from pedido where estado = "Rechazado" and year(fecha_pedido) = 2009;
select * from pedido where month(fecha_entrega) = 1;
select * from pago where (year(fecha_pago) = 2008 and forma_pago = "PayPal") order by id_transaccion asc;
select distinct forma_pago from pago;
select * from producto where (gama = "Ornamentales" and cantidad_en_stock > 100) order by precio_venta desc;
select * from cliente where (ciudad = "Madrid" and codigo_empleado_rep_ventas in (11,30));

# CONSULTAS MULTITABLA (COMPOSICION INTERNA)
select c.nombre_cliente, e.nombre, e.apellido1, e.apellido2 from cliente c inner join empleado e 
	on c.codigo_empleado_rep_ventas = e.codigo_empleado;
select c.nombre_cliente, e.nombre, e.apellido1, e.apellido2 from cliente c inner join empleado e 
	on c.codigo_empleado_rep_ventas = e.codigo_empleado 
	where c.codigo_cliente in (select distinct codigo_cliente from pago);
select c.nombre_cliente, e.nombre, e.apellido1, e.apellido2 from cliente c inner join empleado e 
	on c.codigo_empleado_rep_ventas = e.codigo_empleado 
	where not c.codigo_cliente in (select distinct codigo_cliente from pago);
select c.nombre_cliente, e.nombre, e.apellido1, e.apellido2, o.ciudad from ((cliente c inner join empleado e 
	on c.codigo_empleado_rep_ventas = e.codigo_empleado) inner join oficina o 
    on e.codigo_oficina = o.codigo_oficina)
	where c.codigo_cliente in (select distinct codigo_cliente from pago);
select c.nombre_cliente, e.nombre, e.apellido1, e.apellido2, o.ciudad from ((cliente c inner join empleado e 
	on c.codigo_empleado_rep_ventas = e.codigo_empleado) inner join oficina o 
    on e.codigo_oficina = o.codigo_oficina)
	where not c.codigo_cliente in (select distinct codigo_cliente from pago);
select o.linea_direccion1, o.linea_direccion2 from ((oficina o inner join empleado e 
    on e.codigo_oficina = o.codigo_oficina) inner join cliente c
    on e.codigo_empleado = c.codigo_empleado_rep_ventas)
    where c.ciudad = "Fuenlabrada";
select c.nombre_cliente, e.nombre, e.apellido1, e.apellido2, o.ciudad from ((cliente c inner join empleado e
	on c.codigo_empleado_rep_ventas = e.codigo_empleado) inner join oficina o
    on e.codigo_oficina = o.codigo_oficina);
select e.nombre, e.apellido1, e.apellido2, em.nombre, em.apellido1, em.apellido2 from empleado e 
	inner join empleado em on e.codigo_jefe = em.codigo_empleado order by em.nombre asc;
select distinct c.nombre_cliente from cliente c inner join pedido p on c.codigo_cliente = p.codigo_cliente
	where p.fecha_entrega > p.fecha_esperada;
select distinct prod.gama from (((producto prod inner join detalle_pedido dp on prod.codigo_producto = dp.codigo_producto)
	inner join pedido ped on dp.codigo_pedido = ped.codigo_pedido) inner join cliente c
    on ped.codigo_cliente = c.codigo_cliente);

# CONSULTAS MULTITABLA (COMPOSICION EXTERNA)
select c.nombre_cliente, c.codigo_cliente from cliente c left join pago p on c.codigo_cliente = p.codigo_cliente
	where not c.codigo_cliente in (select distinct codigo_cliente from pago);
select c.nombre_cliente, c.codigo_cliente from cliente c left join pedido p on c.codigo_cliente = p.codigo_cliente
	where not c.codigo_cliente in (select distinct codigo_cliente from pedido);
select c.nombre_cliente, c.codigo_cliente from ((cliente c left join pago p on c.codigo_cliente = p.codigo_cliente)
	left join pedido ped on c.codigo_cliente = ped.codigo_cliente) where not c.codigo_cliente in 
    (select distinct codigo_cliente from pago union select distinct codigo_cliente from pedido);
select * from empleado e left join oficina o on e.codigo_oficina = o.codigo_oficina 
	where not e.codigo_oficina in (select distinct codigo_oficina from empleado);
select * from empleado e left join cliente c on e.codigo_empleado = c.codigo_empleado_rep_ventas
	where not e.codigo_empleado in (select distinct codigo_empleado_rep_ventas from cliente);
select * from ((empleado e left join oficina o on e.codigo_oficina = o.codigo_oficina)
	left join cliente c on e.codigo_empleado = c.codigo_empleado_rep_ventas)
    where not e.codigo_oficina in (select distinct codigo_oficina from empleado where
    e.codigo_empleado in (select distinct codigo_empleado_rep_ventas from cliente));
select * from ((producto pr left join detalle_pedido dp on pr.codigo_producto = dp.codigo_producto)
	left join pedido pe on dp.codigo_pedido = pe.codigo_pedido)
    where not pr.codigo_producto in (select distinct codigo_producto from detalle_pedido where 
    dp.codigo_pedido in (select distinct codigo_pedido from pedido));
select * from ((((oficina o left join empleado e on o.codigo_oficina = e.codigo_oficina)
	left join cliente c on e.codigo_empleado = c.codigo_empleado_rep_ventas)
    left join pedido p on c.codigo_cliente = p.codigo_cliente)
    left join detalle_pedido dp on p.codigo_pedido = dp.codigo_pedido)
    left join producto pr on dp.codigo_producto = pr.codigo_producto 
    where not e.codigo_empleado in (select e.codigo_empleado from (((empleado e 
    inner join cliente c on e.codigo_empleado = c.codigo_empleado_rep_ventas)
    inner join pedido p on c.codigo_cliente = p.codigo_cliente)
    inner join detalle_pedido dp on p.codigo_pedido = dp.codigo_pedido)
    inner join producto pr on dp.codigo_producto = pr.codigo_producto where pr.gama = "Frutales");
select * from cliente c inner join pedido p on c.codigo_cliente = p.codigo_cliente;
select * from cliente c inner join pago p on c.codigo_cliente = p.codigo_cliente;

select * from pago;
