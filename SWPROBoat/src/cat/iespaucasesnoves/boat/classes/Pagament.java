package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.excepcions.LimitNumeroTargeta;

public class Pagament {

    private String comptaCorrent;
    private String numero;
    private int mes;
    private int any;
    private int codiVerificacio;

    public Pagament(String comptaCorrent) {
        this.comptaCorrent = comptaCorrent;
    }

    public Pagament(String numero, int mes, int any, int codiVerificacio) throws LimitNumeroTargeta {
        this.numero = numero;
        this.mes = mes;
        this.any = any;
        this.codiVerificacio = codiVerificacio;
        
        if(numero.length()!=16){
            throw new LimitNumeroTargeta("El numero de targeta ha de contenir 16 caràcters.");
        }
    }

    public String getComptaCorrent() {
        return comptaCorrent;
    }

    public String getNumero() {
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
