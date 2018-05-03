package com.company.project.service;
import com.company.project.model.Cinemahall;
import com.company.project.core.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/05/02.
 */
public interface CinemahallService extends Service<Cinemahall> {

     List<Cinemahall> selectHallByCinemaId(Integer cinemaId);
}
