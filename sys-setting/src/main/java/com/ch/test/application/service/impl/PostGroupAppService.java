package com.ch.test.application.service.impl;

import com.ch.test.application.service.IPostGroupAppService;
import com.ch.test.controller.co.add.PostGroupCreateCmd;
import com.ch.test.controller.co.delete.PostGroupDeleteCmd;
import com.ch.test.domain.entity.PostGroupEntity;
import com.ch.test.domain.event.PostGroupCreatedEvent;
import com.ch.test.domain.factory.PostGroupEntityFactory;
import com.ch.test.domain.service.IPostGroupDomainService;
import com.ch.test.infrastructure.exception.MyException;
import com.ch.test.infrastructure.po.PostGroupPO;

import javax.annotation.Resource;

public class PostGroupAppService implements IPostGroupAppService {
    @Resource
    private IPostGroupDomainService domainService;

    @Override
    public void createPostGroup(PostGroupCreateCmd cmd){
        PostGroupEntity postGroupEntity = PostGroupEntityFactory.getPostGroupEntity();
        postGroupEntity.setName(cmd.getGroupName());
        if(postGroupEntity.checkDuplicateNameCheck()){
            throw new MyException("Duplicate name");
        }
        postGroupEntity.createPostGroup();
    }

    @Override
    public void deletePostGroup(PostGroupDeleteCmd cmd) {
        //跨实体的操作应该在领域服务内完成？？？
        PostGroupEntity postGroupEntity = PostGroupEntityFactory.getPostGroupEntity();
        postGroupEntity.setId(cmd.getId());
        postGroupEntity.deletePostGroup();
    }
}
