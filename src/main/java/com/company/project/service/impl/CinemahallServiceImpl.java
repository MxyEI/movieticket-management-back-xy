package com.company.project.service.impl;

import com.company.project.dao.CinemahallMapper;
import com.company.project.model.Cinemahall;
import com.company.project.service.CinemahallService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/05/02.
 */
@Service
@Transactional
public class CinemahallServiceImpl extends AbstractService<Cinemahall> implements CinemahallService {
    @Resource
    private CinemahallMapper cinemahallMapper;

    @Override
    public List<Cinemahall> selectHallByCinemaId(Integer cinemaId) {
        return cinemahallMapper.selectHallByCinemaId(cinemaId);
    }
}
