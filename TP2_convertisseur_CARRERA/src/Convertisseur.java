/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valen
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur () {
        int nbConversions = 0;
    }
   
    public double CelciusVersKelvin (double tCelcius) {
        nbConversions +=1;
       
        System.out.println(tCelcius + " en degre est egal a " +(tCelcius+273) +" Kelvin");
        return tCelcius+273;
    }
   
    public double KelvinVersCelcius (double tKel) {
        nbConversions +=1;
       
       
        System.out.println(tKel +" en Kelvin est egal a " +(tKel-273) + " Celcius");
        return tKel-273;
    }
    public double FarenheitVersCelcius (double tFar) {
        nbConversions +=1;
       
       
        System.out.println(tFar +" en Farenheit est egal a " +((tFar - 32)/9 *5)+" Celcius");
        return (tFar - 32)/9 *5;
    }
   
    public double CelciusVersFarenheit (double tCelcius) {
        nbConversions +=1;
       
        System.out.println(tCelcius + " en Celcius est egal a " +(tCelcius*1.8 + 32) +" Farenheit");
        return (tCelcius*1.8 + 32);
    }
   
    public double KelvinVersFarenheit (double tKel) {
       
        double tK;
        tK = CelciusVersFarenheit(KelvinVersCelcius(tKel));
        nbConversions +=1;
       
        System.out.println(tKel + " en Kelvin est egal a " +tK + " Farenheit");
        return tK;
    }
   
    public double FarenheitVersKelvin (double tFar) {
        double tF;
        tF = CelciusVersKelvin(FarenheitVersCelcius(tFar));
        nbConversions +=1;
        System.out.println(tFar + "en Farenheit est egal a " + tF + " Kelvin");
        return tF;
    }

    @Override
    public String toString() {
        return "Convertisseur{" + "nbConversions=" + nbConversions + '}';
}}