package com.restaurant.deliveryservice.service;

import com.restaurant.deliveryservice.dto.DeliveryRequest;
import com.restaurant.deliveryservice.dto.DeliveryResponse;

import java.util.List;

public interface DeliveryService {

    DeliveryResponse createDelivery(DeliveryRequest request);

    List<DeliveryResponse> getAllDeliveries();

}