
package GestionParking;

public class Plaza {

    private Vehiculo v;
    private Integer sotano;
    private Integer nplaza;
    private Character tipov;

    public Plaza(Integer sotano, Integer nplaza) {
        this.nplaza = nplaza;
        this.sotano = sotano;
    }

    public Vehiculo getVehiculo() {
        return v;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.v = vehiculo;
    }

    public Integer getNplaza() {
        return nplaza;
    }

    public void setNplaza(Integer nplaza) {
        this.nplaza = nplaza;
    }

    public Integer getSotano() {
        return sotano;
    }

    public void setSotano(Integer sotano) {
        this.sotano = sotano;
    }

    public Character getTipov() {
        return tipov;
    }

    public void setTipov(Character tipov) {
        this.tipov = tipov;
    }
    /*int precio() que calcula cuánto se paga según tipo de vehículo: Si es moto 25€, si es coche
     corto 40€ y si es coche largo 55€. Si el sótano es el segundo se restan 5€.
     String toString() que visualizará la siguiente información:
     */

    public Integer calculaPrecio(Vehiculo v) {
        int precio = 0;
        if (tipov.equals('M')) {
            precio = 25;
        } else {
            if (v instanceof Coche) {
                Coche c = (Coche) v;
                if (c.getTipoc().equals("Corto")) {
                    precio = 40;
                } else {
                    precio = 55;
                }
            }
        }
        if (sotano == 2) {
            precio = precio - 5;
        }
        return precio;
    }
    /*N? Plaza: 58 Sótano: Segundo
     Vehículo: 6785-FLM Seat Ibiza Azul (solo se mostrará si está ocupada por un vehículo)
     Precio: 35 euros (solo se mostrará si está ocupada por un vehículo)*/

    @Override
    public String toString(){
        String text="Sótano: "+sotano+" Num Plaza: " +nplaza;
        if (v==null){
            text=text.concat(" No hay vehiculo en esta plaza\n");
      
        }
        else{
            text=text.concat(" "+v.toString());
            
        }
        
       return text;
    }
        
    
}
