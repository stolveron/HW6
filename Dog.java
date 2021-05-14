package HW6;

public class Dog extends Animal {
    private static int counter;

    public Dog(String name, int maxRun, int maxSwim) {
        super("Dog", name, maxRun, maxSwim);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
