package org.example;

public class Humain {
    private String nom;
    private int force;
    public Humain(String nom, int force){
        this.force=force;
        this.nom=nom;
    }

    public String getNom() {
        return nom;
    }

    public int getForce() {
        return force;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                " : nom= " + nom + " - " +
                "force=" + force;
    }
}
