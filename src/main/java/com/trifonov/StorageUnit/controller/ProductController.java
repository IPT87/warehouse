package com.trifonov.StorageUnit.controller;

import com.trifonov.StorageUnit.model.Product;
import com.trifonov.StorageUnit.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products")
    public String listProducts(Model model) {
        model.addAttribute("products", service.listAllProducts());
        return "productList";
    }

    @PostMapping("/addProduct")
    public String saveProduct(@RequestBody Product product) {
        service.save(product);

        return "Added Successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        service.deleteProduct(id);

        return "Deleted Successfully";
    }
}
