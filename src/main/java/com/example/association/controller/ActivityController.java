package com.example.association.controller;

import com.example.association.entity.Activity;
import com.example.association.entity.R;
import com.example.association.service.ActivityService;
import com.example.association.service.impl.ActivityServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zfl
 * @create 2023-07-16 10:15
 */
@Slf4j
@RestController
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @GetMapping("/list")
    public R<List<Activity>> list(){
        List<Activity> list = activityService.list();

        return R.success(list);
    }
    @PostMapping
    public R<String> save(@RequestBody Activity activity){
        activityService.save(activity);
        return R.success("添加成功");
    }
}
