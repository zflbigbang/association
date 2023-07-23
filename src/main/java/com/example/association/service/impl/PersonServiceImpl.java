package com.example.association.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.association.entity.Person;
import com.example.association.service.PersonService;
import com.example.association.mapper.PersonMapper;
import org.springframework.stereotype.Service;

/**
* @author ZFL
* @description 针对表【person】的数据库操作Service实现
* @createDate 2023-07-16 10:47:16
*/
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person>
    implements PersonService{

}




