/*atributos: vehiculo que alquila la plaza, n? de plaza, s�tano donde se encuentra, tipo 'C' para coche y 'M'
para moto.
m�todos: constructor con n? plaza y s�tano
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
   /*int precio() que calcula cu�nto se paga seg�n tipo de veh�culo: Si es moto 25�, si es coche
corto 40� y si es coche largo 55�. Si el s�tano es el segundo se restan 5�.
String toString() que visualizar� la siguiente informaci�n:
N? Plaza: 58 S�tano: Segundo
Veh�culo: 6785-FLM Seat Ibiza Azul (solo se mostrar� si est� ocupada por un veh�culo)
Precio: 35 euros (solo se mostrar� si est� ocupada por un veh�culo)*/
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
