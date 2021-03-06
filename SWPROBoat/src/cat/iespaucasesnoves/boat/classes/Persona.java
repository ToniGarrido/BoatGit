package cat.iespaucasesnoves.boat.classes;

import java.io.Serializable;

public class Persona implements Serializable {

    protected static int contador =0;
    protected int id;
    protected String nom;
    protected String llinatge;
    protected boolean dni;
    protected boolean nie;
    protected boolean passaport;
    protected String numeroDocument;
    protected String adreça;
    protected int telefon;
    protected String email;

    //Modificació de la classe
    
    public int getId() {
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

    public void setId(int id) {
        this.id = id;
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
