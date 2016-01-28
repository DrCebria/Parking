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
        int menu, numeroplaza=0, resultadobaja, ganancias;
        String matricula, dni, tipovehiculo, tipocoche;
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
                if(tipovehiculo.equals("moto")){
                    Moto m = new Moto(matricula, dni);
                    numeroplaza=parking.alquilar(m);
                }
                if(tipovehiculo.equals("coche")){
                    System.out.println("Es un coche corto o largo?");
                    tipocoche=sc.next();
                    Coche c = new Coche(matricula,dni, tipocoche);
                    numeroplaza=parking.alquilar(c);
                }
                System.out.println("Tu plaza es la: " + numeroplaza);
            }
            if(menu==2){
                System.out.println("Introduce tu plaza: ");
                numeroplaza=sc.nextInt();
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
                ganancias=parking.ganancias();
                System.out.println("Total de ganancias: "+ganancias+" €");
            }
        } while (menu != 4);
        
    }

}
