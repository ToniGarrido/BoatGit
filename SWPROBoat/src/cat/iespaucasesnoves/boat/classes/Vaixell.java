package cat.iespaucasesnoves.boat.classes;

import java.io.Serializable;

public class Vaixell implements Serializable {

    private static int contador = 0;
    private int id;
    private Model model;
    private String matricula;
    private Client propietari;
    private boolean perLlogar;
    private double preuPerDia;

    public Vaixell(Model model, String matricula, boolean perLlogar) {
        contador++;
        id = contador;
        this.model = model;
        this.matricula = matricula;
        this.perLlogar = perLlogar;

    }

    public Vaixell(Model model, String matricula, boolean perLlogar, double preuPerDia) {
        contador++;
        id = contador;
        this.model = model;
        this.matricula = matricula;
        this.perLlogar = perLlogar;
        this.preuPerDia = preuPerDia;
    }

    public String tornarJSON() {

        String json = "{" + "\"Id\": " + id +  "," + "\"NomModel\": " + "\"" + model.nomModel  + "," + "\"Matricula\": " + "\"" + matricula + "\""  + ","  + "\"PerLlogar\": " + perLlogar  + "," + "\"PreuPerDia\": " + preuPerDia + "}";

        return json;
    }

    public int getId() {
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

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Vaixell{" + "id=" + id + ", model=" + model + ", matricula=" + matricula + ", propietari=" + propietari + ", perLlogar=" + perLlogar + "}\n";
    }

}
