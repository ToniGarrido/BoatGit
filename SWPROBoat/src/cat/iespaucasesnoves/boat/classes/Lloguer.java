package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.enumeracions.EnumEstat;
import java.util.Date;

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
