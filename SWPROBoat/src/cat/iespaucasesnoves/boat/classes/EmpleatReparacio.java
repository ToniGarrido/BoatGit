package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.enumeracions.EnumHabilitats;
import java.util.ArrayList;
import java.util.Date;

public class EmpleatReparacio extends Empleat {

    ArrayList<EnumHabilitats> habilitat;

    public EmpleatReparacio(String nom, String llinatge, boolean dni, boolean nie, boolean passaport, String numeroDocument, String adreça, int telefon, String email,Date dataAlta,int sou) {

        contador++;
        id=contador;
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

    public ArrayList<EnumHabilitats> getHabilitat() {
        return habilitat;
    }

    public void setHabilitat(ArrayList<EnumHabilitats> habilitat) {
        this.habilitat = habilitat;
    }
    
}
