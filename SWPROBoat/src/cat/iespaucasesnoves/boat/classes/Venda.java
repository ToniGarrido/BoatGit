package cat.iespaucasesnoves.boat.classes;


import cat.iespaucasesnoves.boat.enumeracions.EnumEstat;
import java.util.Date;

public class Venda {

    private static int contador =0;
    private int id;
    private Client client;
    private Vaixell vaixell;
    private Date data;
    private double preu;
    private EnumEstat estatVenda;
    private EmpleatComercial empleat;

    public Venda(Client client, Vaixell vaixell, Date data, EnumEstat estatVenda, EmpleatComercial empleat) {
        contador++;
        id=contador;
        this.client = client;
        this.vaixell = vaixell;
        this.data = data;
        this.preu = vaixell.getModel().getPreu();
        this.estatVenda = estatVenda;
        this.empleat = empleat;
    }

    public  int getId() {
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

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", client=" + client + ", vaixell=" + vaixell + ", data=" + data + ", preu=" + preu + ", estatVenda=" + estatVenda + ", empleat=" + empleat + '}';
    }
    
    

}
