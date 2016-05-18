package cat.iespaucasesnoves.boat.classes;

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

    public int getNombreCascs() {
        return nombreCascs;
    }

    public int getNomnbrePals() {
        return nomnbrePals;
    }

    public int getNombreCabines() {
        return nombreCabines;
    }

    public void setNombreCascs(int nombreCascs) {
        this.nombreCascs = nombreCascs;
    }

    public void setNomnbrePals(int nomnbrePals) {
        this.nomnbrePals = nomnbrePals;
    }

    public void setNombreCabines(int nombreCabines) {
        this.nombreCabines = nombreCabines;
    }
    
   @Override
    public String toString() {
        return "Model{" + "marca=" + marca + ", manega=" + manega + ", eslora=" + eslora + ", calat=" + calat + ", preu=" + preu + ", nomModel=" + nomModel + ", enVenta=" + enVenta + "nombreCascs=" + nombreCascs + ", nomnbrePals=" + nomnbrePals + ", nombreCabines=" + nombreCabines + '}';
    }

    

    
    
    
    
    
    
}
