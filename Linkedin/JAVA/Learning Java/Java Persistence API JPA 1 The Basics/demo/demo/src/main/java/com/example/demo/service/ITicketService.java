package com.example.demo.service;

import com.example.demo.entity.Ticket;

import java.util.List;

public interface ITicketService {
    List<Ticket> getAllTickets();

    Ticket getTicketById(int ticketId);

    void addTicket(Ticket ticket);

    void updateTicket(Ticket ticket);

    void deleteTicket(int ticketId);

    void closeTicket(int ticketId);
}
