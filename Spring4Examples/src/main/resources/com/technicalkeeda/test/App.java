package com.technicalkeeda.test;
 
import java.util.List;
 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
 
import com.technicalkeeda.bean.Car;
import com.technicalkeeda.configuration.ApplicationConfig;
import com.technicalkeeda.services.CarService;
 
public class App {
 
    public static void main(String args[]) {
 
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        CarService carService = (CarService) context.getBean("carService");
        // Delete All cars
        carService.deleteAll();
 
        Car polo = new Car("Volkswagen", "Polo");
        carService.create(polo);
 
        Car jetta = new Car("Volkswagen", "Jetta");
        carService.create(jetta);
 
        Car swift = new Car("Maruti Suzuki", "Swift");
        carService.create(swift);
 
        Car ertiga = new Car("Maruti Suzuki", "Ertiga");
        carService.create(ertiga);
 
        Car i10 = new Car("Hyundai", "i10");
        carService.create(i10);
 
        Car i20 = new Car("Hyundai", "i20");
        carService.create(i20);
 
        System.out.println("\nFind One:- " + carService.find(swift));
 
        System.out.println("\nFind All!!");
 
        List < Car > cars = carService.findAll();
        for (Car car: cars) {
            System.out.println(car);
        }
        System.out.println();
        carService.delete(swift);
 
        System.out.println();
        i10.setModel("i10 Nxt");
        carService.update(i10);
 
        System.out.println("\nFind By Brand = 'Volkswagen'");
        cars = carService.findByBrand("Volkswagen");
        for (Car car: cars) {
            System.out.println(car);
        }
 
        System.out.println("\nFind By Model = 'Ertiga'");
        System.out.println(carService.findByModel("Ertiga"));
 
        System.out.println("\nFind All!!");
 
        cars = carService.findAll();
        for (Car car: cars) {
            System.out.println(car);
        }
 
        context.close();
    }
 
}