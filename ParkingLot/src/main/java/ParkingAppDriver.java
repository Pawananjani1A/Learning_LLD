import main.java.models.gate.ParkingEntryGate;
import main.java.models.gate.ParkingExitGate;
import main.java.models.parking.ParkingFloor;
import main.java.models.parking.ParkingSpace;
import main.java.models.parking.ParkingSpot;
import main.java.models.person.*;
import main.java.models.ticket.Ticket;
import main.java.models.vehicle.TwoWheelerVehicle;
import main.java.models.vehicle.Vehicle;
import main.java.models.vehicle.VehicleCategoryWithCost;
import main.java.services.*;

import java.util.ArrayList;
import java.util.List;

public class ParkingAppDriver {

    public static void main(String[] args) {

        ParkingSpace parkingSpace = ParkingSpace.getInstance();

        SystemService systemService = new SystemService(parkingSpace);

        TicketService ticketService = new TicketService();
        ParkingService parkingService = new ParkingService(parkingSpace, ticketService);

        SystemAdmin parkingSystemAdministrator =
                new SystemAdmin("Abc", "abc@gmail.com", "abc/12", 18, systemService);

        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(new ParkingSpot(1, VehicleCategoryWithCost.TWOWHEELER, true));
        parkingSpots.add(new ParkingSpot(2, VehicleCategoryWithCost.TWOWHEELER, true));
        parkingSpots.add(new ParkingSpot(4, VehicleCategoryWithCost.FOURWHEELER, true));

        List<ParkingEntryGate> parkingEntryGates = new ArrayList<>();
        parkingEntryGates.add(new ParkingEntryGate(1, 1, true, false));

        List<ParkingExitGate> parkingExitGates = new ArrayList<>();
        parkingExitGates.add(new ParkingExitGate(1, 2, false, false));

        ParkingFloor parkingFloor = new ParkingFloor(1, new ArrayList<>(), parkingSpots, parkingEntryGates, parkingExitGates);
        parkingSystemAdministrator.addParkingFloors(parkingFloor);

        ParkingEntryStaff parkingEntryStaff =
                new ParkingEntryStaff("mohan", "mohan@gmail.com", "mohan/12", 18, new BookParkingService(parkingService));

        ParkingExitStaff parkingExitStaff =
                new ParkingExitStaff("ramu", "ramu@gmail.com", "ramu/12", 18, new FreeParkingService(parkingService));

        Vehicle omVehicle =
                new TwoWheelerVehicle(
                        new VehicleOwner("Om", "om@gmail.com", "om/12", 18),
                        "Dl12 CR");

        Vehicle ramVehicle =
                new TwoWheelerVehicle(
                        new VehicleOwner("ram", "ram@gmail.com", "ram/12", 18),
                        "Dl14 CR");

        Ticket omTicket = parkingEntryStaff.getBookParkingService().bookParking(1, omVehicle);
        Ticket ramTicket = parkingEntryStaff.getBookParkingService().bookParking(1, ramVehicle);

        System.out.println(ticketService.getTicketsCollection());

        double omCost = parkingExitStaff.getFreeParkingService().freeParking(omTicket);
        System.out.println("Price for om parking is "+omCost);

        System.out.println(ticketService.getTicketsCollection());
    }

}