package com.mostimes.flyingfish.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserFans implements Serializable {
    private String id;                //id
    private String userId;            //用户id
    private String fansId;            //粉丝id
    private String fansNickname;      //粉丝昵称
    private String fansIcon;          //粉丝头像地址
    private Date fansTime;            //关注时间
}
