package com.example.myapplication.constant;

/**
 * Description:
 * Detail:
 * Create Time: 2018/8/13
 *
 * @author LiuFangQiang
 * @version 1.0
 * @see ...
 * History:
 * @since Since
 */
public class MessageEvent {

    public int code;
    public String message;
    public String name;

    public MessageEvent(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public MessageEvent(int code, String message, String name) {
        this.code = code;
        this.message = message;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
