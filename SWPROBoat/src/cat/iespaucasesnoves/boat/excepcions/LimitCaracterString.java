
package cat.iespaucasesnoves.boat.excepcions;

public class LimitCaracterString extends Exception{
    
    public LimitCaracterString(){
        super();
    }
    public LimitCaracterString(String missatge){
        super(missatge);
    }
}
