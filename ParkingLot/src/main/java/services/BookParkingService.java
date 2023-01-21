package main.java.services;

import main.java.models.ticket.Ticket;
import main.java.models.vehicle.Vehicle;

public class BookParkingService implements IBookParkingService{

    ParkingService parkingService;

    public BookParkingService(ParkingService parkingService){
        this.parkingService = parkingService;
    }

    @Override
    public Ticket bookParking(int parkingEntryGateNumber, Vehicle vehicle) {
        return parkingService.bookParking(parkingEntryGateNumber, vehicle);
    }
}
