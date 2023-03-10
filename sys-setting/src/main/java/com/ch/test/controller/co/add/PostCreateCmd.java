package com.ch.test.controller.co.add;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PostCreateCmd {
    @NotBlank(message = "name can not be blank")
    private String name;
}
