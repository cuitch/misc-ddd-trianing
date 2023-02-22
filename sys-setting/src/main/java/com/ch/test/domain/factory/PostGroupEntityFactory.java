package com.ch.test.domain.factory;

import com.ch.test.domain.entity.PostGroupEntity;

public class PostGroupEntityFactory {
    public static PostGroupEntity getPostGroupEntity(){
        return new PostGroupEntity();
    }
    public static PostGroupEntity getPostGroupEntityWithName(String name){
        PostGroupEntity postGroupEntity = new PostGroupEntity();
        postGroupEntity.setName(name);
//        postGroupEntity.setCreatedTime();
//        postGroupEntity.setUpdatedTime();
//        postGroupEntity.setCreateUserId();
//        postGroupEntity.setUpdateUserId();
        return postGroupEntity;
    }

    public static PostGroupEntity getPostGroupEntityWithId(Long id){
        PostGroupEntity postGroupEntity = new PostGroupEntity();
        postGroupEntity.setId(id);
        return postGroupEntity;
    }
}
