package demoInterface.models;

import demoInterface.models.interfaces.ICharacter;
import demoInterface.models.interfaces.IPlayableCharacter;

public abstract class Character implements ICharacter {

    private String name;
    private int pv;
    private int atk;

    public Character(String name, int pv, int atk) {
        this.name = name;
        this.pv = pv;
        this.atk = atk;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPv() {
        return pv;
    }

    protected void setPv(int pv) {
        this.pv = pv;
    }

    @Override
    public boolean isAlive(){
        return this.pv > 0;
    }

    @Override
    public void attack(ICharacter c){
        if(this instanceof IPlayableCharacter pc){
            pc.seDeplacer();
        }
        System.out.println(this.name + " attaque " + c.getName());
        c.takeDamage(this.atk);
    }

    @Override
    public String toString() {
        return "Name : " + this.name + "\n" +
                "PV : " + this.pv + "\n" +
                "Atk : " + this.atk;
    }
}
