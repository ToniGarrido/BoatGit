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
public class Iots extends Model {

    private int nombreCamarots;
    private boolean capacitatEmbarAux;
    private int autonomia;
    private int potencia;

    public Iots(String marca, double manega, double eslora, double calat, double preu, String nomModel, boolean enVenta, int nombreCamarots, boolean capacitatEmbarAux, int autonomia, int potencia) {
        this.marca = marca;
        this.manega = manega;
        this.eslora = eslora;
        this.calat = calat;
        this.preu = preu;
        this.nomModel = nomModel;
        this.enVenta = enVenta;
        this.nombreCamarots = nombreCamarots;
        this.capacitatEmbarAux = capacitatEmbarAux;
        this.autonomia = autonomia;
        this.potencia = potencia;
    }

}
