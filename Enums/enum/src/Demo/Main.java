package Demo;

public class Main {
    public static void main(String[] args) {
        OrderStatus s = OrderStatus.PAID;
        System.out.println(s.getLabel()); // "Paid"
        System.out.println(s);
    }
}
