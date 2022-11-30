/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioAP.Corosoft.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author NicoDesktop
 */

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre_escuela;
    private String url_foto;
    private String titulo;
    private String fecha;
    
    public void settitulo(String nuevoTitulo) {
        this.titulo = nuevoTitulo;
    }
    
    public void setnombre_escuela(String nuevoNombre) {
        this.nombre_escuela = nuevoNombre;
    }
    
    public void seturl_foto(String nuevoUrl) {
        this.url_foto = nuevoUrl;
    }
    
    public void setfecha(String nuevaFecha) {
        this.fecha = nuevaFecha;
    }
}
