package com.example.association.mapper;

import com.example.association.entity.Person;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ZFL
* @description 针对表【person】的数据库操作Mapper
* @createDate 2023-07-16 10:47:16
* @Entity com.example.association.entity.Person
*/
@Mapper
public interface PersonMapper extends BaseMapper<Person> {

}




