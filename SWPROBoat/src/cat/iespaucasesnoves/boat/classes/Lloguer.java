/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.enumeracions.EnumEstat;
import java.util.Date;

/**
 *
 * @author Toni
 */
public class Lloguer {

    protected static int id;
    protected boolean tePatro;
    protected Date dataInicial;
    protected Date dataFinal;
    protected Client client;
    protected Patro patro;
    protected EnumEstat estatLloger;
    protected Vaixell vaixell;

    public Lloguer(boolean tePatro, Date dataInicial, Date dataFinal, Client client, EnumEstat estatLloger, Vaixell vaixell) {
        this.tePatro = tePatro;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.client = client;
        this.estatLloger = estatLloger;
        this.vaixell = vaixell;
    }

}
