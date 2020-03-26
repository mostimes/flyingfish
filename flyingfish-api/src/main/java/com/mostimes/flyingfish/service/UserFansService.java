package com.mostimes.flyingfish.service;

import com.mostimes.flyingfish.entity.UserFans;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "PROVIDER-USER")
public interface UserFansService {
    @RequestMapping(value = "/getFansById/{userId}", method = RequestMethod.GET)
    List<UserFans> getFansById(@PathVariable("userId") String userId);
}
