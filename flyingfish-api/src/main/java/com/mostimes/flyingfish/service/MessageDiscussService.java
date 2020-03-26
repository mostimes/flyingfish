package com.mostimes.flyingfish.service;

import com.mostimes.flyingfish.entity.WorksDiscuss;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "PROVIDER-MESSAGE")
public interface MessageDiscussService {
    @RequestMapping(value = "/getDiscussByUserId/{userId}")
    List<WorksDiscuss> getDiscussByUserId(@PathVariable("userId") String userId);
}

