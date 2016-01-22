/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

/**
 *
 * @author daw1
 */
public class Vehiculos {
        private String matricula, modelo, color, nif_dueno;
    private int telefono;

    public Vehiculos (String matricula, String nif_dueno) {
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

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
