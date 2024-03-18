package demoInterface.models.enums;

import java.util.Random;

public enum Dice {
    D4(4),
    D6(6),
    D20(20),
    D100(100);

    private final int value;

    Dice(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int roll(){
        Random random = new Random();
        return random.nextInt(this.value) + 1;
    }
}
