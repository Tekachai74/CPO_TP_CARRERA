/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_carrera;

import java.util.ArrayList;


/**
 *
 * @author VC
 */
public class TP3_Heroic_Fantasy_CARRERA {
    /**
     * @param args the command line arguments
     */
    public class Main {
    public static void main(String[] args) {
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);
        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        ArrayList<Arme> armes = new ArrayList<Arme>();
        armes.add(epee1);
        armes.add(epee2);
        armes.add(baton1);
        armes.add(baton2);

        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i));
        }
     }
  }
}
