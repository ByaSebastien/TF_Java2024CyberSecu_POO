package demoInterface.models.exceptions;

public class YouShallNotPassException extends RuntimeException{

    public YouShallNotPassException() {
        super("You shall not pass!!!");
    }

    public YouShallNotPassException(String message) {
        super(message);
    }
}
