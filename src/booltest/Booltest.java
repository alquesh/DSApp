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
        
        String command = new String();
        
        while (Ende==false) {
            int terminus = 0;                                                       //Var soll anzahl der toten entitys tracken
                
            for (int i=0;i<=anzahl-1;i++) {
            c[i].printsheet();
            while (c[i].turn==false) {
            System.out.println("Was wollen sie tun ?");
            System.out.println("Befehl: Schaden");
            System.out.println("Befehl: Heilung");
            System.out.println("Befehl: Inimod");
            System.out.println("Befehl: Zugende");
            System.out.print("Befehl wählen: ");
            command = input.nextLine();
            System.out.println("");
            if (command.equals("Schaden")||command.equals("Heilung")||command.equals("Inimod")||command.equals("Zugende")){
                if (command.equals("Schaden")){
                System.out.print("Bitte Zielnummer eingeben: ");
                target = input.nextInt();
                System.out.println("Bitte Menge der TP angeben: ");
                c[target].modlep(-(input.nextInt()));
                }
                if (command.equals("Heilung")){
                System.out.print("Bitte Zielnummer eingeben: ");
                target = input.nextInt();
                System.out.println("Bitte Menge der geheilten LeP angeben: ");
                c[target].modlep((input.nextInt()));    
                }
                if (command.equals("Inimod")){
                System.out.print("Bitte Zielnummer eingeben: ");
                target = input.nextInt();
                System.out.println("Bitte Modifikation der Initiative (mit Vorzeichen) angeben: ");
                c[target].modini((input.nextInt()));    
                }
                if (command.equals("Zugende")){
                    c[i].turn=true;
                }
            }else{
            System.out.println("Befehl wurde nicht verstanden.");    
                
            }
            }
        }
            
//            for (int i=0 ;i<=(anzahl-1) ;i++) {
//                if (tot[i]==true) {
//                System.out.printf("Char %d ist tot.\n", i);
//                terminus++;
//                }else{
//                System.out.printf("Char %d ist am Leben.\n", i);
//                }
//                }
//                if (terminus==anzahl) {
//                Ende=true;
//                
//                }else{ 
//                boolean wahl = true;
//                //System.out.print("Wer soll sterben ? :");
//                while (wahl==true){
//                target=(generator.nextInt(anzahl));
//                if (tot[target]==false){
//                System.out.printf("Char %d wird sterben.\n", target);
//                tot[target]=true;
//                System.out.println();
//                wahl=false;
//                }
//                }
//                }
//            System.out.println("Kampf beendet !");
         
            }
        }
    }
    
