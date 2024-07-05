package com.kev.order_service.dto;

import java.util.List;

public record OrderRequest(
        List<OrderLineItemsRequest> orderLineItemsRequests
) {
}
