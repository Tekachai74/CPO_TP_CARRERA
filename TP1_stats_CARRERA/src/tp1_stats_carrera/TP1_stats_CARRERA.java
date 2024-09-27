/*
 * TP1
 * Valentin CARRERA
 * Septembre 2024
 */
package tp1_stats_carrera;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author VC
 */
public class TP1_stats_CARRERA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] faces = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez le nombre de lancers de des: ");
        int m = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            int lancer = random.nextInt(6);
            faces[lancer]++;
        }
        System.out.println("Nombre d'apparitions de chaque face du de :");
        for (int i = 0; i < faces.length; i++) {
            System.out.println("Face " + (i + 1) + ": " + faces[i] + " fois");
        }
        System.out.println("Pourcentage :");
        for (int i = 0; i < faces.length; i++) {
            double pourcentage = ((double) faces[i] / m) * 100;
            System.out.printf("Face %d: %.2f%%\n", (i + 1), pourcentage);
        }

        scanner.close();
    }
}