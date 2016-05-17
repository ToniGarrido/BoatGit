/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.enumeracions.EnumHabilitats;
import java.util.ArrayList;

/**
 *
 * @author Toni
 */
public class EmpleatReparacio extends Empleat{
    
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
        this.dataAlta=dataAlta;
        this.sou=sou;
        habilitat=new ArrayList<>();

    }
}
