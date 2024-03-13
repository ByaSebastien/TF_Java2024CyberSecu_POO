package demoInterface.models;

import demoInterface.models.interfacesFonctionnelles.MyIF;

public class MyIFImpl implements MyIF {
    @Override
    public void execute() {
        System.out.println("Je suis l'implementation de MyIF");
    }
}
