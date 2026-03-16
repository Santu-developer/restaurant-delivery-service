package com.restaurant.deliveryservice.client;

import com.restaurant.deliveryservice.dto.OrderResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "restaurant-order-service")
public interface OrderClient {

    @GetMapping("/orders/{id}")
    OrderResponse getOrder(@PathVariable Long id);

}