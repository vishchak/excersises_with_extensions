package basiclevel;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(150, "cucumber", "grey");

        System.out.println(animal);
        animal.eat();
        animal.sleep();
        System.out.println(animal.getVoice());

        System.out.println();

        Cat cat = new Cat(6, "fish", "red", "Jumpy");

        System.out.println(cat);
        cat.eat();
        cat.sleep();
        System.out.println(cat.getVoice());

        System.out.println();

        Dog dog = new Dog(20, "meat", "white", "Runny");

        System.out.println(dog);
        dog.eat();
        dog.sleep();
        System.out.println(dog.getVoice());

        System.out.println();

        Veterinarian veterinarian = new Veterinarian("Bob");
        veterinarian.treatment(dog);
        veterinarian.treatment(cat);
    }
}
