package com.ch.test.domain.service.impl;

import com.ch.test.controller.co.add.PostGroupCreateCmd;
import com.ch.test.domain.entity.PostGroupEntity;
import com.ch.test.domain.factory.PostGroupEntityFactory;
import com.ch.test.domain.service.PostGroupDomainService;
import com.ch.test.domain.entity.PostGroupEntity;

public class PostGroupDomainServiceImpl implements PostGroupDomainService {
    @Override
    public void createPostGroup(PostGroupCreateCmd cmd) {
        PostGroupEntity postGroupEntity = PostGroupEntityFactory.getPostGroupEntity();
        postGroupEntity.createPostGroup(cmd);
    }
}
