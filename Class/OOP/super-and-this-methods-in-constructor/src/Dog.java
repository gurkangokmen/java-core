// Subclass Dog, inheriting from Animal
class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    // Additional method specific to Dog
    public void bark() {
        System.out.println("Woof! Woof!");
    }
}