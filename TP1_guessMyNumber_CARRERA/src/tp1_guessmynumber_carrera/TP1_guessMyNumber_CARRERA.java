/*
 * TP1
 * Valentin CARRERA
 * Septembre 2024
 */
package tp1_guessmynumber_carrera;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author VC
 */
public class TP1_guessMyNumber_CARRERA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int altnb;
        int nb1;
        int cmp;
        int choix;
        double limit;
        int limit2 = 0;
        limit = Double.POSITIVE_INFINITY;
        altnb = 10;
        cmp = 1;
       
       
        System.out.println("Bonjour, choisissez une difficultee :");
        System.out.println("1) Facile");
        System.out.println("2) Moyen");
        System.out.println("3) Difficile");
        Scanner sc2 = new Scanner(System.in);
        choix = sc2.nextInt();
       
        switch (choix){
            case 1:
                altnb = 10;
                break;
            case 2:
                altnb = 100;
                limit2 = 10;
                break;
            case 3:
                altnb = 1000;
                limit2 = 20;
                break;
            default:

           
        }
               
        int n = generateurAleat.nextInt(0,altnb);

        System.out.println("Bonjour, saisissez une valeur entre 0 et "+ altnb + ":");
        if (limit2 == 0){
            System.out.println("Vous avez autant d'essai que vous voulez.");
        }
        else{
           
            System.out.println("Vous avez droit a " + limit2 + " essais.");
        }
       
        Scanner sc1 = new Scanner(System.in);
        nb1 = sc1.nextInt();
        while((nb1 != n) && (cmp < limit)){
            if (nb1 < n){
                System.out.println("trop petit");
            }
            else{
                System.out.println("trop grand");
            }
            Scanner sc = new Scanner(System.in);            
            nb1 = sc1.nextInt();
            cmp +=1;
        }
        if (nb1 == n){
            System.out.println("Gagne en " + cmp + " tantatives");
        }
        else{
            System.out.println("Perdu");
        }
    }
}
