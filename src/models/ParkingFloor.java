package models;

import models.constants.ParkingFloorStatus;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private int floorNumber;
    private List<ParkingSlot> parkingSlots;
    private ParkingFloorStatus parkingFloorStatus;
    private List<SupportedVehicleType> supportedVehicleTypes;
}
