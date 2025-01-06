package com.example.client_service.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class ClientService {

    private final WebClient webClient;

    public ClientService(WebClient.Builder webClientBuilder) {
        // Base URL for the Car Service
        this.webClient = webClientBuilder.baseUrl("http://CAR-SERVICE").build();
    }

    // Fetch cars for a specific client using WebClient
    public List<Object> getCarsForClient(int clientId) {
        return webClient.get()
                .uri("/cars/{clientId}", clientId)
                .retrieve()
                .bodyToFlux(Object.class)
                .collectList()
                .block(); // Blocking to return a synchronous response
    }
}
