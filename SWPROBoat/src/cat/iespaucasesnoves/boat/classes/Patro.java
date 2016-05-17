/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boat.classes;

/**
 *
 * @author Toni
 */
public class Patro extends Persona {

    private String titulacio;
    private double costServei;

    public Patro(String nom, String llinatge, boolean dni, boolean nie, boolean passaport, String numeroDocument, String adreça, int telefon, String email, String titulacio, double costServei) {

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

}
