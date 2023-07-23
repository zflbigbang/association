package com.example.association.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.association.entity.Manager;
import com.example.association.service.ManagerService;
import com.example.association.mapper.ManagerMapper;
import org.springframework.stereotype.Service;

/**
* @author ZFL
* @description 针对表【manager】的数据库操作Service实现
* @createDate 2023-07-16 10:47:11
*/
@Service
public class ManagerServiceImpl extends ServiceImpl<ManagerMapper, Manager>
    implements ManagerService{

}




