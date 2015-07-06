package com.explitech.fiata.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.explitech.fiata.dao.TicketMapper;
import com.explitech.fiata.model.Ticket;
import com.explitech.fiata.model.TicketExample;
import com.explitech.fiata.service.TicketService;

public class TicketServiceImpl implements TicketService{

	@Autowired
	private TicketMapper TicketDao;
	
	public int add(Ticket record) {
		// TODO Auto-generated method stub
		return TicketDao.insertSelective(record);
	}

	public int update(Ticket record) {
		// TODO Auto-generated method stub
		return TicketDao.updateByPrimaryKeySelective(record);
	}

	public int delete(int TicketId) {
		// TODO Auto-generated method stub
		return TicketDao.deleteByPrimaryKey(TicketId);
	}

	public Ticket find(int TicketId) {
		// TODO Auto-generated method stub
		return TicketDao.selectByPrimaryKey(TicketId);
	}

	public int count(TicketExample example) {
		// TODO Auto-generated method stub
		return TicketDao.countByExample(example);
	}

	public List<Ticket> list(TicketExample example) {
		// TODO Auto-generated method stub
		return TicketDao.selectByExample(example);
	}

}
