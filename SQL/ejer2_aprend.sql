select nombre from producto;
select nombre, precio from producto;
select * from producto;
select nombre, round(precio) from producto;
select codigo_fabricante from producto;
select distinct codigo_fabricante from producto;
select nombre from fabricante order by nombre asc;
select nombre from producto order by nombre asc, precio desc;
select * from fabricante limit 5;
select nombre, precio from producto order by precio asc limit 1;
select nombre, precio from producto order by precio desc limit 1;
select nombre from producto where precio <= 120;
select nombre, precio from producto where precio between 60 and 120;
select nombre, codigo_fabricante from producto where codigo_fabricante in (1,3,5);
select nombre from producto where nombre like "%Portatil%";

# CONSULTAS MULTITABLA
select p.codigo, p.nombre, f.codigo, f.nombre from producto p inner join fabricante f 
	on f.codigo = p.codigo_fabricante;
select p.nombre, p.precio, f.nombre from producto p inner join fabricante f 
	on f.codigo = p.codigo_fabricante order by f.nombre asc;
select p.nombre, p.precio, f.nombre from producto p inner join fabricante f 
	on f.codigo = p.codigo_fabricante order by p.precio asc limit 1;
select p.nombre from producto p inner join fabricante f
	on f.codigo = p.codigo_fabricante where f.nombre = "Lenovo";
select p.nombre from producto p inner join fabricante f
	on f.codigo = p.codigo_fabricante where f.nombre = "Crucial" and p.precio > 200;
select p.nombre from producto p inner join fabricante f
	on f.codigo = p.codigo_fabricante where f.nombre in ("Asus","Hewlett-Packard");
select p.nombre, p. precio, f.nombre from producto p inner join fabricante f
	on f.codigo = p.codigo_fabricante where p.precio >= 180 order by p.precio desc, p.nombre asc;
    
# LEFT JOIN - RIGHT JOIN
select f.nombre from fabricante f left join producto p
	on f.codigo = p.codigo_fabricante;
select f.nombre from fabricante f left join producto p
	on f.codigo = p.codigo_fabricante where p.codigo_fabricante is null;

# SUBCONSULTAS (EN WHERE)
select nombre from producto where codigo_fabricante = (select codigo from fabricante where nombre = "Lenovo");
select * from producto where precio = (select precio from producto 
	where codigo_fabricante = (select codigo from fabricante where nombre = "Lenovo") order by precio desc limit 1);
select nombre from producto where precio = (select precio from producto 
	where codigo_fabricante = (select codigo from fabricante where nombre = "Lenovo") order by precio desc limit 1);
select nombre, precio from producto where precio > (select avg(precio) from producto 
	where codigo_fabricante = (select codigo from fabricante where nombre = "Asus")) and 
    codigo_fabricante = (select codigo from fabricante where nombre = "Asus");
    
# SUBCONSULTAS CON IN Y NOT IN
select nombre from fabricante where codigo in (select codigo_fabricante 
	from producto where codigo_fabricante is not null);
select nombre from fabricante where codigo not in (select codigo_fabricante 
	from producto where codigo_fabricante is not null);
    
# SUBCONSULTAS EN HAVING
select nombre from fabricante where codigo in (select codigo_fabricante from producto 
	group by codigo_fabricante having count(codigo) = (select count(codigo) from producto 
    where codigo_fabricante = (select codigo from fabricante where nombre = "Lenovo")));
