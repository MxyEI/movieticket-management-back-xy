package com.company.project.service.impl;

import com.company.project.DTO.MovieOnShowDTO;
import com.company.project.core.AbstractService;
import com.company.project.dao.MovieonshowAstMapper;
import com.company.project.dao.MovieonshowMapper;
import com.company.project.model.Movieonshow;
import com.company.project.service.MovieonshowAstService;
import com.company.project.service.MovieonshowService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/05/02.
 */
@Service
@Transactional
public class MovieonshowAstServiceImpl implements MovieonshowAstService {
    @Resource
    private MovieonshowAstMapper movieonshowAstMapper;

    @Override
    public List<MovieOnShowDTO> selectonshow() {
        return movieonshowAstMapper.selectonshow();
    }


}
