package org.eclipse.jakarta.hello.service;

import jakarta.ejb.Singleton;
import jakarta.inject.Inject;
import org.eclipse.jakarta.hello.model.Product;
import org.eclipse.jakarta.hello.repositry.ProductRepo;

import java.util.List;


@Singleton

public class ProductServiceImp implements ProductService{


    @Inject
    ProductRepo productRepo;

    @Override
    public void addProduct(Product product) {
        productRepo.addProduct(product);
    }

    @Override
    public void deleteProduct(int id) {
      productRepo.deleteProduct(id);
    }

    @Override
    public List<Product> getProducts() {
        return productRepo.getProducts();
    }

    @Override
    public void updateProduct(int id,Product product) {
         productRepo.updateProduct(id, product);
    }

    @Override
    public Product getproduct(String name) {
        return productRepo.getproduct(name);
    }
}
