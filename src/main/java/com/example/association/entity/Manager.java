package com.example.association.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName manager
 */
@TableName(value ="manager")
@Data
public class Manager implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer manno;

    /**
     * 
     */
    private Integer assno;

    /**
     * 
     */
    private String manname;

    /**
     * 
     */
    private String manpas;

    /**
     * 
     */
    private String manpho;

    /**
     * 
     */
    private String mansup;


}