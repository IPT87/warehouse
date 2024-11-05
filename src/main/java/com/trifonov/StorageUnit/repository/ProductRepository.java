package com.trifonov.StorageUnit.repository;

import com.trifonov.StorageUnit.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {
    @Query(value = "{'_id' : ?0}", delete = true)
    void deleteById(String id);
}
