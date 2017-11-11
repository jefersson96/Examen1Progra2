/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1progra2;

import java.util.Scanner;

/**
 *
 * @author jefersson
 */
public class Empleado extends Persona {
    int Codigo_Empleado;
    Scanner leer=new Scanner(System.in);
    float Sueldo_Mensual;
    public Empleado(int codigo,String nombre, int edad, float Sueldo){
    super(nombre,edad);
    Codigo_Empleado=codigo;
    Sueldo_Mensual=Sueldo;
    
    }

    public int getCodigo_Empleado() {
        return Codigo_Empleado;
    }

    public Scanner getLeer() {
        return leer;
    }

    public float getSueldo_Mensual() {
        return Sueldo_Mensual;
    }

    
    @Override
    public String imprimir(){
    
 return "\nNombre :"+super.nombre+ " Codigo :"+this.Codigo_Empleado+" Edad :"+super.edad+" Salario :"+this.Sueldo_Mensual;
    
    }
    
    
}
