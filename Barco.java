package intento4;

/*hay que importar java.util.date para poder usar la variable date*/
import java.util.Date;
/*Version 5.0.0*/
/**
 *
 * @author Cortavarria Andara,José Noel ,ZAMBRANA ,Manel
 */

public class Barco extends Motor {
    /*private String nombre*/
    private String nombre;
    /*Private Date fecha construccion*/
    private Date fechaConstruccion;
    /*private Integer numCamarotes*/
    private Integer numCamarotes;
/*CONSTRUCTOR de la clase Barco*/
    public Barco(String nombre, Date fechaConstruccion, Integer numCamarotes, String fabricante, String potencia, Integer codigo) {
        super(fabricante, potencia, codigo);
        this.nombre = nombre;
        this.fechaConstruccion = fechaConstruccion;
        this.numCamarotes = numCamarotes;
    }
 /*Devuelve el  nombre
        @return nombre de la persona */
    
    public String getNombre() {
        return nombre;
    }
 /*Modifica el nombre de la persona
    @param  nombre*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     /*Devuelve la fecha de la Construccion
        @return fechaConstruccion */

    public Date getFechaConstruccion() {
        return fechaConstruccion;
    }
     /*Modifica la FechaConstruccion
    @param  fechaConstruccion*/

    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }
 /*Devuelve el  numero de camarotes
        @return numCamarotes */
    public Integer getNumCamarotes() {
        return numCamarotes;
    }
     /*Modifica el numero de camarotes
    @param  numCamarotes*/

    public void setNumCamarotes(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }


/*metodo toString*/

    @Override
    public String toString() {
        return "Barco{" + "nombre=" + nombre + ", fechaConstruccion=" + fechaConstruccion + ", numCamarotes=" + numCamarotes + '}';
    }





}




