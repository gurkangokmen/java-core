package decorator;

//Base Notifier Implementation
public class BaseNotifier implements Notifier {
 
 @Override
 public void send(String message) {
     System.out.println("Sending default notification: " + message);
 }
 
}
