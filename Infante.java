/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intento4;

/**
 *
 * @author manel
 */
public class Infante extends Humano{
    //atributos
    private String colegio = new String();
    //constructor
    public Infante(String nombre, String DNI, Integer edad) {
        super(nombre, DNI, edad);
    }

    public Infante() {
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