package com.ch.test.infrastructure.po;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class PostPO {

    private Long id;

    private String uuid;

    private Long groupId;

    private String name;

    private Integer seq;

    private Long createUserId;

    private Long updateUserId;

    private Long createdTime;

    private Long updatedTime;

}
