package models;

import java.time.LocalDate;
import java.util.List;

public class Bill extends BaseModel {
    private LocalDate exitTime;
    private int billAmount;
    private Ticket ticket;
    private Gate exitGate;
    private Operator operator;
    private List<Payment> payments;

    public LocalDate getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDate exitTime) {
        this.exitTime = exitTime;
    }

    public int getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }
}
