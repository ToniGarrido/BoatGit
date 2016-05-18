package cat.iespaucasesnoves.boat.classes;

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
