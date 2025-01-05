package com.example.client_service.controller;

import com.example.client_service.dto.Car;
import com.example.client_service.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/{clientId}/cars")
    public ResponseEntity<List<Car>> getCarsForClient(@PathVariable int clientId) {
        return ResponseEntity.ok(clientService.getCarsForClient(clientId));
    }
}
