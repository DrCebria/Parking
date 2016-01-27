package GestionParking;

import java.util.*;

public class GestionParking {

    public static void main(String[] args) {
        Coche c = new Coche("2653-G", "35597712Z", "Largo");
        int precio;
//        System.out.println(c.toString());
        Plaza p = new Plaza(1, 1);
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


