package com.egg.news.entidades;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Periodista extends Usuario {
    
    @OneToOne
    private Noticia noticia;
    private Integer sueldoMensual;

    public Periodista() {
    }
    
    public Noticia getNoticia() {
        return noticia;
    }

    public void setNoticia(Noticia noticia) {
        this.noticia = noticia;
    }

    public Integer getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(Integer sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
