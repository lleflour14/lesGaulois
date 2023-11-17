package org.example;
public class Main {
    public static void main(String[] args) {
        Romain caius= new Romain("Caius",Grade.soldat );
        System.out.println(caius);
        Gaulois asterix = new Gaulois("Asterix", ("Héros"));
        Gaulois obelix = new Gaulois("Obélix", "Tailleur de ménhir ?");
        System.out.println(asterix);
        System.out.println(obelix);
        Druide panoramix = new Druide("Panoramix","Druide", 7, 20);
        System.out.println(panoramix);
    }


}