package com.example.car.jinru;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @ClassName Car
 * @Desc
 * @Date 2023/11/26 17:45
 * @Version 1.0
 * 你我山巅自相逢
 **/
@TableName("car")
public class Car implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 车辆名称
     */
    private String name;
    /**
     * 车辆类型
     */
    private String type;
    /**
     * 车辆牌号
     */
    private String number;
    /**
     * 车辆状态  0:已租，1:可租
     */
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
