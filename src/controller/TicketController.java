package controller;

import dtos.IssueTicketRequestDTO;
import dtos.IssueTicketResponseDTO;
import dtos.ResponseStatus;
import models.Ticket;
import service.TicketService;

/**
 * Not recommended to use models directly within the controllers.
 * We use data transfer objects(DTO) for such tasks.
 */

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO) {
        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO();

        Ticket ticket = ticketService.issueTicket(requestDTO.getGateId(), requestDTO.getVehicleNumber());

        responseDTO.setTicketId(ticket.getId());
        responseDTO.setResponseStatus(ResponseStatus.SUCCESS);

        return responseDTO;
    }
}
