package com.cengizhanyavuz.elasticsearchexample.controller;

import com.cengizhanyavuz.elasticsearchexample.entity.Product;
import com.cengizhanyavuz.elasticsearchexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("findAll")
    public Iterable<Product> findAll() {
        return productService.getProducts();
    }

    @GetMapping("insert")
    public Product insert(Product product) {
        return productService.insertProduct(product);
    }

    @GetMapping("update")
    public Product update(Product product, int id) {
        return productService.updateProduct(product, id);
    }

    @GetMapping("delete")
    public void delete(int id) {
        productService.deleteProduct(id);
    }

}
