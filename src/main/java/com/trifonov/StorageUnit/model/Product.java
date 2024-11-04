package com.trifonov.StorageUnit.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Document(collection = "Item")
public class Product {

    @Id
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String description;
    private boolean promotion;

}
