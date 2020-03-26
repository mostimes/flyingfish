package com.mostimes.flyingfish.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserConversation implements Serializable {
    private String id;                     //id
    private String userId;                 //用户id
    private String conversationId;         //话题id
    private String conversationName;       //话题名称
    private String conversationPic;        //话题图片
    private Date followTime;             //关注时间
}
