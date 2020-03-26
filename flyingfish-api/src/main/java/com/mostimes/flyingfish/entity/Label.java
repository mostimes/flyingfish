package com.mostimes.flyingfish.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Label implements Serializable {
    private String id;
    private String labelName;
    private Date createTime;
}
