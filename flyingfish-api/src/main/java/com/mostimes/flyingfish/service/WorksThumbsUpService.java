package com.mostimes.flyingfish.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "PROVIDER-WORKS")
public interface WorksThumbsUpService {
    @RequestMapping(value = "thumbsUpWorks/{userId}/{worksId}/{thumbsUpUserId}/{thumbsUpNickname}/{thumbsUpIcon}/{content}/{fileUrl}")
    void thumbsUpWorks(@PathVariable("userId") String userId, @PathVariable("worksId") String worksId, @PathVariable("thumbsUpUserId") String thumbsUpUserId, @PathVariable("thumbsUpNickname") String thumbsUpNickname, @PathVariable("thumbsUpIcon") String thumbsUpIcon, @PathVariable("content") String content, @PathVariable("fileUrl") String fileUrl);
}
