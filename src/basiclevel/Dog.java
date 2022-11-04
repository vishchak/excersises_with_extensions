package basiclevel;

public class Dog extends Animal {

    private String name;

    public Dog() {
    }

    public Dog(int weight, String ration, String color, String name) {
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
        return "Loud woof.........";
    }

    @Override
    public void eat() {
        System.out.println("Enjoying my " + getRation());
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping on the mattress");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                super.toString() + '}';
    }
}
