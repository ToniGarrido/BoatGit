package cat.iespaucasesnoves.boat.classes;


import cat.iespaucasesnoves.boat.enumeracions.EnumEstat;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Gestio {

    public void inicialitzacio() {
        
        Empresa empresa = new Empresa("Boat");
        
        Date data1 = new Date();

        Pagament pagament01 = new Pagament("52684515612");
        Pagament pagament02 = new Pagament("78919518456");
        Pagament pagament03 = new Pagament("1475456869357892", 05, 18, 940);
        Pagament pagament04 = new Pagament("5268451561268249", 11, 19, 651);

        Client client01 = new Client("Toni", "Perello", false, true, false, "45678912E", "Santa Ana 95", 971895623, "toni@hotmail.com", pagament01);
        Client client02 = new Client("Pep", "Sastre", true, false, false, "987654368", "Murillo 54", 971451278, "pep@hotmail.com", pagament02);
        Client client03 = new Client("Pau", "Serra", false, false, true, "25814736P", "Major 25", 971526385, "pau@hotmail.com", pagament03);
        Client client04 = new Client("Maria", "Garcia", false, true, false, "78915995L", "Joan Riusech 87", 971481907, "maria@hotmail.com", pagament03);
        Client client05 = new Client("Aina", "Fornés", true, false, false, "147456357", "Pare Alzina 45", 971958844, "aina@hotmail.com", pagament02);
        Client client06 = new Client("Tomeu", "Suasi", false, true, false, "789753963", "Colomer 85", 971746352, "tomeu@hotmail.com", pagament04);

        Patro patro01 = new Patro("Tomeu", "Mir", false, true, false, "12369391U", "Garcia 85", 971859063, "tomeuMir@hotmail.com", "Patro moto nautica A", 60.80);
        Patro patro02 = new Patro("Sesbastia", "Pepo", true, false, false, "98732101T", "Sol 95", 971364959, "sesbastia@hotmail.com", "Patro de iot", 57.89);
        Patro patro03 = new Patro("Jaume", "Gonzalez", false, false, true, "951974965", "Mallorca 41", 971010298, "jaume@hotmail.com", "Patro de navegació bàsica", 85.25);

        EmpleatComercial empleatCo01 = new EmpleatComercial("Jaume", "Camilla", false, true, false, "45615689P", "Colomer 85", 971746352, "jaume3@hotmail.com", data1, 1300, 12);
        EmpleatComercial empleatCo02 = new EmpleatComercial("Miquel", "Taula", false, true, false, "9870896M", "Lluna 45", 971746352, "miquel1@hotmail.com", data1, 1200, 10);
        EmpleatComercial empleatCo03 = new EmpleatComercial("Rafel", "Piña", false, true, false, "45615935", "Menor 47", 971746352, "rafele@hotmail.com", data1, 1450, 15);
        EmpleatComercial empleatCo04 = new EmpleatComercial("Antonia", "Ferragut", false, true, false, "9873094L", "Pagat 75", 971746352, "antonia1@hotmail.com", data1, 1370, 17);
        EmpleatComercial empleatCo05 = new EmpleatComercial("Pep", "Sipi", false, true, false, "9875615K", "Cadira 15", 971746352, "pep@hotmail.com", data1, 1600, 14);
        EmpleatComercial empleatCo06 = new EmpleatComercial("Joan", "Perello", false, true, false, "7535749G", "Rey Carles 98", 971746352, "joan33@hotmail.com", data1, 1420, 11);

        EmpleatReparacio empleatRe01 = new EmpleatReparacio("Miquela", "Segui", false, true, false, "78906419I", "Eina 19", 971746352, "miquela@hotmail.com", data1, 1200);
        EmpleatReparacio empleatRe02 = new EmpleatReparacio("Sebastia", "Serra", false, true, false, "089045567", "Taula 17", 971746352, "sebastia2@hotmail.com", data1, 1300);
        EmpleatReparacio empleatRe03 = new EmpleatReparacio("Aina", "Trias", false, true, false, "14736925H", "Finestra 89", 971746352, "aina1@hotmail.com", data1, 1380);
        EmpleatReparacio empleatRe04 = new EmpleatReparacio("Joan", "Camilla", false, true, false, "65098078H", "Pantalla 78", 971746352, "joan56@hotmail.com", data1, 1020);
        EmpleatReparacio empleatRe05 = new EmpleatReparacio("Andreu", "Perico", false, true, false, "32912803A", "Lauar 12", 971746352, "andreu@hotmail.com", data1, 1450);
        EmpleatReparacio empleatRe06 = new EmpleatReparacio("Toni", "Cantallops", false, true, false, "456093098", "Ripoll 46", 971746352, "toni45@hotmail.com", data1, 1250);

        Iots iot01 = new Iots("Toyota", 70.5, 50.8, 40.7, 80000, "Pacific", true, 5, true, 500, 150);
        Iots iot02 = new Iots("Renault", 80.6, 78.1, 56.2, 90000, "El Mari", false, 6, true, 600, 190);
        Iots iot03 = new Iots("Fiat", 89.3, 45.4, 78.6, 75000, "Camaron", true, 4, false, 580, 160);
        Iots iot04 = new Iots("Peugeot", 47.1, 78.6, 78.9, 100000, "San cristo", true, 8, true, 900, 210);
        Iots iot05 = new Iots("Volkswagen", 56.1, 89.4, 34.6, 70800, "El rey", false, 10, false, 700, 170);
        Iots iot06 = new Iots("Audi", 54.6, 80.7, 76.1, 90400, "Iotet", true, 8, true, 800, 160);

        Motores motora01 = new Motores("Dufour",45.1, 78.6, 98.3, 60000, "Dufi", false, true, 980, 160);
        Motores motora02 = new Motores("Beneteau", 25.9, 36.7, 25.9, 17000, "Berni", true, false, 750, 145);
        Motores motora03 = new Motores("Lagoon", 58.9, 14.6, 47.2, 25000, "Lago", true, false, 590, 230);
        Motores motora04 = new Motores("Jeanneau", 87.9,45.8, 78.1, 36489, "Jense", false, true, 1200, 258);
        Motores motora05 = new Motores("Elan", 89.6, 78.9, 45.9, 32587, "Elana", true, false, 690, 187);
        Motores motora06 = new Motores("Hanse", 15.8, 78.6, 48.6, 25999, "Hansel", true, false, 820, 189);
        
        Velers veler01 = new Velers("Jeanneau", 56.9, 98.6, 97.6, 25999, "Jane ", false, 59, 820, 189);
        Velers veler02 = new Velers("Bavaria", 26.8, 81.3, 36.7, 8500, "Bevi", true, 59, 820, 189);
        Velers veler03 = new Velers("Hanse", 89.6, 56.7, 47.6, 7500, "Hansi", false, 59, 820, 189);
        Velers veler04 = new Velers("Dufour", 36.8, 89.3, 78.5, 9600, "Dufol", false, 59, 820, 189);
        Velers veler05 = new Velers("Beneteau", 78.6,22.4,78.8, 8000, "Benetauro", true, 59, 820, 189);
        Velers veler06 = new Velers("Elan", 78.6, 78.2,47.8, 9000, "Eloal", true, 59, 820, 189);
        
        Vaixell vaixell01 = new Vaixell(iot01,"456789BFR",false,null);
        Vaixell vaixell02 = new Vaixell(motora01,"123456PO",true,15.8);
        Vaixell vaixell03 = new Vaixell(veler01,"987654321",true,18.9);
        Vaixell vaixell04 = new Vaixell(iot02,"789456123",false,null);
        Vaixell vaixell05 = new Vaixell(motora02,"654159780",true,15.4);
        Vaixell vaixell06 = new Vaixell(veler02,"78902398",false,null);
        
        Reparacio reparacio01= new Reparacio("Taller",data1,data1,"Te romput el motor",56.4,EnumEstat.ENUS,"L'hi hem hagut de canviar una peça mes",vaixell01);
        Reparacio reparacio02= new Reparacio("Port",data1,data1,"S'ha romput una vela",45.7,EnumEstat.DISPONIBLE,"",vaixell02);
        Reparacio reparacio03= new Reparacio("Taller",data1,data1,"L'havien de pintar",60.85,EnumEstat.NODISPONIBLE,"L'hi hem hagut de canviar una peça mes",vaixell03);
        Reparacio reparacio04= new Reparacio("Taller",data1,data1,"L'han de pulir",98.4,EnumEstat.ENUS,"L'hi hem hagut de canviar una peça mes",vaixell04);
        Reparacio reparacio05= new Reparacio("Taller",data1,data1,"Se l'hi ha fus es llum",69.5,EnumEstat.ENUS,"L'hi hem hagut de canviar una peça mes",vaixell04);
        Reparacio reparacio06= new Reparacio("Taller",data1,data1,"S'ha de calibrar el motor",78.5,EnumEstat.ENUS,"L'hi hem hagut de canviar una peça mes",vaixell03);
    
        Venda venda01 = new Venda(client03,vaixell01,data1,98000.45,EnumEstat.DISPONIBLE,empleatCo01);
        Venda venda02 = new Venda(client02,vaixell02,data1,78000.45,EnumEstat.ENUS,empleatCo02);
        Venda venda03 = new Venda(client01,vaixell03,data1,45800.45,EnumEstat.DISPONIBLE,empleatCo01);
        Venda venda04 = new Venda(client04,vaixell04,data1,98050.45,EnumEstat.NODISPONIBLE,empleatCo03);
        Venda venda05 = new Venda(client05,vaixell05,data1,78000.78,EnumEstat.DISPONIBLE,empleatCo03);
        Venda venda06 = new Venda(client06,vaixell06,data1,87000.45,EnumEstat.NODISPONIBLE,empleatCo03);
        
        Lloguer lloguer01 = new Lloguer(true,data1,data1,client05,EnumEstat.DISPONIBLE,vaixell04);
        Lloguer lloguer02 = new Lloguer(false,data1,data1,client05,EnumEstat.DISPONIBLE,vaixell04);
        Lloguer lloguer03 = new Lloguer(true,data1,data1,client05,EnumEstat.DISPONIBLE,vaixell04);
        Lloguer lloguer04 = new Lloguer(false,data1,data1,client05,EnumEstat.DISPONIBLE,vaixell04);
        Lloguer lloguer05 = new Lloguer(false,data1,data1,client05,EnumEstat.DISPONIBLE,vaixell04);
        Lloguer lloguer06 = new Lloguer(true,data1,data1,client05,EnumEstat.DISPONIBLE,vaixell04);
    }
    

    public void provesEmpresa(Empresa empresa) {

    }

    public void generarFitxer(String desti, Empresa empr) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(desti)))) {
            out.writeObject(empr);
        }
    }

    public void llegirFitxer(String origen) throws FileNotFoundException, IOException {
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(origen)))) {
        }

    }

    public static void main(String[] Args) {

        Gestio m = new Gestio();
        
       

        m.inicialitzacio();
    }
}
