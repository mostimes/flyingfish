package com.mostimes.flyingfish.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class WorksReply implements Serializable {
    private String id;                                //id
    private String userId;                            //用户id
    private String worksId;                           //作品id
    private String discussId;                         //评论id
    private String replyUserId;                       //回复用户id
    private String replyNickname;                     //回复用户昵称
    private String replyIcon;                         //回复用户头像
    private String type;                              //回复内容类型
    private String content;                           //回复文字内容
    private String fileUrl;                           //媒体文件地址
    private Date time;                                //回复时间
}
