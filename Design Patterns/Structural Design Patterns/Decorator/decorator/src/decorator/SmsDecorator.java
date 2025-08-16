package decorator;

//Concrete Decorators
public class SmsDecorator extends BaseDecorator {
 public SmsDecorator(Notifier notifier) {
     super(notifier);
 }

 @Override
 public void send(String message) {
     super.send(message);
     System.out.println("Sending SMS notification: " + message);
 }
}
