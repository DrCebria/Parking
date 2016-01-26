
package GestionParking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Parking {
   private Map<Integer,Plaza> listaPlaza=new HashMap<>();
   private String nombreParking, direccion;

    public Parking(String nombreParking) {
        this.nombreParking = nombreParking;
        String SNN;
        Plaza p1 = new Plaza(1,1);
        Plaza p2 = new Plaza(1,2);
        Plaza p3 = new Plaza(1,3);
        Plaza p4 = new Plaza(1,4);
        Plaza p5 = new Plaza(2,1);
        p5.setTipov('C');
        Plaza p6 = new Plaza(2,2);
        Plaza p7 = new Plaza(2,3);
        Plaza p8 = new Plaza(2,4);
        Coche c1 = new Coche("2653-G", "35597712Z", "Largo");
        p5.setVehiculo(c1);
        listaPlaza.put(11, p1);
        listaPlaza.put(12, p2);
        listaPlaza.put(13, p3);
        listaPlaza.put(14, p4);
        listaPlaza.put(21, p5);
        listaPlaza.put(22, p6);
        listaPlaza.put(23, p7);
        listaPlaza.put(24, p8);
        
        }

    public Map<Integer, Plaza> getListaPlaza() {
        return listaPlaza;
    }

    public void setListaPlaza(Map<Integer, Plaza> listaPlaza) {
        this.listaPlaza = listaPlaza;
    }

    public String getNombreParking() {
        return nombreParking;
    }

    public void setNombreParking(String nombreParking) {
        this.nombreParking = nombreParking;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   

}
