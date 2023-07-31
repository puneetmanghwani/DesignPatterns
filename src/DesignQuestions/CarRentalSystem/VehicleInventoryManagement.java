package DesignQuestions.CarRentalSystem;

import DesignQuestions.CarRentalSystem.Product.Vehicle;

import java.util.List;

public class VehicleInventoryManagement {

    List<Vehicle> vehicleList;

    public VehicleInventoryManagement(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }


}
