/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

public class Coche extends Vehiculos{
    private String tipo;

    public Coche( String matricula, String nif_dueno, String tipo) {
        super(matricula, nif_dueno);
        if (tipo.equals("Corto")|tipo.equals("Largo"))       
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean setTipo(String tipo) {
        boolean a=false;
        if(tipo.equals("Corto")|tipo.equals("Largo")){
        this.tipo = tipo;
        a=true;
        return a;
        }
            return a;
    }
    
    
}
