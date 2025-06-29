package com.carcaretracker.service;

import com.carcaretracker.entity.Car;
import com.carcaretracker.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CarService {
    private final CarRepository repo;

    public CarService(CarRepository repo) {
        this.repo = repo;
    }

    public Car save(Car car) {
        return repo.save(car);
    }

    public Car get(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<Car> getCarsWithUpcomingExpiries() {
        LocalDate today = LocalDate.now();
        LocalDate in7days = today.plusDays(7);
        return repo.findByInsuranceExpiryBetween(today, in7days);
    }

    public List<Car> findAll() {
        return repo.findAll();
    }
}
