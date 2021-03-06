package cat.iespaucasesnoves.boat.classes;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Empleat extends Persona implements Serializable {

    protected Date dataAlta;
    protected double sou;

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }

}
