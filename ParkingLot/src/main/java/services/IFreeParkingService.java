package main.java.services;

import main.java.models.ticket.Ticket;

public interface IFreeParkingService{
    // returns cost
    public double freeParking(Ticket ticket);
}
