package com.ch.test.application.service;

import com.ch.test.controller.co.add.PostGroupCreateCmd;
import com.ch.test.domain.service.PostGroupDomainService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public interface IPostGroupAppService {
    void createPostGroup(PostGroupCreateCmd cmd);

}
