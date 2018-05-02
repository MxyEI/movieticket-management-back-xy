package com.company.project.service.impl;

import com.company.project.dao.MoviestatusMapper;
import com.company.project.model.Moviestatus;
import com.company.project.service.MoviestatusService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/05/02.
 */
@Service
@Transactional
public class MoviestatusServiceImpl extends AbstractService<Moviestatus> implements MoviestatusService {
    @Resource
    private MoviestatusMapper moviestatusMapper;

}
