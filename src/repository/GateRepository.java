package repository;

import exception.GateNotFoundException;
import models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private Map<Integer, Gate> gateMap;

    public GateRepository() {
        this.gateMap = new HashMap<>();
    }

    public Gate getGate(int id) throws GateNotFoundException {
        Gate gate = this.gateMap.get(id);

        if (gate == null) {
            throw new GateNotFoundException("Gate not found for Id: " + id);
        }
        return gate;
    }

    public Gate addGate(Gate gate) {
        this.gateMap.put(gate.getId(), gate);
        return gate;
    }
}
