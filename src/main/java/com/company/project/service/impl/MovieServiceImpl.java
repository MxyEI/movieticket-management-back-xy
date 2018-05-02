package com.company.project.service.impl;

import com.company.project.dao.MovieMapper;
import com.company.project.model.Movie;
import com.company.project.service.MovieService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/05/02.
 */
@Service
@Transactional
public class MovieServiceImpl extends AbstractService<Movie> implements MovieService {
    @Resource
    private MovieMapper movieMapper;

}
