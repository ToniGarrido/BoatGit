package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.enumeracions.EnumHabilitats;
import java.util.ArrayList;

public class EmpleatReparacio extends Empleat {

    ArrayList<EnumHabilitats> habilitat;

    public EmpleatReparacio(String nom, String llinatge, boolean dni, boolean nie, boolean passaport, String numeroDocument, String adreça, int telefon, String email) {

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
        habilitat = new ArrayList<>();

    }
}
