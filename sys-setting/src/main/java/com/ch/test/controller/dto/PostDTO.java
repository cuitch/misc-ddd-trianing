package com.ch.test.controller.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PostDTO {
    @NotBlank(message = "group name can not be blank")
    private String groupName;
}
