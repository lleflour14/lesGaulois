package org.example;

import java.util.ArrayList;

public class Bataille {
    private Village gentils;
    private Camp mechants;
    private ArrayList<Gaulois> gentilsBataille;
    private ArrayList<Romain> mechantsBataille;

    private Druide druideBataille;


    public Bataille(Village gentils, Camp mechants, Druide druideBataille) {
        this.gentils = gentils;
        this.mechants = mechants;
        this.druideBataille = druideBataille;
        this.gentilsBataille=new ArrayList<>();
        this.mechantsBataille=new ArrayList<>();

        for (Gaulois g : gentils.getLesGaulois()) {
            if (g.getMetier() != "Druide" && g.getMetier() != "Chef") {
                gentilsBataille.add(g);
            }
        }
        for (Romain r : mechants.getLesRomains()) {
            if (r.getGraderomain() != Grade.chef) {
                mechantsBataille.add(r);
            }
        }
        distributionPotion();

    }

    public void distributionPotion() {
        int qualite = druideBataille.getDosePotionMin() + (int) (Math.random() * ((druideBataille.getDosePotionMax() - druideBataille.getDosePotionMin()) + 1));
        for (Gaulois g : gentilsBataille) {
            if (g.getForce() < 5) {
                g.setForce(g.getForce() + qualite);

            }
        }

    }

    public String seBagarre(Gaulois g, Romain r) {
        r.setForce(r.getForce() - (g.getForce()/6));
        if(r.getForce()>0) {
            g.setForce(g.getForce() - r.getForce());
        }
        return "Claque";
    }

    public boolean lesRomainsPerdu(){
        int i=0;
        for (Romain r : mechantsBataille) {
            if (r.getForce() > 0) {
                i+=1;
            }
        }
        if(i>0){
            return false;
        }
        else{
            return true;
        }
    }
    public String strategie1() {
        for (Gaulois g : gentilsBataille) {
            while (g.getForce() > 0 && lesRomainsPerdu()==false) {
                for (Romain r : mechantsBataille) {
                    while (r.getForce() > 0 && g.getForce() > 0) {
                        seBagarre(g, r);
                        System.out.println(seBagarre(g,r));
                    }


                }
            }
        }

        if (lesRomainsPerdu()){
            return "Les Gaulois ont gagné!!";
        }
        else{
            return "Les Romains ont gagné :(";
        }
    }
}



