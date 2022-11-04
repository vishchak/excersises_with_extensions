package basiclevel;

public class Veterinarian {
    private String name;

    public Veterinarian() {
    }

    public Veterinarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void treatment(Animal animal) {
        String split = animal.getClass().getName();
        String[] whoIsBeingCured = split.split("\\.");
        System.out.println("I'm curing " + (whoIsBeingCured[1]));
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "name='" + name + '\'' +
                '}';
    }
}
