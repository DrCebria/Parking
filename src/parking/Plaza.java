/*atributos: vehiculo que alquila la plaza, n? de plaza, sótano donde se encuentra, tipo 'C' para coche y 'M'
para moto.
métodos: constructor con n? plaza y sótano
 get() y set() de cada atributo.
*/
package parking;

public class Plaza {
    protected Vehiculo vehiculo;
    protected Integer nplaza, sotano;
    protected Character tipov;

    public Plaza(Integer nplaza, Integer sotano) {
        this.nplaza = nplaza;
        this.sotano = sotano;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
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

    public void setTipov(Character tipo) {
        this.tipov = tipo;
    }
   /*int precio() que calcula cuánto se paga según tipo de vehículo: Si es moto 25€, si es coche
corto 40€ y si es coche largo 55€. Si el sótano es el segundo se restan 5€.
String toString() que visualizará la siguiente información:
N? Plaza: 58 Sótano: Segundo
Vehículo: 6785-FLM Seat Ibiza Azul (solo se mostrará si está ocupada por un vehículo)
Precio: 35 euros (solo se mostrará si está ocupada por un vehículo)*/
    public Integer calculaPrecio(Vehiculo v){
        int precio=0;
        if (tipov.equals("M")){
            precio = 5;
        }
        else{
            if (v instanceof Coche){
                Coche c= (Coche) v;
               if (c.getTipoc().equals("Corto")){
                   
               } 
            } 
        }
        return precio;
    }
}
