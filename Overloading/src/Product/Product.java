package Product;

// this bu class demektir.

public class Product
{
    // Constructor oluşturulmadığında da çalışır.
    public Product(int id, String name, String description, double price, int stockAmount)
    {
        System.out.println("Constructor is run.");
        _id = id;
        _name = name;
        _description = description;
        _price = price;
        _stockAmount = stockAmount;
    }

    // Constructor Overloading
    public Product()
    {

    }





    // attribute (field)
    // Sadece tanımlandığı blokta (class) geçerlidir.
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _code;

    // getter
    // Ulaşılabilmesi için public yapılır.
    // read
    public int get_id()
    {
        return _id;
    }

    // setter
    // write
    public void set_id(int id)
    {
        _id = id;
    }

    public String get_name()
    {
        return _name;
    }

    public void set_name(String name)
    {
        _name = name;
    }

    public String get_description()
    {
        return _description;
    }

    public void set_description(String description)
    {
        _description = description;
    }

    public double get_price()
    {
        return _price;
    }

    public void set_price(double price)
    {
        _price = price;
    }

    public int get_stockAmount()
    {
        return _stockAmount;
    }

    public void set_stockAmount(int stockAmount)
    {
        _stockAmount = stockAmount;
    }

    public String get_code()
    {
        return _name.substring(0,1) + _id;
    }

    public void set_code(String code)
    {
        _code = code;
    }
}
