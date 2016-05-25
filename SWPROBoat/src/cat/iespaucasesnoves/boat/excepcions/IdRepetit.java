/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boat.excepcions;

/**
 *
 * @author Toni
 */
public class IdRepetit extends Exception {
    
    public IdRepetit(){
        super();
    }
    
    public IdRepetit(String missatge){
        super(missatge);
    }
}
