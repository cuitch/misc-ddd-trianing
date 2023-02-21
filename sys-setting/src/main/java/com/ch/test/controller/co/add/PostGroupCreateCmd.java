package com.ch.test.controller.co.add;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PostGroupCreateCmd {
    @NotBlank(message = "group name can not be blank")
    private String groupName;
}
