package org.example;

public class Druide extends Gaulois{

    private int dosePotionMin;
    private int dosePotionMax;

    public Druide(String nom, int dosePotionMin,int dosePotionMax) {
        super(nom, "Druide");
        this.dosePotionMin = dosePotionMin;
        this.dosePotionMax=dosePotionMax;
    }

    public int getDosePotionMin() {
        return dosePotionMin;
    }

    public int getDosePotionMax() {
        return dosePotionMax;
    }

    @Override
    public String toString() {
        return super.toString() +
                " - dosePotionMin= " + dosePotionMin +
                " - dosePotionMax= " + dosePotionMax;
    }
}
