package main.java.models.person;

import main.java.models.parking.ParkingFloor;
import main.java.services.ISystemService;

public class SystemAdmin extends Admin{
    private ISystemService iSystemService;

    public SystemAdmin(String name, String email, String address, int age, ISystemService systemService) {
        super(name, email, address, age);
        this.iSystemService = systemService;
    }

    public void addParkingFloors(ParkingFloor parkingFloor){
        this.iSystemService.addParkingFloor(parkingFloor);
    }

    public void removeParkingFloor(int floorNumber){
        this.iSystemService.removeParkingFloor(floorNumber);
    }

    public void addEntranceGate(int floorNumber, int gateNumber){
        this.iSystemService.addEntranceGate(floorNumber, gateNumber);
    }

    public void addExitGate(int floorNumber, int gateNumber){
        this.iSystemService.addExitGate(floorNumber, gateNumber);
    }

    public void removeEntranceGate(int floorNumber, int gateNumber){
        this.iSystemService.removeEntranceGate(floorNumber, gateNumber);
    }

    public void removeExitGate(int floorNumber, int gateNumber){
        this.iSystemService.removeExitGate(floorNumber, gateNumber);
    }

    @Override
    public ParkingFloor getFloorInformation(int floorNumber) {
        return iSystemService.getParkingInformation(floorNumber);
    }
}