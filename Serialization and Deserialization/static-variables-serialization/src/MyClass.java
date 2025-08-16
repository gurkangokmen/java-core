import java.io.Serializable;

public class MyClass implements Serializable {
    public static String staticMessage = "Static Abagai";
    public String instanceMessage = "Instance Abagai";

    public MyClass() {
        this.staticMessage = this.staticMessage + " " + "is from Static Khuzait"; // Modify static value in constructor for demonstration
        this.instanceMessage = this.instanceMessage + " " + "is from Instance Khuzait"; // Modify instance value in constructor for demonstration
    }
}
