import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Bmw");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("Volkswagen");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Chevrolet");
        cars.add("Jeep");
        cars.add("Dodge");
        cars.add("Ram");
        cars.add("Gmc");

        cars.stream().filter(car -> car.startsWith("A")).forEach(System.out::println);
    }
}