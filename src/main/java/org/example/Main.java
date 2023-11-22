package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ChefException {

        Gaulois abraracourcix = new Gaulois("Abraracourcix", "Chef");
        Gaulois agecanonix = new Gaulois("Agecanonix", "Retraité");
        Gaulois assurancetourix = new Gaulois("Assurancetourix", "Barde");
        Gaulois bonemine = new Gaulois("Bonemine", "Femme du chef");
        Gaulois asterix = new Gaulois("Asterix", "Héros");
        Gaulois obelix = new Gaulois("Obélix", "Tailleur de menhir");
        Gaulois cétautomatix = new Gaulois("Cétautomatix", "Forgeron");
        Gaulois tragicomix = new Gaulois("Tragicomix", "Beau Gosse");
        Gaulois ordralbabétix = new Gaulois("Ordralbabétix", "poissonnier");
        Gaulois falbala = new Gaulois("Falbala", "fiancée");
        Druide panoramix = new Druide("Panoramix", 7, 20);

        System.out.println(panoramix);
        ArrayList<Gaulois> lesGaulois = new ArrayList<Gaulois>();
        lesGaulois.add(abraracourcix);
        lesGaulois.add(obelix);
        lesGaulois.add(agecanonix);
        lesGaulois.add(assurancetourix);
        lesGaulois.add(bonemine);
        lesGaulois.add(asterix);
        lesGaulois.add(cétautomatix);
        lesGaulois.add(tragicomix);
        lesGaulois.add(ordralbabétix);
        lesGaulois.add(falbala);
        lesGaulois.add(panoramix);
        Village irreductible = new Village( lesGaulois, abraracourcix);
        abraracourcix.seRencontrer(abraracourcix);

        Romain caiusobtus = new Romain("Caius Obtus", Grade.chef);
        Romain brutus = new Romain("Brutus", Grade.centurion);
        Romain briseradius = new Romain("Briseradius", Grade.soldat);
        Romain caligulaminus = new Romain("Caligula Minus", Grade.soldat);
        Romain chorus = new Romain("Chorus", Grade.centurion);
        Romain milexcus = new Romain("Milexcus", Grade.soldat);

        ArrayList<Romain> lesRomains = new ArrayList<Romain>();
        lesRomains.add(caiusobtus);
        lesRomains.add(brutus);
        lesRomains.add(briseradius);
        lesRomains.add(caligulaminus);
        lesRomains.add(chorus);
        lesRomains.add(milexcus);


        Camp babaorum = new Camp(lesRomains, "Babaorum", caiusobtus);
        System.out.println(babaorum);
        System.out.println(irreductible);
    }



}