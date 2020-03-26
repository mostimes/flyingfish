package com.mostimes.flyingfish.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserLabel implements Serializable {
    private String id;                     //id
    private String userId;                 //用户id
    private String labelId;                //标签id
    private String labelName;              //标签名称
    private Date labelTime;               //打标时间
}
