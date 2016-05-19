package cat.iespaucasesnoves.boat.classes;

import java.util.Calendar;
import java.util.Date;

public class EmpleatComercial extends Empleat {

    private int percentatgeComissio;

    public EmpleatComercial(String nom, String llinatge, boolean dni, boolean nie, boolean passaport, String numeroDocument, String adreça, int telefon, String email, Calendar dataAlta, int sou, int percentatgeComissio) {

        contador++;
        id = contador;
        this.nom = nom;
        this.llinatge = llinatge;
        this.dni = dni;
        this.nie = nie;
        this.numeroDocument = numeroDocument;
        this.adreça = adreça;
        this.telefon = telefon;
        this.email = email;
        this.dataAlta = dataAlta;
        this.sou = sou;
        this.percentatgeComissio = percentatgeComissio;

    }

    public int getPercentatgeComissio() {
        return percentatgeComissio;
    }

    public void setPercentatgeComissio(int percentatgeComissio) {
        this.percentatgeComissio = percentatgeComissio;
    }

    @Override
    public String toString() {
        return "EmpleatComercial{id=" + id + ", nom=" + nom + ", llinatge=" + llinatge + ", dni=" + dni + ", nie=" + nie + ", passaport=" + passaport + ", numeroDocument=" + numeroDocument + ", adre\u00e7a=" + adreça + ", telefon=" + telefon + ", email=" + email + "dataAlta=" + dataAlta + ", sou=" + sou + ", percentatgeComissio=" + percentatgeComissio + "}";
    }

}
