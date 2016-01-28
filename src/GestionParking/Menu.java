/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionParking;

import java.util.Scanner;

/**
 *
 * @author basko
 */
class Menu
{
public static void main(String[] args)
{
int opciones;
Scanner leer = new Scanner(System.in);
Opcion1 op1=null;
Opcion2 op2=null;
Opcion3 op3=null;
 
System.out.println("Menu por consola");
System.out.println("1.- op1");
System.out.println("2.- op2");
System.out.println("3.- op2");
System.out.println("Comandos: "); //Pretendo que el usuario escriba el numero de  opcion
opciones=leer.nexInt();
 
switch(opciones) {
case 1: 
op1=new Opcion1();
op1.ejecutaMetodo();
break;
 
case 2:
op2=new Opcion2();
op2.ejecutaMetodo();
String variable = op1.variableOpcion1;
break;
 
case 3: 
op3=new Opcion3();
op3.ejecutaMetodo();
break;
}
}

} //catch(Exception error) 
//{ 
///System.out.println("genero error: "+error); 
//} 
} 