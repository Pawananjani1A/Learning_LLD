package main.java.models.vehicle;

import main.java.models.person.VehicleOwner;
public class TwoWheelerVehicle extends Vehicle{
    public TwoWheelerVehicle(VehicleOwner vehicleOwner, String vehicleNumber) {
        super(vehicleOwner, vehicleNumber, VehicleCategoryWithCost.TWOWHEELER);
    }

}
