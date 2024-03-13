package demoInterface.models;

import demoInterface.models.interfaces.IPlayableCharacter;

public class Gentil extends Character implements IPlayableCharacter {


    public Gentil(String name, int pv, int atk) {
        super(name, pv, atk);
    }

    @Override
    public void takeDamage(int amount) {
        this.setPv(this.getPv() - amount / 2);
    }

    @Override
    public void criDeGuerre() {
        System.out.println("Je suis le gentil");
    }

    @Override
    public String toString(){
        return "Le gentil : " + super.toString();
    }

    @Override
    public void seDeplacer() {
        System.out.println("1 2 3 je m'en vais dans les bois...");
    }
}
