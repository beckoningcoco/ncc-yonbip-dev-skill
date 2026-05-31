/*
 * Decompiled with CFR 0.152.
 */
package nccloud.vo.pub.pa;

public enum ErrorCodeEnum {
    RESULT_SUCCESS(0, "\u8bf7\u6c42\u6210\u529f"),
    BUSINESS_FAIL(1, "\u4e1a\u52a1\u5904\u7406\u5931\u8d25"),
    SYSTEM_ERROR(100001, "\u7cfb\u7edf\u9519\u8bef"),
    SERVICE_UNAVAILABLE(10002, "\u670d\u52a1\u6682\u505c"),
    REMOTE_SERVICE_ERROR(10003, "\u8fdc\u7a0b\u670d\u52a1\u9519\u8bef"),
    IP_LIMIT(10004, "IP\u9650\u5236\u4e0d\u80fd\u8bf7\u6c42\u8be5\u8d44\u6e90"),
    PERMISSION_DENIED(10005, "\u8be5\u8d44\u6e90\u9700\u8981\u62e5\u6709\u6388\u6743"),
    MISSING_REQUIRED_ARGUMENTS(10006, "\u7f3a\u5c11\u5fc5\u9009\u53c2\u6570,\u8bf7\u53c2\u8003API\u6587\u6863"),
    INVALID_ARGUMENTS(10007, "\u975e\u6cd5\u7684\u53c2\u6570"),
    SYSTEM_BUSY(10008, "\u4efb\u52a1\u8fc7\u591a\uff0c\u7cfb\u7edf\u7e41\u5fd9"),
    RPC_ERROR(10009, "RPC\u9519\u8bef"),
    ILLEGAL_REQUEST(10010, "\u975e\u6cd5\u8bf7\u6c42"),
    INVALID_USER(10011, "\u4e0d\u5408\u6cd5\u7684\u7528\u6237"),
    MESSAGE_ERROR(10012, "\u6d88\u606f\u5904\u7406\u5f02\u5e38");

    private Integer code;
    private String msg;

    private ErrorCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

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

    public static String getMsg(Integer code) {
        for (ErrorCodeEnum apiCodeEnum : ErrorCodeEnum.values()) {
            if (!code.equals(apiCodeEnum.getCode())) continue;
            return apiCodeEnum.getMsg();
        }
        return BUSINESS_FAIL.getMsg();
    }
}

