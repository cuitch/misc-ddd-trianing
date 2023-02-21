package com.ch.test.application.service.impl;


import com.ch.test.application.service.IPostAppService;
import com.ch.test.controller.co.add.PostCreateCmd;
import com.ch.test.controller.co.query.PostQueryCmd;
import com.ch.test.controller.dto.PostDTO;
import com.ch.test.domain.entity.aggregateRoot.PostEntity;
import com.ch.test.domain.factory.PostFactory;
import com.ch.test.domain.service.IPostDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostAppServiceImpl implements IPostAppService {

    @Autowired
    private IPostDomainService postDomainService;

    @Override
    public void createPost(PostCreateCmd postCreateCmd) {
        PostEntity postEntity = PostFactory.createPost(postCreateCmd);
        postEntity.create();
    }

    @Override
    public List<PostDTO> queryPost(PostQueryCmd postQueryCmd) {
        List<PostEntity> postEntities = postDomainService.queryPosts();

        // TODO convert Entity to DTO

        return new ArrayList<>();
    }
}
