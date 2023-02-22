package com.ch.test;

import com.ch.test.infrastructure.po.PostPO;
import com.ch.test.infrastructure.mapper.PostMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@Slf4j
@SpringBootTest
public class SysSettingApplicationTest {
    @Autowired
    private PostMapper postMapper;

    @Test
    public void insertPost(){
        PostPO postPO = new PostPO();
        postPO.setSeq(1);
        postPO.setCreateUserId(1L);
        postPO.setUpdateUserId(1L);
        postPO.setCreatedTime(System.currentTimeMillis());
        postPO.setUpdatedTime(System.currentTimeMillis());
        postPO.setGroupId(1L);
        postPO.setUuid(UUID.randomUUID().toString().replace("-",""));
        postPO.setName("test1234567890");

        postMapper.insert(postPO);
    }
}
