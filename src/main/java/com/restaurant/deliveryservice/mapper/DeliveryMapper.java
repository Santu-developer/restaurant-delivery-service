package com.restaurant.deliveryservice.mapper;

import com.restaurant.deliveryservice.dto.DeliveryRequest;
import com.restaurant.deliveryservice.dto.DeliveryResponse;
import com.restaurant.deliveryservice.model.Delivery;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DeliveryMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "status", ignore = true)
    Delivery toEntity(DeliveryRequest request);

    DeliveryResponse toResponse(Delivery delivery);

}