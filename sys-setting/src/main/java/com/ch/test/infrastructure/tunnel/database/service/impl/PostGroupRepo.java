package com.ch.test.infrastructure.tunnel.database.service.impl;


import com.ch.test.infrastructure.po.PostGroupPO;
import com.ch.test.infrastructure.tunnel.database.service.IPostGroupRepo;
import com.ch.test.infrastructure.tunnel.database.service.mapper.PostGroupMapper;

import javax.annotation.Resource;

public class PostGroupRepo implements IPostGroupRepo {

    @Resource
    private PostGroupMapper mapper;
    @Override
    public void save(PostGroupPO po) {
        mapper.save(po);
    }
}
