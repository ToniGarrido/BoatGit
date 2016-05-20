package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.enumeracions.EnumEstat;
import java.util.ArrayList;
import java.util.Date;

public class Reparacio {

    private static int contador = 0;
    private int id;
    private ArrayList<EmpleatReparacio> nEmpleats;
    private String lloc;
    private Date dataInici;
    private Date dataFinal;
    private String descripcio;
    private double preu;
    private EnumEstat estatReparacio;
    private String infoReparacio;
    private Vaixell vaixell;

    public Reparacio(String lloc, Date dataInici, Date dataFinal, String descripcio, double preu, EnumEstat estatReparacio, String infoReparacio, Vaixell vaixell) {
        contador++;
        id = contador;
        this.lloc = lloc;
        this.dataInici = dataInici;
        this.dataFinal = dataFinal;
        this.descripcio = descripcio;
        this.preu = preu;
        this.estatReparacio = estatReparacio;
        this.infoReparacio = infoReparacio;
        this.vaixell = vaixell;
        nEmpleats = new ArrayList<>();
    }

    public void afegirEmpleat(EmpleatReparacio empleat) {

        nEmpleats.add(empleat);
    }

    public void eliminarEmpleat(EmpleatReparacio empleat) {

        nEmpleats.remove(empleat);
    }

    public int getId() {
        return id;
    }

    public ArrayList<EmpleatReparacio> getnEmpleats() {
        return nEmpleats;
    }

    public String getLloc() {
        return lloc;
    }

    public Vaixell getVaixell() {
        return vaixell;
    }

    public Date getDataInici() {
        return dataInici;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public double getPreu() {
        return preu;
    }

    public EnumEstat getEstatReparacio() {
        return estatReparacio;
    }

    public String getInfoReparacio() {
        return infoReparacio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setnEmpleats(ArrayList<EmpleatReparacio> nEmpleats) {
        this.nEmpleats = nEmpleats;
    }

    public void setLloc(String lloc) {
        this.lloc = lloc;
    }

    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public void setEstatReparacio(EnumEstat estatReparacio) {
        this.estatReparacio = estatReparacio;
    }

    public void setInfoReparacio(String infoReparacio) {
        this.infoReparacio = infoReparacio;
    }

    @Override
    public String toString() {
        return "Reparacio{" + "id=" + id + ", nEmpleats=" + nEmpleats + ", lloc=" + lloc + ", dataInici=" + dataInici + ", dataFinal=" + dataFinal + ", descripcio=" + descripcio + ", preu=" + preu + ", estatReparacio=" + estatReparacio + ", infoReparacio=" + infoReparacio + '}';
    }

}
