/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionParking;

public class Coche extends Vehiculo{
    private String tipoc;

    public Coche( String matricula, String nif_dueno, String tipo) {
        super(matricula, nif_dueno);
        if (tipo.equals("Corto")|tipo.equals("Largo"))       
        this.tipoc = tipo;
    }

    public String getTipoc() {
        return tipoc;
    }

    public boolean setTipoc(String tipo) {
        boolean a=false;
        if(tipo.equals("Corto")|tipo.equals("Largo")){
        this.tipoc = tipo;
        a=true;
        return a;
        }
            return a;
    }
    
    
}
