package main.java.models.person;

import main.java.models.vehicle.Vehicle;


public class VehicleOwner extends Person{
    private Vehicle vehicle;

    public VehicleOwner(String name,String email,String address,int age){
        super(name,email,address,age);
    }

    public Vehicle getVehicle() {
        return vehicle;
    };

    public void setVehicle(Vehicle V){
        vehicle = V;
    }
}
