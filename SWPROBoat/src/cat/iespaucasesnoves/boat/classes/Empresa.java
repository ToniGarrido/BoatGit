package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.enumeracions.EnumEstat;
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

    public void afegirReparacio(Reparacio reparacio) {
        llistaReparacions.put(reparacio.getId(), reparacio);
    }

    public void afegirModel(Model model) {
        llistaModel.put(model.getId(), model);
    }

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

    public ArrayList<Vaixell> llistarVaixellDispData(Date dataInicial, Date dataFinal) {

        ArrayList<Vaixell> vaixellsDisp = new ArrayList();
        for (Entry<Integer, Lloguer> d : llistaLloguers.entrySet()) {
            Lloguer re = d.getValue();

            if (re.getDataInicial().compareTo(dataInicial) <= 0 && re.getDataFinal().compareTo(dataFinal) >= 0 && re.getEstatLloger()==EnumEstat.DISPONIBLE) {
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

}
