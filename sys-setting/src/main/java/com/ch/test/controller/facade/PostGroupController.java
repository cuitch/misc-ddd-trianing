package com.ch.test.controller.facade;

import com.ch.test.application.service.IPostGroupAppService;
import com.ch.test.controller.co.add.PostGroupCreateCmd;
import com.ch.test.controller.co.delete.PostGroupDeleteCmd;
import com.ch.test.controller.dto.MyResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RequestMapping("/post-group")
public class PostGroupController {
    @Resource
    private IPostGroupAppService appService;
    @PostMapping("/add")
    public MyResponse createPostGroup(PostGroupCreateCmd cmd){
        appService.createPostGroup(cmd);
        return MyResponse.success("200","success",null);
    }

    @DeleteMapping("/delete-by-id")
    public MyResponse deletePostGroup(PostGroupDeleteCmd cmd){
        appService.deletePostGroup(cmd);
        return MyResponse.success("200","success",null);
    }
}
