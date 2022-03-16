/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intento4;

/**
 *
 * @author manel
 */
public abstract class Humano {
    //atributs
    private String nombre =new String();
    private String DNI =new String();
    private Integer edad;
    //constructor
    public Humano(String nombre, String DNI, Integer edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }
    public Humano(){
    }
    //getters i setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    //toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", DNI=" + DNI + ", edad=" + edad + '}';
    }
    
    
    
}
