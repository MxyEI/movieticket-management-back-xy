package com.company.project.service.impl;

import com.company.project.dao.TicketMapper;
import com.company.project.model.Ticket;
import com.company.project.service.TicketService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/05/02.
 */
@Service
@Transactional
public class TicketServiceImpl extends AbstractService<Ticket> implements TicketService {
    @Resource
    private TicketMapper ticketMapper;

}
