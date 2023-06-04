package com.example.minigame.base;

/**
 * @author Administrator
 * 响应状态码枚举类
 */
public enum ResultCodeEnum {
    RC200(200,"操作成功"),
    RC100(100,"用户名不存在"),
    RC500(500,"系统异常，请稍后重试");

    private final int code;
    private final String message;

    ResultCodeEnum(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
