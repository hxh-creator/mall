package com.example.mall.common;

import java.io.Serializable;

public class Response<T> implements Serializable {
    private int code;
    private String msg;
    private T data;
    public Response(int code,String msg,T data){
        this.code=code;
        this.msg=msg;
        this.data=data;
    }
    public Response(int code,String msg){
        this.code=code;
        this.msg=msg;
    }
    public Response(ResultEnum resultEnum,T data){
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
        this.data = data;
    }
    public Response(ResultEnum resultEnum){
        this.code=resultEnum.getCode();
        this.msg=resultEnum.getMsg();
    }
    public Response(){

    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
