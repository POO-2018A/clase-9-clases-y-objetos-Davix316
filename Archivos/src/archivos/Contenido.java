/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

public class Contenido {
    public static void main(String[] agrs){
     Archivos[] archivos = new Archivos[3];
     
    //Archivo 1
    archivos[0] = new Archivos("libroEtnicidades", "pdf", "03,05,2018", "Libro completo de Etnicidades");     
        System.out.println("Archivo 1 ");
        System.out.println("Nombre: "+ archivos[0].getNombre());
        System.out.println("Tipo: "+ archivos[0].getTipo());
        System.out.println("Fecha: "+ archivos[0].getfechaCreacion());
        System.out.println("Contenido: "+ archivos[0].getContenido());
        
    //Archivo 2
    archivos[1] = new Archivos("Rolling", "mp3", "02,06,2015", "Canción grupo Limp Bizkit");     
        System.out.println("Archivo 2 ");
        System.out.println("Nombre: "+ archivos[1].getNombre());
        System.out.println("Tipo: "+ archivos[1].getTipo());
        System.out.println("Fecha: "+ archivos[1].getfechaCreacion());
        System.out.println("Contenido: "+ archivos[1].getContenido());
        
    //Archivo 1
    archivos[2] = new Archivos("Resumen", "doc", "03,11,2017", "Resumen del libro Etnicidades");     
        System.out.println("Archivo 3 ");
        System.out.println("Nombre: "+ archivos[2].getNombre());
        System.out.println("Tipo: "+ archivos[2].getTipo());
        System.out.println("Fecha: "+ archivos[2].getfechaCreacion());
        System.out.println("Contenido: "+ archivos[2].getContenido());    
    }
    
}
