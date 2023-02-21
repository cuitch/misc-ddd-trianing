package com.ch.test.controller.facade;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/post")
public class PostController {

//    @Resource
//    private PostServiceI postService;
//
//    @PostMapping("/add")
//    public Map<String, List<String>> createPost(@RequestBody @Validated PostCreateCmd cmd) {
//        return postService.createPost(cmd);
//    }
}
