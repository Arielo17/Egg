package com.egg.news.servicios;

import com.egg.news.entidades.Noticia;
import com.egg.news.entidades.Periodista;
import com.egg.news.excepciones.MiExcepcion;
import com.egg.news.repositorios.NoticiaRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NoticiaServicio {

    @Autowired
    private NoticiaRepositorio noticiaRepositorio;

    @Transactional
    public void crarNoticia(String idNoticia, String titulo, String cuerpo, Date publicacion, Periodista creador) throws MiExcepcion {
        validar(titulo, cuerpo);

        Noticia noticia = new Noticia();
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setPublicacion(new Date());
        noticia.setCreador(creador);

        noticiaRepositorio.save(noticia);
    }

    @Transactional
    public void modificarNoticia(String idNoticia, String titulo, String cuerpo, Date publicacion, Periodista creador) throws MiExcepcion {
        validar(titulo, cuerpo);
        
        Optional<Noticia> respuesta = noticiaRepositorio.findById(idNoticia);
        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();
            
            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);
            noticia.setPublicacion(new Date());
            noticia.setCreador(creador);
            
            noticiaRepositorio.save(noticia);
        }
    }

    @Transactional
    public void eliminarNoticia(String idNoticia) throws MiExcepcion {
        
        Optional<Noticia> respuesta = noticiaRepositorio.findById(idNoticia);

        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();
            noticiaRepositorio.delete(noticia);
        }
    }

    public List<Noticia> listarNoticias() {
        List<Noticia> noticias = new ArrayList<>();
        noticias = noticiaRepositorio.findAll();
        return noticias;
    }

    private void validar(String titulo, String cuerpo) throws MiExcepcion {
        if (titulo == null || titulo.isEmpty()) {
            throw new MiExcepcion("El titulo no puede ser nulo o estar vacío");
        }

        if (cuerpo == null || cuerpo.isEmpty()) {
            throw new MiExcepcion("El cuerpo de la noticia no puede ser nulo o estar vacio");
        }
    }
}
