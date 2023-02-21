package com.ch.test.application.service;

import com.ch.test.controller.co.add.PostGroupCreateCmd;
import com.ch.test.controller.co.delete.PostGroupDeleteCmd;
import com.ch.test.domain.event.PostGroupCreatedEvent;
import org.springframework.stereotype.Component;

@Component
public interface IPostGroupAppService {
    void createPostGroup(PostGroupCreateCmd cmd);
    void deletePostGroup(PostGroupDeleteCmd cmd);
}
