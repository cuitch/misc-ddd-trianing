package com.ch.test.domain.repository.impl;

import com.ch.test.domain.entity.aggregateRoot.PostEntity;
import com.ch.test.domain.repository.IPostRepo;
import com.ch.test.infrastructure.conventor.PostConvertor;
import com.ch.test.infrastructure.mapper.PostMapper;
import com.ch.test.infrastructure.po.PostPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostRepoImpl implements IPostRepo {

    @Autowired
    private PostMapper postMapper;
    @Override
    public void save(PostEntity postEntity) {
        // 1
        PostPO postPO = PostConvertor.toPO(postEntity);
        postMapper.insert(postPO);

        // 2
    }

    @Override
    public List<PostEntity> queryPosts() {
        List<PostPO> postPOs = postMapper.query();

        //TODO convert PO to DO

        return new ArrayList<>();
    }
}
