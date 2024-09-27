/*
 * TP0 Exercice 2
 * VC
 * Septembre 2024
 
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author VC
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
 
 int nb;
 //nb=5;
 Scanner sc = new Scanner(System.in);
 System.out.println("\n Entrer le nombre :");
 nb=sc.nextInt(); 
 int result;
 int ind = 0;
 result=0;

 ind=1;
 while (ind <= nb) {
 result=result+ind;
 ind=ind+1;
 }
 // Affichage du resultat
 System.out.println();
 System.out.println("La somme des "+ nb + "entiers est: "+result);
    }
    
}
