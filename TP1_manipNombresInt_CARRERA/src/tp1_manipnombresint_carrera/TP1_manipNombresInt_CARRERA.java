/*
 * TP1
 * Valentin CARRERA
 * Septembre 2024
 */
package tp1_manipnombresint_carrera;

import java.util.Scanner;

/**
 *
 * @author VC
 */
public class TP1_manipNombresInt_CARRERA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez le premier entier: ");
        int nombre1 = scanner.nextInt();
        
        System.out.print("Entrez le deuxieme entier: ");
        int nombre2 = scanner.nextInt();
        
        int somme = nombre1 + nombre2;
        int difference = nombre1 - nombre2;
        int produit = nombre1 * nombre2;
    
        System.out.println("La somme des deux nombres est: " + somme);
        System.out.println("La difference entre les deux nombres est: " + difference);
        System.out.println("Le produit des deux nombres est: " + produit);
        
        if (nombre2 != 0) {
            int quotient = nombre1 / nombre2;
            int reste = nombre1 % nombre2;
            System.out.println("Le quotient entier de " + nombre1 + " divise par " + nombre2 + " est: " + quotient);
            System.out.println("Le reste de la division euclidienne de " + nombre1 + " par " + nombre2 + " est: " + reste);
        } else {
            System.out.println("La division par zéro n'est pas possible.");
        }
        scanner.close();
    }
}