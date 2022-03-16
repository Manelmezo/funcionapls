/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intento4;

/**
 *
 * @author manel
 */
public class Adulto extends Humano{
    private String NISS =new String();
    private String direccion =new String();
    //Constructor
    public Adulto(String nombre, String DNI, Integer edad) {
        super(nombre, DNI, edad);
    }

    public Adulto() {
    }
    //getters i setters
    public String getNISS() {
        return NISS;
    }

    public void setNISS(String NISS) {
        this.NISS = NISS;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //toString

    @Override
    public String toString() {
        return "Adulto{" + "NISS=" + NISS + ", direccion=" + direccion + '}';
    }
    
    
    
}
