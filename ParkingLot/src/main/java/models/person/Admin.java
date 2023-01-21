package main.java.models.person;

import main.java.models.parking.ParkingFloor;
public abstract class Admin extends Staff{

    Admin(String name,String email,String address,int age){
        super(name,email,address,age);
    }

    public abstract ParkingFloor getFloorInformation(int floorNumber);
}
