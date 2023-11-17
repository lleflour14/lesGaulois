package org.example;

public class Druide extends Gaulois{

    private int dosePotionMin;
    private int dosePotionMax;

    public Druide(String nom, String metier, int dosePotionMin,int dosePotionMax) {
        super(nom, metier);
        this.dosePotionMin = dosePotionMin;
        this.dosePotionMax=dosePotionMax;
        System.out.println("ff");
    }

    @Override
    public String toString() {
        return super.toString() +
                " - dosePotionMin= " + dosePotionMin +
                " - dosePotionMax= " + dosePotionMax;
    }
}
