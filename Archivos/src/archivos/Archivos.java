/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.util.*;

public class Archivos {

    private String nombre;
    private String tipo;
    private String fechaCreacion;
    private String contenido; 

    public Archivos(){};
    
    public Archivos(String nombre, String tipo, String fechaCreacion, String contenido ){
        this.nombre=nombre;
        this.tipo=tipo;
        this.fechaCreacion=fechaCreacion;
        this.contenido=contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getfechaCreacion() {
        return fechaCreacion;
    }

    public void setfechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
