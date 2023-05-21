import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        service.addProducts(new Products("laptop", "Apple", "USA", 2));
        service.addProducts(new Products("Mouse", "Apple", "USA", 3));
        service.addProducts(new Products("CPU", "ASUS", "USA", 5));
        service.addProducts(new Products("Mobile", "REALME", "USA", 3));
        service.addProducts(new Products("Pen", "OX", "USA", 1));

        // List<Products> products = service.getAllProducts();
        // for (Products p : products)
        // System.out.println(p);

        Products p = service.getProduct("laptop");
        System.out.println(p);
    }

}
