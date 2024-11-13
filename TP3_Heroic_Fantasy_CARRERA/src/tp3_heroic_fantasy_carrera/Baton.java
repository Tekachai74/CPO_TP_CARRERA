/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_carrera;

/**
 *
 * @author valen
 */
public class Baton extends Arme {
    private int age;

    // Constructeur qui initialise nom, niveauAttaque, et age
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);

        // Assurez-vous que l'âge est inférieur ou égal à 100
        if (age > 100) {
            this.age = 100;
        } else {
            this.age = age;
        }
    }

    // Getter pour l'âge
    public int getAge() {
        return age;
    }

    // Redéfinition de toString pour inclure l'âge
    @Override
    public String toString() {
        return super.toString() + ", Age: " + age;
    }
}