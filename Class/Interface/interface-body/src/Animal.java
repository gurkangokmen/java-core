
// ✔️: public, default access modifier
// ❌: final,protected, private, static
interface Animal {




    // 💛All fields in an interface are implicitly public, static and final.💛
    // ℹ️: All fields must be initialized due to final!
    public String animalSound = "Animal Sound";
    String animalMeal = "Animal Meal";






    // Concrete methods with default implementation
    // ✔️: static, private
    // ❌: public, default access modifier, final, protected

    // public static  → ✔️
    // public  → ❌
    // static  → ✔️ (its implicitly public)
    static String getAnimalMammal() {
        return "Animal Mammal";
    }


    default String getAnimalSound() {
        return "Animal Sound";
    }











    // 💛All methods in an interface are implicitly public and abstract (but not final).💛
    // 🚫It cannot be final.🚫

    public abstract String getAnimalCellularStructure();
    String getAnimalCirculation();











    // Inner class

    // All inner class in an interface are implicitly public, static (not final).
    // 🌭It can be final.🌭
    public static class Point {

    }

    // Not allowed in Interface
    public Animal(){

    }

}
