package com.egg.news.controladores;

import com.egg.news.entidades.Noticia;
import com.egg.news.servicios.NoticiaServicio;
import com.egg.news.servicios.PeriodistaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/periodistas")
public class PeriodistaControlador {
    
    @Autowired
    private PeriodistaServicio periodistaServicio;
    @Autowired
    private NoticiaServicio noticiaServicio;
    
    @GetMapping("/inicio")
    public String indexPeriodista(Model modelo) {
        List<Noticia> noticias = noticiaServicio.listarNoticias();
        modelo.addAttribute("noticias", noticias);
        return "indexPeriodista.html";
    }
}
