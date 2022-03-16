
package intento4;

/**
 *
 * @author Cortavarria Andara,José Noel
 */
//IMPLEMENTAMOS LA INTERFAZ SONIDO EN MASCOTA
public abstract class Mascota implements Sonido {
    //Atributos
    private String nombre;
    private Integer edad;
    //constructor



    public Mascota(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
//    getters y setters
    public Mascota(){
         }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    //to String

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}
