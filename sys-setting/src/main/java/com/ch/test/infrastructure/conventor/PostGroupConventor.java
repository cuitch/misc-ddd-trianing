package com.ch.test.infrastructure.conventor;


import com.ch.test.domain.entity.PostGroupEntity;
import com.ch.test.infrastructure.po.PostGroupPO;
import org.springframework.beans.BeanUtils;

public class PostGroupConventor {
    public static PostGroupPO toPo(PostGroupEntity entity){
        PostGroupPO po = new PostGroupPO();
        BeanUtils.copyProperties(entity,po);
        return po;
    }
}
