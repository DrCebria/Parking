
package GestionParking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Parking {
   Map<String,Plaza> listaPlaza=new HashMap<>();
   protected String nombreParking, direccion;

    public Parking(String nombreParking) {
        this.nombreParking = nombreParking;
        String SNN;
        Plaza p1 = new Plaza(1,1);
        Plaza p2 = new Plaza(1,2);
        Plaza p3 = new Plaza(1,3);
        Plaza p4 = new Plaza(1,4);
        Plaza p5 = new Plaza(2,1);
        Plaza p6 = new Plaza(2,2);
        Plaza p7 = new Plaza(2,3);
        Plaza p8 = new Plaza(2,4);
        Coche c1 = new Coche("2653-G", "35597712Z", "Largo");
        
        
    }

    public Map<String, Plaza> getListaPlaza() {
        return listaPlaza;
    }

    public void setListaPlaza(Map<String, Plaza> listaPlaza) {
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
