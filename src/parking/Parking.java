/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

/*  en la clase vehiculo falta String toString() que concatena los datos del vehículo segun formato:
"6785-FLM Seat Ibiza azul"
 */
public class Parking {

    public static void main(String[] args) {
        Coche c=new Coche ("2653-G", "35597712Z", "Largo");
        int precio=0;
       System.out.println(c.toString());      
        Plaza p=new Plaza(35, "Segundo");
        p.setVehiculo(c);
        p.setTipov('C');
        precio= p.calculaPrecio(c);
        System.out.println(p.toString()+"\n"+"Precio: "+precio+" €");
    }
    
}
