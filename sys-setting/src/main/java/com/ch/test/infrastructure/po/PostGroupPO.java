package com.ch.test.infrastructure.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
