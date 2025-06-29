package com.carcaretracker.controller;

import com.carcaretracker.entity.Car;
import com.carcaretracker.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    private final CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @PostMapping
    public Car addCar(@RequestBody Car car) {
        return service.save(car);
    }

    @GetMapping("/{id}")
    public Car getCar(@PathVariable Long id) {
        System.out.println("Request came");
        return service.get(id);
    }

    @GetMapping("/all")
    public List<Car> getAllCars() {
        return service.findAll();
    }

}
