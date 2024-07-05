package com.kev.order_service.dto;

import java.math.BigDecimal;

public record OrderLineItemsRequest(
        String skuCode,
        BigDecimal price,
        Integer quantity
) {

}
