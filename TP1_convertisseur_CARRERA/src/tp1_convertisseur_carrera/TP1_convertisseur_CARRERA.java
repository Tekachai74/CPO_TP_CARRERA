/*
 * TP1
 * Valentin CARRERA
 * Septembre 2024
 */
package tp1_convertisseur_carrera;

import java.util.Scanner;

/**
 *
 * @author VC
 */
public class TP1_convertisseur_CARRERA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez un reel: ");
        double valeur = scanner.nextDouble();
        double Kelvin = valeur + 273;
        
        System.out.println("La temperature en Celsius est de : " + valeur + "C");
        System.out.println("La temperature en Kelvin est de : " + Kelvin + "K");
        scanner.close();
    }
}