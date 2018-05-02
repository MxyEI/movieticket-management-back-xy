package com.company.project.service.impl;

import com.company.project.dao.CinemaMapper;
import com.company.project.model.Cinema;
import com.company.project.service.CinemaService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/05/02.
 */
@Service
@Transactional
public class CinemaServiceImpl extends AbstractService<Cinema> implements CinemaService {
    @Resource
    private CinemaMapper cinemaMapper;

}
