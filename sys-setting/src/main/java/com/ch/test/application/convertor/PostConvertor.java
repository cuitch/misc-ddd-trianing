package com.ch.test.application.convertor;

import com.ch.test.controller.co.add.PostCreateCmd;
import com.ch.test.controller.co.update.PostUpdateCmd;
import com.ch.test.domain.entity.aggregateRoot.PostEntity;

public class PostConvertor {

    public static PostEntity transToEntity(PostCreateCmd postCreateCmd){
        PostEntity postEntity = new PostEntity();
        postEntity.setName(postCreateCmd.getName());
        return postEntity;
    }

    public static PostEntity transToEntity(PostUpdateCmd postUpdateCmd){
        PostEntity postEntity = new PostEntity();

        return new PostEntity();
    }
}
