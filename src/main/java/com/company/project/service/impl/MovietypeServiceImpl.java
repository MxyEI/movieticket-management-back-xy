package com.company.project.service.impl;

import com.company.project.dao.MovietypeMapper;
import com.company.project.model.Movietype;
import com.company.project.service.MovietypeService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/05/02.
 */
@Service
@Transactional
public class MovietypeServiceImpl extends AbstractService<Movietype> implements MovietypeService {
    @Resource
    private MovietypeMapper movietypeMapper;

}
