package com.mostimes.flyingfish.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserFollow implements Serializable {
    private String id;                  //id
    private String userId;              //用户id
    private String followId;            //关注用固话id
    private String followNickname;      //关注用户昵称
    private String followIcon;          //关注用户头像地址
    private Date followTime;            //关注时间
}
