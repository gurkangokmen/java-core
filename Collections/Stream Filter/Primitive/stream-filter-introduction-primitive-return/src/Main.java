import java.util.ArrayList;
import java.util.List;

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

        Main main = new Main();
        System.out.println(main.getCarsStartingWithA(cars));
    }

    public List<String> getCarsStartingWithA(ArrayList<String> cars) {
        return cars.stream().filter(car -> car.startsWith("A")).toList();
    }
}