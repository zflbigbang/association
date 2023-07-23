package com.example.association.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.association.entity.Manager;
import com.example.association.entity.Person;
import com.example.association.entity.R;
import com.example.association.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zfl
 * @create 2023-07-22 13:27
 */
@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;
    @PostMapping("/login")
    public R<Person> login(@RequestBody Person person){
        String password = person.getPerpas();
        //从数据库中查找用户
        LambdaQueryWrapper<Person> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Person::getPername,person.getPername());
        Person man = personService.getOne(queryWrapper);
        //如果没有找到
        if(man == null){
            return R.error("登录失败");
        }
        //找到后匹配密码
        if(!man.getPerpas().equals(password)){
            return R.error("密码错误");
        }
        return  R.success(man);
    }
}
