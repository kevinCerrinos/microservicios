package com.kev.order_service.service;

import com.kev.order_service.dto.OrderLineItemsRequest;
import com.kev.order_service.dto.OrderRequest;
import com.kev.order_service.model.Order;
import com.kev.order_service.model.OrderLineItems;
import com.kev.order_service.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class OrderService {

    private final OrderRepository orderRepository;

    public void  placeOrder(OrderRequest orderRequest){
        var order = Order.builder()
                .orderNumber(UUID.randomUUID().toString())
                .orderLineItems(
                        orderRequest.orderLineItemsRequests()
                                .stream()
                                .map(OrderLineItems::new)
                                .collect(Collectors.toList())
                        )
                .build();
        orderRepository.save(order);
    }

}
