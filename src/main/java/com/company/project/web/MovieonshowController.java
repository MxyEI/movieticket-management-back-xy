package com.company.project.web;
import com.company.project.DTO.MovieOnShowDTO;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Movieonshow;
import com.company.project.service.MovieonshowAstService;
import com.company.project.service.MovieonshowService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/05/02.
*/
@RestController
@RequestMapping("/manageback/movieonshow")
public class MovieonshowController {
    @Resource
    private MovieonshowService movieonshowService;

    @Autowired
    private MovieonshowAstService movieonshowAstService;

    @PostMapping("/add")
    public Result add(Movieonshow movieonshow) {
        movieonshowService.save(movieonshow);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        movieonshowService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Movieonshow movieonshow) {
        movieonshowService.update(movieonshow);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Movieonshow movieonshow = movieonshowService.findById(id);
        return ResultGenerator.genSuccessResult(movieonshow);
    }

    //查询同一影院同一影厅在同一时间是否存在档期冲突
    @PostMapping("/selectsameonshow")
    public Result resultdetail(Movieonshow movieonshow) {
        List<Movieonshow> mos = movieonshowService.selectsameonshow(movieonshow);
        return ResultGenerator.genSuccessResult(mos);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<MovieOnShowDTO> list = movieonshowAstService.selectonshow();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
