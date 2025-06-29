package com.carcaretracker.repository;

import com.carcaretracker.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByInsuranceExpiryBetween(LocalDate start, LocalDate end);
    List<Car> findByPollutionExpiryBetween(LocalDate start, LocalDate end);
    List<Car> findByServiceDueBetween(LocalDate start, LocalDate end);
}
