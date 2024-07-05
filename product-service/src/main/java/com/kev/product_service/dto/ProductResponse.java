package com.kev.product_service.dto;

import com.kev.product_service.model.Product;
import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record ProductResponse(
        String id,
        String name,
        String description,
        BigDecimal price
) {
    public ProductResponse(Product product) {
        this(product.getId(), product.getName(), product.getDescription(), product.getPrice());
    }
}
