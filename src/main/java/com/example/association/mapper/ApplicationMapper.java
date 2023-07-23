package com.example.association.mapper;

import com.example.association.entity.Application;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ZFL
* @description 针对表【application】的数据库操作Mapper
* @createDate 2023-07-16 10:43:07
* @Entity com.example.association.entity.Application
*/
@Mapper
public interface ApplicationMapper extends BaseMapper<Application> {

}




