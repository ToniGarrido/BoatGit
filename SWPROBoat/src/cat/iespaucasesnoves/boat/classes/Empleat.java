package cat.iespaucasesnoves.boat.classes;

import java.util.Calendar;
import java.util.Date;

public class Empleat extends Persona {

    protected Calendar dataAlta;
    protected double sou;

    public Calendar getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Calendar dataAlta) {
        this.dataAlta = dataAlta;
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }

    @Override
    public String toString() {
        return "Empleat{" + "dataAlta=" + dataAlta + ", sou=" + sou + '}';
    }
    
    
    
}
