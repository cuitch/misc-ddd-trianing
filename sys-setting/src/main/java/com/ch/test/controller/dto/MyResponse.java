package com.ch.test.controller.dto;

import lombok.Data;

import java.util.Objects;

@Data
public class MyResponse {
    private String code;
    private String message;
    private Object data;

    public static MyResponse success(String code,String message,String data){
        MyResponse myResponse = new MyResponse();
        myResponse.setCode(code);
        myResponse.setMessage("success");
        myResponse.setData(data);
        return myResponse;
    }
}
