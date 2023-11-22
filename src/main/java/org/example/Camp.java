package org.example;
import java.util.ArrayList;


public class Camp {
    private ArrayList<Romain> lesRomains;
    private String nom;
    private Romain chef;

    public Camp(ArrayList<Romain> lesRomains, String nom, Romain chef){
        this.lesRomains = lesRomains;
        this.nom=nom;
        this.chef = chef;
    }

    @Override
    public String toString() {
        return nom + " Le chef= " + chef.getNom() + "les membres= " + lesRomains;
    }

    public void ajouterRomain(Romain r)throws ChefException {
        if (r.getGraderomain().equals("Chef")) {
            throw new ChefException("Il ne peut pas y avoir 2 chefs dans le même camp");
        } else {
            lesRomains.add(r);
        }
    }
}
