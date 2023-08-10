package DesignQuestions.CarRentalSystem;

import DesignQuestions.CarRentalSystem.Product.Vehicle;
import DesignQuestions.CarRentalSystem.Product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;

    VehicleInventoryManagement vehicleInventoryManagement;

    Location location;

    List<Reservation> reservations = new ArrayList<>();

    public Reservation createReservation(User user, Vehicle vehicle){
        Reservation reservation = new Reservation();
        reservation.createReservation(user, vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationId){
        return true;
    }

    public void setVehicles(List<Vehicle> vehicles){
        this.vehicleInventoryManagement = new VehicleInventoryManagement(vehicles);
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType){
        return vehicleInventoryManagement.getVehicleList();
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public VehicleInventoryManagement getVehicleInventoryManagement() {
        return vehicleInventoryManagement;
    }

    public void setVehicleInventoryManagement(VehicleInventoryManagement vehicleInventoryManagement) {
        this.vehicleInventoryManagement = vehicleInventoryManagement;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }


}
