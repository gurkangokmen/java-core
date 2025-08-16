package Product;

public class ProductManager
{

    public void Add(Product product_variable)
    {
        //JDBC
        System.out.println("Ürün eklendi: " + product_variable.get_name());
    }


}