package com.egg.biblioteca.controladores;

import com.egg.biblioteca.excepciones.MiExcepcion;
import com.egg.biblioteca.servicio.AutorServicio;
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
@RequestMapping("/autor")   // localhost:8080/autor
public class AutorControlador {
    
    @Autowired
    private AutorServicio autorServicio;
    
    @GetMapping("/registrar")   //localhost:8080/autor/registrar
    public String registrar() {
        return "autor_form.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo) {
        
        try {
            autorServicio.crearAutor(nombre);
            modelo.put("exito", "El autor ha sido cargado con exito!!");
        } catch (MiExcepcion e) {
            modelo.put("error", e.getMessage());
            return "autor_form.html";
        }
        
        return "index.html";
    }
}
