public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();

        a1.age = 10;
        System.out.println(a1.age);           // 10
        System.out.println(a2.age);           // 10
        System.out.println(Animal.age);   // 10

        a2.age = 20;
        System.out.println(a1.age);          // 20
        System.out.println(a2.age);          // 20
        System.out.println(Animal.age);  // 20

        Animal.age = 30;
        System.out.println(a1.age);          // 30
        System.out.println(a2.age);          // 30
        System.out.println(Animal.age);   // 30
    }
}