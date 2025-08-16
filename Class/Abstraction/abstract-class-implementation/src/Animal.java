abstract class Animal {
    // Fields with different access modifiers
    public String animalSound;
    protected String animalKind;
    private String animalMammal;
    String animalMeal;

    // Concrete methods with default implementation
    public String getAnimalSound() {
        return animalSound;
    }
    protected String getAnimalKind() {
        return animalKind;
    }
    private String getAnimalMammal() {
        return animalMammal;
    }
    String getAnimalMeal(){
        return animalMeal;
    }


    // Static method
    public static String getName() {
        return "Animals is here!";
    }

    // Abstract method (no implementation body)
    // All access modifiers are ok, but except private: Illegal combination of modifiers: 'abstract' and 'private'
    public abstract String getAnimalCellularStructure();

    // Inner class
    // All access modifiers are ok
    public class Point {

    }
}
