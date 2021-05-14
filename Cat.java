package HW6;

public class Cat extends Animal{
    private static int counter;

    Cat(String name) {
        super("Cat", name, 200, 0);
        counter++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " won't swim!");
    }

    public static int getCounter() {
        return counter;
    }
}
