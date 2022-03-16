/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intento4;

import intento4.Sonido;

/**
 *
 * @author Cortavarria Andara,José Noel
 */
//Implementamos la interfaz Sonido en Motor, más abajo hacemos un override ya que motor no esta definida como abstracta
public class Motor implements NewInterface {
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

    @Override
    public String getFabricante() {
        return fabricante;
    }

    @Override
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String getPotencia() {
        return potencia;
    }

    @Override
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    @Override
    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


//    METODO toString

    @Override
    public String toString() {
        return "Motor{" + "fabricante=" + fabricante + ", potencia=" + potencia + ", codigo=" + codigo + '}';
    }
//YA QUE LA CLASE MOTOR NO ES UNA CLASE ABSTRACTA TENEMOS QUE HACER UN OVERRIDE DE LOS METODOS DE LA INTERFAZ SONIDO
    
    @Override
    public void sonido() {
        
    }
    
    
    



}