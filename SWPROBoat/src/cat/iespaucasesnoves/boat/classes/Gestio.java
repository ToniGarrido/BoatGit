package cat.iespaucasesnoves.boat.classes;

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

      
        Date data1= new Date();
        
        data1.setYear(2017);
        data1.setMonth(11);
        
        
        DateFormat format = new SimpleDateFormat("YYYY-MM-dd");
       
        
        
        String p= format.format(data1);
        
       
       
        
        System.out.println(format);
        
        
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

        Patro patro01 = new Patro("Tomeu", "Mir", false, true, false, "12369391U", "Garcia 85",971859063, "tomeuMir@hotmail.com", "Patro moto nautica A", 60.80);
        Patro patro02 = new Patro("Sesbastia", "Pepo", true, false, false, "98732101T", "Sol 95", 971364959, "sesbastia@hotmail.com", "Patro de iot", 57.89);
        Patro patro03 = new Patro("Jaume", "Gonzalez", false, false, true, "951974965", "Mallorca 41", 971010298, "jaume@hotmail.com", "Patro de navegació bàsica",85.25);
        
        EmpleatComercial empleatCo01 = new EmpleatComercial("Jaume", "Camilla", false, true, false, "45615689P", "Colomer 85", 971746352, "jaume3@hotmail.com",data1,1300,12);
        EmpleatComercial empleatCo02 = new EmpleatComercial("Miquel", "Taula", false, true, false, "9870896M", "Lluna 45", 971746352, "miquel1@hotmail.com",data1,1200,10);
        EmpleatComercial empleatCo03 = new EmpleatComercial("Rafel", "Piña", false, true, false, "45615935", "Menor 47", 971746352, "rafele@hotmail.com",data1,1450,15);
        EmpleatComercial empleatCo04 = new EmpleatComercial("Antonia", "Ferragut", false, true, false, "9873094L", "Pagat 75", 971746352, "antonia1@hotmail.com",data1,1370,17);
        EmpleatComercial empleatCo05 = new EmpleatComercial("Pep", "Sipi", false, true, false, "9875615K", "Cadira 15", 971746352, "pep@hotmail.com",data1,1600,14);
        EmpleatComercial empleatCo06 = new EmpleatComercial("Joan", "Perello", false, true, false, "7535749G", "Rey Carles 98", 971746352, "joan33@hotmail.com",data1,1420,11);
        
        EmpleatReparacio empleatRe01 = new EmpleatReparacio("Miquela", "Segui", false, true, false, "78906419I", "Eina 19", 971746352, "miquela@hotmail.com",data1,1200);
        EmpleatReparacio empleatRe02 = new EmpleatReparacio("Sebastia", "Serra", false, true, false, "089045567", "Taula 17", 971746352, "sebastia2@hotmail.com",data1,1300);
        EmpleatReparacio empleatRe03 = new EmpleatReparacio("Aina", "Trias", false, true, false, "14736925H", "Finestra 89", 971746352, "aina1@hotmail.com",data1,1380);
        EmpleatReparacio empleatRe04 = new EmpleatReparacio("Joan", "Camilla", false, true, false, "65098078H", "Pantalla 78", 971746352, "joan56@hotmail.com",data1,1020);
        EmpleatReparacio empleatRe05 = new EmpleatReparacio("Andreu", "Perico", false, true, false, "32912803A", "Lauar 12", 971746352, "andreu@hotmail.com",data1,1450);
        EmpleatReparacio empleatRe06 = new EmpleatReparacio("Toni", "Cantallops", false, true, false, "456093098", "Ripoll 46", 971746352, "toni45@hotmail.com",data1,1250);

        Iots iot01= new Iots("Toyota",70.5,50.8,40.7,80000,"Pacific",true,5,true,500,150);
        Iots iot02= new Iots("Renault",80.6,78.1,56.2,90000,"El Mari",false,6,true,600,190);
        Iots iot03= new Iots("Fiat",89.3,45.4,78.6,75000,"Camaron",true,4,false,580,160);
        Iots iot04= new Iots("Peugeot",47.1,78.6,78.9,100000,"San cristo",true,8,true,900,210);
        Iots iot05= new Iots("Volkswagen",56.1,89.4,34.6,70800,"El rey",false,10,false,700,170);
        Iots iot06= new Iots("Audi",54.6,80.7,76.1,90400,"Iotet",true,8,true,800,160);
        
        
        
        
        
        
        
        
        
        
        // Reparacio reparacio01 = new Reparacio("",data1,data1,"",50.45);












//System.out.println(empleatC01);

    }

    public void provesEmpresa(Empresa empresa) {

    }

    public void generarFitxer(String desti, Empresa empr) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(desti)))){
			out.writeObject(empr);
    }
    }
    public void llegirFitxer(String origen) throws FileNotFoundException, IOException{
		try (ObjectInputStream in = new ObjectInputStream (new BufferedInputStream(new FileInputStream(origen)))){
			}

    }

    public static void main(String[] Args) {

        Gestio m = new Gestio();

        m.inicialitzacio();
    }
}
