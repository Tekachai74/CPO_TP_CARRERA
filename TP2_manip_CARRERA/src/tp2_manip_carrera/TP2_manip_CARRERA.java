/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_carrera;

/**
 *
 * @author VC
 */
public class TP2_manip_CARRERA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
       
        Moussaka [] tabMouss = new Moussaka[10];
        tabMouss[0] = new Moussaka(0);
        tabMouss[1] = new Moussaka(10);
        tabMouss[2] = new Moussaka(20);
        tabMouss[3] = new Moussaka(30);
        tabMouss[4] = new Moussaka(40);
        tabMouss[5] = new Moussaka(50);
        tabMouss[6] = new Moussaka(60);
        tabMouss[7] = new Moussaka(70);
        tabMouss[9] = new Moussaka(80);
        tabMouss[8] = new Moussaka(90);
    }
   
}