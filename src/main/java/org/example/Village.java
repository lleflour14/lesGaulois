package org.example;

import java.util.ArrayList;

public class Village {

    private ArrayList<Gaulois> lesGaulois;
    private Gaulois chef;

    public Village(ArrayList<Gaulois> lesGaulois, Gaulois chef) throws ChefException {
        this.lesGaulois = lesGaulois;
        this.chef = chef;
        int i=0;
        for(Gaulois g : lesGaulois){
            if(g.getMetier().equals("Chef")){
                i+=1;
            }
        }
        if(i>1){
            throw new ChefException("Il y a 2 chefs dans le village");
        }
    }

    @Override
    public String toString() {
        return "Chef= " + chef.getNom() + "les habitants= "+lesGaulois;
    }

    public ArrayList<Gaulois> getLesGaulois() {
        return lesGaulois;
    }

    public void ajouterGaulois(Gaulois g)throws ChefException{
        if(g.getMetier().equals("Chef")){
            throw new ChefException("Il ne peut pas y avoir 2 chefs dans le même village");
        }
        /*for(Gaulois g1 : lesGaulois) {
            if (g.getNom().equals(g1)){
                throw new ChefException("Il est déjà dans le village");
            }

         */
            else {
                lesGaulois.add(g);

            }
        //}



    }
}
