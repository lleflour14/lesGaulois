package org.example;

public class Humain {
    private String nom;
    protected int force;
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

    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " : nom= " + nom +
                " - force= " + force;
    }
}
