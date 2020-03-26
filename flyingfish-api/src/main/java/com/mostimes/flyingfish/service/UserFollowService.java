package com.mostimes.flyingfish.service;

import com.mostimes.flyingfish.entity.UserFollow;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "PROVIDER-USER")
public interface UserFollowService {
    @RequestMapping(value = "/getFollowById/{userId}", method = RequestMethod.GET)
    List<UserFollow> getFollowById(@PathVariable("userId") String userId);

    @RequestMapping(value = "/followUser/{userId}/{followId}/{followNickname}/{followIcon}")
    String followUser(@PathVariable("userId") String userId, @PathVariable("followId") String followId, @PathVariable("followNickname") String followNickname, @PathVariable("followIcon") String followIcon);
}