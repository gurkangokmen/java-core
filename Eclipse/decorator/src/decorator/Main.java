package decorator;

//Creating Decorated Notifiers
public class Main {
 public static void main(String[] args) {
     Notifier basicNotifier = new BaseNotifier();

     Notifier smsNotifier = new SmsDecorator(basicNotifier);
     Notifier facebookNotifier = new FacebookDecorator(smsNotifier);
     Notifier slackNotifier = new SlackDecorator(facebookNotifier);

     String message = "Hello, this is an important notification!";

     System.out.println("Sending notifications:");
     slackNotifier.send(message);
 }
}
