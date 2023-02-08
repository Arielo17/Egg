package com.egg.news;

import com.egg.news.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SeguridadWeb extends WebSecurityConfigurerAdapter{
    
    @Autowired
    public UsuarioServicio usuarioServicio;
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(usuarioServicio).passwordEncoder(new BCryptPasswordEncoder());
    }
    
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                        .antMatchers("/admin/*").hasRole("ADMIN")  //decimos que podremos acceder a /admin sólo si tenemos Rol ADMIN
                        .antMatchers("/css/*","/js/*","/img/*","/**")
                        .permitAll()    //permisos para poder cargar css, js, img, etc
                .and().formLogin()      //configuraciones de seguridad para el login
                        .loginPage("/login")   //decimos donde esta la pagina de login
                        .loginProcessingUrl("/logincheck")   //url con la cual springSecurity autentica un usuario (loginchek debe ser igual al action del formulario
                        .usernameParameter("email")    //configuramos las credenciales
                        .passwordParameter("password")
                        .defaultSuccessUrl("/inicio")   //url a la que se dirige sitodo sale bien
                        .permitAll()
                .and().logout()     //configuramos el logout
                        .logoutUrl("/logout")   //cuando ingrese a esa url cerrara la sesion
                        .logoutSuccessUrl("/")  //si todo sale bien nos redirecciona a esa url (en este caso, login)
                        .permitAll()
                .and().csrf()
                        .disable();
    }
}
