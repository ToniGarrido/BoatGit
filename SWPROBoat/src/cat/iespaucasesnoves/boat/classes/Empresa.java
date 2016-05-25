package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.enumeracions.EnumEstat;
import cat.iespaucasesnoves.boat.excepcions.DataInicialMajor;
import cat.iespaucasesnoves.boat.excepcions.IdRepetit;
import cat.iespaucasesnoves.boat.excepcions.NoHiEsLlista;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;

public class Empresa implements Serializable {

    private String nom;
    private ArrayList<Patro> llistaPatrons;
    private HashMap<Integer, Reparacio> llistaReparacions;
    private HashMap<Integer, Empleat> llistaEmpleats;
    private HashMap<Integer, Lloguer> llistaLloguers;
    private HashMap<Integer, Model> llistaModel;
    private HashMap<Integer, Venda> llistaVendes;
    private HashMap<Integer, Vaixell> llistaVaixells;
    private HashMap<Integer, Client> llistaClients;

    public Empresa(String nom) {
        this.nom = nom;
        llistaPatrons = new ArrayList();
        llistaReparacions = new HashMap();
        llistaEmpleats = new HashMap();
        llistaLloguers = new HashMap();
        llistaVendes = new HashMap();
        llistaVaixells = new HashMap();
        llistaModel = new HashMap();
        llistaClients = new HashMap();
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Patro> getLlistaPatrons() {
        return llistaPatrons;
    }

    public HashMap<Integer, Reparacio> getLlistaReparacions() {
        return llistaReparacions;
    }

    public HashMap<Integer, Empleat> getLlistaEmpleats() {
        return llistaEmpleats;
    }

    public HashMap<Integer, Lloguer> getLlistaLloguers() {
        return llistaLloguers;
    }

    public HashMap<Integer, Model> getLlistaModel() {
        return llistaModel;
    }

    public HashMap<Integer, Venda> getLlistaVendes() {
        return llistaVendes;
    }

    public HashMap<Integer, Vaixell> getLlistaVaixells() {
        return llistaVaixells;
    }

    public HashMap<Integer, Client> getLlistaClients() {
        return llistaClients;
    }

    public void afegirReparacio(Reparacio reparacio) throws IdRepetit {
        if (llistaReparacions.containsKey(reparacio.getId())) {
            throw new IdRepetit("La reparació ja està dins la llista.");
        } else {
            llistaReparacions.put(reparacio.getId(), reparacio);
        }
    }

    public void afegirModel(Model model) throws IdRepetit {
        if (llistaModel.containsKey(model.getId())) {
            throw new IdRepetit("El model ja està dins la llista.");
        } else {
            llistaModel.put(model.getId(), model);
        }
    }

    public void afegirLloguer(Lloguer lloguer) throws IdRepetit {
        if (llistaLloguers.containsKey(lloguer.getId())) {
            throw new IdRepetit("El lloguer ja està dins la llista.");
        } else {
            llistaLloguers.put(lloguer.getId(), lloguer);
        }

    }

    public void afegirVenda(Venda venda) throws IdRepetit {
        if (llistaVendes.containsKey(venda.getId())) {
            throw new IdRepetit("La venda ja està dins la llista.");
        } else {
            llistaVendes.put(venda.getId(), venda);
        }

    }

    public void afegirVaixell(Vaixell vaixell) throws IdRepetit {
        if (llistaVaixells.containsKey(vaixell.getId())) {
            throw new IdRepetit("El vaixell ja està dins la llista.");
        } else {
            llistaVaixells.put(vaixell.getId(), vaixell);
        }
    }

    public void afegirClient(Client client) throws IdRepetit {
        if (llistaClients.containsKey(client.getId())) {
            throw new IdRepetit("El client ja està dins la llista.");
        } else {
            llistaClients.put(client.getId(), client);
        }
    }

    public void afegirEmpleat(Empleat empleat) throws IdRepetit {
        if (llistaEmpleats.containsKey(empleat.getId())) {
            throw new IdRepetit("L'empleat ja està dins la llista.");
        } else {
            llistaEmpleats.put(empleat.getId(), empleat);
        }
    }

    public void afegiPatro(Patro patro) throws IdRepetit {
        if (llistaPatrons.contains(patro)) {
            throw new IdRepetit("El patró ja està dins la llista.");
        } else {
            llistaPatrons.add(patro);
        }
    }

    public ArrayList<Model> llistarMoDisponibles() {
        ArrayList<Model> llistaDisponible = new ArrayList<>();
        for (Entry<Integer, Model> d : llistaModel.entrySet()) {
            Model mo = d.getValue();
            if (mo.enVenta == true) {
                llistaDisponible.add(mo);
            }

        }
        return llistaDisponible;
    }

    public ArrayList<Model> llistarTipusEmb(Model model) {
        ArrayList<Model> llistaTipus = new ArrayList<>();

        for (Entry<Integer, Model> d : llistaModel.entrySet()) {
            Model mo = d.getValue();
            if (mo.getClass() == model.getClass()) {
                llistaTipus.add(mo);
            }

        }
        return llistaTipus;
    }

    public ArrayList<Model> llistarIntervalPreu(Double preuMinim, Double preuMaxim) {
        ArrayList<Model> modelsInterval = new ArrayList();

        for (Entry<Integer, Model> d : llistaModel.entrySet()) {
            Model mo = d.getValue();
            if (mo.getPreu() > preuMinim && mo.getPreu() < preuMaxim) {
                modelsInterval.add(mo);
            }

        }
        return modelsInterval;
    }

    public ArrayList<Reparacio> llistarRepaPendent() {

        ArrayList<Reparacio> repaPendents = new ArrayList();
        for (Entry<Integer, Reparacio> d : llistaReparacions.entrySet()) {
            Reparacio re = d.getValue();
            if (re.getEstatReparacio() == EnumEstat.DISPONIBLE) {
                repaPendents.add(re);
            }
        }
        return repaPendents;
    }

    public ArrayList<Reparacio> llistarRepaAturada() {

        ArrayList<Reparacio> repaAturades = new ArrayList();
        for (Entry<Integer, Reparacio> d : llistaReparacions.entrySet()) {
            Reparacio re = d.getValue();
            if (re.getEstatReparacio() == EnumEstat.NODISPONIBLE) {
                repaAturades.add(re);
            }
        }

        return repaAturades;
    }

    public ArrayList<Reparacio> llistarRepaVaixell(Vaixell vaixell) {

        ArrayList<Reparacio> repaVaixell = new ArrayList();
        for (Entry<Integer, Reparacio> d : llistaReparacions.entrySet()) {
            Reparacio re = d.getValue();
            if (re.getVaixell().equals(vaixell)) {
                repaVaixell.add(re);
            }
        }
        return repaVaixell;
    }

    public Empleat ferNomina(EmpleatComercial empleat) {
        double total = 0;
        double suma = 0;
        for (Entry<Integer, Venda> d : llistaVendes.entrySet()) {
            Venda ve = d.getValue();

            if (ve.getEmpleat().equals(empleat)) {
                suma = ve.getPreu() * empleat.getPercentatgeComissio();
                suma = suma / 100;

                total = suma + total;
            }

        }

        empleat.setSou(empleat.getSou() + total);
        return empleat;
    }

    public Empleat ferNomina(EmpleatReparacio empleat) {

        return empleat;
    }

    public ArrayList<Vaixell> llistarVaixellDispData(Date dataInicial, Date dataFinal) throws DataInicialMajor {

        if (dataInicial.after(dataFinal)) {
            throw new DataInicialMajor("La data inicial no pot ser major a la data final.");
        }

        ArrayList<Vaixell> vaixellsDisp = new ArrayList();
        for (Entry<Integer, Lloguer> d : llistaLloguers.entrySet()) {
            Lloguer re = d.getValue();
            if ((dataInicial.before(re.getDataInicial()) && dataFinal.before(re.getDataInicial())) == true) {
                vaixellsDisp.add(re.getVaixell());
            } else if ((dataInicial.after(re.getDataFinal()) && dataFinal.after(re.getDataFinal())) == true) {
                vaixellsDisp.add(re.getVaixell());
            }
        }
        return vaixellsDisp;
    }

    public void eliminarVaixell(Vaixell vaixell) throws NoHiEsLlista {
        if (llistaVaixells.containsValue(vaixell)) {
            llistaVaixells.remove(vaixell.getId());
        } else {
            throw new NoHiEsLlista("No s'ha eliminat el vaixell, perqué no s'ha trobat a la llista.");
        }
    }

    public void eliminarPatro(Patro patro) throws NoHiEsLlista {
        for (Patro cont : llistaPatrons) {
            if (cont == patro) {
                llistaPatrons.remove(patro);
            } else {
                throw new NoHiEsLlista("No s'ha eliminat el patró, perque no s'ha trobat a la llista.");
            }
        }
    }

    public void eliminarReparacio(Reparacio reparacio) throws NoHiEsLlista {
        if (llistaReparacions.containsValue(reparacio)) {
            llistaReparacions.remove(reparacio.getId());
        } else {
            throw new NoHiEsLlista("No s'ha eliminat la reparació, perque no s'ha trobat a la llista.");
        }
    }

    public void eliminarEmpleat(Empleat empleat) throws NoHiEsLlista {
        if (llistaEmpleats.containsValue(empleat)) {
            llistaEmpleats.remove(empleat.getId());
        } else {
            throw new NoHiEsLlista("No s'ha eliminat l'empleat, perque no s'ha trobat a la llista.");
        }
    }

    public void eliminarLloguer(Lloguer lloguer) throws NoHiEsLlista {
        if (llistaLloguers.containsValue(lloguer)) {
            llistaLloguers.remove(lloguer.getId());
        } else {
            throw new NoHiEsLlista("No s'ha eliminat el lloguer, perque no s'ha trobat a la llista.");
        }
    }

    public void eliminarModel(Model model) throws NoHiEsLlista {
        if (llistaModel.containsValue(model)) {
            llistaModel.remove(model.getId());
        } else {
            throw new NoHiEsLlista("No s'ha eliminat el model, perque no s'ha trobat a la llista.");
        }
    }

    public void eliminarClient(Client client) throws NoHiEsLlista {
        if (llistaClients.containsValue(client)) {
            llistaClients.remove(client.getId());
        } else {
            throw new NoHiEsLlista("No s'ha eliminat el client, perque no s'ha trobat a la llista.");
        }
    }

    public Vaixell tornarVaixell(String matricula) {
        Vaixell vaixell = null;
        for (Entry<Integer, Vaixell> d : llistaVaixells.entrySet()) {
            Vaixell re = d.getValue();

            if (re.getMatricula() == matricula) {
                vaixell = re;
                break;
            }

        }
        return vaixell;

    }

    public Model tornarModel(String nomModel) {
        Model model = null;
        for (Entry<Integer, Model> d : llistaModel.entrySet()) {
            Model re = d.getValue();

            if (re.getNomModel().equalsIgnoreCase(nomModel)) {
                model = re;
                break;
            }
        }
        return model;
    }

    public Client tornarClient(String document) {
        Client client = null;
        for (Entry<Integer, Client> d : llistaClients.entrySet()) {
            Client re = d.getValue();

            if (re.getNumeroDocument() == document) {
                client = re;
                break;
            }
        }
        return client;
    }

    public Patro tornarPatro(String document) {
        Patro patro = null;
        for (Patro d : llistaPatrons) {
            if (d.getNumeroDocument() == document) {
                patro = d;
                break;
            }
        }
        return patro;
    }

    public Empleat tornarEmpleat(String document) {
        Empleat empleat = null;

        for (Entry<Integer, Empleat> d : llistaEmpleats.entrySet()) {
            Empleat re = d.getValue();

            if (re.getNumeroDocument() == document) {
                empleat = re;
                break;
            }
        }
        return empleat;
    }

    public Reparacio tornarReparacio(int id) {
        Reparacio reparacio = null;

        for (Entry<Integer, Reparacio> d : llistaReparacions.entrySet()) {
            Reparacio re = d.getValue();
            if (re.getId() == id) {
                reparacio = re;
                break;
            }
        }
        return reparacio;
    }

    public Venda tornarVenda(int id) {
        Venda venda = null;

        for (Entry<Integer, Venda> d : llistaVendes.entrySet()) {
            Venda re = d.getValue();
            if (re.getId() == id) {
                venda = re;
                break;
            }
        }
        return venda;
    }
    
    public Lloguer tornarLloguer(int id) {
        Lloguer lloguer = null;

        for (Entry<Integer, Lloguer> d : llistaLloguers.entrySet()) {
            Lloguer re = d.getValue();
            if (re.getId() == id) {
                lloguer = re;
                break;
            }
        }
        return lloguer;
    }
}
