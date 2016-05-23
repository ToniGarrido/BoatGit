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
public class NoHiEsLlista extends Exception  {
    
    public NoHiEsLlista(){
        super();
    }
    
    public NoHiEsLlista(String missatge){
        super(missatge);
    }
}
