/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1progra2;

/**
 *
 * @author jefersson
 */
public abstract class Persona {
    protected String nombre;
    protected int edad;
    
   public Persona(String nombre,int edad){
   
   this.nombre=nombre;
   this.edad=edad;
   
   }    
    
    public String imprimir(){
    
    return "Nombre :"+this.nombre + " Edad: "+this.edad;
    
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
}
