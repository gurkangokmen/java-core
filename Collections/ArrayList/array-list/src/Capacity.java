import java.lang.reflect.Field;
import java.util.ArrayList;

public class Capacity {
    public static void main (String[] args) throws NoSuchFieldException, IllegalAccessException {
        // Create an ArrayList object
        ArrayList<String> cars = new ArrayList<String>();
          cars.add("Volvo");
          cars.add("BMW");
          cars.add("Ford");
          cars.add("Mazda");
          cars.add("Audi");
          cars.add("Mercedes");
          cars.add("Toyota");
          cars.add("Nissan");
          cars.add("Honda");
          cars.add("Hyundai");
          cars.add("Kia");
        cars.add("Chevrolet");

        // Print ArrayList Capacity
        // Using reflection to get the capacity
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(cars);
        int capacity = elementData.length;

        System.out.println("Current capacity of the ArrayList: " + capacity);

    }
}
