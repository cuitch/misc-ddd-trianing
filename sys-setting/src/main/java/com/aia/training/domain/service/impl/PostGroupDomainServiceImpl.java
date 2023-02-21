package com.aia.training.domain.service.impl;

import com.aia.training.controller.co.PostGroupCreateCmd;
import com.aia.training.domain.entity.PostGroupEntity;
import com.aia.training.domain.factory.PostGroupEntityFactory;
import com.aia.training.domain.service.PostGroupDomainService;

public class PostGroupDomainServiceImpl implements PostGroupDomainService {
    @Override
    public void createPostGroup(PostGroupCreateCmd cmd) {
        PostGroupEntity postGroupEntity = PostGroupEntityFactory.getPostGroupEntity();
        postGroupEntity.createPostGroup(cmd);
    }
}
