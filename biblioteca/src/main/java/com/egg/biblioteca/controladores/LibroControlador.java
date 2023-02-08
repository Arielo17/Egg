package com.egg.biblioteca.controladores;

import com.egg.biblioteca.excepciones.MiExcepcion;
import com.egg.biblioteca.servicio.AutorServicio;
import com.egg.biblioteca.servicio.EditorialServicio;
import com.egg.biblioteca.servicio.LibroServicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/libro")   // localhost:8080/libro
public class LibroControlador {
    
    @Autowired
    private LibroServicio libroServicio;
    @Autowired
    private AutorServicio autorServicio;
    @Autowired
    private EditorialServicio editorialServicio;
    
    @GetMapping("/registrar")   // localhost:8080/libro/registrar
    public String registrar() {
        return "libro_form.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) Long isbn, @RequestParam String titulo,
            @RequestParam(required = false) Integer ejemplares, @RequestParam String idAutor,
            @RequestParam String idEditorial, ModelMap modelo) {
        
        try {
            libroServicio.crearLibro(isbn, titulo, ejemplares, idAutor, idEditorial);
            modelo.put("exito", "El libro fue cargado con exito!!");
        } catch (MiExcepcion e) {
            modelo.put("error", e.getMessage());
            return "libro_form.html";
        }
        
        return "index.html";
    }
}
