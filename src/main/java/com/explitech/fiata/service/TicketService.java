package com.explitech.fiata.service;

import java.util.List;

import com.explitech.fiata.model.Ticket;
import com.explitech.fiata.model.TicketExample;

public interface TicketService {

	int add(Ticket record);
	int update(Ticket record);
	int delete(int TicketId);
	
	Ticket find(int TicketId);
	
	int count(TicketExample example);
	List<Ticket> list(TicketExample example);
	
}
