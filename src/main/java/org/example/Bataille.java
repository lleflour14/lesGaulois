package org.example;

import java.util.ArrayList;

public class Bataille {
    private Village gentils;
    private Camp mechants;
    private ArrayList<Gaulois> gentilsBataille;
    private ArrayList<Romain> mechantsBataille;



    public Bataille(Village gentils, Camp mechants) {
        this.gentils = gentils;
        this.mechants = mechants;

        for(Gaulois g : gentils.getLesGaulois()){
            if(g.getMetier()!="Druide" || g.getMetier()!="Chef"){
                gentilsBataille.add(g);
            }
        }
        for(Romain r : mechants.getLesRomains()){
            if(r.getGraderomain()!=Grade.chef){
                mechantsBataille.add(r);
            }
        }
        public void distributionPotion(ArrayList<Gaulois> g){

        }


    }


}
