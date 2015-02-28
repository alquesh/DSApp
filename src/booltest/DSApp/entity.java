/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DSApp;

import java.util.Random;

/**
 *
 * @author Alquesh
 */

public class entity {
    
    public String name;
    public Wert initiative;
    public HashSet<Wert> eigenschaft;
    public Wert lep;
    public int lepmax;
    public boolean tot;																	
    public boolean turn;										

    public entity(){                                         
        this.name="PH";                                      
        this.initiative= new Wert(10, "Initiative")
        this.eigenschaft= {new Wert(10, "Körperkraft"),new Wert(10, "Konstitution"),new Wert(10, "Gewandheit"),new Wert(10, "Fingerfertigkeit")
                           new Wert(10, "Mut"),new Wert(10, "Charisma"),new Wert(10, "Klugheit"),new Wert(10, "Intuition")}
        }
        this.lep= new Wert(20, "LeP");
        this.lepmax=20;
        this.tot=false;
        this.turn=false;
    }
    
    public void printsheet(PrintWriter out) {
        for (Wert w: eigenschaft){
         out.printl(w);
        }
    }
    
    public String getname(){
        return this.name;
    }
    
    public int getini(){
        return this.initiative.netValue();
    }
    
    public void modini(modifier m){
        this.initiative.addModifier(m)
    }
    
    public int getstat(String name){
        for (wert w : eigenschaft){
         if (w.descriptor.equals(name)){
          return w.netValue();
         } 
        }
    }
    
    public int getlep(){
        return this.lep.netValue();
    }
    
    public void modlep(modifier m){
        this.lep.addModifier(m);
    }
    
    public boolean gettot(){
        return this.tot;
    }
    
    public void totcheck(){
        if (this.lep<= 0) {
            this.tot=true;
            System.out.printf("%s ist tot.", this.name);
        }else{
            System.out.printf("%s ist lebendig.", this.name);
        }
    }
}
