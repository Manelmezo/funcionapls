/*
 */
package intento4;

/**
 *
 * @author ZAMBRANA,Manel y CORTAVARRIA,Noel
 */
/*@version 5.0*/


public class Adulto extends Humano{
/*NISS de la persona */
    private String NISS =new String();
/*Direccion de la persona */
    private String direccion =new String();
    /*Constructor*/
    public Adulto(String nombre, String DNI, Integer edad) {
        super(nombre, DNI, edad);
    }

    public Adulto() {
    }
    /*Devuelve el NISS de la persona
    *   @return NISS de la persona */
    public String getNISS() {
        return NISS;
    }
 /**
     * Modifica el NISS de la persona
     * @param NISS
     */
    public void setNISS(String NISS) {
        this.NISS = NISS;
    }
 /*Devuelve la direccion  de la persona
    *   @return Direccion de la persona */
    public String getDireccion() {
        return direccion;
    }
 /*@par
 */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //toString

    @Override
    public String toString() {
        return "Adulto{" + "NISS=" + NISS + ", direccion=" + direccion + '}';
    }
    
    
    
}
