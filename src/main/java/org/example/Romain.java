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
        return ret;
    }
    @Override
    public void seRencontrer(Humain h) {

    }
}

