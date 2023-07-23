package com.example.association.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName person
 */
@TableName(value ="person")
@Data
public class Person implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer perno;

    /**
     * 
     */

    /**
     * 
     */
    private String pername;

    /**
     * 
     */
    private String perpas;

    /**
     * 
     */
    private String peradr;

    /**
     * 
     */
    private String perpho;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}