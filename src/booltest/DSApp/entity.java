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
    public int initiative;
    public int[] eigenschaft;
    public int lep;
    public int lepmax;
    public boolean tot;																	
    public boolean turn;										//tracks wether the object allready had a turn this round
    //public int[] wunde;
    //Random generator = new Random();

    public entity(){                                         //a constructor that outputs an entity with default stats
        this.name="PH";                                      //for now only intended to 
        this.initiative=10;
        this.eigenschaft=new int[8];
        this.lep=20;
        this.lepmax=20;
        this.tot=false;
        this.turn=false;
        //for(int i=0;i<=7;i++){
        //    this.wunde[i]=0;
        //}
    }
    
    public void generate(int name, int ini,int[] eig, int lep){                     //a constructor that outputs an entity with random
                                                                                    //values within an expected range
        this.name=("Gegner ");                                              								//used for NPC generation or testing
        this.initiative=10+ini;
        this.eigenschaft=eig;    
        this.lep=25+lep;
        this.lepmax=25+lep;
        this.tot=false;
        this.turn=false;
        //for(int i=0;i<=7;i++){
        //    this.wunde[i]=0;
        //}
    }
    
    public void printsheet() {
        System.out.printf("Name             : %s\n", this.name);
        System.out.printf("Initiative       : %d\n", this.initiative);
        System.out.printf("Mut              : %d\n", this.eigenschaft[0]);
        System.out.printf("Klugheit         : %d\n", this.eigenschaft[1]);
        System.out.printf("Intuition        : %d\n", this.eigenschaft[2]);
        System.out.printf("Charisma         : %d\n", this.eigenschaft[3]);
        System.out.printf("Fingerfertigkeit : %d\n", this.eigenschaft[4]);
        System.out.printf("Gewandheit       : %d\n", this.eigenschaft[5]);
        System.out.printf("Konstitution     : %d\n", this.eigenschaft[6]);
        System.out.printf("Körperkraft      : %d\n", this.eigenschaft[7]);
        System.out.printf("Lebenspunkte     : %d / %d\n", this.lep, this.lepmax);
        this.totcheck();
        
    }
    
    
    public String getname(){
        return this.name;
    }
    
    public int getini(){
        return this.initiative;
    }
    
    public void modini(int i){
        this.initiative=this.initiative+i;
    }
    
    public int getstat(int i){
        return this.eigenschaft[i];
    }
    
    public int getlep(){
        return this.lep;
    }
    
    public void modlep(int i){
        this.lep=this.lep+i;
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
