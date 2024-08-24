package models;

import models.constants.ParkingLotStatus;
import service.strategy.billCalculationStrategy.BillCalculationStrategy;
import service.strategy.slotAllocationStrategy.SlotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseModel {
    private String name;
    private String address;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;
    private SlotAllocationStrategy slotAllocationStrategy;
    private BillCalculationStrategy billCalculationStrategy;
    private List<SupportedVehicleType> supportedVehicleTypes;
}
