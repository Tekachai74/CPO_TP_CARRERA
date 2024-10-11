/*
 * CARRERA Valentin
 * Octobre 2024
 */
package tp2_bieres_carrera;

/**
 *
 * @author VC
 */
public class TP2_Bieres_CARRERA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BouteilleBiere uneBiere = new BouteilleBiere();
        uneBiere.nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0; 
        uneBiere.brasserie = "Dubuisson";
        uneBiere.booleen = "non ouvert"; 

        uneBiere.lireEtiquette();
    }
}
