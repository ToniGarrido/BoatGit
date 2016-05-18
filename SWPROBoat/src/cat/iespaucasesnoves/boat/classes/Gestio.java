package cat.iespaucasesnoves.boat.classes;

public class Gestio {

    public void inicialitzacio() {
        
        Pagament pagament01 = new Pagament("52684515612");

        Client client01 = new Client("Toni","Garrido",false,false,false,"","",5,"",pagament01);
        Patro patro001 = new Patro("Toni","Garrido",false,false,false,"","",5,"","",4.2);
        
        
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
