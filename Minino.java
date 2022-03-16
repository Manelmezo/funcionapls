/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intento4;

/**
 *
 * @author Cortavarria Andara,José Noel
 */
public class Minino extends Mascota{
    private String raza;
    //Constructores

    public Minino(String raza, String nombre, Integer edad) {
        super(nombre, edad);
        this.raza = raza;
    }

    public Minino(String raza) {
        this.raza = raza;
    }


//Getters y setters
    public Minino(){
    
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
