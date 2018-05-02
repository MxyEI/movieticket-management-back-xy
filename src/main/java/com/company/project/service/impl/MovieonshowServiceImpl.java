package com.company.project.service.impl;

import com.company.project.dao.MovieonshowMapper;
import com.company.project.model.Movieonshow;
import com.company.project.service.MovieonshowService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/05/02.
 */
@Service
@Transactional
public class MovieonshowServiceImpl extends AbstractService<Movieonshow> implements MovieonshowService {
    @Resource
    private MovieonshowMapper movieonshowMapper;

}
