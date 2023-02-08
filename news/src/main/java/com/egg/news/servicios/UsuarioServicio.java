package com.egg.news.servicios;

import com.egg.news.entidades.Imagen;
import com.egg.news.entidades.Usuario;
import com.egg.news.enumeraciones.Rol;
import com.egg.news.excepciones.MiExcepcion;
import com.egg.news.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UsuarioServicio implements UserDetailsService {
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    @Autowired
    private ImagenServicio imagenServicio;
    
    @Transactional
    public void registrar(String nombre, String email, String password, String password2, MultipartFile archivo) throws MiExcepcion {
        
        validar(nombre, email, password, password2);
        
        Usuario usuario = new Usuario();
        
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(new BCryptPasswordEncoder().encode(password));
        usuario.setFechaAlta(new Date());
        usuario.setRol(Rol.USER);
        
        Imagen imagen = imagenServicio.guardar(archivo);
        usuario.setImagen(imagen);
        
        usuario.setActivo(Boolean.TRUE);
        
        usuarioRepositorio.save(usuario);
    }
    
    public void actualizar(String nombre, String email, String password, String password2, MultipartFile archivo) throws MiExcepcion {
        validar(nombre, email, password, password2);
        
        Usuario usuario = new Usuario();
        
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(new BCryptPasswordEncoder().encode(password));
        
        usuario.setRol(Rol.USER);
        
        String idImagen = null;
        if (usuario.getImagen() != null) {          //Si el usuario ya tiene una imagen...
            idImagen = usuario.getImagen().getId(); //cargamos el id de la imagen que ya estaba 
        } 
        Imagen imagen = imagenServicio.actualizar(archivo, idImagen);
        usuario.setImagen(imagen);
        
        usuarioRepositorio.save(usuario);
    }
    
    public Usuario getOne(String id) {
        return usuarioRepositorio.getOne(id);
    }

    private void validar(String nombre, String email, String password, String password2) throws MiExcepcion {
        
        if(nombre.isEmpty() || nombre == null) {
            throw new MiExcepcion("El nombre no puede ser nulo o estar vacío");
        }
        if(email.isEmpty() || email == null) {
            throw new MiExcepcion("El mail no puede ser nulo o estar vacío");
        }
        if(password.isEmpty() || password == null) {
            throw new MiExcepcion("El password no puede ser nulo o estar vacío");
        }
        if(password.length()<6) {
            throw new MiExcepcion("El password debe contener 6 o más caracteres");
        }
        if(!password2.equals(password)) {
            throw new MiExcepcion("Las contraseñas ingresadas deben ser iguales");
        }
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        
        Usuario usuario = usuarioRepositorio.buscarPorMail(email);
        
        if(usuario != null) {
            List<GrantedAuthority> permisos = new ArrayList();
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString());
            permisos.add(p);
            
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpSession session = attr.getRequest().getSession(true);
            session.setAttribute("usuarioSession", usuario);
            
            return new User(usuario.getEmail(), usuario.getPassword(), permisos);
        } else {
            return null;
        }
    }
}
