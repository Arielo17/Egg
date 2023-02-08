package com.egg.news.servicios;

import com.egg.news.entidades.Noticia;
import com.egg.news.entidades.Periodista;
import com.egg.news.entidades.Usuario;
import com.egg.news.enumeraciones.Rol;
import com.egg.news.repositorios.NoticiaRepositorio;
import com.egg.news.repositorios.PeriodistaRepositorio;
import com.egg.news.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PeriodistaServicio {
    
    @Autowired
    private PeriodistaRepositorio periodistaRepositorio;
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    @Autowired
    private NoticiaRepositorio noticiaRepositorio;
    
    @Transactional
    public void crearPeriodista(String id, Noticia noticia, Integer sueldoMensual){
        
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
        
        if (respuesta.isPresent()) {
            Periodista periodista = (Periodista) respuesta.get();
            
            periodista.setRol(Rol.PERIODISTA);
            
            periodista.setNoticia(noticia);
            
            periodista.setSueldoMensual(sueldoMensual);
            
            periodistaRepositorio.save(periodista);
        }
        
        
    }
    
    public List<Noticia> listarNoticias(String nombre) {
        
        Periodista periodista = periodistaRepositorio.buscarPorNombre(nombre);
        
        if (periodista != null) {
            List<Noticia> misNoticias = new ArrayList<>();
            List<Noticia> noticias = noticiaRepositorio.findAll();
            for (Noticia aux : noticias) {
                if (aux.getCreador().getNombre().equals(nombre)) {
                    misNoticias.add(aux);
                }
            }
            return misNoticias;
        } else {
            return null;
        }
    }
    
    
}
