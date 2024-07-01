package org.eclipse.jakarta.hello.repositry;

import jakarta.ejb.Singleton;
import org.eclipse.jakarta.hello.exeception.ProductException;
import org.eclipse.jakarta.hello.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


@Singleton
public class ProductRepoImp implements ProductRepo{

    List<Product> products=new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void deleteProduct(int id) {
        Product theproduct=products.stream().filter(product -> product.getId()==id).findFirst().orElseThrow(()->new ProductException("no product is found"));


    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void updateProduct(int id,Product product) {
        products.stream().filter(theproduct->theproduct.getId()==id).findFirst().orElseThrow(()->new ProductException("no product with this id"));

        products.set(id-1,product);

    }

    @Override
    public Product getproduct(String name) {

        Predicate<Product> productPredicate=product -> product.getName().equals(name);
       return products.stream().filter(productPredicate).findFirst().orElseThrow(()->new ProductException("no product found"));

    }
}
