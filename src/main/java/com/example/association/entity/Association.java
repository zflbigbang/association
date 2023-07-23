package com.example.association.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName association
 */
@TableName(value ="association")
@Data
public class Association implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer assno;

    /**
     * 
     */
    private String assname;

    /**
     * 
     */
    private String asssta;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}