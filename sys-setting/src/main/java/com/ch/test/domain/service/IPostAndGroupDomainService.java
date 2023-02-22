package com.ch.test.domain.service;

import com.ch.test.domain.entity.aggregateRoot.PostEntity;

import java.util.List;

public interface IPostAndGroupDomainService {

    List<PostEntity> queryPosts();
}
