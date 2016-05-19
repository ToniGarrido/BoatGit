package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.enumeracions.EnumEstat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;

public class Empresa {

    private String nom;
    private ArrayList<Patro> llistaPatrons;
    private HashMap<Integer, Reparacio> llistaReparacions;
    private HashMap<Integer, Empleat> llistaEmpleats;
    private HashMap<Integer, Lloguer> llistaLloguers;
    private HashMap<Integer, Model> llistaModel;
    private HashMap<Integer, Venda> llistaVendes;
    private HashMap<Integer, Vaixell> llistaVaixells;
    private HashMap<Integer, Client> llistaClients;

    public void Empresa(String nom) {
        this.nom = nom;
        llistaPatrons = new ArrayList();
        llistaReparacions = new HashMap();
        llistaEmpleats = new HashMap();
        llistaLloguers = new HashMap();
        llistaVendes = new HashMap();
        llistaModel = new HashMap();
        llistaClients = new HashMap();
    }

    public void afegirReparacio(Reparacio reparacio) {
        llistaReparacions.put(reparacio.getId(), reparacio);
    }

    //PROBLEMA AMB CLAU PER AFEGIR MODEL AL HASHMAP
    /* public void afegirModel(Model model) {
      // llistaModel.put(model., model);
    }*/
    public void afegirLloguer(Lloguer lloguer) {

        llistaLloguers.put(lloguer.getId(), lloguer);

    }

    public void afegirVenda(Venda venda) {
        llistaVendes.put(venda.getId(), venda);

    }

    public void afegirVaixell(Vaixell vaixell) {
        llistaVaixells.put(vaixell.getId(), vaixell);
    }

    public void afegirClient(Client client) {
        llistaClients.put(client.getId(), client);
    }

    public void afegirEmpleat(Empleat empleat) {
        llistaEmpleats.put(empleat.getId(), empleat);
    }

    public void afegiPatro(Patro patro) {
        llistaPatrons.add(patro);
    }

    public ArrayList<Model> llistarMoDisponibles(Model model) {
        ArrayList<Model> llistaDisponible = new ArrayList<>();
        for (Entry<Integer, Model> d : llistaModel.entrySet()) {
            Model mo = d.getValue();
            if (mo.enVenta == true) {
                llistaDisponible.add(mo);
            }
            return llistaDisponible;
        }
    }

    public ArrayList<Model> llistarTipusEmb(String model) {
        ArrayList<Model> llistaTipus = new ArrayList<>();

        for(Entry<Integer,Model> d : llistaModel.entrySet())
        return llistaTipus ;
}

public ArrayList<Model> llistarIntervalPreu(Double preuMinim, Double preuMaxim) {
        ArrayList<Model> modelsInterval = new ArrayList();

        for (Entry<Integer, Model> d : llistaModel.entrySet()) {
            Model mo = d.getValue();
            if (mo.getPreu() > preuMinim && mo.getPreu() < preuMaxim) {
                modelsInterval.add(mo);
            }
        
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

    public ArrayList<Vaixell> llistarVaixellDispData(Date dataInicial, Date dataFinal) {

        ArrayList<Vaixell> vaixellsDisp = new ArrayList();
        return vaixellsDisp;
    }

    public void eliminarVaixell(Vaixell vaixell) {

    }

    public void eliminarPatro(Patro patro) {

    }

    public void eliminarReparacio(Reparacio reparacio) {

    }

    public void eliminarEmpleat(Empleat empleat) {

    }

    public void eliminarLloguer(Lloguer lloguer) {

    }

    public void eliminarModel(Model model) {

    }

    public void eliminarClient(Client client) {

    }

}
