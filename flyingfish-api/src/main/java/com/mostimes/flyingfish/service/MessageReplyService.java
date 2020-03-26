package com.mostimes.flyingfish.service;

import com.mostimes.flyingfish.entity.WorksReply;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "PROVIDER-MESSAGE")
public interface MessageReplyService {
    @RequestMapping(value = "/getReplyByUserId/{userId}")
    List<WorksReply> getReplyByUserId(@PathVariable("userId") String userId);
}
