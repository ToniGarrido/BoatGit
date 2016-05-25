/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cat.iespaucasesnoves.boat.classes.Empresa;
import cat.iespaucasesnoves.boat.classes.Iots;
import cat.iespaucasesnoves.boat.classes.Vaixell;
import cat.iespaucasesnoves.boat.excepcions.IdRepetit;
import cat.iespaucasesnoves.boat.excepcions.LimitCaracterString;
import cat.iespaucasesnoves.boat.excepcions.NoHiEsLlista;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miquel
 */
public class TestLlistaVaixells {

    @Test
    public void afegirVaixell() throws LimitCaracterString, IdRepetit {
        Empresa empresaProva = new Empresa("EmpresaProva");
        Iots iot01 = new Iots("Toyota", 70.5, 50.8, 40.7, 80000, "Pacific", true, 5, true, 500, 150);
        Iots iot02 = new Iots("Renault", 80.6, 78.1, 56.2, 90000, "El Mari", false, 6, true, 600, 190);
        Vaixell vaixellProva01 = new Vaixell(iot01, "456789BFR", false);
        Vaixell vaixellProva02 = new Vaixell(iot02, "123456PO", true, 15.8);

        empresaProva.afegirVaixell(vaixellProva01);
        empresaProva.afegirVaixell(vaixellProva02);

        assertEquals("S'han afegit els dos vaixells", 2, empresaProva.getLlistaVaixells().size());

    }

    @Test(expected = LimitCaracterString.class)
    public void afegirVaixellException() throws LimitCaracterString, IdRepetit {
        Empresa empresaProva = new Empresa("EmpresaProva");
        Iots iot01 = new Iots("qwertyuiopasdfghjklñzxcvbnmqwertyuiopasdfghjk", 70.5, 50.8, 40.7, 80000, "Pacific", true, 5, true, 500, 150);
        Vaixell vaixellProva01 = new Vaixell(iot01, "456789BFR", false);
        empresaProva.afegirVaixell(vaixellProva01);

    }
     @Test(expected = IdRepetit.class)
    public void afegirVaixellException2() throws IdRepetit, LimitCaracterString {
        Empresa empresaProva = new Empresa("EmpresaProva");
        Iots iot01 = new Iots("iot1", 70.5, 50.8, 40.7, 80000, "Pacific", true, 5, true, 500, 150);
        Vaixell vaixellProva01 = new Vaixell(iot01, "456789BFR", false);
        empresaProva.afegirVaixell(vaixellProva01);
        empresaProva.afegirVaixell(vaixellProva01);

    }
    @Test
    public void esborrarVaixell() throws LimitCaracterString, NoHiEsLlista, IdRepetit{
    Empresa empresaProva = new Empresa("EmpresaProva");
        Iots iot01 = new Iots("Toyota", 70.5, 50.8, 40.7, 80000, "Pacific", true, 5, true, 500, 150);
        Iots iot02 = new Iots("Renault", 80.6, 78.1, 56.2, 90000, "El Mari", false, 6, true, 600, 190);
        Vaixell vaixellProva01 = new Vaixell(iot01, "456789BFR", false);
        Vaixell vaixellProva02 = new Vaixell(iot02, "123456PO", true, 15.8);

        empresaProva.afegirVaixell(vaixellProva01);
        empresaProva.afegirVaixell(vaixellProva02);

        assertEquals("S'han afegit els dos vaixells", 2, empresaProva.getLlistaVaixells().size());
        empresaProva.eliminarVaixell(vaixellProva02);
        assertEquals("S'ha esborrat un vaixell correctament", 1, empresaProva.getLlistaVaixells().size());
    }
    
     @Test(expected = NoHiEsLlista.class)
    public void esborrarVaixellException() throws LimitCaracterString, NoHiEsLlista {
        Empresa empresaProva = new Empresa("EmpresaProva");
       Iots iot01 = new Iots("VaixellFantasma", 70.5, 50.8, 40.7, 80000, "Pacific", true, 5, true, 500, 150);
       Vaixell vaixellFantasma = new Vaixell(iot01, "456789BFR", false);
        empresaProva.eliminarVaixell(vaixellFantasma);
        
}
}
