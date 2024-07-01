package org.eclipse.jakarta.hello.service;

import org.eclipse.jakarta.hello.model.Product;

import java.util.List;

public interface ProductService {

    public void addProduct(Product product);

    public void deleteProduct(int id);

    public List<Product> getProducts();

    public void updateProduct(int id,Product product);

    public Product getproduct(String name);
}
