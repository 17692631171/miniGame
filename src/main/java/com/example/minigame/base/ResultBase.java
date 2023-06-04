package com.example.minigame.base;

import java.io.Serializable;

/**
 * @author Administrator
 * 统一返回结果类
 */
public class ResultBase implements Serializable {
    private static final long serialVersionUID = 8676392564995403365L;
    private int state; //状态
    private String message;//消息
    private Object data;//数据
    private final long timestamp;//耗时

    public ResultBase() {
        this.timestamp = System.currentTimeMillis();
    }

    public static ResultBase ok(Object data){
        ResultBase resultBase = new ResultBase();
        resultBase.setState(ResultCodeEnum.RC200.getCode());
        resultBase.setMessage(ResultCodeEnum.RC200.getMessage());
        resultBase.setData(data);
        return resultBase;
    }
    public static ResultBase fail(int state, String message){
        ResultBase resultBase = new ResultBase();
        resultBase.setState(state);
        resultBase.setMessage(message);
        return resultBase;
    }


    @Override
    public String toString() {
        return "JsonResult [state=" + state + ", message=" + message + ", data=" + data + "]";
    }

    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
