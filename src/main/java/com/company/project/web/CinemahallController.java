package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Cinemahall;
import com.company.project.service.CinemahallService;
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
@RequestMapping("/manageback/cinemahall")
public class CinemahallController {
    @Resource
    private CinemahallService cinemahallService;

    @PostMapping("/add")
    public Result add(Cinemahall cinemahall) {
        cinemahallService.save(cinemahall);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        cinemahallService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Cinemahall cinemahall) {
        cinemahallService.update(cinemahall);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Cinemahall cinemahall = cinemahallService.findById(id);
        return ResultGenerator.genSuccessResult(cinemahall);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Cinemahall> list = cinemahallService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/findHallBycId")
    public Result findHallByCinemaId(@RequestParam Integer cinemaId,@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size){
        PageHelper.startPage(page, size);
        List<Cinemahall> list = cinemahallService.selectHallByCinemaId(cinemaId);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
