/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intento4;

/**
 *
 * @author manel
 */
public class Niño extends Persona{
    //atributos
    private String colegio = new String();
    //constructor
    public Niño(String nombre, String DNI, Integer edad) {
        super(nombre, DNI, edad);
    }

    public Niño() {
    }
    //setters i getters
    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    @Override
    public String toString() {
        return "Ni\u00f1o{" + "colegio=" + colegio + '}';
    }
    
    
    
    
}