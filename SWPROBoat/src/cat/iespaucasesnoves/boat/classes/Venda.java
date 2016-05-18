package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.enumeracions.EnumEstat;
import java.util.Date;

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
