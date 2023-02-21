package com.ch.test.domain.service.impl;

import com.ch.test.controller.co.add.PostGroupCreateCmd;
import com.ch.test.controller.co.delete.PostGroupDeleteCmd;
import com.ch.test.domain.entity.PostEntity;
import com.ch.test.domain.entity.PostGroupEntity;
import com.ch.test.domain.event.PostGroupCreatedEvent;
import com.ch.test.domain.factory.PostFactory;
import com.ch.test.domain.factory.PostGroupEntityFactory;
import com.ch.test.domain.service.IPostGroupDomainService;
import com.ch.test.infrastructure.exception.MyException;
import com.ch.test.infrastructure.po.PostGroupPO;
import org.springframework.transaction.annotation.Transactional;

public class PostGroupDomainService implements IPostGroupDomainService {
//    @Override
//    @Transactional
//    public PostGroupCreatedEvent createPostGroup(PostGroupCreateCmd cmd) {
//        PostGroupEntity postGroupEntity = PostGroupEntityFactory.getPostGroupEntity();
//        postGroupEntity.setName(cmd.getGroupName());
//        if(postGroupEntity.checkDuplicateNameCheck()){
//            throw new MyException("Duplicate name");
//        }
//        return postGroupEntity.createPostGroup();
//    }
//
//    @Override
//    public PostGroupDeleteCmd deletePostGroup(PostGroupDeleteCmd cmd) {
//
//    }
}
