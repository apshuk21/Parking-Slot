package repository;

import exception.ParkingFloorNotFoundException;
import models.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {
    private Map<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloorRepository() {
        this.parkingFloorMap = new HashMap<>();
    }

    public ParkingFloor getparkingFloorMap(int id) throws ParkingFloorNotFoundException {
        ParkingFloor parkingFloor  = this.parkingFloorMap.get(id);

        if (parkingFloor == null) {
            throw new ParkingFloorNotFoundException("ParkingFloor not found for Id: " + id);
        }
        return parkingFloor;
    }

    public ParkingFloor addparkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        return parkingFloor;
    }
}
