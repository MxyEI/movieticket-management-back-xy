package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Movieonshow;

import java.util.List;

public interface MovieonshowMapper extends Mapper<Movieonshow> {
    List<Movieonshow> selectsameonshow(Movieonshow movieonshow);
}