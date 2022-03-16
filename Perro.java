
package intento4;

/**
 *
 * @author Cortavarria Andara,José Noel
 */
public class Perro extends Mascota{
//Atributo
    private String raza;
//Constructores

    public Perro(String raza, String nombre, Integer edad) {
        super(nombre, edad);
        this.raza = raza;
    }

    public Perro(String raza) {
        this.raza = raza;
    }

//Getters and setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
 //toString
    

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + '}';
    }

    @Override
    public void sonido() {
        
    }
    
    
    
}
