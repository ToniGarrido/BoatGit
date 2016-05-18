package cat.iespaucasesnoves.boat.classes;

public class Persona {

    protected static int id;
    protected String nom;
    protected String llinatge;
    protected boolean dni;
    protected boolean nie;
    protected boolean passaport;
    protected String numeroDocument;
    protected String adreça;
    protected int telefon;
    protected String email;

    public static int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getLlinatge() {
        return llinatge;
    }

    public boolean isDni() {
        return dni;
    }

    public boolean isNie() {
        return nie;
    }

    public boolean isPassaport() {
        return passaport;
    }

    public String getNumeroDocument() {
        return numeroDocument;
    }

    public String getAdreça() {
        return adreça;
    }

    public int getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public static void setId(int id) {
        Persona.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLlinatge(String llinatge) {
        this.llinatge = llinatge;
    }

    public void setDni(boolean dni) {
        this.dni = dni;
    }

    public void setNie(boolean nie) {
        this.nie = nie;
    }

    public void setPassaport(boolean passaport) {
        this.passaport = passaport;
    }

    public void setNumeroDocument(String numeroDocument) {
        this.numeroDocument = numeroDocument;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
