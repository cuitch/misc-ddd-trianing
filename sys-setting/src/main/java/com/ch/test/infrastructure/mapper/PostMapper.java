package com.ch.test.infrastructure.mapper;

import com.ch.test.infrastructure.po.PostPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PostMapper {
    void insert(PostPO postPO);

    List<PostPO> query();
}
