package com.ch.test.domain.entity;

import com.ch.test.controller.co.add.PostGroupCreateCmd;
import com.ch.test.domain.event.PostGroupCreatedEvent;
import com.ch.test.infrastructure.conventor.PostGroupConventor;
import com.ch.test.infrastructure.tunnel.database.service.IPostGroupRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostGroupEntity {
    private Long id;

    private String uuid;

    private String name;

    private Integer seq;

    private Long createUserId;

    private Long updateUserId;

    private Long createdTime;

    private Long updatedTime;

    @Resource
    private IPostGroupRepo repo;

    private void checkDuplicateNameCheck(String name){
        //query Database
    }

    public PostGroupCreatedEvent createPostGroup(PostGroupCreateCmd cmd) {
        checkDuplicateNameCheck(cmd.getGroupName());
        repo.save(PostGroupConventor.toPo(this));
        return new PostGroupCreatedEvent("Post Group Created!");
    }

    public PostGroupEntity toEntity(){
        PostGroupEntity postGroup = new PostGroupEntity();
        BeanUtils.copyProperties(this,postGroup);
        return postGroup;
    }

}
