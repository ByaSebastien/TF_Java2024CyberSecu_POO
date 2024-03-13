package demoInterface.models;

import demoInterface.models.interfaces.IGold;

import java.util.Random;

public class GrandMechant extends Mechant implements IGold {
    public GrandMechant(String name, int pv, int atk) {
        super(name, pv, atk);
    }

    @Override
    public int getGold() {
        return new Random().nextInt(10) + 1 ;
    }
}
