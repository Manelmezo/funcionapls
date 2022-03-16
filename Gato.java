/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intento4;

/**
 *
 * @author Cortavarria Andara,José Noel
 */
public class Gato extends Mascota{
    private String raza;
    //Constructores

    public Gato(String raza, String nombre, Integer edad) {
        super(nombre, edad);
        this.raza = raza;
    }

    public Gato(String raza) {
        this.raza = raza;
    }


//Getters y setters
    public Gato(){
    
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" + "raza=" + raza + '}';
    }
//override para poder implementar la interfaz sonido en clases no abstractas
    @Override
    public void sonido() {
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
