package GestionParking;

import java.util.*;

public class GestionParking {

    public static void main(String[] args) {
        Coche c = new Coche("2653-G", "35597712Z", "Largo");
        int precio;
//        System.out.println(c.toString());
        Plaza p = new Plaza(1, 1);
//Menu principal del juego// 

{
int opciones;
Scanner leer = new Scanner(System.in);
Opcion1 op1=null;
Opcion2 op2=null;
Opcion3 op3=null;
 
System.out.println("Menu por consola");
System.out.println("1.- Opcion1");
System.out.println("2.- Opcion2");
System.out.println("3.- Opcion3");
System.out.println("Comandos: ") //Pretendo que el usuario escriba el numero de  opcion
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


//       p.setTipov('C'); p.setVehiculo(c);
       
//        precio = p.calculaPrecio(c);
//        System.out.println(p.toString() + "\n" + "Precio: " + precio + " €");
        Moto m=new Moto("3647-K", "35597713S");
        Parking parking = new Parking("Parking to guapo");
        System.out.println();
        System.out.println(parking.alquilar(m));
        System.out.println(parking.darBaja(24));
        System.out.println(parking.ganancias());
        }
    }


