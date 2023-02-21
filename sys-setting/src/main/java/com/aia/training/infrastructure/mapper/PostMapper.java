package com.aia.training.infrastructure.mapper;

import com.aia.training.infrastructure.po.PostPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PostMapper {
    void insert(PostPO post);
}
