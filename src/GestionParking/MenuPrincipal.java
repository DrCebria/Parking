/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionParking;
import java.util.Scanner;

public class MenuPrincipal {

    static {
        int opciones;
        Scanner leer = new Scanner(System.in);
        Opcion1 op1 = null;
        Opcion2 op2 = null;
        Opcion3 op3 = null;
        System.out.println("Bienvenido al programa para la Gestion del Parking Wow");

        System.out.println("Menu principal");
        System.out.println("1.- Opcion1");
        System.out.println("2.- Opcion2");
        System.out.println("3.- Opcion3");
        System.out.println("Comandos: ") //Pretendo que el usuario escriba el numero de  opcion
        int menu = leer.nextInt();
        
        /*         case 1: {
                    System.out.println("?Acceso!");
                   System.out.println("Introduce tu numero de empleado: ");
                    nombre = ln.nextLine();
                    nombre = nombre.toUpperCase();     */
        // hacemos un do while?       
        switch (opciones) {
            case 1:
                op1 = new Opcion1();
                op1.ejecutaMetodo();
                break;

            case 2:
                op2 = new Opcion2();
                op2.ejecutaMetodo();
                String variable = op1.variableOpcion1;
                break;

            case 3:
                op3 = new Opcion3();
                op3.ejecutaMetodo();
                break;
        }

    }
  /*  catch(Exception e

    
        ){
				System.out.println("Uoop! Error!"); */
    }
}
