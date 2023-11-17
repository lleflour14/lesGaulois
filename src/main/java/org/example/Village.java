package org.example;

import java.util.ArrayList;

public class Village {

    private ArrayList<Gaulois> lesGaulois;
    private Gaulois chef;

    public Village(ArrayList<Gaulois> lesGaulois, Gaulois chef) {
        this.lesGaulois = lesGaulois;
        this.chef = chef;
        lesGaulois.add(chef);
    }

    @Override
    public String toString() {
        return "Village{" +
                "lesGaulois=" + lesGaulois +
                ", chef=" + chef +
                '}';
    }

    public void ajouterGaulois(Gaulois g)throws ChefException{
        if(g.getMetier().equals("Chef")){
            throw new ChefException("Il ne peut pas y avoir 2 chefs dans le même village");
        }
        for(Gaulois g1 : lesGaulois) {
            if (g.getNom().equals(g1)){
                throw new ChefException("Il est déjà dans le village");
            }
            else {
                lesGaulois.add(g);

            }
        }


    }
}
