package com.carcaretracker.scheduler;

import com.carcaretracker.entity.Car;
import com.carcaretracker.service.CarService;
import com.carcaretracker.service.EmailService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReminderScheduler {

    private final CarService carService;
    private final EmailService emailService;

    public ReminderScheduler(CarService carService, EmailService emailService) {
        this.carService = carService;
        this.emailService = emailService;
    }

     @Scheduled(cron = "0 * * * * *")
    public void checkExpiries() {
        List<Car> cars = carService.getCarsWithUpcomingExpiries();

        for (Car car : cars) {
            String to = car.getEmail();
            String subject = "CarCareTracker: Insurance Expiry Reminder";
            String body = "Hi,\n\nYour car (" + car.getCarNumber() + ") insurance expires on " +
                    car.getInsuranceExpiry() + ".\nPlease renew it to stay protected.\n\n- CarCareTracker";

            if (to != null && !to.isEmpty()) {
                emailService.sendReminder(to, subject, body);
                System.out.println("Sent reminder to: " + to);
            }
        }
    }
}
