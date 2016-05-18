package cat.iespaucasesnoves.boat.classes;

public class Vaixell {

    private static int id;
    private Model model;
    private String matricula;
    private Client propietari;
    private boolean perLlogar;

    public Vaixell(Model model, String matricula, Client propietari, boolean perLlogar) {
        id++;
        this.model = model;
        this.matricula = matricula;
        this.propietari = propietari;
        this.perLlogar = perLlogar;
    }

    public void tornarJSON() {

    }

    public static int getId() {
        return id;
    }

    public Model getModel() {
        return model;
    }

    public String getMatricula() {
        return matricula;
    }

    public Client getPropietari() {
        return propietari;
    }

    public boolean isPerLlogar() {
        return perLlogar;
    }

    public static void setId(int id) {
        Vaixell.id = id;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPropietari(Client propietari) {
        this.propietari = propietari;
    }

    public void setPerLlogar(boolean perLlogar) {
        this.perLlogar = perLlogar;
    }

}
