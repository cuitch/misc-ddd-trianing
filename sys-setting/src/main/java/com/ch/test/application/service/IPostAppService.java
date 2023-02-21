package com.ch.test.application.service;

import com.ch.test.controller.co.add.PostCreateCmd;
import com.ch.test.controller.co.add.PostGroupCreateCmd;
import com.ch.test.controller.co.query.PostQueryCmd;
import com.ch.test.controller.dto.PostDTO;

import java.util.List;

public interface IPostAppService {
    void createPost(PostCreateCmd cmd);

    List<PostDTO> queryPost(PostQueryCmd postQueryCmd);
}
