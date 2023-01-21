package main.java.models.person;


import main.java.models.gate.ParkingExitGate;
import main.java.services.IFreeParkingService;

public class ParkingExitStaff extends Staff {
    private ParkingExitGate parkingExitGate;
    private IFreeParkingService freeParkingService;

    public ParkingExitStaff(String name, String email, String address, int age, IFreeParkingService freeParkingService) {
        super(name, email, address, age);
        this.freeParkingService = freeParkingService;
    }

    public ParkingExitGate getParkingExitGate() {
        return parkingExitGate;
    }

    public void setParkingExitGate(ParkingExitGate parkingExitGate) {
        this.parkingExitGate = parkingExitGate;
    }

    public IFreeParkingService getFreeParkingService() {
        return freeParkingService;
    }

    public void setFreeParkingService(IFreeParkingService freeParkingService) {
        this.freeParkingService = freeParkingService;
    }
}
