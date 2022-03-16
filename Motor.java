
package intento4;
/*@version 5.0.0 */
/**
 *
 * @author Cortavarria Andara,José Noel
 */
//Implementamos la interfaz Sonido en Motor, más abajo hacemos un override ya que motor no esta definida como abstracta
public class Motor implements Sonido {
    private String fabricante;
    private String potencia;
    private Integer codigo;
    
//CONSTRUCTOR

    public Motor(String fabricante, String potencia, Integer codigo) {
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.codigo = codigo;
    }

//GETTERS AND SETTERS
    /*Devuelve el  fabricante
        @return fabricante */

    public String getFabricante() {
        return fabricante;
    }
    /*Modifica  el fabricante
    @param fabricante*/
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    /*Devuelve la potencia del motor
        @return potencia*/
    public String getPotencia() {
        return potencia;
    }
    /*Modifica la potencia
        @param potencia*/

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
     /*Devuelve el codigo 
    @return codigo*/

    public Integer getCodigo() {
        return codigo;
    }
       /*Modifica el codigo
        @param codigo*/

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


/*Método toString*/

    @Override
    public String toString() {
        return "Motor{" + "fabricante=" + fabricante + ", potencia=" + potencia + ", codigo=" + codigo + '}';
    }
//YA QUE LA CLASE MOTOR NO ES UNA CLASE ABSTRACTA TENEMOS QUE HACER UN OVERRIDE DE LOS METODOS DE LA INTERFAZ SONIDO
    
    @Override
    public void sonido() {
        
    }
    
    
    



}
