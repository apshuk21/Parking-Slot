package models;

import models.constants.ParkingSlotStatus;
import models.constants.VehicleType;

public class ParkingSlot extends BaseModel {
    private int number;
    private VehicleType vehicleType;
    private ParkingSlotStatus parkingSlotStatus;
    private Vehicle vehicle;
}
