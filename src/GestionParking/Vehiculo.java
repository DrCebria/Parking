
package GestionParking;

public abstract class Vehiculo {
    private String matricula, modelo, color, nif_dueno;
    private Integer telefono;

    public Vehiculo (String matricula, String nif_dueno) {
        this.matricula = matricula;
        this.nif_dueno = nif_dueno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNif_dueno() {
        return nif_dueno;
    }

    public void setNif_dueno(String nif_dueno) {
        this.nif_dueno = nif_dueno;
    }

    public int getTelefono() {
        return telefono;
    }

    public boolean setTelefono(int telefono) {
        boolean a=true;
        if((599999999<telefono)&&(telefono<799999999)){
        this.telefono = telefono;
        return a;}
        a=false;
        return a;
    }
@Override

public String toString(){
    return matricula+" "+modelo+" "+color;
}
    
}
