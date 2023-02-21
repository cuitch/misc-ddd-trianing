package com.ch.test.domain.repository;

import com.ch.test.domain.entity.aggregateRoot.PostEntity;

import java.util.List;

public interface IPostRepo {
    void save(PostEntity postEntity);

    List<PostEntity> queryPosts();

}
