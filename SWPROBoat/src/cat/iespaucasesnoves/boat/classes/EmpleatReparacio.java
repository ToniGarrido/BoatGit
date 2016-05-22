package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.enumeracions.EnumHabilitats;
import cat.iespaucasesnoves.boat.excepcions.LimitCaracterDocument;
import cat.iespaucasesnoves.boat.excepcions.LimitCaracterString;
import cat.iespaucasesnoves.boat.excepcions.LimitDeDocuments;
import java.util.ArrayList;
import java.util.Date;

public class EmpleatReparacio extends Empleat {

    private ArrayList<EnumHabilitats> llistaHabilitats;

    public EmpleatReparacio(String nom, String llinatge, boolean dni, boolean nie, boolean passaport, String numeroDocument, String adreça, int telefon, String email, Date dataAlta, int sou) throws LimitCaracterString, LimitCaracterDocument, LimitDeDocuments {

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
        llistaHabilitats = new ArrayList<>();
        
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

    public ArrayList<EnumHabilitats> getHabilitat() {
        return llistaHabilitats;
    }

    public void setHabilitat(ArrayList<EnumHabilitats> habilitat) {
        this.llistaHabilitats = habilitat;
    }

    public void afegirHabilitat(EnumHabilitats habilitat) {

        llistaHabilitats.add(habilitat);

    }
    
    public void eliminarHabilitat(EnumHabilitats habilitat) {

        llistaHabilitats.remove(habilitat);

    }

    @Override
    public String toString() {
        return "EmpleatRepracio{id=" + id + ", nom=" + nom + ", llinatge=" + llinatge + ", dni=" + dni + ", nie=" + nie + ", passaport=" + passaport + ", numeroDocument=" + numeroDocument + ", adre\u00e7a=" + adreça + ", telefon=" + telefon + ", email=" + email + "dataAlta=" + dataAlta + ", sou=" + sou + ", habilitats=" + llistaHabilitats + "}";
    }

}
