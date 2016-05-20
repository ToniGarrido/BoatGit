package cat.iespaucasesnoves.boat.classes;

public class Motores extends Model {

    private boolean motorAux;
    private int capacitatDeposit;
    private int potencia;

    public Motores(String marca, double manega, double eslora, double calat, double preu, String nomModel, boolean enVenta, boolean motorAux, int capacitatDeposit, int potencia) {
        contador++;
        id = contador;
        this.marca = marca;
        this.manega = manega;
        this.eslora = eslora;
        this.calat = calat;
        this.preu = preu;
        this.nomModel = nomModel;
        this.enVenta = enVenta;
        this.motorAux = motorAux;
        this.capacitatDeposit = capacitatDeposit;
        this.potencia = potencia;
    }

    public boolean isMotorAux() {
        return motorAux;
    }

    public int getCapacitatDeposit() {
        return capacitatDeposit;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setMotorAux(boolean motorAux) {
        this.motorAux = motorAux;
    }

    public void setCapacitatDeposit(int capacitatDeposit) {
        this.capacitatDeposit = capacitatDeposit;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String toString() {
        return "Motores{" + "marca=" + marca + ", manega=" + manega + ", eslora=" + eslora + ", calat=" + calat + ", preu=" + preu + ", nomModel=" + nomModel + ", enVenta=" + enVenta + "motorAux=" + motorAux + ", capacitatDeposit=" + capacitatDeposit + ", potencia=" + potencia + '}';
    }

}
