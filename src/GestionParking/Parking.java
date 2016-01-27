package GestionParking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

public class Parking {

    private Map<Integer, Plaza> listaPlaza = new HashMap<>();
    private String nombreParking, direccion;

    public Parking(String nombreParking) {
        this.nombreParking = nombreParking;
        String SNN;
        Plaza p1 = new Plaza(1, 1);
        p1.setTipov('C');
        Plaza p2 = new Plaza(1, 2);
        p2.setTipov('C');
        Plaza p3 = new Plaza(1, 3);
        p3.setTipov('C');
        Plaza p4 = new Plaza(1, 4);
        p4.setTipov('C');
        Plaza p5 = new Plaza(2, 1);
        p5.setTipov('C');
        Plaza p6 = new Plaza(2, 2);
        p6.setTipov('C');
        Plaza p7 = new Plaza(2, 3);
        p7.setTipov('C');
        Plaza p8 = new Plaza(2, 4);
        p8.setTipov('M');
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

/*String alquilar(Vehiculo vehiculo) que deberá recorrer la colección de plazas, según el tipo de
vehiculo, buscando una libre y asociarle el vehiculo. El método devolverá el n? de plaza asignada,
si no hay ninguna plaza libre devolverá null*/

    public Integer alquilar(Vehiculo v) {
        Iterator<Integer> it = listaPlaza.keySet().iterator();

        while (it.hasNext()) {
            Integer SNN = it.next();
            Plaza p = listaPlaza.get(SNN);

            if (p.getTipov() == 'C' && v instanceof Coche && p.getVehiculo() == null
                    || p.getTipov() == 'M' && v instanceof Moto && p.getVehiculo() == null) {
                p.setVehiculo(v);
                return SNN;

            }
        }
        return null;
    }
/*int darBaja(int numPlaza), buscará la plaza pasada como parámetro y si estaba ocupada por un
vehiculo borrará ese dato y devolverá 0, en caso contrario devolverá 1 si no existe la plaza ó 2 si
no estaba ocupada.*/

    public Integer darBaja(Integer numPlaza) {
        Iterator<Integer> it = listaPlaza.keySet().iterator();
        while (it.hasNext()) {
            Integer SNN = it.next();
            Plaza p = listaPlaza.get(SNN);
            if (numPlaza == SNN) {
                if (p.getVehiculo() != null) {
                    p.setVehiculo(null);
                    return 0;
                } else {
                    return 1;
                }
            }
        }
        return 2;

    }
/*List<Plaza> listarPlazas(String estado, char tipoVehiculo), generará un listado de plazas
según el tipo pasado por parámetro (estado será: "libres" u "ocupadas", y tipoVehiculo será: 'C' ó 'M')*/ 
    
    public List<Plaza> listarPlazas(String estado, char tipov) {
        List<Plaza> listarPlazas = new ArrayList();
        Iterator<Integer> it = listaPlaza.keySet().iterator();
        while (it.hasNext()) {
            Integer SNN = it.next();
            Plaza p = listaPlaza.get(SNN);
            if (p.getTipov() == tipov && p.getVehiculo() == null && estado.equals("libres")) {
                listarPlazas.add(p);
            }
            if (p.getTipov() == tipov && p.getVehiculo() != null && estado.equals("ocupadas")) {
                listarPlazas.add(p);
            }
        }
        return listarPlazas;
    }
/*int ganancias(), calculará el dinero que gana el parking según todas las plazas que tiene
alquiladas, es decir ocupadas. (Para obtenerlas usará el método listarPlazas())*/
    public Integer ganancias() {
        int total=0;
        for(Plaza p : listarPlazas("ocupadas", 'M')) {
            total = total + p.calculaPrecio(p.getVehiculo());
        }
        for(Plaza p : listarPlazas("ocupadas", 'C')) {
            total = total + p.calculaPrecio(p.getVehiculo());
        }
        
        return total;
    }

}
