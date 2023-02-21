package com.aia.training.infrastructure.tunnel.database.service.mapper;

import com.aia.training.infrastructure.po.PostGroupPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostGroupMapper {
    void save(PostGroupPO po);
}
