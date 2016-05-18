package cat.iespaucasesnoves.boat.classes;

public class Model {

    protected String marca;
    protected double manega;
    protected double eslora;
    protected double calat;
    protected double preu;
    protected String nomModel;
    protected boolean enVenta;

    public String getMarca() {
        return marca;
    }

    public double getManega() {
        return manega;
    }

    public double getEslora() {
        return eslora;
    }

    public double getCalat() {
        return calat;
    }

    public double getPreu() {
        return preu;
    }

    public String getNomModel() {
        return nomModel;
    }

    public boolean isEnVenta() {
        return enVenta;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setManega(double manega) {
        this.manega = manega;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public void setCalat(double calat) {
        this.calat = calat;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public void setNomModel(String nomModel) {
        this.nomModel = nomModel;
    }

    public void setEnVenta(boolean enVenta) {
        this.enVenta = enVenta;
    }

}
