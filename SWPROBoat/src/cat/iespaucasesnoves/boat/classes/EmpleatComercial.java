package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.excepcions.LimitCaracterDocument;
import cat.iespaucasesnoves.boat.excepcions.LimitCaracterString;
import cat.iespaucasesnoves.boat.excepcions.LimitDeDocuments;
import java.util.Calendar;
import java.util.Date;

public class EmpleatComercial extends Empleat {

    private int percentatgeComissio;

    public EmpleatComercial(String nom, String llinatge, boolean dni, boolean nie, boolean passaport, String numeroDocument, String adreça, int telefon, String email, Date dataAlta, int sou, int percentatgeComissio) throws LimitCaracterString, LimitCaracterDocument, LimitDeDocuments {

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
        
        if(nom.length()>30 || llinatge.length()>30 || adreça.length()>30 || email.length()>30){
            throw new LimitCaracterString("S'han introduit mes de 30 caracters.");
        }
        
        if(numeroDocument.length()!=9){
            throw new LimitCaracterDocument("El document ha de contenir obligatoriament 9 caracters.");
        }
        
        if(dni==true && nie==true && passaport==true ||dni==true && nie==true||dni==true && passaport==true||nie==true && passaport==true){
            throw new LimitDeDocuments("S'ha elegit més d'un document");
        }

    }

    public int getPercentatgeComissio() {
        return percentatgeComissio;
    }

    public void setPercentatgeComissio(int percentatgeComissio) {
        this.percentatgeComissio = percentatgeComissio;
    }

    @Override
    public String toString() {
        return "EmpleatComercial{id=" + id + ", nom=" + nom + ", llinatge=" + llinatge + ", dni=" + dni + ", nie=" + nie + ", passaport=" + passaport + ", numeroDocument=" + numeroDocument + ", adre\u00e7a=" + adreça + ", telefon=" + telefon + ", email=" + email + "dataAlta=" + dataAlta + ", sou=" + sou + ", percentatgeComissio=" + percentatgeComissio + "}\n";
    }

}
