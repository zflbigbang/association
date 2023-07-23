package com.example.association.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.association.entity.Activity;
import com.example.association.service.ActivityService;
import com.example.association.mapper.ActivityMapper;
import org.springframework.stereotype.Service;

/**
* @author ZFL
* @description 针对表【activity】的数据库操作Service实现
* @createDate 2023-07-16 10:45:55
*/
@Service
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, Activity>
    implements ActivityService{

}




