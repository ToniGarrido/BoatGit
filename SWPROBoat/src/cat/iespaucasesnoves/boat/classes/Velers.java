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
public class Velers extends Model {

    private int nombreCascs;
    private int nomnbrePals;
    private int nombreCabines;

    public Velers(String marca, double manega, double eslora, double calat, double preu, String nomModel, boolean enVenta, int nombreCascs, int nomnbrePals, int nombreCabines) {
        this.marca = marca;
        this.manega = manega;
        this.eslora = eslora;
        this.calat = calat;
        this.preu = preu;
        this.nomModel = nomModel;
        this.enVenta = enVenta;
        this.nombreCascs = nombreCascs;
        this.nomnbrePals = nomnbrePals;
        this.nombreCabines = nombreCabines;
    }
}
