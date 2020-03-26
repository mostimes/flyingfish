package com.mostimes.flyingfish.service;

import com.mostimes.flyingfish.entity.WorksThumbsUp;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@FeignClient(value = "PROVIDER-MESSAGE")
public interface MessageThumbsUpService {
    @RequestMapping(value = "/getThumbsUpByUserId/{userId}")
    List<WorksThumbsUp> getThumbsUpByUserId(@PathVariable("userId") String userId);
}
