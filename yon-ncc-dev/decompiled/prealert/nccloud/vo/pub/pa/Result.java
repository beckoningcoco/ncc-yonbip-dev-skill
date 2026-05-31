/*
 * Decompiled with CFR 0.152.
 */
package nccloud.vo.pub.pa;

import java.io.Serializable;
import nccloud.vo.pub.pa.ErrorCodeEnum;

public class Result<T>
implements Serializable {
    private static final long serialVersionUID = 8992436576262574064L;
    private Integer code;
    private String msg;
    private T result;
    private Long timestamp;

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public static <T> Result<T> error() {
        return Result.error(ErrorCodeEnum.BUSINESS_FAIL.getCode(), ErrorCodeEnum.BUSINESS_FAIL.getMsg());
    }

    public static <T> Result<T> error(String message) {
        return Result.error(ErrorCodeEnum.BUSINESS_FAIL.getCode(), message);
    }

    public static <T> Result<T> error(Integer code) {
        return Result.error(code, ErrorCodeEnum.getMsg(code));
    }

    public static <T> Result<T> error(Integer code, String message) {
        Result<T> msg = new Result<T>();
        msg.msg = message;
        msg.code = code;
        return super.putTimeStamp();
    }

    public static <T> Result<T> errorResult(T result) {
        return super.putTimeStamp().code(ErrorCodeEnum.BUSINESS_FAIL.getCode()).msg(ErrorCodeEnum.BUSINESS_FAIL.getMsg());
    }

    public static <T> Result<T> ok(T result) {
        return super.putTimeStamp().code(ErrorCodeEnum.RESULT_SUCCESS.getCode()).msg(ErrorCodeEnum.RESULT_SUCCESS.getMsg());
    }

    private Result<T> putTimeStamp() {
        this.timestamp = System.currentTimeMillis();
        return this;
    }

    public Result<T> result(T result) {
        this.result = result;
        return this;
    }

    public Result<T> code(Integer code) {
        this.code = code;
        return this;
    }

    public Result<T> msg(String msg) {
        this.msg = msg;
        return this;
    }
}

