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

    public static int getId() {
        return id;
    }

    public boolean isTePatro() {
        return tePatro;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public Client getClient() {
        return client;
    }

    public Patro getPatro() {
        return patro;
    }

    public EnumEstat getEstatLloger() {
        return estatLloger;
    }

    public Vaixell getVaixell() {
        return vaixell;
    }

    public static void setId(int id) {
        Lloguer.id = id;
    }

    public void setTePatro(boolean tePatro) {
        this.tePatro = tePatro;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setPatro(Patro patro) {
        this.patro = patro;
    }

    public void setEstatLloger(EnumEstat estatLloger) {
        this.estatLloger = estatLloger;
    }

    public void setVaixell(Vaixell vaixell) {
        this.vaixell = vaixell;
    }

}
