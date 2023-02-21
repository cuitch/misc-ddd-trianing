package com.ch.test.domain.entity;

import com.ch.test.controller.co.delete.PostGroupDeleteCmd;
import com.ch.test.domain.event.PostGroupCreatedEvent;
import com.ch.test.domain.repository.IPostRepo;
import com.ch.test.infrastructure.convertor.PostGroupConvertor;
import com.ch.test.infrastructure.exception.MyException;
import com.ch.test.infrastructure.po.PostGroupPO;
import com.ch.test.infrastructure.po.PostPO;
import com.ch.test.infrastructure.tunnel.database.service.IPostGroupRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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

    private List<PostPO> posts;
    @Resource
    private IPostGroupRepo postGroupRepo;

    @Resource
    private IPostRepo postRepo;
    public Boolean checkDuplicateNameCheck(){
        //query Database
        return postGroupRepo.getOneWithName(this.name) != null;
    }

    public PostGroupCreatedEvent createPostGroup() {
        // todo:set properties
        postGroupRepo.save(PostGroupConvertor.toPo(this));
        return new PostGroupCreatedEvent("Post Group Created!");
    }

    public PostGroupEntity toEntity(){
        PostGroupEntity postGroup = new PostGroupEntity();
        BeanUtils.copyProperties(this,postGroup);
        return postGroup;
    }

    public PostGroupDeleteCmd deletePostGroup(){
        List<PostPO> allPosts = this.getAllPosts();
        if(!CollectionUtils.isEmpty(allPosts)){
            throw new MyException("not a empty post group");
        }
        PostGroupPO oneById = this.getOneById();
        if(oneById==null){
            throw new MyException("No one");
        }
        this.setSeq(oneById.getSeq());

        this.minusTheSeqAfter();
        postGroupRepo.deleteOneById(this.getId());
        return new PostGroupDeleteCmd();
    }

    public void minusTheSeqAfter(){
        List<PostGroupPO> postGroupPOS = postGroupRepo.getSomeBySeqGreaterThan(this.getSeq());
        postGroupPOS.forEach(p->p.setSeq(p.getSeq()-1));
        postGroupRepo.batchSave(postGroupPOS);
    }

    public Boolean hasOneInDbById(){
        return this.getOneById()!=null;
    }

    public PostGroupPO getOneById(){
        return postGroupRepo.getOneById(this.id);
    }

    public List<PostPO> getAllPosts(){
//        return postRepo.getAllByGroupId(this.getId());
        return new ArrayList<>();
    }
}
