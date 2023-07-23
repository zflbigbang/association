package com.example.association.controller;

import com.example.association.entity.Association;
import com.example.association.entity.R;
import com.example.association.service.AssociationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zfl
 * @create 2023-07-20 18:02
 */
@RestController
@RequestMapping("/association")
public class AsssociationController {
    @Autowired
    private AssociationService associationService;
    @GetMapping("list")
    public R<List<Association>> list(){
        List<Association> list = associationService.list();
        return R.success(list);
    }

}
