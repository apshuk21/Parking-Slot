package repository;

import exception.ParkingSlotNotFoundException;
import models.ParkingSlot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSlotRepository {
    private Map<Integer, ParkingSlot> parkingSlotMap;

    public ParkingSlotRepository() {
        this.parkingSlotMap = new HashMap<>();
    }

    public ParkingSlot getParkingSlotMap(int id) throws ParkingSlotNotFoundException {
       ParkingSlot parkingSlot  = this.parkingSlotMap.get(id);

        if (parkingSlot == null) {
            throw new ParkingSlotNotFoundException("ParkingSlot not found for Id: " + id);
        }
        return parkingSlot;
    }

    public ParkingSlot addParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlotMap.put(parkingSlot.getId(), parkingSlot);
        return parkingSlot;
    }
}
