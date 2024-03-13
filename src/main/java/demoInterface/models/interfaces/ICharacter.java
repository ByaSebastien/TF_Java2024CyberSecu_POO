package demoInterface.models.interfaces;


public interface ICharacter {

    String getName();
    int getPv();

    void attack(ICharacter c);
    void takeDamage(int amount);
    boolean isAlive();
    void criDeGuerre();
}
