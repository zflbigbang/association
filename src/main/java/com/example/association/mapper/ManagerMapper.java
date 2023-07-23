package com.example.association.mapper;

import com.example.association.entity.Manager;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ZFL
* @description 针对表【manager】的数据库操作Mapper
* @createDate 2023-07-16 10:47:11
* @Entity com.example.association.entity.Manager
*/
@Mapper
public interface ManagerMapper extends BaseMapper<Manager> {

}




