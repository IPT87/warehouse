package com.trifonov.StorageUnit.service;

import com.trifonov.StorageUnit.model.Product;
import com.trifonov.StorageUnit.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> listAllProducts() {
        return repository.findAll();
    }

    public void save(Product product) {
        this.repository.save(product);
    }

    public void deleteProduct(int id) {
        this.repository.deleteById(id);
    }
}
