package com.mostimes.flyingfish.service;

import com.mostimes.flyingfish.entity.UserConversation;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "PROVIDER-USER")
public interface UserConversationService {
    @RequestMapping(value = "/getConversationById/{userId}", method = RequestMethod.GET)
    List<UserConversation> getConversationById(@PathVariable("userId") String userId);

    @RequestMapping(value = "/followConversation/{userId}/{conversationId}/{conversationName}/{conversationPic}")
    String followConversation(@PathVariable("userId") String userId, @PathVariable("conversationId") String conversationId, @PathVariable("conversationName") String conversationName, @PathVariable("conversationPic") String conversationPic);

    @RequestMapping(value = "/deleteConversation/{userId}/{conversationId}")
    void deleteConversation(@PathVariable("userId") String userId, @PathVariable("conversationId") String conversationId);
}
