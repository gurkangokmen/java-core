package Demo;

public enum OrderStatus {
    NEW("New"),
    PAID("Paid"),
    SHIPPED("Shipped"),
    CANCELLED("Cancelled");

    private final String label;



    // Enum constructors are implicitly private
    OrderStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
