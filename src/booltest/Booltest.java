/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booltest;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alquesh
 */
public class Booltest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        boolean Ende = false;                               //Für Terminierung
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        System.out.print("Anzahl an Kampfteilnehmern:");
        int anzahl = input.nextInt();                       //Für Anzahl an entitys
        System.out.println();
        //System.out.print("Anzahl an Spielern:");
        //int spieler = input.nextInt();
        entity[] c = new entity[anzahl];
        boolean[] tot = new boolean[anzahl];
        int target = 1;
        
        
        while (Ende==false) {
            int terminus = 0;                               //Var soll anzahl der toten entitys tracken
        
            for (int i=0 ;i<=(anzahl-1) ;i++) {
                if (tot[i]==true) {
                System.out.printf("Char %d ist tot.\n", i);
                terminus++;
                }else{
                System.out.printf("Char %d ist am Leben.\n", i);
                }
                }
                if (terminus==anzahl) {
                Ende=true;
                
                }else{ 
                boolean wahl = true;
                //System.out.print("Wer soll sterben ? :");
                while (wahl==true){
                target=(generator.nextInt(anzahl));
                if (tot[target]==false){
                System.out.printf("Char %d wird sterben.\n", target);
                tot[target]=true;
                System.out.println();
                wahl=false;
                }
                }
                }
            System.out.println("Kampf beendet !");
         
            }
        }
    }
    

