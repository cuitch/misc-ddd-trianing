package com.ch.test.controller.facade;

import com.ch.test.application.service.IPostAppService;
import com.ch.test.controller.co.add.PostCreateCmd;
import com.ch.test.controller.co.query.PostQueryCmd;
import com.ch.test.controller.dto.PostDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/post")
public class PostController {

    @Resource
    private IPostAppService postAppService;

    @PostMapping("/add")
    public Map<String, List<String>> createPost(@RequestBody @Validated PostCreateCmd postCreateCmd) {
        postAppService.createPost(postCreateCmd);
        return new HashMap<>();
    }

    @PostMapping("/query")
    public List<PostDTO> queryPost(@RequestBody @Validated PostQueryCmd postQueryCmd) {
        postAppService.queryPost(postQueryCmd);
        return new ArrayList<>();
    }
}
