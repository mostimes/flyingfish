package com.mostimes.flyingfish.service;

import com.mostimes.flyingfish.entity.Works;
import com.mostimes.flyingfish.entity.WorksSearch;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@FeignClient(value = "PROVIDER-WORKS")
public interface WorksService {
    @RequestMapping(value = "/upLoadWorks/{userId}/{nickname}/{userIcon}/{type}/{fileUrl}/{title}/{conversationId}/{conversationName}")
    String upLoadWorks(@PathVariable("userId") String userId, @PathVariable("nickname") String nickname, @PathVariable("userIcon") String userIcon, @PathVariable("type") String type, @PathVariable("fileUrl") String fileUrl, @PathVariable("title") String title, @PathVariable("conversationId") String conversationId, @PathVariable("conversationName") String conversationName);

    @RequestMapping(value = "searchWorks/{key}/{type}")
    List<Works> searchWorks(@PathVariable("key") String key, @PathVariable("type") String type);
}
