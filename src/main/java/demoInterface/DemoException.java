package demoInterface;

import demoInterface.models.exceptions.YouShallNotPassException;

public class DemoException {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        try {
            System.out.println(division(a, b));
        } catch (ArithmeticException | YouShallNotPassException ex) {
            System.out.println(ex.getMessage());
        } catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Hey!!!");
    }

    public static int division(int a, int b) throws YouShallNotPassException {
        if (b == 0) {
            throw new YouShallNotPassException();
        }
        return a / b;
    }
}
