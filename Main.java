import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        // Adding all Products
        service.addProducts(new Products("laptop", "Apple", "USA", 2));
        service.addProducts(new Products("Mouse", "Apple", "USA", 3));
        service.addProducts(new Products("CPU", "ASUS", "USA", 5));
        service.addProducts(new Products("Mobile", "REALME", "USA", 3));
        service.addProducts(new Products("Pen", "OX", "USA", 1));

        // Printing all products 1 by 1 in a new line
        List<Products> products = service.getAllProducts();
        for (Products p : products)
            System.out.println(p);

        // Searching by names
        Products p = service.getProduct("laptop");
        System.out.println(p);

        // For like search Suggestion
        List<Products> prod = service.getProductswithText("Laptop");
        for (Products p1 : prod)
            System.out.println(p1);
    }

}
