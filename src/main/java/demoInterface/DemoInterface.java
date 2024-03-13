package demoInterface;

import demoInterface.models.*;
import demoInterface.models.Character;
import demoInterface.models.interfaces.ICharacter;

public class DemoInterface {
    public static void main(String[] args) {

        Gentil c1 = new Gentil("Dante", 1000, 9999);
        Mechant c2 = new PetitMechant("Vergil", 99999999, 10000000);

        c1.addDieEventSubscriber((target -> {
            System.out.println(target.getName() + " vient de te tuer gros nul!");
            c2.criDeGuerre();
            System.out.println("GAME OVER");
        }));
        c2.addDieEventSubscriber(target -> {
            c1.loot(target);
            c1.criDeGuerre();
            System.out.println("You win!");
        });


        System.out.println(c1);
        System.out.println(c2);

        c1.addDieEventSubscriber((target) -> {
            System.out.println("Même avec une jambe di bouè");
        });

        while (c1.isAlive() && c2.isAlive()) {
            c1.attack(c2);
            if (c2.isAlive()) {
                c2.attack(c1);
            }
        }
    }
}
