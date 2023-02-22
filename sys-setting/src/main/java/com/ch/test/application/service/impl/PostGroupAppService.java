package com.ch.test.application.service.impl;

import com.ch.test.application.service.IPostGroupAppService;
import com.ch.test.controller.co.add.PostGroupCreateCmd;
import com.ch.test.controller.co.delete.PostGroupDeleteCmd;
import com.ch.test.domain.entity.PostGroupEntity;
import com.ch.test.domain.factory.PostGroupEntityFactory;
import com.ch.test.domain.service.IPostAndGroupDomainService;
import com.ch.test.infrastructure.exception.MyException;

import javax.annotation.Resource;

public class PostGroupAppService implements IPostGroupAppService {
    @Resource
    private IPostAndGroupDomainService domainService;

    @Override
    public void createPostGroup(PostGroupCreateCmd cmd){
        PostGroupEntity postGroupEntity = PostGroupEntityFactory.getPostGroupEntityWithName(cmd.getGroupName());
        if(postGroupEntity.checkDuplicateNameCheck()){
            throw new MyException("Duplicate name");
        }
        postGroupEntity.createPostGroup();
    }

    @Override
    public void deletePostGroup(PostGroupDeleteCmd cmd) {
        //跨实体的操作应该在领域服务内完成？？？
        PostGroupEntity postGroupEntity = PostGroupEntityFactory.getPostGroupEntityWithId(cmd.getId());
        postGroupEntity.deletePostGroup();
    }
}
