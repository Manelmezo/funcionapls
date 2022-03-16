
package intento4;
/*@Version */
/**
 *
 * @author Cortavarria Andara,José Noel ,ZAMBRANA ,manel
 */
/*IMPLEMENTAMOS LA INTERFAZ SONIDO EN MASCOTA*/
public abstract class Mascota implements Sonido {
    //Atributos
    private String nombre;
    private Integer edad;
    //constructor

/*Constructor publico de Mascota */

    public Mascota(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    

    public Mascota(){
         }
/*Devuelve el  nombre de la mascota
        @return nombre */
    public String getNombre() {
        return nombre;
    }
/*Modifica el nombre de la mascota
    @param  nombre*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/*Devuelve la edad de la mascota
        @return edad */
    public Integer getEdad() {
        return edad;
    }
/*Modifica la edad de la mascota
    @param  edad*/

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    /*to String*/

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}
