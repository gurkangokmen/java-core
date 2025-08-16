package facade;

//Client Code
public class Main {
	public static void main(String[] args) {
        PhoneOperator operator = new PhoneOperator();
        
        // Placing an order through the facade
        operator.placeOrder("Burger Combo", 12.99);
    }
}
