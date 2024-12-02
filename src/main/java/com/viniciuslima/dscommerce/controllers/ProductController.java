package com.viniciuslima.dscommerce.controllers;

import com.viniciuslima.dscommerce.dto.ProductDTO;
import com.viniciuslima.dscommerce.entities.Product;
import com.viniciuslima.dscommerce.repositories.ProductRepository;
import com.viniciuslima.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        return productService.findById(id);
    }
}
