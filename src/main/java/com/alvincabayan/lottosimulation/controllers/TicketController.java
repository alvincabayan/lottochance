package com.alvincabayan.lottosimulation.controllers;

import com.alvincabayan.lottosimulation.models.Ticket;
import com.alvincabayan.lottosimulation.services.TicketService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TicketController {
    private static Logger logger = LogManager.getLogger(TicketController.class);
    @Autowired
    TicketService ticketService;
    @GetMapping("ticket")
    public @ResponseBody ResponseEntity<String> getTicket() {
        logger.info("getTicket()");
        Ticket ticket = ticketService.getTicket();
        logger.info("ticket {}", ticket);
        return new ResponseEntity<>("You got your ticket : " + ticket, HttpStatus.OK);
    }

}
