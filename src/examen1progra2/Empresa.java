/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1progra2;

import java.util.ArrayList;

/**
 *
 * @author jefersson
 */

import java.util.Scanner;
public class Empresa {
    protected String Nombre;
    protected ArrayList<Empleado> empleados;
    Scanner leer=new Scanner(System.in);
    public Empresa(String nombre){
    
        
        empleados=new ArrayList<>();
    
   Nombre=nombre;
    
    
    
    }
    
    public void AddSubordinados(String Nombre){
  
    
        
        for(int i=0;i<empleados.size();i++){
   if(empleados.get(i).nombre.equals(Nombre) && empleados.get(i) instanceof Directivo){
   System.out.print("Ingrese el nombre del Subordinado de "+Nombre+" :");
        String nombre=leer.next();
 
  System.out.print("Ingrese la edad del Subordinado de "+Nombre+" :");
   int edad=leer.nextInt();
  System.out.print("Ingrese el sueldo del Subordinado de "+Nombre+" :");
  float sueldo=leer.nextFloat();
  System.out.print("Ingrese el codigo del Subordinado de "+Nombre+" :");
  int codigo=leer.nextInt();
       
       ((Directivo)empleados.get(i)).AgregarSubordinado(codigo, nombre, edad, sueldo);

   }
    
  
    
    
    }
    }
    
public Empleado Buscar(int n){
        for(Empleado cb : empleados){
            if(cb.getCodigo_Empleado() == n)
              System.out.print( cb.imprimir());
                return cb;
        }
        return null;
    }
     
    public void addEmpleado(int codigo, String Nombre,int edad,float sueldo, String tipo){
        if(Buscar(codigo) == null){
            if(tipo.equals("DIRECTIVO"))
                empleados.add(new Directivo(codigo,Nombre,edad,sueldo));
            else if(tipo.equals("EMPLEADO"))
                empleados.add(new Empleado(codigo,Nombre,edad,sueldo));
        }
    }

public void imprimir(){
    Empleado emp;
    
for(int i=0;i<empleados.size();i++){
   if(empleados.get(i) instanceof Empleado){

   System.out.println("Emplpeado "+i+":"+empleados.get(i).imprimir());
   }
    
  if(empleados.get(i) instanceof Directivo)
  
((Directivo)empleados.get(i)).Imprimir();

    
    }
}


}

     
     
     
    
    
    
    
