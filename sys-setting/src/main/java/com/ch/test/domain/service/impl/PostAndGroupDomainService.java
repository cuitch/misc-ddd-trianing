package com.ch.test.domain.service.impl;

import com.ch.test.domain.entity.aggregateRoot.PostEntity;
import com.ch.test.domain.repository.IPostRepo;
import com.ch.test.domain.service.IPostAndGroupDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostAndGroupDomainService implements IPostAndGroupDomainService {

    private PostEntity postEntity;

    @Autowired
    private IPostRepo postRepo;

    @Override
    public List<PostEntity> queryPosts() {
        return postRepo.queryPosts();
    }
}
