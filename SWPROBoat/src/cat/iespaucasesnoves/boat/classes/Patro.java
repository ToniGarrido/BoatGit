package cat.iespaucasesnoves.boat.classes;

public class Patro extends Persona {

    private String titulacio;
    private double costServei;

    public Patro(String nom, String llinatge, boolean dni, boolean nie, boolean passaport, String numeroDocument, String adreça, int telefon, String email, String titulacio, double costServei) {

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
        this.titulacio = titulacio;
        this.costServei = costServei;

    }

    public String getTitulacio() {
        return titulacio;
    }

    public double getCostServei() {
        return costServei;
    }

    
}
