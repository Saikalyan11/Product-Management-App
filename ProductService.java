import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Products> products = new ArrayList<>();

    public void addProducts(Products p) {
        products.add(p);
    }

    public List<Products> getAllProducts() {
        return products;
    }

    public Products getProduct(String name) {
        for (Products p : products)
            if (p.getName().equals(name))
                return p;
        return null;
    }
}
