package com.example.association.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.association.entity.Association;
import com.example.association.entity.Manager;
import com.example.association.entity.R;
import com.example.association.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


/**
 * @author zfl
 * @create 2023-07-19 14:22
 */
@RestController
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    private ManagerService managerService;
    @PostMapping("/login")
    public R<Manager> login(@RequestBody Manager manager){
        String password = manager.getManpas();
        //从数据库中查找用户
        LambdaQueryWrapper<Manager> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Manager::getManname,manager.getManname());
        Manager man = managerService.getOne(queryWrapper);
        //如果没有找到
        if(man == null){
            return R.error("登录失败");
        }
        //找到后匹配密码
        if(!man.getManpas().equals(password)){
            return R.error("密码错误");
        }
        return  R.success(man);
    }
    @GetMapping("/list")
    public R<List<Manager>> list(){
        List<Manager> list = managerService.list();
        return R.success(list);
    }
    @PutMapping("/update")
    public R<String> updateManager(@RequestBody Manager manager){
        managerService.updateById(manager);
        return R.success("更新成功");
    }
}
