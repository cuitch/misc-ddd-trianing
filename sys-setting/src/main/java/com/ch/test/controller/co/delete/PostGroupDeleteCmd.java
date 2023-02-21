package com.ch.test.controller.co.delete;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class PostGroupDeleteCmd {
    @NotNull(message = "group id can not be null")
    private Long id;
}
