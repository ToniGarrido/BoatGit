/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.enumeracions.EnumEstat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Toni
 */
public class Reparacio {

    private static int id;
    private ArrayList<EmpleatReparacio> nEmpleats;
    private String lloc;
    private Date dataInici;
    private Date dataFinal;
    private String descripcio;
    private double preu;
    private EnumEstat estatReparacio;
    private String infoReparacio;

    public Reparacio(ArrayList<EmpleatReparacio> nEmpleats, String lloc, Date dataInici, Date dataFinal, String descripcio, double preu, EnumEstat estatReparacio, String infoReparacio) {
        this.nEmpleats = nEmpleats;
        this.lloc = lloc;
        this.dataInici = dataInici;
        this.dataFinal = dataFinal;
        this.descripcio = descripcio;
        this.preu = preu;
        this.estatReparacio = estatReparacio;
        this.infoReparacio = infoReparacio;
        nEmpleats = new ArrayList<>();
    }
    
    public void afegirEmpleat(EmpleatReparacio empleat){
        
        nEmpleats.add(empleat);
    }
    
    public void eliminarEmpleat(EmpleatReparacio empleat){
        
        nEmpleats.remove(empleat);
    }

}
