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

    public static int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Vaixell getVaixell() {
        return vaixell;
    }

    public Date getData() {
        return data;
    }

    public double getPreu() {
        return preu;
    }

    public EnumEstat getEstatVenda() {
        return estatVenda;
    }

    public EmpleatComercial getEmpleat() {
        return empleat;
    }

    public static void setId(int id) {
        Venda.id = id;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setVaixell(Vaixell vaixell) {
        this.vaixell = vaixell;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public void setEstatVenda(EnumEstat estatVenda) {
        this.estatVenda = estatVenda;
    }

    public void setEmpleat(EmpleatComercial empleat) {
        this.empleat = empleat;
    }

}
