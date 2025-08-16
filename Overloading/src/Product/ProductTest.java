package Product;

public class ProductTest
{
    public static void main(String[] args)
    {
        Product productObject = new Product(1, "Laptop", "Asus Laptop", 5000, 3 );

        ProductManager productManagerObject = new ProductManager();
        productManagerObject.Add(productObject);
        System.out.println(productObject.get_code());
    }
}