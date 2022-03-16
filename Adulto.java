
package intento4;

/**
 *
 * @author ZAMBRANA,Manel y CORTAVARRIA,Noel
 */
public class Adulto extends Persona{
    /*private String NISS*/
    private String NISS =new String();
    /*private String direccion*/
    private String direccion =new String();
    //Constructor
    public Adulto(String nombre, String DNI, Integer edad) {
        super(nombre, DNI, edad);
    }

    public Adulto() {
    }
    //getters i setters
    /*Devuelve el  NISS
        @return NISS de la persona */
    public String getNISS() {
        return NISS;
    }
    /*Modifica el NISS de la persona
    @param  NISS*/
    public void setNISS(String NISS) {
        this.NISS = NISS;
    }
    /*Devuelve la direccion de una persona
    @return direccion*/
    public String getDireccion() {
        return direccion;
    }
    /*Modifica la direccion
    @param direccion*/
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //toString
    /*método toString*/
    @Override
    public String toString() {
        return "Adulto{" + "NISS=" + NISS + ", direccion=" + direccion + '}';
    }
    
    
    
}
