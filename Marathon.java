package HW6;

public class Marathon {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Barsik"),
                new Cat("Murzik"),
                new Dog("Bobik", 500, 20),
                new Dog("Tuzik", 1000, 15),
                new Dog("lknfgsd", 800, 30),
                new Dog("kdfsgkldrf", 500, 50)
        };

        for (Animal a : animals) {
            a.run(200);
            a.swim(10);
            a.run(500);
            a.swim(15);
            a.run(1000);
            a.swim(30);
        }



        System.out.println("There were " + Cat.getCounter() + " Cats");
        System.out.println("There were " + Dog.getCounter() + " Dogs");
        System.out.println("There were " + Animal.getCounter() + " Animals");

    }
}