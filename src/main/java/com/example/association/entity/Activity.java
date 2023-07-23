package com.example.association.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName activity
 */
@TableName(value ="activity")
@Data
public class Activity implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer actno;



    /**
     * 
     */
    private Integer assno;

    /**
     * 
     */
    private String actname;

    /**
     * 
     */
    private LocalDateTime actdata;

    /**
     * 
     */
    private String actsta;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}