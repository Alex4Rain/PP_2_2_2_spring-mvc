package web.models;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String brand;
    private String model;
    private int registrationPlate;

    public Car() {
    }

    public Car(String brand, String model, int registrationPlate) {
        this.brand = brand;
        this.model = model;
        this.registrationPlate = registrationPlate;
    }
    @Override
    public String toString() {
        return "Car " + brand + " " + model + " with registration number " + registrationPlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(int registrationPlate) {
        this.registrationPlate = registrationPlate;
    }
}
