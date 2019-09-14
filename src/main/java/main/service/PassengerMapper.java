package main.service;

import main.model.CreatePassengerRequest;
import main.model.Passenger;

public class PassengerMapper {


    public static Passenger map(CreatePassengerRequest passengerRequest) {

        Passenger passenger = new Passenger();
        passenger.setPassengerName(passengerRequest.getPassengerName());
        passenger.setPassword(passengerRequest.getPassword());
        passenger.setFirstName(passengerRequest.getFirstName());
        passenger.setLastName(passengerRequest.getLastName());

        return passenger;
    }
}
