import java.io.Serializable;

public class Address implements Serializable {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}
