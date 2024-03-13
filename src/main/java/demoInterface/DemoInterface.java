package demoInterface;

import demoInterface.models.Gentil;
import demoInterface.models.Mechant;
import demoInterface.models.interfaces.ICharacter;

public class DemoInterface {
    public static void main(String[] args) {

        ICharacter c1 = new Gentil("Dante", 1000, 9999);
        ICharacter c2 = new Mechant("Vergil", 9999, 1000);

        System.out.println(c1);
        System.out.println(c2);

        while (c1.isAlive() && c2.isAlive()) {
            c1.attack(c2);
            if (c2.isAlive()) {
                c2.attack(c1);
            }
        }
        if (c1.isAlive()) {
            c1.criDeGuerre();
        } else {
            c2.criDeGuerre();
        }
    }
}
