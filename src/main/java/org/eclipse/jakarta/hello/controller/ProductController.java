package org.eclipse.jakarta.hello.controller;

import jakarta.ejb.Singleton;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.jakarta.hello.model.Product;
import org.eclipse.jakarta.hello.service.ProductService;

import java.util.List;

@Path("products")
@Singleton
public class ProductController {

    @Inject
    ProductService productService;

    @GET
    @Path("getall")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> findAll(){
        return productService.getProducts();
    }

    @POST
    @Path("addproduct")
    public void addProduct(@Valid Product product){
        productService.addProduct(product);
    }
    @GET

    @Path("getproduct")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getProductbyname(@QueryParam("name") String name){
        return productService.getproduct(name);
    }
    @DELETE
    @Path("deleteproduct")
    public void deleteproduct(@QueryParam("id") int id){
        productService.deleteProduct(id);
    }
    @PUT
    @Path("updateproduct/{id}")
    public void updateproduct(@PathParam("id") int id, @Valid Product product){
        productService.updateProduct(id,product);
    }
}
