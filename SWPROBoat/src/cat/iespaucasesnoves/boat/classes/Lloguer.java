package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.enumeracions.EnumEstat;
import cat.iespaucasesnoves.boat.excepcions.PatroException;
import java.io.Serializable;
import java.util.Date;

public class Lloguer implements Serializable {

    private static int contador = 0;
    private int id;
    private boolean tePatro;
    private Date dataInicial;
    private Date dataFinal;
    private Client client;
    private Patro patro;
    private EnumEstat estatLloger;
    private Vaixell vaixell;

    public Lloguer(boolean tePatro, Date dataInicial, Date dataFinal, Client client, EnumEstat estatLloger, Vaixell vaixell) throws PatroException {
        contador++;
        id = contador;
        this.tePatro = tePatro;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.client = client;
        this.estatLloger = estatLloger;
        this.vaixell = vaixell;

        if (tePatro == true) {
            throw new PatroException("Si te patro s'ha d'indicar quin patro és.");
        }
    }

    public Lloguer(boolean tePatro, Patro patro, Date dataInicial, Date dataFinal, Client client, EnumEstat estatLloger, Vaixell vaixell) throws PatroException {
        contador++;
        id = contador;
        this.tePatro = tePatro;
        this.patro = patro;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.client = client;
        this.estatLloger = estatLloger;
        this.vaixell = vaixell;

        if (tePatro == false) {
            throw new PatroException("S'ha d'indicar true si s'ha indicat un patró.");
        }
    }

    public int getId() {
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

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Lloguer{" + "id=" + id + ", tePatro=" + tePatro + ", dataInicial=" + dataInicial + ", dataFinal=" + dataFinal + ", client=" + client + ", patro=" + patro + ", estatLloger=" + estatLloger + ", vaixell=" + vaixell + '}';
    }

}
