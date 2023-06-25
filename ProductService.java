
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

    public List<Products> getProductswithText(String text) {
        String str = text.toLowerCase();
        List<Products> result = new ArrayList<>();
        for (Products p : products) {
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if (name.contains(str) || type.contains(str) || place.contains(str))
                result.add(p);
        }
        return result;
    }

}
