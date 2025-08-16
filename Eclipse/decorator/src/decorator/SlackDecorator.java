package decorator;

//Concrete Decorators
public class SlackDecorator extends BaseDecorator {
    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending Slack notification: " + message);
    }
}
