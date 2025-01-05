package com.example.car_service.controller;

import com.example.car_service.entity.Car;
import com.example.car_service.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    // Obtenir les voitures d'un client
    @GetMapping("/{clientId}")
    public ResponseEntity<List<Car>> getCarsByClientId(@PathVariable int clientId) {
        List<Car> cars = carService.getCarsByClientId(clientId);
        return ResponseEntity.ok(cars);
    }

    @GetMapping
    public ResponseEntity<List<Car>> getAllCars() {
        List<Car> cars = carService.getAllCars();
        return ResponseEntity.ok(cars);
    }

    // Ajouter une nouvelle voiture
    @PostMapping
    public ResponseEntity<Car> saveCar(@RequestBody Car car) {
        return ResponseEntity.ok(carService.saveCar(car));
    }
}
