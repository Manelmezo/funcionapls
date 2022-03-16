package intento4;

//hay que importar java.util.date para poder usar la variable date
import java.util.Date;

/**
 *
 * @author Cortavarria Andara,José Noel
 */

public class Barco extends Motor {
    private String nombre;
    private Date fechaConstruccion;
    private Integer numCamarotes;
//CONSTRUCTOR
    public Barco(String nombre, Date fechaConstruccion, Integer numCamarotes, String fabricante, String potencia, Integer codigo) {
        super(fabricante, potencia, codigo);
        this.nombre = nombre;
        this.fechaConstruccion = fechaConstruccion;
        this.numCamarotes = numCamarotes;
    }
//GETTERS Y SETTERS
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public Integer getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }


//TO STRING

    @Override
    public String toString() {
        return "Barco{" + "nombre=" + nombre + ", fechaConstruccion=" + fechaConstruccion + ", numCamarotes=" + numCamarotes + '}';
    }





}




