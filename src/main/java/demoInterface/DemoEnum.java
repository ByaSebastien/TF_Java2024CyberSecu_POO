package demoInterface;

import demoInterface.models.enums.Dice;
import demoInterface.models.enums.Permis;

import java.util.ArrayList;
import java.util.List;

public class DemoEnum {
    public static void main(String[] args) {

        Dice dice = Dice.D6;
        System.out.println(dice);
        Dice dice6 = Dice.valueOf("D6");
        System.out.println(dice6);
        String dice6String = dice6.toString();
        System.out.println(dice6String);
        int dice6Ordinal = dice.ordinal();
        System.out.println(dice6Ordinal);
        Dice dice6FromInt = Dice.values()[dice6Ordinal];
        System.out.println(dice6FromInt);

        System.out.println("______________________________________");

        int result = Dice.D6.roll();

        System.out.println("______________________________________");

        List<Permis> permis = new ArrayList<>();
        permis.add(Permis.A);
        permis.add(Permis.B);

        permis.forEach(p -> System.out.println(p));

    }
}
