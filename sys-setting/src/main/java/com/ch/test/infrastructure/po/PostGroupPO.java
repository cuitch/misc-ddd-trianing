package com.aia.training.infrastructure.po;

import lombok.Data;

@Data
public class PostGroupPO {
    private Long id;

    private String uuid;

    private String name;

    private Integer seq;

    private Long createUserId;

    private Long updateUserId;

    private Long createdTime;

    private Long updatedTime;
}
