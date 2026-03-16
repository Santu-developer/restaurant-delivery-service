package com.restaurant.deliveryservice.controller;

import com.restaurant.deliveryservice.dto.DeliveryRequest;
import com.restaurant.deliveryservice.dto.DeliveryResponse;
import com.restaurant.deliveryservice.service.DeliveryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deliveries")
@RequiredArgsConstructor
public class DeliveryController {

    private final DeliveryService deliveryService;

    @PostMapping
    public DeliveryResponse createDelivery(@RequestBody DeliveryRequest request) {

        return deliveryService.createDelivery(request);
    }

    @GetMapping
    public List<DeliveryResponse> getDeliveries() {

        return deliveryService.getAllDeliveries();
    }
}