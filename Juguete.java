/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intento4;

/**
 *
 * @author manel
 */

public class Juguete extends Infante{
    //atributos
    private String nombre_juguete = new String();
    private Integer precio;
    private Integer edad_recomendada;
    //constructores
    public Juguete(String Nombre_juguete, Integer precio, Integer edad_recomendada) {
        this.nombre_juguete =nombre_juguete;
        this.precio = precio;
        this.edad_recomendada = edad_recomendada;
    }
    public Juguete (){
        
    }
    //getters i setters
    public String getNombre_juguete() {
        return nombre_juguete;
    }

    public void setNombre_juguete(String nombre_juguete) {
        this.nombre_juguete = nombre_juguete;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getEdad_recomendada() {
        return edad_recomendada;
    }

    public void setEdad_recomendada(Integer edad_recomendada) {
        this.edad_recomendada = edad_recomendada;
    }
    //toString
    @Override
    public String toString() {
        return "Juguete{" + "nombre_juguete=" + nombre_juguete + ", precio=" + precio + ", edad_recomendada=" + edad_recomendada + '}';
    }
    
    
}
