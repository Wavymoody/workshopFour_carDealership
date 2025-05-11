package com.ps;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public ArrayList<Vehicle> vehiclesByPrice(double min, double max){
        return null;

        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            double vehiclePrice = vehicle.getPrice();

            if (vehiclePrice >= min && vehiclePrice <= max) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public ArrayList<Vehicle> vehiclesByMakeModel(String make, String model){
        return null;


        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();
    }

    public ArrayList<Vehicle> vehiclesByYear(int min, int max){
        return null;


    }

    public ArrayList<Vehicle> vehiclesByColor(String color){
        return null;
    }

    public ArrayList<Vehicle> getAllVehicles(){
        return inventory;
    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }


// TODO
// get VehiclesByMileage(min, max) : List<Vehicle>
    public List<Vehicle> getVehiclesByMileage(int min, int max) {
    List<Vehicle> results = new ArrayList<>();
    for (Vehicle v : inventory) {
        if (v.getOdometer() >= min && v.getOdometer() <= max) {
            results.add(v);
        }
    }
    return results;
}

//  get VehiclesByType(vehicleType) : List<Vehicle>
public List<Vehicle> getVehiclesByType(String vehicleType) {
    List<Vehicle> results = new ArrayList<>();
    for (Vehicle v : inventory) {
        if (v.getVehicleType().equalsIgnoreCase(vehicleType)) {
            results.add(v);
        }
    }
    return results;
}

//  remove Vehicle(vehicle)
public void removeVehicle(String vin) {
    inventory.removeIf(vehicle -> vehicle.getVin());
}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}