/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booltest;

import java.util.Random;

/**
 *
 * @author Alquesh
 */
public class entity {
    
    private String name;
    private int initiative;
    private int[] eigenschaft;
    private int lep;
    private int lepmax;
    private boolean tot;
    private boolean turn;
    Random generator = new Random();

    public entity(String name,int initiative,int[] eigenschaft, int lep){           //a constructor that outputs an entity with
        this.name=name;                                                             //the given stats
        this.initiative =initiative;
        this.eigenschaft=eigenschaft;
        this.lep=lep;
        this.lepmax=lep;
        this.tot=false;
        this.turn=false;
    }
    
    public entity(int nummer){                                                      //a constructor that outputs an entity with random
                                                                                    //values within an expected range
        this.name=("Gegner "+ nummer);                                              //used for NPC generation or testing
        this.initiative=(8+generator.nextInt(10));
        for(int i=0;i>=7;i++){
        this.eigenschaft[i]=(8+generator.nextInt(6));    
        }
        this.lep=30+(generator.nextInt(10)-5);
        this.lepmax=this.lep;
        this.tot=false;
        this.turn=false;
    }
    
    public void printsheet() {
        System.out.printf("Name             : %s", this.name);
        System.out.printf("Initiative       : %d", this.initiative);
        System.out.printf("Mut              : %d", this.eigenschaft[0]);
        System.out.printf("Klugheit         : %d", this.eigenschaft[1]);
        System.out.printf("Intuition        : %d", this.eigenschaft[2]);
        System.out.printf("Charisma         : %d", this.eigenschaft[3]);
        System.out.printf("Fingerfertigkeit : %d", this.eigenschaft[4]);
        System.out.printf("Gewandheit       : %d", this.eigenschaft[5]);
        System.out.printf("Konstitution     : %d", this.eigenschaft[6]);
        System.out.printf("Körperkraft      : %d", this.eigenschaft[7]);
        System.out.printf("Lebenspunkte     : %d / %d", this.lep, this.lepmax);
        this.totcheck();
        
    }
    
    
    public String getname(){
        return this.name;
    }
    
    public int getini(){
        return this.initiative;
    }
    
    public void modini(int i){
        this.initiative=this.initiative-i;
    }
    
    public int getstat(int i){
        return this.eigenschaft[i];
    }
    
    public int getlep(){
        return this.lep;
    }
    
    public void modlep(int i){
        this.lep=this.lep-i;
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
