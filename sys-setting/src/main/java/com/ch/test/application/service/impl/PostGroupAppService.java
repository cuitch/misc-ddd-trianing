package com.ch.test.application.service.impl;

import com.ch.test.application.service.IPostGroupAppService;
import com.ch.test.controller.co.add.PostGroupCreateCmd;
import com.ch.test.domain.service.PostGroupDomainService;

import javax.annotation.Resource;

public class PostGroupAppService implements IPostGroupAppService {
    @Resource
    private PostGroupDomainService domainService;

    @Override
    public void createPostGroup(PostGroupCreateCmd cmd){
        domainService.createPostGroup(cmd);
    }
}
