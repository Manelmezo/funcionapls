
package intento4;

/**
 *
 * @author Cortavarria Andara,José Noel ,ZAMBRANA,Manel
 */
public class Perro extends Mascota{
/*private String raza*/
    private String raza;
/*Constructor clase perro*/

    public Perro(String raza, String nombre, Integer edad) {
        super(nombre, edad);
        this.raza = raza;
    }

    public Perro(String raza) {
        this.raza = raza;
    }
    /*Devuelve la raza del perro
        @return raza */

    public String getRaza() {
        return raza;
    }
/*Modifica la raza de la mascota
    @param  raza*/
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
 /*toString*/
    

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + '}';
    }
/* override de la interfaz sonido para poder utilizarla en la clase perro*/
    @Override
    public void sonido() {
        
    }
    
    
    
}
