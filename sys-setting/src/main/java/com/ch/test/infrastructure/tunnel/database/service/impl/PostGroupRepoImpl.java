package com.aia.training.infrastructure.tunnel.database.service.impl;


import com.aia.training.infrastructure.po.PostGroupPO;
import com.aia.training.infrastructure.tunnel.database.service.PostGroupRepo;
import com.aia.training.infrastructure.tunnel.database.service.mapper.PostGroupMapper;

import javax.annotation.Resource;

public class PostGroupRepoImpl implements PostGroupRepo {

    @Resource
    private PostGroupMapper mapper;
    @Override
    public void save(PostGroupPO po) {
        mapper.save(po);
    }
}
