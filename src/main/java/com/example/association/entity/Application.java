package com.example.association.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName application
 */
@TableName(value ="application")
@Data
public class Application implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer appno;

    /**
     * 
     */
    private Integer actno;

    /**
     * 
     */
    private Integer perno;

    /**
     * 
     */
    private LocalDateTime appdata;

    /**
     * 
     */
    private Integer appsta;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}