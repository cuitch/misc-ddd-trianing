package com.aia.training.infrastructure.conventor;


import com.aia.training.domain.entity.PostGroupEntity;
import com.aia.training.infrastructure.po.PostGroupPO;
import org.springframework.beans.BeanUtils;

public class PostGroupConventor {
    public static PostGroupPO toPo(PostGroupEntity entity){
        PostGroupPO po = new PostGroupPO();
        BeanUtils.copyProperties(entity,po);
        return po;
    }
}
