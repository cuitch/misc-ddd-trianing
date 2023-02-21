package com.ch.test.domain.entity.aggregateRoot;

import com.ch.test.domain.repository.IPostRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class PostEntity {
    private Long id;

    private String uuid;

    private Long groupId;

    private String name;

    private Integer seq;

    private Long createUserId;

    private Long updateUserId;

    private Long createdTime;

    private Long updatedTime;

    @Autowired
    private IPostRepo postRepo;
    public void create(){
        postRepo.save(this);
    }
}
