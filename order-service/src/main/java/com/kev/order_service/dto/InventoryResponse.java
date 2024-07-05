package com.kev.inventory_service.dto;


import lombok.Builder;

@Builder
public record InventoryResponse(
        String skuCode,
        boolean isInStock
) {
}
