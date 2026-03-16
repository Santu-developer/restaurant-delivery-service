package com.restaurant.deliveryservice.service.impl;

import com.restaurant.deliveryservice.client.OrderClient;
import com.restaurant.deliveryservice.dto.DeliveryRequest;
import com.restaurant.deliveryservice.dto.DeliveryResponse;
import com.restaurant.deliveryservice.mapper.DeliveryMapper;
import com.restaurant.deliveryservice.model.Delivery;
import com.restaurant.deliveryservice.repository.DeliveryRepository;
import com.restaurant.deliveryservice.service.DeliveryService;
import com.restaurant.deliveryservice.util.DeliveryStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class DeliveryServiceImpl implements DeliveryService {

    private final DeliveryRepository repository;
    private final DeliveryMapper mapper;
    private final OrderClient orderClient;

    @Override
    public DeliveryResponse createDelivery(DeliveryRequest request) {

        orderClient.getOrder(request.getOrderId());

        Delivery delivery = mapper.toEntity(request);

        delivery.setStatus(DeliveryStatus.ASSIGNED);

        Delivery saved = repository.save(delivery);

        return mapper.toResponse(saved);
    }

    @Override
    public List<DeliveryResponse> getAllDeliveries() {

        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }
}