package com.company.project.dao;

import com.company.project.DTO.MovieOnShowDTO;
import com.company.project.core.Mapper;

import java.util.List;

public interface MovieonshowAstMapper  {
    public List<MovieOnShowDTO> selectonshow();
}