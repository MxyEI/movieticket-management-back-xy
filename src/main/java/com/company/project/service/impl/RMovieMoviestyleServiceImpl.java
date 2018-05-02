package com.company.project.service.impl;

import com.company.project.dao.RMovieMoviestyleMapper;
import com.company.project.model.RMovieMoviestyle;
import com.company.project.service.RMovieMoviestyleService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/05/02.
 */
@Service
@Transactional
public class RMovieMoviestyleServiceImpl extends AbstractService<RMovieMoviestyle> implements RMovieMoviestyleService {
    @Resource
    private RMovieMoviestyleMapper rMovieMoviestyleMapper;

}
