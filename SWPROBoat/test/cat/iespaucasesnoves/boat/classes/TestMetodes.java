package cat.iespaucasesnoves.boat.classes;

import cat.iespaucasesnoves.boat.excepcions.LimitCaracterDocument;
import cat.iespaucasesnoves.boat.excepcions.LimitCaracterString;
import cat.iespaucasesnoves.boat.excepcions.LimitDeDocuments;
import cat.iespaucasesnoves.boat.excepcions.NoHiEsLlista;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TestMetodes {

    /* @Test(expected= Exception.class)
    
    
    public void testFerNomina_EmpleatComercial() throws ParseException, LimitCaracterString, LimitCaracterDocument, LimitDeDocuments {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date data1 = sdf.parse("2006-05-01");

        Empresa empresa = new Empresa("Boat");

        EmpleatComercial empleatCo01 = new EmpleatComercial("Jaume", "Camilla", false, true, false, "78945612P", "Colomer 85", 971746352, "jaume3@hotmail.com", data1, 1300, 12);

        System.out.println("ferNomina");
        EmpleatComercial empleat = empleatCo01;
        Empresa instance = empresa;
        Empleat expResult = empleatCo01;
        Empleat result = instance.ferNomina(empleatCo01);
        assertEquals(expResult, result);*/


        @Test
        public void testAfegirVaixell() throws LimitCaracterString {
        
        Empresa empresa = new Empresa("Boat");
        Iots iot01 = new Iots("Toyota", 70.5, 50.8, 40.7, 80000, "Pacific", true, 5, true, 500, 150);
        Vaixell vaixell01 = new Vaixell(iot01, "456789BFR", false);
        System.out.println("afegirVaixell");
        Vaixell vaixell = vaixell01;
        Empresa instance = empresa ;
        instance.afegirVaixell(vaixell01);
        
        
    }

        @Test
        public void testEliminarVaixell() throws LimitCaracterString, NoHiEsLlista{

        Empresa empresa = new Empresa("Boat");
        Iots iot02 = new Iots("Toyota", 70.5, 50.8, 40.7, 80000, "Pacific", true, 5, true, 500, 150);
        Vaixell vaixell04 = new Vaixell(iot02, "789456123", false);
      

        System.out.println("eliminarVaixell");
        Vaixell vaixell = vaixell04;
        Empresa instance = empresa;
        instance.eliminarVaixell(vaixell04);

    }
    
    
}
