import java.io.Serializable;

public class MyClass implements Serializable {
    private transient String transientMessage;
    private String message;

   public MyClass(String transientMessage ,String message) {
        this.transientMessage = transientMessage;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getTransientMessage() {
        return transientMessage;
    }
}
