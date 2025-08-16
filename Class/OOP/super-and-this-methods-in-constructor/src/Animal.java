public class Animal {
    private String species;

    public Animal(String species) {
        this();
        System.out.println("Animal constructor with species");
        this.species = species;
    }

    public Animal() {
        super(); //Every class in Java extends Object class by default
        System.out.println("Animal constructor without species");
        this.species = "Animal";
    }

    public void eat() {
        System.out.println(species + " is eating.");
    }

    public void sleep() {
        System.out.println(species + " is sleeping.");
    }

    // Getter method for species
    public String getSpecies() {
        return species;
    }

    public int age() {
        return 120;
    }
}
