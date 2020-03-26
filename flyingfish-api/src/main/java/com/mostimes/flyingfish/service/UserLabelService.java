package com.mostimes.flyingfish.service;

import com.mostimes.flyingfish.entity.UserLabel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "PROVIDER-USER")
public interface UserLabelService {
    @RequestMapping(value = "/getLabelById/{userId}", method = RequestMethod.GET)
    List<UserLabel> getLabelById(@PathVariable("userId") String userId);
}
