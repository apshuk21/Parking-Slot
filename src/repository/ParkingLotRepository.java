package repository;

import exception.ParkingLotNotFoundException;
import models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Integer, ParkingLot> parkingLotMap;

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
    }

    public ParkingLot getParkingLotMap(int id) throws ParkingLotNotFoundException {
        ParkingLot parkingLot  = this.parkingLotMap.get(id);

        if (parkingLot == null) {
            throw new ParkingLotNotFoundException("ParkingLot not found for Id: " + id);
        }
        return parkingLot;
    }

    public ParkingLot addParkingFloor(ParkingLot parkingLot) {
        this.parkingLotMap.put(parkingLot.getId(), parkingLot);
        return parkingLot;
    }
}
