package tp2_bieres_carrera;

/*
 * CARRERA Valentn
 * Octobre 2024
 */

/**
 *
 * @author VC
 */
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
   
public boolean Decapsuler() {
    if (ouverte){
        System.out.println("erreur : biere deja ouverte");
        return false;
    }
    else{
        ouverte = true;
        return true;
    }
}
@Override
public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";  
    if (ouverte == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
}
   
public void lireEtiquette() {
    System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie );
}
public BouteilleBiere(String unNom, double unDegre, String uneBrasserie){
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
}}