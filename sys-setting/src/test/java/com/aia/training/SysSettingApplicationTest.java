package com.aia.training;

import com.aia.training.domain.po.PostPO;
import com.aia.training.infrastructure.mapper.PostMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class SysSettingApplicationTest {
    @Autowired
    private PostMapper postMapper;

    @Test
    public void insertPost(){
        PostPO postPO = new PostPO();
        postPO.setName("test1234567890");

        postMapper.insert(postPO);
    }
}