package cat.iespaucasesnoves.boat.classes;

import java.util.Calendar;
import java.util.Date;

public class Gestio {

    public void inicialitzacio() {

      
        
        
        
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
        
        EmpleatComercial empleatC01 = new EmpleatComercial("Tomeu", "Suasi", false, true, false, "789753963", "Colomer 85", 971746352, "tomeu@hotmail.com",data1,1200,12);
        
        System.out.println(empleatC01);

    }

    public void provesEmpresa(Empresa empresa) {

    }

    public void generarFitxer(String origen, Empresa Empr) {

    }

    public void llegirFitxer(String origen) {

    }

    public static void main(String[] Args) {

        Gestio m = new Gestio();

        m.inicialitzacio();
    }
}
