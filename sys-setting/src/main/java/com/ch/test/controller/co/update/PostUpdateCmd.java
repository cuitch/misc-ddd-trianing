package com.ch.test.controller.co.update;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PostUpdateCmd {
    @NotBlank(message = "name can not be blank")
    private String name;
}
