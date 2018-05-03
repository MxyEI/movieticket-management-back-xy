package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Cinemahall;

import java.util.List;
import java.util.Map;

public interface CinemahallMapper extends Mapper<Cinemahall> {

    //根据影院id查询影厅
    public List<Cinemahall> selectHallByCinemaId(Integer cinemaId);
}