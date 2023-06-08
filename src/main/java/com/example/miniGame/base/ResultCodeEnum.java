package com.example.miniGame.base;

/**
 * @author Administrator
 * 响应状态码枚举类
 */
public enum ResultCodeEnum {
    /**
     * 自定义异常枚举
     */
    RC200(200,"操作成功"),
    RC100(100,"用户名不存在"),
    RC500(500,"系统异常，请稍后重试");

    /**
     * 异常码
     */
    private final int code;
    /**
     * 异常信息
     */
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
