// Subclass Cat, inheriting from Animal
class Cat extends Animal {
    public Cat() {
        super();
    }

    // Additional method specific to Cat
    public void meow() {
        System.out.println("Meow!");
    }

    @Override
    public int age() {
        return super.age() + 10;
    }
}
