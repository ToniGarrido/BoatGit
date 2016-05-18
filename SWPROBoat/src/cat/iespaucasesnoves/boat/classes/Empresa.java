package cat.iespaucasesnoves.boat.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Empresa {

    private String nom;
    private ArrayList<Patro> llistaPatrons;
    private HashMap<Integer, Reparacio> llistaReparacions;
    private HashMap<Integer, Empleat> llistaEmpleats;
    private HashMap<Integer, Lloguer> llistaLloguers;
    private HashMap<Integer, Model> llistaModel;
    private HashMap<Integer, Client> llistaClients;

    public void Empresa(String nom) {

    }

    public void afegirReparacio(Reparacio reparacio) {

    }

    public void afegirLloguer(Lloguer lloguer) {

    }

    public void afegirVenda(Venda venda) {

    }

    public void afegirVaixell(Vaixell vaixell) {

    }

    public void afegirClient(Client client) {

    }

    public void afegirEmpleat(Empleat empleat) {

    }

    public void afegiPatro(Patro patro) {

    }

    public Model llistarMoDisponibles(Model model) {

        return model;
    }

    public Model llistarTipusEmb(Model model) {

        return model;
    }

    public ArrayList<Model> llistarIntervalPreu(Double preuMinim, Double preuMaxim) {
        ArrayList<Model> modelsInterval = new ArrayList();
        return modelsInterval;
    }

    public ArrayList<Reparacio> llistarRepaPendent() {

        ArrayList<Reparacio> repaPendents = new ArrayList();
        return repaPendents;
    }

    public ArrayList<Reparacio> llistarRepaAturada() {

        ArrayList<Reparacio> repaAturades = new ArrayList();
        return repaAturades;
    }

    public ArrayList<Reparacio> llistarRepaVaixell(Vaixell vaixell) {

        ArrayList<Reparacio> repaVaixell = new ArrayList();
        return repaVaixell;
    }

    public ArrayList<Empleat> ferNomina() {
        ArrayList<Empleat> nomines = new ArrayList();
        return nomines;
    }
    
    public ArrayList<Vaixell> llistarVaixellDispData(Date dataInicial, Date dataFinal){
        
        ArrayList<Vaixell> vaixellsDisp = new ArrayList();
        return vaixellsDisp;
    }
    
    public void eliminarVaixell(Vaixell vaixell){
    
    }
    
    public void eliminarPatro(Patro patro){
    
    }
    
    public void eliminarReparacio(Reparacio reparacio){
    
    }
    
    public void eliminarEmpleat(Empleat empleat){
    
    }
    
    public void eliminarLloguer(Lloguer lloguer){
    
    }
    
    public void eliminarModel(Model model){
    
    }
    
    public void eliminarClient(Client client){
    
    }
    
}
