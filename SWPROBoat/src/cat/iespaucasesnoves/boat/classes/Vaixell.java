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
public class Vaixell {

    private static int id;
    private Model model;
    private String matricula;
    private Client propietari;
    private boolean perLlogar;

    public Vaixell(Model model, String matricula, Client propietari, boolean perLlogar) {
        id++;
        this.model = model;
        this.matricula = matricula;
        this.propietari = propietari;
        this.perLlogar = perLlogar;
    }

    public void tornarJSON() {

    }

}
