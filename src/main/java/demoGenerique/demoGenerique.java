package demoGenerique;

import demoInterface.models.enums.Dice;

import java.util.ArrayList;
import java.util.List;

public class demoGenerique {
    public static void main(String[] args) {

        SimpleList<Double> doubleSimpleList = new SimpleList<Double>(10);

        doubleSimpleList.add(6D);

        doubleSimpleList.removeAt(0);

        SimpleList<Dice> dices = new SimpleList<Dice>(10);

        dices.add(Dice.D6);
        dices.add(Dice.D20);
        dices.add(Dice.D100);

        int result = dices.getValue(2).roll();

        System.out.println(result);
    }
}
