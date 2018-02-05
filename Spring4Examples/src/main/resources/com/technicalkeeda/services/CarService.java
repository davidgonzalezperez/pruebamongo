package com.technicalkeeda.services;
 
import java.util.List;
 
import com.technicalkeeda.bean.Car;
 
public interface CarService {
 
    public void create(Car car);
 
    public void update(Car car);
 
    public void delete(Car car);
 
    public void deleteAll();
 
    public Car find(Car car);
 
    public List < Car > findByBrand(String brand);
 
    public Car findByModel(String model);
 
    public List < Car > findAll();
}