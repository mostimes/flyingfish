package com.mostimes.flyingfish.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private String id;                                    //用户id
    private String userName;                              //用户名
    private String password;                              //密码
    private String nickname;                              //昵称
    private String phone;                                 //手机号码
    private String email;                                 //邮箱
    private int status;                                   //帐号启用状态:0->禁用；1->启用
    private Date createTime;                              //注册时间
    private String icon;                                  //头像地址
    private int gender;                                   //性别：0->未知；1->男；2->女
    private Date birthday;                                //生日
    private String city;                                  //所做城市
    private String job;                                   //职业
    private String personalizedSignature;                 //个性签名
    private int sourceType;                               //用户来源:0->账号密码注册； 1->手机注册； 2->邮箱注册
    private int integration;                              //积分
    private int divineJudgement;                          //是否为神评见鉴定师:0->否；1->是
    private int followCount;                              //关注用户数量
    private int fansCount;                                //粉丝数量
    private int collectionCount;                          //作品收藏数量
    private int allThumbsUpCount;                         //获赞数
    private String accessToken;                           //令牌
}
