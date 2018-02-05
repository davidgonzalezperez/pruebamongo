package com.technicalkeeda.services;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.technicalkeeda.bean.Car;
import com.technicalkeeda.repositories.CarRepository;
 
@Service("carService")
public class CarServiceImpl implements CarService {
 
    @Autowired
    CarRepository carRepo;
 
    @Override
    public void create(Car car) {
        Car c = carRepo.insert(car);
        System.out.println("Created:- " + c);
    }
 
    @Override
    public void update(Car car) {
        Car c = carRepo.save(car);
        System.out.println("Updated:- " + c);
 
    }
 
    @Override
    public void delete(Car car) {
        carRepo.delete(car);
        System.out.println("Deleted:- " + car.getId());
    }
 
    @Override
    public List < Car > findAll() {
        return carRepo.findAll();
    }
 
    @Override
    public List < Car > findByBrand(String brand) {
        return carRepo.findByBrand(brand);
    }
 
    @Override
    public Car findByModel(String model) {
        return carRepo.findByModel(model);
    }
 
    @Override
    public Car find(Car car) {
        return carRepo.findOne(car.getId());
    }
 
    @Override
    public void deleteAll() {
        carRepo.deleteAll();
    }
}