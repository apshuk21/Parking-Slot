package models;

import models.constants.TicketStatus;

import java.time.LocalDateTime;

public class Ticket extends BaseModel {
    private LocalDateTime entryTime;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
    private Gate entryGate;
    private TicketStatus ticketStatus;
    /**
     * Gate will contain the current operator at the gate, which might change with time.
     * So, we don't trust the Gate object to find the operator details, as it changes with time.
     * This operator will contain the operator details, which was present when the ticket was issued
     */
    private Operator operator;

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
