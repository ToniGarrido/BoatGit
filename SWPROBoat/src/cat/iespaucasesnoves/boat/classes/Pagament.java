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

}
