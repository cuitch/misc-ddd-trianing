package com.ch.test.infrastructure.tunnel.database.service;

import com.ch.test.infrastructure.po.PostGroupPO;

import java.util.List;

public interface IPostGroupRepo {

    void save(PostGroupPO po);

    PostGroupPO getOneWithName(String name);

    void deleteOneById(Long id);

    PostGroupPO getOneById(Long id);
    List<PostGroupPO> getSomeBySeqGreaterThan(Integer seq);

    void batchSave(List<PostGroupPO> postGroupPOS);
}
