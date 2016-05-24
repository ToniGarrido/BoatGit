/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boat.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Toni
 */
public class EmpresaTest {
    
    public EmpresaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNom method, of class Empresa.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Empresa instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLlistaPatrons method, of class Empresa.
     */
    @Test
    public void testGetLlistaPatrons() {
        System.out.println("getLlistaPatrons");
        Empresa instance = null;
        ArrayList<Patro> expResult = null;
        ArrayList<Patro> result = instance.getLlistaPatrons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLlistaReparacions method, of class Empresa.
     */
    @Test
    public void testGetLlistaReparacions() {
        System.out.println("getLlistaReparacions");
        Empresa instance = null;
        HashMap<Integer, Reparacio> expResult = null;
        HashMap<Integer, Reparacio> result = instance.getLlistaReparacions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLlistaEmpleats method, of class Empresa.
     */
    @Test
    public void testGetLlistaEmpleats() {
        System.out.println("getLlistaEmpleats");
        Empresa instance = null;
        HashMap<Integer, Empleat> expResult = null;
        HashMap<Integer, Empleat> result = instance.getLlistaEmpleats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLlistaLloguers method, of class Empresa.
     */
    @Test
    public void testGetLlistaLloguers() {
        System.out.println("getLlistaLloguers");
        Empresa instance = null;
        HashMap<Integer, Lloguer> expResult = null;
        HashMap<Integer, Lloguer> result = instance.getLlistaLloguers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLlistaModel method, of class Empresa.
     */
    @Test
    public void testGetLlistaModel() {
        System.out.println("getLlistaModel");
        Empresa instance = null;
        HashMap<Integer, Model> expResult = null;
        HashMap<Integer, Model> result = instance.getLlistaModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLlistaVendes method, of class Empresa.
     */
    @Test
    public void testGetLlistaVendes() {
        System.out.println("getLlistaVendes");
        Empresa instance = null;
        HashMap<Integer, Venda> expResult = null;
        HashMap<Integer, Venda> result = instance.getLlistaVendes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLlistaVaixells method, of class Empresa.
     */
    @Test
    public void testGetLlistaVaixells() {
        System.out.println("getLlistaVaixells");
        Empresa instance = null;
        HashMap<Integer, Vaixell> expResult = null;
        HashMap<Integer, Vaixell> result = instance.getLlistaVaixells();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLlistaClients method, of class Empresa.
     */
    @Test
    public void testGetLlistaClients() {
        System.out.println("getLlistaClients");
        Empresa instance = null;
        HashMap<Integer, Client> expResult = null;
        HashMap<Integer, Client> result = instance.getLlistaClients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirReparacio method, of class Empresa.
     */
    @Test
    public void testAfegirReparacio() {
        System.out.println("afegirReparacio");
        Reparacio reparacio = null;
        Empresa instance = null;
        instance.afegirReparacio(reparacio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirModel method, of class Empresa.
     */
    @Test
    public void testAfegirModel() {
        System.out.println("afegirModel");
        Model model = null;
        Empresa instance = null;
        instance.afegirModel(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirLloguer method, of class Empresa.
     */
    @Test
    public void testAfegirLloguer() {
        System.out.println("afegirLloguer");
        Lloguer lloguer = null;
        Empresa instance = null;
        instance.afegirLloguer(lloguer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirVenda method, of class Empresa.
     */
    @Test
    public void testAfegirVenda() {
        System.out.println("afegirVenda");
        Venda venda = null;
        Empresa instance = null;
        instance.afegirVenda(venda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirVaixell method, of class Empresa.
     */
    @Test
    public void testAfegirVaixell() {
        System.out.println("afegirVaixell");
        Vaixell vaixell = vaixell01;
        Empresa instance = null;
        instance.afegirVaixell(vaixell);
        
    }

    /**
     * Test of afegirClient method, of class Empresa.
     */
    @Test
    public void testAfegirClient() {
        System.out.println("afegirClient");
        Client client = null;
        Empresa instance = null;
        instance.afegirClient(client);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirEmpleat method, of class Empresa.
     */
    @Test
    public void testAfegirEmpleat() {
        System.out.println("afegirEmpleat");
        Empleat empleat = null;
        Empresa instance = null;
        instance.afegirEmpleat(empleat);
        
    }

    /**
     * Test of afegiPatro method, of class Empresa.
     */
    @Test
    public void testAfegiPatro() {
        System.out.println("afegiPatro");
        Patro patro = null;
        Empresa instance = null;
        instance.afegiPatro(patro);
       
    }

    /**
     * Test of llistarMoDisponibles method, of class Empresa.
     */
    @Test
    public void testLlistarMoDisponibles() {
        System.out.println("llistarMoDisponibles");
        Empresa instance = null;
        ArrayList<Model> expResult = null;
        ArrayList<Model> result = instance.llistarMoDisponibles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of llistarTipusEmb method, of class Empresa.
     */
    @Test
    public void testLlistarTipusEmb() {
        System.out.println("llistarTipusEmb");
        Model model = null;
        Empresa instance = null;
        ArrayList<Model> expResult = null;
        ArrayList<Model> result = instance.llistarTipusEmb(model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of llistarIntervalPreu method, of class Empresa.
     */
    @Test
    public void testLlistarIntervalPreu() {
        System.out.println("llistarIntervalPreu");
        Double preuMinim = null;
        Double preuMaxim = null;
        Empresa instance = null;
        ArrayList<Model> expResult = null;
        ArrayList<Model> result = instance.llistarIntervalPreu(preuMinim, preuMaxim);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of llistarRepaPendent method, of class Empresa.
     */
    @Test
    public void testLlistarRepaPendent() {
        System.out.println("llistarRepaPendent");
        Empresa instance = null;
        ArrayList<Reparacio> expResult = null;
        ArrayList<Reparacio> result = instance.llistarRepaPendent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of llistarRepaAturada method, of class Empresa.
     */
    @Test
    public void testLlistarRepaAturada() {
        System.out.println("llistarRepaAturada");
        Empresa instance = null;
        ArrayList<Reparacio> expResult = null;
        ArrayList<Reparacio> result = instance.llistarRepaAturada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of llistarRepaVaixell method, of class Empresa.
     */
    @Test
    public void testLlistarRepaVaixell() {
        System.out.println("llistarRepaVaixell");
        Vaixell vaixell = null;
        Empresa instance = null;
        ArrayList<Reparacio> expResult = null;
        ArrayList<Reparacio> result = instance.llistarRepaVaixell(vaixell);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ferNomina method, of class Empresa.
     */
    @Test
    public void testFerNomina_EmpleatComercial() {
        System.out.println("ferNomina");
        EmpleatComercial empleat = null;
        Empresa instance = null;
        Empleat expResult = null;
        Empleat result = instance.ferNomina(empleat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ferNomina method, of class Empresa.
     */
    @Test
    public void testFerNomina_EmpleatReparacio() {
        System.out.println("ferNomina");
        EmpleatReparacio empleat = null;
        Empresa instance = null;
        Empleat expResult = null;
        Empleat result = instance.ferNomina(empleat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of llistarVaixellDispData method, of class Empresa.
     */
    @Test
    public void testLlistarVaixellDispData() {
        System.out.println("llistarVaixellDispData");
        Date dataInicial = null;
        Date dataFinal = null;
        Empresa instance = null;
        ArrayList<Vaixell> expResult = null;
        ArrayList<Vaixell> result = instance.llistarVaixellDispData(dataInicial, dataFinal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarVaixell method, of class Empresa.
     */
    @Test
    public void testEliminarVaixell() throws Exception {
        System.out.println("eliminarVaixell");
        Vaixell vaixell = null;
        Empresa instance = null;
        instance.eliminarVaixell(vaixell);
        
    }

    /**
     * Test of eliminarPatro method, of class Empresa.
     */
    @Test
    public void testEliminarPatro() throws Exception {
        System.out.println("eliminarPatro");
        Patro patro = null;
        Empresa instance = null;
        instance.eliminarPatro(patro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarReparacio method, of class Empresa.
     */
    @Test
    public void testEliminarReparacio() throws Exception {
        System.out.println("eliminarReparacio");
        Reparacio reparacio = null;
        Empresa instance = null;
        instance.eliminarReparacio(reparacio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarEmpleat method, of class Empresa.
     */
    @Test
    public void testEliminarEmpleat() throws Exception {
        System.out.println("eliminarEmpleat");
        Empleat empleat = null;
        Empresa instance = null;
        instance.eliminarEmpleat(empleat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarLloguer method, of class Empresa.
     */
    @Test
    public void testEliminarLloguer() throws Exception {
        System.out.println("eliminarLloguer");
        Lloguer lloguer = null;
        Empresa instance = null;
        instance.eliminarLloguer(lloguer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarModel method, of class Empresa.
     */
    @Test
    public void testEliminarModel() throws Exception {
        System.out.println("eliminarModel");
        Model model = null;
        Empresa instance = null;
        instance.eliminarModel(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarClient method, of class Empresa.
     */
    @Test
    public void testEliminarClient() throws Exception {
        System.out.println("eliminarClient");
        Client client = null;
        Empresa instance = null;
        instance.eliminarClient(client);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
