package com.ch.test.infrastructure.exception;

public class MyException extends RuntimeException{
    public MyException(){
        super();
    }
    public MyException(String message){
        super(message);
    }

}
