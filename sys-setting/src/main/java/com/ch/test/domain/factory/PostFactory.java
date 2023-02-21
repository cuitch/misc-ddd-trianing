package com.ch.test.domain.factory;

import com.ch.test.application.convertor.PostConvertor;
import com.ch.test.controller.co.add.PostCreateCmd;
import com.ch.test.controller.co.update.PostUpdateCmd;
import com.ch.test.domain.entity.aggregateRoot.PostEntity;

public class PostFactory {

    public static PostEntity createPost(PostCreateCmd cmd){
        return PostConvertor.transToEntity(cmd);
    }

    public static PostEntity updatePost(PostUpdateCmd cmd){
        return PostConvertor.transToEntity(cmd);
    }
}
