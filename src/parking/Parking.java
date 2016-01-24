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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Moto c=new Moto("2653-G", "35597712Z");
        
       // System.out.println(c.toString());      
        Plaza p=new Plaza(35, "Primero");
        p.setVehiculo(c);
        System.out.println(p.toString());
    }
    
}
