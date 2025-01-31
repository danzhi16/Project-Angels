package repositories;

import models.Product;
import repositories.interfaces.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final List<Product> products = new ArrayList<>();

    @Override
    public boolean createProduct(Product product) {
        return products.add(product);
    }

    @Override
    public Product getProductById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }

    @Override
    public boolean deleteProduct(int id) {
        return products.removeIf(product -> product.getId() == id);
    }
}
