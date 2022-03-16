/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package intento4;

/**
 *
 * @author manel
 */
public interface NewInterface extends Sonido {

    Integer getCodigo();

    //GETTERS AND SETTERS
    String getFabricante();

    String getPotencia();

    void setCodigo(Integer codigo);

    void setFabricante(String fabricante);

    void setPotencia(String potencia);

    void sonido();

    //    METODO toString
    String toString();
    //YA QUE LA CLASE MOTOR NO ES UNA CLASE ABSTRACTA TENEMOS QUE HACER UN OVERRIDE DE LOS METODOS DE LA INTERFAZ SONIDO
    
}
