package com.restaurant.deliveryservice.dto;

import lombok.Data;

@Data
public class DeliveryRequest {

    private Long orderId;

    private String deliveryAddress;

}