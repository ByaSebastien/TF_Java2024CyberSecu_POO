package demoInterface.models;

public class Mechant extends Character{

    public Mechant(String name, int pv, int atk) {
        super(name, pv, atk);
    }

    @Override
    public void takeDamage(int amount) {
        this.setPv(this.getPv() - amount);
    }

    @Override
    public void criDeGuerre() {
        System.out.println("Je suis le mechant!");
    }
}
