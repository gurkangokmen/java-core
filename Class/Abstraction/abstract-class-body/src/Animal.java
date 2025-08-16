
// ✔️: public, default access modifier
// ❌: final, protected, private, static
abstract class Animal {


    // Fields with different access modifiers
    // ✔️: public, protected, private, default access modifier, final, static
    public String animalSound;
    protected String animalKind;
    private String animalMammal;
    String animalMeal;
    final String animalRespiratory = "Animal Respiratory";


    // Concrete methods with default implementation
    // ✔️: public, protected, private, default access modifier, final, static
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
    public static String getName() {
        return "Animals is here!";
    }
    protected final String getRespiratory() {
        return animalRespiratory;
    }


    // Abstract methods (no implementation body)
    // ✔️: public, protected, default access modifier
    // ❌: private, final, static
    public abstract double getAnimalCellularStructure();


    // Error (No Error in interface!)
    // double getAnimalCellularStructure();

    // Inner class
    // ✔️: public, protected, private, default access modifier, final, static
    public class Point {

    }


    // Constructor
    // ✔️: public, protected, private, default access modifier
    // ❌: final, static
    public Animal(){

    }




}
