package models;

public class ParkingSlot extends BaseModel {
    private int number;
    private VehicleType vehicleType;
    private ParkingSlotStatus parkingSlotStatus;
    private Vehicle vehicle;
    private ParkingFloor parkingFloor;
}
