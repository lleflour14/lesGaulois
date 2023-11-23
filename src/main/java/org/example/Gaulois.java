package org.example;

public class Gaulois extends Humain implements Rencontre{

    private String metier;

    public Gaulois(String nom, String metier) {
        super(nom, 1);
        if(nom.equals("Obélix")){
            force=15;
        }
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

    @Override
    public void seRencontrer(Humain h) throws RencontreException, soiMemeException {
        if(h.getNom().equals(this.getNom())){
            throw new soiMemeException("Un gaulois ne peut se rencontrer soi-même");
        }
        if(h instanceof Gaulois){
            System.out.println("Bonjour, je suis " + h.getNom() + '\''+ " Bonjour " + h.getNom() + ", moi c’est " + this.getNom());
        }
        else {
            throw new RencontreException("Un gaulois ne peut pas rencontrer un romain");

        }
    }
}
