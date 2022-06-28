package com.example.mall.common;

public class ResponseUtil {
    public static <T> Response success(T data) {
        return new Response<T>(ResultEnum.SUCCESS, data);
    }

    public static Response success() {
        return new Response(ResultEnum.SUCCESS);
    }

    public static Response success(String msg) {
        return new Response(ResultEnum.SUCCESS.getCode(), msg);
    }

    public static Response success(int code, String msg) {
        return new Response(code, msg);
    }

    public static <T> Response success(int code, String msg, T data) {
        return new Response<T>(code, msg, data);
    }

    public static Response success(ResultEnum resultEnums) {
        return new Response(resultEnums);
    }

    public static <T> Response error(T data) {
        return new Response<T>(ResultEnum.ERROR, data);
    }

    public static Response error() {
        return new Response(ResultEnum.ERROR);
    }

    public static Response error(String msg) {
        return new Response(ResultEnum.ERROR.getCode(), msg);
    }

    public static Response error(int code, String msg) {
        return new Response(code, msg);
    }

    public static <T> Response error(int code, String msg, T data) {
        return new Response<T>(code, msg, data);
    }

    public static Response error(ResultEnum resultEnums) {
        return new Response(resultEnums);
    }
}
