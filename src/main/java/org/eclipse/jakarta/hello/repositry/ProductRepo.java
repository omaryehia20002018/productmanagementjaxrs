package org.eclipse.jakarta.hello.repositry;

import org.eclipse.jakarta.hello.model.Product;

import java.util.List;

public interface ProductRepo {
    public void addProduct(Product product);

    public void deleteProduct(int id);

    public List<Product> getProducts();

    public void updateProduct(int id,Product product);

    public Product getproduct(String name);
}
