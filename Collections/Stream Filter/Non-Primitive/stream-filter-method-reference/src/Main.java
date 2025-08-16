import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer asha = new Customer("Asha", 100);
        Customer ira = new Customer("Ira", 200);
        Customer bolat = new Customer("Bolat", 300);
        Customer mesui = new Customer("Mesui", 400);

        List<Customer> customers = Arrays.asList(asha, ira, bolat, mesui);

        List<Customer> customersWithMoreThan100Points = customers
                .stream()
                .filter(Customer::hasOverHundredPoints)
                .toList();

        for (Customer customer : customersWithMoreThan100Points) {
            System.out.println(customer.getName());
        }
    }



}