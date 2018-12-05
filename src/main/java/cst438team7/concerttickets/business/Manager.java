package cst438team7.concerttickets.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cst438team7.concerttickets.api.entities.ConcertTicket;
import cst438team7.concerttickets.data.ConcertTicketsDBClient;

@Service
public class Manager {
    @Autowired
    ConcertTicketsDBClient concertTicketsDBClient;

    public List<ConcertTicket> getConcertTicketList() {
        return null;
    }
}
