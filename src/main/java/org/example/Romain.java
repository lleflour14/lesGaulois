package org.example;

public class Romain extends Humain{
    private Grade graderomain;

    public Romain(String nom, int force, Grade graderomain){
        super (nom, force);
        this.graderomain = graderomain;
    }

    @Override
    public String toString() {
        return super.toString() + "- grade= " + graderomain;
    }

    public Grade getGraderomain() {
        return graderomain;

    }
}

