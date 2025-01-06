package com.example.client_service.controller;

import com.example.client_service.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    // Endpoint to fetch cars for a specific client
    @GetMapping("/{clientId}/cars")
    public ResponseEntity<List<Object>> getCarsForClient(@PathVariable int clientId) {
        return ResponseEntity.ok(clientService.getCarsForClient(clientId));
    }
}
