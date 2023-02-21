package com.ch.test.infrastructure.tunnel.database.service.impl;


import com.ch.test.infrastructure.po.PostGroupPO;
import com.ch.test.infrastructure.tunnel.database.service.IPostGroupRepo;
import com.ch.test.infrastructure.mapper.PostGroupMapper;

import javax.annotation.Resource;
import java.util.List;

public class PostGroupRepo implements IPostGroupRepo {

    @Resource
    private PostGroupMapper mapper;
    @Override
    public void save(PostGroupPO po) {
        mapper.save(po);
    }

    @Override
    public PostGroupPO getOneWithName(String name) {
        return mapper.getOneByName(name);
    }

    @Override
    public void deleteOneById(Long id) {
        mapper.deleteOneById(id);
    }

    @Override
    public PostGroupPO getOneById(Long id) {
        return mapper.getOneById(id);
    }

    @Override
    public List<PostGroupPO> getSomeBySeqGreaterThan(Integer seq) {
        return mapper.getManyBySeqGreaterThan(seq);
    }

    @Override
    public void batchSave(List<PostGroupPO> postGroupPOS) {
        mapper.batchSave(postGroupPOS);
    }
}
