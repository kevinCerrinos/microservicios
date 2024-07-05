package com.kev.order_service.model;

import com.kev.order_service.dto.OrderLineItemsRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "order_line_items")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class OrderLineItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;

    public OrderLineItems(OrderLineItemsRequest orderLineItemsRequest) {
        this.skuCode = orderLineItemsRequest.skuCode();
        this.price = orderLineItemsRequest.price();
        this.quantity = orderLineItemsRequest.quantity();
    }
}
