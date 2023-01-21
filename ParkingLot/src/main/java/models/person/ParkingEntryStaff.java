package main.java.models.person;


import main.java.models.gate.ParkingEntryGate;
import main.java.services.IBookParkingService;

public class ParkingEntryStaff extends  Staff{
    private ParkingEntryGate parkingEntryGate;
    private IBookParkingService bookParkingService;


    public ParkingEntryStaff(String name, String email, String address, int age, IBookParkingService bookParkingService) {
        super(name, email, address, age);
        this.bookParkingService = bookParkingService;
    }

    public ParkingEntryGate getParkingEntryGate() {
        return parkingEntryGate;
    }

    public void setParkingEntryGate(ParkingEntryGate parkingEntryGate) {
        this.parkingEntryGate = parkingEntryGate;
    }

    public IBookParkingService getBookParkingService() {
        return bookParkingService;
    }

    public void setBookParkingService(IBookParkingService bookParkingService) {
        this.bookParkingService = bookParkingService;
    }
}
