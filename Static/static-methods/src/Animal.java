public class Animal {
    public static int age;

    // We can write static methods in non-static things. (Compare Class-Method)
    public static void printAge() {
        System.out.println(age);
    }

    // We can write static variables in non-static methods. (Compare Method-Variables)
    public void printAge2() {
        System.out.println(age);
    }

    public  String color;

    // We can not write non-static variables in static methods. (Compare Method-Variables)

    // Assume;
    // We have multiple objects of Animal class.
    // Animal a1 = new Animal();
    // Animal a2 = new Animal();
    // Animal a3 = new Animal();
    // color is a non-static variable.
    // If we change the color of a1, it will not affect the color of a2 and a3.
    // If we change the color of a2, it will not affect the color of a1 and a3.
    // If we change the color of a3, it will not affect the color of a1 and a2.
    // but static method must be same for all objects. (💫Contradiction !!!!! 💫)
    public static void printColor() {
        System.out.println(color);
    }
}
