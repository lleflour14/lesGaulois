package org.example;

public class Gaulois extends Humain{

    private String metier;

    public Gaulois(String nom, int force, String metier) {
        super(nom, force);
        this.metier = metier;
    }

    @Override
    public String toString() {
        return super.toString() +
                " - metier= " + metier;
    }

    public String getMetier() {
        return metier;
    }
}
