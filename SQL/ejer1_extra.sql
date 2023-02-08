select nombre from jugador order by nombre asc;
select nombre from jugador where posicion = "C" and peso > 200 order by nombre asc;
select nombre from equipo order by nombre asc;
select nombre from equipo where conferencia = "East";
select nombre, ciudad from equipo where ciudad like "c%";
select nombre, nombre_equipo from jugador order by nombre_equipo asc;
select nombre from jugador where nombre_equipo = "Raptors" order by nombre asc;
select round(sum(e.Puntos_por_partido),2) from estadistica e inner join jugador j on e.jugador = j.codigo 
	where j.nombre = "Pau Gasol";
select e.Puntos_por_partido from estadistica e inner join jugador j on e.jugador = j.codigo 
	where j.nombre = "Pau Gasol" and e.temporada = "04/05";
select j.nombre, round(sum(e.Puntos_por_partido),2) as puntos from estadistica e inner join jugador j on e.jugador = j.codigo
	group by j.codigo;
select count(codigo), nombre_equipo from jugador group by nombre_equipo;
select j.nombre, round(sum(e.Puntos_por_partido),2) as puntos from estadistica e inner join jugador j on e.jugador = j.codigo
	group by j.codigo order by round(sum(e.Puntos_por_partido),2) desc limit 1;
select j.nombre_equipo, e.conferencia, e.division from jugador j inner join equipo e on j.nombre_equipo = e.nombre
	where j.altura = (select max(altura) from jugador);
select round(avg(Puntos_por_partido),2) as Media from estadistica where jugador in 
(select codigo from jugador where nombre_equipo in 
(select nombre from equipo where division = "Pacific"));
select equipo_local, equipo_visitante, abs(puntos_local - puntos_visitante) as diferencia from partido
	where abs(puntos_local - puntos_visitante) = (select max( abs(puntos_local - puntos_visitante)) from partido);
# el eercicio 16 es igual al 14, o seal select de la linea 19
select sum(puntos_local) from partido group by equipo_local;
select sum(puntos_visitante) from partido group by equipo_visitante;
##select e.nombre,(sum(p.puntos_local) + sum(p.puntos_visitante)) as Puntos from equipo e inner join partido p on e.nombre = p.equipo_local group by e.nombre;
select equipo_visitante, sum(puntos_visitante) from partido group by equipo_visitante;

select codigo, equipo_local, equipo_visitante, equipo_local as ganador from partido where puntos_local > puntos_visitante 
union
select codigo, equipo_local, equipo_visitante, equipo_visitante as ganador from partido where puntos_local < puntos_visitante
union
select codigo, equipo_local, equipo_visitante, null as ganador from partido where puntos_local = puntos_visitante
order by codigo asc;

# 18 otra forma
SELECT codigo, equipo_local, equipo_visitante,
CASE
    WHEN puntos_local > puntos_visitante THEN equipo_local
    WHEN puntos_local < puntos_visitante THEN equipo_visitante
    ELSE null
END resultado
FROM partido;