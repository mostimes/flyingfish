package com.mostimes.flyingfish.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Works implements Serializable {
    private String id;                            //作品id
    private String userId;                        //用户id
    private String nickname;                      //用户昵称
    private String userIcon;                      //用户头像
    private int discussCount;                     //评论数
    private int thubmsUpCount;                    //点赞数
    private String type;                          //作品类型  0->视频 1->图片
    private String fileUrl;                       //媒体文件地址
    private String title;                         //文字内容
    private String conversationId;                //话题id
    private String conversationName;              //话题名称
    private Date time;                            //发布时间
}
