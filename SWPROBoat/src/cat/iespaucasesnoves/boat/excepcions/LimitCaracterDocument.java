
package cat.iespaucasesnoves.boat.excepcions;

public class LimitCaracterDocument extends Exception {
    
    public LimitCaracterDocument(){
        super();
    }
    
    public LimitCaracterDocument(String missatge){
        super(missatge);
    }
}
