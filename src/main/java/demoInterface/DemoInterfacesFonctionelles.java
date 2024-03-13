package demoInterface;

import demoInterface.models.MyIFImpl;
import demoInterface.models.interfacesFonctionnelles.MyIF;

import java.util.ArrayList;
import java.util.List;

public class DemoInterfacesFonctionelles {
    public static void main(String[] args) {

        List<MyIF> ifs = new ArrayList<>();
        ifs.add(new MyIFImpl());

        ifs.add(new MyIF() {
            @Override
            public void execute() {
                System.out.println("Je suis l'implementation anonyme de MyIF");
            }
        });

        ifs.add(() -> System.out.println("Pas mal!"));
        ifs.add(() -> myFonction());

        for (MyIF i : ifs){
            i.execute();
        }

        ifs.forEach(i -> i.execute());


    }

    static void myFonction(){
        System.out.println("This is me!!!!");
    }
}
