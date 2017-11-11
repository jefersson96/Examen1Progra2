/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1progra2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jefersson
 */
public class Examen1Progra2 {

    public static Empresa h = new Empresa("VENTA DE AUTOS");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 4) {

            System.out.println("-----Menu------");
            System.out.println("1- Ingresar personas \n2- Reportes \n3 -Buscar Empleado\n4 -Salir");

            System.out.println("Ingrese Opcion: ");
            opcion = leer.nextInt();
            try {

                switch (opcion) {

                    case 1:
                        int op = 0;
                        while (op != 4) {

                            System.out.println("-----Menu------");
                            System.out.println("1- Empleado \n2- Directivo \n3- Agregar Empleados a un directivo \n4 -Salir");

                            System.out.println("Ingrese Opcion: ");
                            op = leer.nextInt();
                            try {

                                switch (op) {

                                    case 1:
                                        System.out.print("Ingresar el Codigo del Empleado: ");
                                        int cod = leer.nextInt();
                                        System.out.print("Ingresar el Nombre del Empleado: ");
                                        String nom = leer.next();
                                        System.out.print("Ingresar el Edad del Empleado: ");
                                        int ed = leer.nextInt();
                                        System.out.print("Ingresar el Sueldo del Empleado: ");
                                        float suel = leer.nextFloat();
                                        h.addEmpleado(cod, nom, ed, suel, "EMPLEADO");
                                        break;

                                    case 2:
                                        
                                        
        System.out.print("Ingresar el Codigo del Empleado: ");
                                        int cod2 = leer.nextInt();
                                        System.out.print("Ingresar el Nombre del Directivo: ");
                                        String nom2 = leer.next();
                                        System.out.print("Ingresar el Edad del Directivo: ");
                                        int ed2 = leer.nextInt();
                                        System.out.print("Ingresar el Sueldo del Directivo: ");
                                        float suel2 = leer.nextFloat();                                
 h.addEmpleado(cod2, nom2, ed2, suel2, "DIRECTIVO");
                                        break;
                                    case 3:
                                       System.out.print("Ingrese el nombre del directivo a buscar :");
                                       String direc=leer.next();
                                       h.AddSubordinados(direc);
                                       
                                        
                                        break;
                                    case 4:
                                       
                                        break;

                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un número");
                                leer.next();
                            }
                        }
                        break;

                    case 2:
h.imprimir();
                        break;
                    case 4:
                     System.exit(0);  
                        break;
                    case 3:
         System.out.print("Ingrese el codigo del empleado :");
         int n=leer.nextInt();
         
h.Buscar(n);
                    case 5:

                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                leer.next();
            }
        }
    }

}
