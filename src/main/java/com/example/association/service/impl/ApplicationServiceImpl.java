package com.example.association.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.association.entity.Application;
import com.example.association.service.ApplicationService;
import com.example.association.mapper.ApplicationMapper;
import org.springframework.stereotype.Service;

/**
* @author ZFL
* @description 针对表【application】的数据库操作Service实现
* @createDate 2023-07-16 10:43:07
*/
@Service
public class ApplicationServiceImpl extends ServiceImpl<ApplicationMapper, Application>
    implements ApplicationService{

}




