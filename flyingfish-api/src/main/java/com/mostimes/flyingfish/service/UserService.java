package com.mostimes.flyingfish.service;

import com.mostimes.flyingfish.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "PROVIDER-USER")
public interface UserService {

    @RequestMapping(value = "/getUserById/{userId}", method = RequestMethod.GET)
    User getUserById(@PathVariable("userId") String userId);

    @RequestMapping(value = "/loginByUserName/{userName}/{password}", method = RequestMethod.GET)
    User loginByUserName(@PathVariable("userName") String userName, @PathVariable("password") String password);

    @RequestMapping(value = "/getLoginCode/{phone}/{ip}", method = RequestMethod.GET)
    void getLoginCode(@PathVariable("phone") String phone, @PathVariable("ip") String ip);

    @RequestMapping(value = "/loginByPhone/{phone}/{code}", method = RequestMethod.GET)
    User loginByPhone(@PathVariable("phone") String phone, @PathVariable("code") String code);

    @RequestMapping(value = "/getRegisterCode/{phone}/{ip}", method = RequestMethod.GET)
    void getRegisterCode(@PathVariable("phone") String phone, @PathVariable("ip") String ip);

    @RequestMapping(value = "/registerByPhone/{phone}/{code}", method = RequestMethod.GET)
    User registerByPhone(@PathVariable("phone") String phone, @PathVariable("code") String code);
}