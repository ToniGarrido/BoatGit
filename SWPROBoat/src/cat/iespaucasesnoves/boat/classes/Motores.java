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
public class Motores extends Model {

    private boolean motorAux;
    private int capacitatDeposit;
    private int potencia;

    public Motores(String marca, double manega, double eslora, double calat, double preu, String nomModel, boolean enVenta, boolean motorAux, int capacitatDeposit, int potencia) {
        this.marca = marca;
        this.manega = manega;
        this.eslora = eslora;
        this.calat = calat;
        this.preu = preu;
        this.nomModel = nomModel;
        this.enVenta = enVenta;
        this.potencia = potencia;
        this.motorAux = motorAux;
        this.capacitatDeposit = capacitatDeposit;
        this.potencia = potencia;
    }
}
