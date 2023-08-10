package DesignQuestions.CarRentalSystem;

import DesignQuestions.CarRentalSystem.Product.Vehicle;

import java.util.Date;

public class Reservation {
    int reservationId;

    User user;

    Vehicle vehicle;

    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;

    public int createReservation(User user, Vehicle vehicle){
        this.reservationId = reservationId;
        this.vehicle = vehicle;
        this.user = user;
        this.reservationType = ReservationType.DAILY;
        this.reservationStatus = ReservationStatus.SCHEDULED;

        return reservationId;
    }
}
