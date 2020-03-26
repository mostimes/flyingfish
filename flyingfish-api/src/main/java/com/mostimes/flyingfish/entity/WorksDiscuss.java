package com.mostimes.flyingfish.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class WorksDiscuss implements Serializable {
    private String id;                                //id
    private String userId;                            //用户id
    private String worksId;                           //作品id
    private String discussUserId;                     //评论用户id
    private String discussNickname;                   //评论用户昵称
    private String discussIcon;                       //评论用户头像
    private String type;                              //评论类型
    private String content;                           //评论文字内容
    private String fileUrl;                           //媒体文件地址
    private Date time;                                //评论时间
}
