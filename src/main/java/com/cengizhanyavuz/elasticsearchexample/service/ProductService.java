package com.cengizhanyavuz.elasticsearchexample.service;

import com.cengizhanyavuz.elasticsearchexample.entity.Product;
import com.cengizhanyavuz.elasticsearchexample.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product insertProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product, int id) {
        Product prod = productRepository.findById(id).isPresent() ? productRepository.findById(id).get() : null;
        assert prod != null;
        prod.setPrice(product.getPrice());
        return productRepository.save(prod);
    }
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
