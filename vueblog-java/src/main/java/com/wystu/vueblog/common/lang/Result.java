package com.wystu.vueblog.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @author WY
 * @description: Result，结果返回统一处理
 * @date 2021/8/8 22:18
 */

@Data
public class Result implements Serializable {

    private int code;
    private String msg;
    private Object data;

    public static Result succ(Object data) {
        return info(400, "操作成功", data);
    }

    public static Result fail(String msg) {
        return info(400, msg, null);
    }

    public static Result fail(String msg, Object data) {
        return info(400, msg, data);
    }

    public static Result info(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
