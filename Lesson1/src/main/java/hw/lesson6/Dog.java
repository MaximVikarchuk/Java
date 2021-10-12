package hw.lesson6;


public class Dog extends Animal {

    public static int countDog = 0;
    public static String typeThisClass = "Пес";

    Dog(String name, float maxJump, float maxRun, float maxSwim) {
        super(typeThisClass, name, maxJump, maxRun, maxSwim);
        ++countDog;
    }



}
