package com.example.client_service.service;

import com.example.client_service.feign.CarFeignClient;
import com.example.client_service.dto.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private CarFeignClient carFeignClient;

    public List<Car> getCarsForClient(int clientId) {
        // Directly return the list of Car objects
        return carFeignClient.getCarsByClientId(clientId);
    }
}
