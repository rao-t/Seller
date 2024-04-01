package com.example.demo.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Enum.ProductStatus;
import com.example.demo.Models.Product;
import com.example.demo.Repository.ProductRepository;

//import jakarta.websocket.server.ServerEndpoint;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }
    
    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product getProductById(UUID id){
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name){
        return repository.findByName(name);
    }

    
    public String deleteProduct(UUID id){
        repository.deleteById(id);
        return "product removed || "+id;
    }

    public void updateProductStatus(ProductStatus status) {
        // Your service logic here
        System.out.println("Updating product status to: " + status);
    }

    public Product updateProduct(Product product){
        Product existingProduct=repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
       
        return repository.save(existingProduct);
    }


}
