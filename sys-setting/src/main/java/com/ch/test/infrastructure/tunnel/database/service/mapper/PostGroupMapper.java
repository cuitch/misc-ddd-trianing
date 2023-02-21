package com.ch.test.infrastructure.tunnel.database.service.mapper;

import com.ch.test.infrastructure.po.PostGroupPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostGroupMapper {
    void save(PostGroupPO po);
}
