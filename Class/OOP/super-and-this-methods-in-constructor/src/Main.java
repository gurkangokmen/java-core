public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getSpecies()); //Output: Dog

        System.out.println(dog.age()); //Output: 120

        Cat cat = new Cat();
        System.out.println(cat.getSpecies()); //Output: Animal

        System.out.println(cat.age()); //Output: 130
    }
}