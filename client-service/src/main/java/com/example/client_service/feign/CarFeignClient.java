package com.example.client_service.feign;

import com.example.client_service.dto.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "car-service")
public interface CarFeignClient {
    @GetMapping("/cars/{clientId}")
    List<Car> getCarsByClientId(@PathVariable int clientId);
}
