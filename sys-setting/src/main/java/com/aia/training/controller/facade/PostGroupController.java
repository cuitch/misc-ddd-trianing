package com.aia.training.controller.facade;

import com.aia.training.application.service.PostGroupAppService;
import com.aia.training.controller.co.PostGroupCreateCmd;
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
