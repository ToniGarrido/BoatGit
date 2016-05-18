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

}
