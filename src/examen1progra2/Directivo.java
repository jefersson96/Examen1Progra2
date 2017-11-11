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
public class Directivo extends Empleado{
protected ArrayList<Empleado> EmpleadosA;
Scanner leer=new Scanner(System.in);
public Directivo(int codigo,String nombre, int edad, float sueldo){
super(codigo,nombre,edad,sueldo);

EmpleadosA=new ArrayList<>();


}

public void AgregarSubordinado(int codigo,String nombre, int edad, float sueldo){

if(Buscar(codigo) == null){
          
                EmpleadosA.add(new Empleado(codigo,nombre,edad,sueldo));

}


}


public Empleado Buscar(int n){
        for(Empleado cb :   EmpleadosA){
            if(cb.getCodigo_Empleado() == n)
                return cb;
        }
        return null;
    }

public  void Imprimir(){
for(int x=0;x<EmpleadosA.size();x++){
System.out.println("Subordinado"+x+" :"+super.imprimir());

}


}



}





    


