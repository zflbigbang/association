package com.example.association.controller;


import com.example.association.entity.Activity;
import com.example.association.entity.Application;

import com.example.association.entity.R;
import com.example.association.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zfl
 * @create 2023-07-22 10:41
 */
@RestController
@RequestMapping("/application")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;
    @GetMapping("/list")
    public R<List<Application>> list(){
        List<Application> list = applicationService.list();
        return R.success(list);
    }
    @PutMapping("/update")
    public R<String> updateManager(@RequestBody Application application){
        applicationService.updateById(application);
        return R.success("更新成功");
    }
    @PostMapping("/save")
    public R<String> save(@RequestBody Application application){
        application.setAppno(applicationService.list().size()+1);
        applicationService.save(application);
        return R.success("添加成功");
    }
}
