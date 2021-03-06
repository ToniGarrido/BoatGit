package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.excepcions.LimitCaracterString;
import java.io.Serializable;

public class Iots extends Model implements Serializable{

    private int nombreCamarots;
    private boolean capacitatEmbarAux;
    private int autonomia;
    private int potencia;

    public Iots(String marca, double manega, double eslora, double calat, double preu, String nomModel, boolean enVenta, int nombreCamarots, boolean capacitatEmbarAux, int autonomia, int potencia) throws LimitCaracterString {
        contador++;
        id = contador;
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

        if (marca.length() > 30 || nomModel.length() > 30) {
            throw new LimitCaracterString("S'han introduit mes de 30 caracters.");
        }
    }

    public int getNombreCamarots() {
        return nombreCamarots;
    }

    public boolean isCapacitatEmbarAux() {
        return capacitatEmbarAux;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setNombreCamarots(int nombreCamarots) {
        this.nombreCamarots = nombreCamarots;
    }

    public void setCapacitatEmbarAux(boolean capacitatEmbarAux) {
        this.capacitatEmbarAux = capacitatEmbarAux;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String toString() {
        return "Iots{" + "marca=" + marca + ", manega=" + manega + ", eslora=" + eslora + ", calat=" + calat + ", preu=" + preu + ", nomModel=" + nomModel + ", enVenta=" + enVenta + " ,nombreCamarots=" + nombreCamarots + ", capacitatEmbarAux=" + capacitatEmbarAux + ", autonomia=" + autonomia + ", potencia=" + potencia + "}\n";
    }

}
