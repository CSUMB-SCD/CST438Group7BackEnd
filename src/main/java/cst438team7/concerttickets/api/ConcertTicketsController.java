package cst438team7.concerttickets.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import cst438team7.concerttickets.api.entities.ConcertTicket;

import cst438team7.concerttickets.business.Manager;

@RestController
public class ConcertTicketsController {

    @Autowired
    Manager manager;

    @GetMapping ("/ConcertTickets")
    @ResponseBody
    List<ConcertTicket> getConcertTickets() {
        return null;
    }
}