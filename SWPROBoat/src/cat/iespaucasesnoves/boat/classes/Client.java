package cat.iespaucasesnoves.boat.classes;

public class Client extends Persona {

    private Pagament formaPagament;

    public Client(String nom, String llinatge, boolean dni, boolean nie, boolean passaport, String numeroDocument, String adreça, int telefon, String email, Pagament formaPagament) {

        this.nom = nom;
        this.llinatge = llinatge;
        this.dni = dni;
        this.nie = nie;
        this.numeroDocument = numeroDocument;
        this.adreça = adreça;
        this.telefon = telefon;
        this.email = email;
        this.formaPagament = formaPagament;
    }
}
