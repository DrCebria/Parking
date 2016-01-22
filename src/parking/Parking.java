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
        Coche c=new Coche("25262", "adgdsa", "Corto");
        System.out.println(c.getTipoc());      
        
    }
    
}
