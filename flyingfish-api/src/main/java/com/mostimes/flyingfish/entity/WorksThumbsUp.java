package com.mostimes.flyingfish.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class WorksThumbsUp implements Serializable {
    private String id;                               //id
    private String userId;                           //用户id
    private String worksId;                          //作品id
    private String thumbsUpUserId;                   //点赞用户id
    private String thumbsUpNickname;                 //点赞用户昵称
    private String thumbsUpIcon;                     //点赞用户头像
    private String type;                             //点赞类型
    private String content;                          //点赞文字内容
    private String fileUrl;                          //媒体文件地址
    private Date time;                               //点赞时间
}
