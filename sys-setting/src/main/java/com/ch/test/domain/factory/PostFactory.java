package com.ch.test.domain.factory;

import com.ch.test.domain.entity.PostEntity;

public class PostFactory {

    public static PostEntity createPost(){
        return new PostEntity();
    }
}
