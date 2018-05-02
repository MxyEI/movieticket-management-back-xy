package com.company.project.service.impl;

import com.company.project.dao.SeatMapper;
import com.company.project.model.Seat;
import com.company.project.service.SeatService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/05/02.
 */
@Service
@Transactional
public class SeatServiceImpl extends AbstractService<Seat> implements SeatService {
    @Resource
    private SeatMapper seatMapper;

}
