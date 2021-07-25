package br.com.fabriciosaand.productcatalog.controller;

import br.com.fabriciosaand.productcatalog.model.Product;
import br.com.fabriciosaand.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping
    public Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping(value = "/{id}")
    public Product findById(@PathVariable String id){
        Optional<Product> productOptional = productRepository.findById(id);
        return productOptional.orElse(null);
    }
}
