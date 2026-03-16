package com.restaurant.deliveryservice.dto;

import lombok.Data;

@Data
public class DeliveryResponse {

    private Long id;

    private Long orderId;

    private String deliveryAddress;

    private String status;

}