package repository;

import exception.TicketNotFoundException;
import models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    private Map<Integer, Ticket> ticketMap;

    public TicketRepository() {
        this.ticketMap = new HashMap<>();
    }

    public Ticket getTicketMap(int id) throws TicketNotFoundException {
        Ticket ticket  = this.ticketMap.get(id);

        if (ticket == null) {
            throw new TicketNotFoundException("Ticket not found for Id: " + id);
        }
        return ticket;
    }

    public Ticket addTicket(Ticket ticket) {
        this.ticketMap.put(ticket.getId(), ticket);
        return ticket;
    }
}
