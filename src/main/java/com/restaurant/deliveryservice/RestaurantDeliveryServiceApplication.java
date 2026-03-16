package com.restaurant.deliveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestaurantDeliveryServiceApplication {

	public static void main(String[] args) {

        SpringApplication.run(RestaurantDeliveryServiceApplication.class, args);
        System.out.println("Jay Shree Ram - 10");
	}

}
