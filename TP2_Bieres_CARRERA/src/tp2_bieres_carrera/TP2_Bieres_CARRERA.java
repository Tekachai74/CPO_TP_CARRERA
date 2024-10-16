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
        BouteilleBiere uneBiere = new BouteilleBiere("CuvEe des trolls", 7.0 ,"Dubuisson") ;
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
        BouteilleBiere Biere = new BouteilleBiere("La chouffe", 5.0 ,"Abbaye de Chouffe") ;
        BouteilleBiere powerade = new BouteilleBiere("Boisson",10.0 ,"ELLLLLL PRIMO") ;

        powerade.lireEtiquette();
        powerade.Decapsuler();
       
        System.out.println(powerade.ouverte);
       

}}
