package com.ch.test.controller.facade;

import com.ch.test.application.service.PostGroupAppService;
import com.ch.test.controller.co.add.PostGroupCreateCmd;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RequestMapping("/post-group")
public class PostGroupController {
    @Resource
    private PostGroupAppService appService;
    @PostMapping("/add")
    public void createPostGroup(PostGroupCreateCmd cmd){

    }
}
