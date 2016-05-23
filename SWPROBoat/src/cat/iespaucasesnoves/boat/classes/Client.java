package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.excepcions.LimitCaracterDocument;
import cat.iespaucasesnoves.boat.excepcions.LimitCaracterString;
import cat.iespaucasesnoves.boat.excepcions.LimitDeDocuments;
import java.io.Serializable;

public class Client extends Persona implements Serializable {

    private Pagament formaPagament;

    public Client(String nom, String llinatge, boolean dni, boolean nie, boolean passaport, String numeroDocument, String adreça, int telefon, String email, Pagament formaPagament) throws LimitCaracterString , LimitCaracterDocument, LimitDeDocuments{

        contador++;
        id=contador;
        this.nom = nom;
        this.llinatge = llinatge;
        this.dni = dni;
        this.nie = nie;
        this.passaport=passaport;
        this.numeroDocument = numeroDocument;
        this.adreça = adreça;
        this.telefon = telefon;
        this.email = email;
        this.formaPagament = formaPagament;
        
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

    public Pagament getFormaPagament() {
        return formaPagament;
    }

    public void setFormaPagament(Pagament formaPagament) {
        this.formaPagament = formaPagament;
    }
    
}
