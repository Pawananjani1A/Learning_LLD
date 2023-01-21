package main.java.services;

import main.java.models.gate.ParkingEntryGate;
import main.java.models.ticket.Ticket;
import main.java.models.vehicle.Vehicle;

public interface IBookParkingService {
    // return ticket
    Ticket bookParking(int parkingGateNumber, Vehicle vehicle);
}