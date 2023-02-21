package com.aia.training.domain.service;

import com.aia.training.controller.co.PostGroupCreateCmd;

public interface PostGroupDomainService {
    void createPostGroup(PostGroupCreateCmd cmd);
}
