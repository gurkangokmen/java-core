package facade;

//Facade: Phone Operator
public class PhoneOperator {
 private Kitchen kitchen;
 private PaymentGateway paymentGateway;
 private DeliveryService deliveryService;
 
 public PhoneOperator() {
     kitchen = new Kitchen();
     paymentGateway = new PaymentGateway();
     deliveryService = new DeliveryService();
 }
 
 public void placeOrder(String meal, double amount) {
     System.out.println("Welcome to our restaurant!");
     
     kitchen.prepareMeal(meal);
     paymentGateway.processPayment(amount);
     deliveryService.deliverOrder(meal);
     
     System.out.println("Thank you for your order!");
 }
}
