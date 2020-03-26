package com.mostimes.flyingfish.service;

import com.mostimes.flyingfish.entity.WorksDiscuss;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "PROVIDER-WORKS")
public interface WorksDiscussService {
    @RequestMapping(value = "discussWorks/{userId}/{worksId}/{discussUserId}/{discussNickname}/{discussIcon}/{content}/{fileUrl}")
    void discussWorks(@PathVariable("userId") String userId, @PathVariable("worksId") String worksId, @PathVariable("discussUserId") String discussUserId, @PathVariable("discussNickname") String discussNickname, @PathVariable("discussIcon") String discussIcon, @PathVariable("content") String content, @PathVariable("fileUrl") String fileUrl);

    @RequestMapping(value = "getDiscussById/{worksId}")
    List<WorksDiscuss> getDiscussById(@PathVariable("worksId") String worksId);
}
