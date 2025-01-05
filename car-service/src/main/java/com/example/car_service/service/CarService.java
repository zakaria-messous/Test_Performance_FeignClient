package com.example.car_service.service;

import com.example.car_service.entity.Car;
import com.example.car_service.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getCarsByClientId(int clientId) {
        return carRepository.findByClientId(clientId);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }
}
