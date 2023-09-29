package com.alvincabayan.lottosimulation.services;

import com.alvincabayan.lottosimulation.models.Ticket;
import org.springframework.beans.factory.annotation.Autowired;

public class SimulationService {
    @Autowired TicketService ticketService;
    public Ticket getWinningTicket() {
        return ticketService.getTicket();
    }

    public void simulateWithMultipleTickets(Integer numberOfTickets) {

    }
}
