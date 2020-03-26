package com.mostimes.flyingfish.service;

import com.mostimes.flyingfish.entity.WorksReply;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "PROVIDER-WORKS")
public interface WorksReplyService {
    @RequestMapping(value = "replyWorks/{userId}/{worksId}/{discussId}/{replyUserId}/{replyNickname}/{relpyIcon}/{content}/{fileUrl}")
    void replyWorks(@PathVariable("userId") String userId, @PathVariable("worksId") String worksId, @PathVariable("discussId") String discussId, @PathVariable("replyUserId") String replyUserId, @PathVariable("replyNickname") String replyNickname, @PathVariable("relpyIcon") String relpyIcon, @PathVariable("content") String content, @PathVariable("fileUrl") String fileUrl);

    @RequestMapping(value = "getReplyById/{discussId}")
    List<WorksReply> getReplyById(@PathVariable("discussId") String discussId);
}
