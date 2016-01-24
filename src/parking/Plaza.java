/*atributos: vehiculo que alquila la plaza, n? de plaza, s�tano donde se encuentra, tipo 'C' para coche y 'M'
 para moto.
 m�todos: constructor con n? plaza y s�tano
 get() y set() de cada atributo.
 */
package parking;

public class Plaza {

    protected Vehiculo v;
    protected String sotano;
    protected Integer nplaza;
    protected Character tipov;

    public Plaza(Integer nplaza, String sotano) {
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

    public String getSotano() {
        return sotano;
    }

    public void setSotano(String sotano) {
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
     */

    public Integer calculaPrecio(Vehiculo v) {
        int precio = 0;
        if (tipov.equals("M")) {
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
        if (this.sotano.equals("Segundo")) {
            precio = precio - 5;
        }
        return precio;
    }
    /*N? Plaza: 58 S�tano: Segundo
     Veh�culo: 6785-FLM Seat Ibiza Azul (solo se mostrar� si est� ocupada por un veh�culo)
     Precio: 35 euros (solo se mostrar� si est� ocupada por un veh�culo)*/

    @Override
    public String toString() {
        String text;
        text = ("N�mero Plaza: " + getNplaza() +" "+ "S�tano: "+ getSotano());
        if (v!=null){
            text.concat("\n"+v.toString());
        }
        else{
            text.concat("\n+plaza vac�a");
        }
        return text;
    }
}
