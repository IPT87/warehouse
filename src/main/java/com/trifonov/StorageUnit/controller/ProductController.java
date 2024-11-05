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

    @GetMapping("/addProduct")
    public String addProduct() {
        return "addProduct";
    }

    @PostMapping("/addProduct")
    public String saveProduct(Product product) {
        service.save(product);

        return "addProduct";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteProduct(@PathVariable String id) {
        service.deleteProduct(id);

        return "redirect:/products";
    }
}
