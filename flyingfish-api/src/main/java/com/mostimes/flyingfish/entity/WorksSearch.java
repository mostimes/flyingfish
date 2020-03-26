package com.mostimes.flyingfish.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class WorksSearch implements Serializable {
    private String id;                            //作品id
    private String title;                         //文字内容
    private String conversationName;              //话题名称
}
