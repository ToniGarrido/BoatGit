package cat.iespaucasesnoves.boat.classes;

public class Gestio {

    public void inicialitzacio() {
        
        Pagament pagament01 = new Pagament("52684515612");
        Pagament pagament02 = new Pagament(124556234758,05,18,068);
        Pagament pagament03 = new Pagament("52684515612");
        

        Client client01 = new Client("Toni","Perello",false,true,false,"45678912E","Santa Ana 95",5,"toni@hotmail.com",pagament01);
        Client client02 = new Client("Pep","Sastre",true,false,false,"987654368","Murillo 54",5,"pep@hotmail.com",pagament01);
        Client client03 = new Client("Pau","Serra",false,false,true,"25814736P","Major 25",5,"pau@hotmail.com",pagament01);
        Client client04 = new Client("Maria","Garcia",false,true,false,"78915995L","Joan Riusech 87",5,"maria@hotmail.com",pagament01);
        Client client05 = new Client("Aina","Fornés",true,false,false,"147456357","Pare Alzina 45",5,"aina@hotmail.com",pagament01);
        Client client06 = new Client("Tomeu","Suasi",false,true,false,"789753963","Colomer 85",5,"tomeu@hotmail.com",pagament01);
        
        
        
        Patro patro01 = new Patro("Toni","Garrido",false,false,false,"","",5,"","",4.2);
        
        
    }

    public void provesEmpresa(Empresa empresa) {

    }

    public void generarFitxer(String origen, Empresa Empr) {

    }

    public void llegirFitxer(String origen) {

    }

    public static void main(String[]Args){
        
        Gestio m = new Gestio();
        
        m.inicialitzacio();
    }
}
