package com.example.mall.common;

public enum ResultEnum {
    SUCCESS(1,"请求成功"),
    ERROR(0,"请求失败");
    private int code;
    private String msg;
    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
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
}
