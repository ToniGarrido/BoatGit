package cat.iespaucasesnoves.boat.classes;

import java.util.Date;

public class EmpleatComercial extends Empleat {

    private int percentatgeComissio;

    public EmpleatComercial(String nom, String llinatge, boolean dni, boolean nie, boolean passaport, String numeroDocument, String adreça, int telefon, String email, Date dataAlta, int sou, int percentatgeComissio) {

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

}
