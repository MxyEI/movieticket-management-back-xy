package com.company.project.service.impl;

import com.company.project.dao.MoviestyleMapper;
import com.company.project.model.Moviestyle;
import com.company.project.service.MoviestyleService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/05/02.
 */
@Service
@Transactional
public class MoviestyleServiceImpl extends AbstractService<Moviestyle> implements MoviestyleService {
    @Resource
    private MoviestyleMapper moviestyleMapper;

}
