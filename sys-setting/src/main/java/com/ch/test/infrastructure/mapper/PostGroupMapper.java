package com.ch.test.infrastructure.mapper;

import com.ch.test.infrastructure.po.PostGroupPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostGroupMapper {
    void save(PostGroupPO po);
    PostGroupPO getOneByName(String name);
    void deleteOneById(Long id);
    PostGroupPO getOneById(Long id);
    List<PostGroupPO> getManyBySeqGreaterThan(Integer seq);

    void batchSave(List<PostGroupPO> postGroupPOS);
}
