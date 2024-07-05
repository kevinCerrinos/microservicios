package com.kev.product_service.model;

import com.kev.product_service.dto.ProductRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

    /*public Product(ProductRequest productRequest) {
        this.name = productRequest.name();
        this.description = productRequest.description();
        this.price = productRequest.price();
    }*/
}
