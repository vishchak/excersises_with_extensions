package basiclevel;

public class Animal {
    private int weight;
    private String ration;
    private String color;

    public Animal() {
    }

    public Animal(int weight, String ration, String color) {
        this.weight = weight;
        this.ration = ration;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVoice() {
        return "Don't even know who am I";
    }

    public void sleep() {
        System.out.println("Unknown creature is sleeping");
    }

    public void eat() {
        System.out.println("In process of eating " + this.ration);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", ration='" + ration + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
