package com.ch.test.infrastructure.conventor;


import com.ch.test.controller.dto.PostDTO;
import com.ch.test.domain.entity.PostGroupEntity;
import com.ch.test.domain.entity.aggregateRoot.PostEntity;
import com.ch.test.infrastructure.po.PostGroupPO;
import com.ch.test.infrastructure.po.PostPO;
import org.springframework.beans.BeanUtils;

public class PostConvertor {
    public static PostDTO toDto(PostEntity entity){


        return new PostDTO();
    }

    public static PostPO toPO(PostEntity postEntity){
        PostPO postPO = new PostPO();
        postPO.setName(postEntity.getName());

        return postPO;
    }
}
