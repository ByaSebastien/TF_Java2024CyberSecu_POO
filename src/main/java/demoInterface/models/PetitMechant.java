package demoInterface.models;

import demoInterface.models.interfaces.ILeather;

import java.util.Random;

public class PetitMechant extends Mechant implements ILeather {
    public PetitMechant(String name, int pv, int atk) {
        super(name, pv, atk);
    }

    @Override
    public int getLeather() {
        return new Random().nextInt(10) + 1;
    }
}
