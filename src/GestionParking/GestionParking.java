package GestionParking;

import java.util.*;

public class GestionParking {

    public static void main(String[] args) {
        int precio;
//        System.out.println(c.toString());
        Plaza p = new Plaza(1, 1);
//Menu principal del juego// 


//       p.setTipov('C'); p.setVehiculo(c);

//        precio = p.calculaPrecio(c);
//        System.out.println(p.toString() + "\n" + "Precio: " + precio + " €");
        Parking parking = new Parking("Parking to guapo");
//1
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la gestión del Parking:\n");
        int menu, resultadobaja, gananciastotales;
        String matricula,  numeroplaza,dni, tipovehiculo, tipocoche;
        do {
            System.out.println("\t\t|Menú principal\t|\n"
                    + "\t|1. Alquilar una plaza \t\t|\n"
                    + "\t|2. Abandonar el alquiler \t|\n"
                    + "\t|3. Ganancias del Parking\t|\n"
                    + "\t|4. Cierre\t\t\t|");
            menu = sc.nextInt();
            
            if(menu==1){
                System.out.println("Introduce la matricula del vehiculo");
                matricula = sc.next();
                System.out.println("Introduce tu dni");
                dni = sc.next();
                System.out.println("Es moto o coche?");
                tipovehiculo = sc.next();
                if(tipovehiculo.equalsIgnoreCase("moto")){
                    Moto m = new Moto(matricula, dni);
                    System.out.println("Tu plaza es la: " + parking.alquilar(m));

                }
                if(tipovehiculo.equalsIgnoreCase("coche")){
                    System.out.println("Es un coche corto o largo?");
                    tipocoche=sc.next();
                    Coche c = new Coche(matricula,dni, tipocoche);
                    System.out.println("Tu plaza es la: " + parking.alquilar(c));
                }
                
            }
            if(menu==2){
                System.out.println("Introduce tu plaza: ");
                numeroplaza=sc.next();
                resultadobaja=parking.darBaja(numeroplaza);
                if(resultadobaja==0){
                    System.out.println("Dado de baja correctamente");
                }
                if(resultadobaja==1){
                    System.out.println("No existe la plaza");
                }
                if(resultadobaja==2){
                    System.out.println("No estaba ocupada");
                }
            }
            if(menu==3){
                gananciastotales=parking.ganancias();
                System.out.println("Total de ganancias: "+gananciastotales+" €");
            }
        } while (menu != 4);
        
    }

}
