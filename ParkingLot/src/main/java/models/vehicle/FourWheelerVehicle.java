package main.java.models.vehicle;

import main.java.models.person.VehicleOwner;
public class FourWheelerVehicle extends Vehicle{

    public FourWheelerVehicle(VehicleOwner vehicleOwner, String vehicleNumber) {
        super(vehicleOwner, vehicleNumber, VehicleCategoryWithCost.FOURWHEELER);
    }
}


