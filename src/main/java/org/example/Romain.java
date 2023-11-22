package org.example;

public class Romain extends Humain implements Rencontre{
    private Grade graderomain;

    public Romain(String nom, Grade graderomain){
        super (nom, (int)(Math.random()*(4)) +1);
        this.graderomain = graderomain;
    }

    @Override
    public String toString() {
        return super.toString() + "- grade= " + graderomain;
    }

    public Grade getGraderomain() {
        return graderomain;

    }

    //true == plus gradé , false == moins gradé
    public boolean plusOuMoinsGrade(Romain r){
        boolean ret=true;
        if(r.graderomain.equals(Grade.chef)){
            ret= false;
        }
        if(r.graderomain.equals(Grade.centurion)){
            if(graderomain.equals(Grade.chef)){
                ret= true;
            }
            else{
                ret= false;
            }
        }
        return ret;
    }
    @Override
    public void seRencontrer(Humain h) {
        //this est plus gradé que h
        if(plusOuMoinsGrade((Romain) h)==true){
            System.out.println("Je te salue " + this.getGraderomain()+ " "+ this.getNom() +", je suis " + h.getNom());
            System.out.println("C’est à moi à te saluer" + ((Romain) h).getGraderomain()+ ((Romain) h).getNom() +", je suis " + this.getNom());
        }
        else{
            System.out.println("Je te salue " + ((Romain) h).getGraderomain()+ h.getNom() +", je suis " + this.getNom());
            System.out.println("C’est à moi à te saluer " + this.getGraderomain()+" " + this.getNom() +", je suis " + h.getNom());

        }

    }
}

