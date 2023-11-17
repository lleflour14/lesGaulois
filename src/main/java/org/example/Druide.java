package org.example;

public class Druide extends Gaulois{

    private int dosePotionMin;
    private int dosePotionMax;

    public Druide(String nom, int force, String metier, int dosePotionMin,int dosePotionMax) {
        super(nom, force, metier);
        this.dosePotionMin = dosePotionMin;
        this.dosePotionMax=dosePotionMax;
    }

    @Override
    public String toString() {
        return super.toString() +
                " - dosePotionMin= " + dosePotionMin +
                " - dosePotionMax= " + dosePotionMax;
    }
}
