package com.ch.test.controller.co.query;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PostQueryCmd {
    @NotBlank(message = "group name can not be blank")
    private String name;
}
