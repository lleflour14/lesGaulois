package org.example;
import java.util.ArrayList;


public class Camp {
    private ArrayList<Romain> lesRomains;
    private String nom;
    private Romain chef;

    public Camp(ArrayList<Romain> lesRomains, String nom, Romain chef) throws ChefException {
        this.lesRomains = lesRomains;
        this.nom=nom;
        this.chef = chef;
        int i=0;
        for(Romain g : lesRomains){
            if(g.getGraderomain()== Grade.chef){
                i+=1;
            }
        }
        if(i>1){
            throw new ChefException("Il y a 2 chefs dans le village");
        }
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

    public ArrayList<Romain> getLesRomains() {
        return lesRomains;
    }
}
