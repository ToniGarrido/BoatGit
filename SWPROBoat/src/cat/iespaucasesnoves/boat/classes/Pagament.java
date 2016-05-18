package cat.iespaucasesnoves.boat.classes;

public class Pagament {

    private String comptaCorrent;
    private int numero;
    private int mes;
    private int any;
    private int codiVerificacio;

    public Pagament(String comptaCorrent) {
        this.comptaCorrent = comptaCorrent;
    }

    public Pagament(int numero, int mes, int any, int codiVerificacio) {
        this.numero = numero;
        this.mes = mes;
        this.any = any;
        this.codiVerificacio = codiVerificacio;
    }

    public String getComptaCorrent() {
        return comptaCorrent;
    }

    public int getNumero() {
        return numero;
    }

    public int getMes() {
        return mes;
    }

    public int getAny() {
        return any;
    }

    public int getCodiVerificacio() {
        return codiVerificacio;
    }

    @Override
    public String toString() {
        return "Pagament{" + "comptaCorrent=" + comptaCorrent + ", numero=" + numero + ", mes=" + mes + ", any=" + any + ", codiVerificacio=" + codiVerificacio + '}';
    }
    

}
