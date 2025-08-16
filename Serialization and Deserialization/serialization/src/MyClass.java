import java.io.Serializable;

public class MyClass implements Serializable {
    private String message;

    public MyClass(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
