package com.ch.test.infrastructure.convertor;


import com.ch.test.domain.entity.PostGroupEntity;
import com.ch.test.infrastructure.po.PostGroupPO;
import org.springframework.beans.BeanUtils;

public class PostGroupConvertor {
    public static PostGroupPO toPo(PostGroupEntity entity){
        PostGroupPO po = new PostGroupPO();
        BeanUtils.copyProperties(entity,po);
        return po;
    }
}
