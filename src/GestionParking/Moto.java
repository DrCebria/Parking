/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionParking;

public class Moto extends Vehiculo{
    private Integer nruedas;

    public Moto(String matricula, String nif_dueno) {
        super(matricula, nif_dueno);
    }

    public Integer getNruedas() {
        return nruedas;
    }

    public void setNruedas(Integer nruedas) {
        this.nruedas = nruedas;
    }

    
}
