package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.RMovieMoviestyle;
import com.company.project.service.RMovieMoviestyleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
@RequestMapping("/manageback/r/movie/moviestyle")
public class RMovieMoviestyleController {
    @Resource
    private RMovieMoviestyleService rMovieMoviestyleService;

    @PostMapping("/add")
    public Result add(RMovieMoviestyle rMovieMoviestyle) {
        rMovieMoviestyleService.save(rMovieMoviestyle);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        rMovieMoviestyleService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(RMovieMoviestyle rMovieMoviestyle) {
        rMovieMoviestyleService.update(rMovieMoviestyle);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RMovieMoviestyle rMovieMoviestyle = rMovieMoviestyleService.findById(id);
        return ResultGenerator.genSuccessResult(rMovieMoviestyle);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RMovieMoviestyle> list = rMovieMoviestyleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
