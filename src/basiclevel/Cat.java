package basiclevel;

public class Cat extends Animal {
    private String name;

    public Cat() {
    }

    public Cat(int weight, String ration, String color, String name) {
        super(weight, ration, color);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getVoice() {
        return "Meow.........";
    }

    @Override
    public void eat() {
        System.out.println("Enjoying my " + getRation());
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping on the couch");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' + super.toString() +
                '}';
    }
}
