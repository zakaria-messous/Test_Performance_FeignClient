package com.example.client_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Arrays;

@Service
public class ClientService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String CAR_SERVICE_URL = "http://CAR-SERVICE/cars/";

    // Fetch cars for a specific client using RestTemplate
    public List<Object> getCarsForClient(int clientId) {
        Object[] cars = restTemplate.getForObject(CAR_SERVICE_URL + clientId, Object[].class);
        return Arrays.asList(cars);
    }
}
