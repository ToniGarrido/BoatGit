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
public class Venda {

    private static int id;
    private Client client;
    private Vaixell vaixell;
    private Date data;
    private double preu;
    private EnumEstat estatVenda;
    private EmpleatComercial empleat;

    public Venda(Client client, Vaixell vaixell, Date data, double preu, EnumEstat estatVenda, EmpleatComercial empleat) {
        this.client = client;
        this.vaixell = vaixell;
        this.data = data;
        this.preu = preu;
        this.estatVenda = estatVenda;
        this.empleat = empleat;
    }

}
