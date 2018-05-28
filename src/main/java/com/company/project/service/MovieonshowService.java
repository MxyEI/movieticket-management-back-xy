package com.company.project.service;
import com.company.project.DTO.MovieOnShowDTO;
import com.company.project.model.Movieonshow;
import com.company.project.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/05/02.
 */
public interface MovieonshowService extends Service<Movieonshow> {
   List<Movieonshow> selectsameonshow(Movieonshow movieonshow);
}
