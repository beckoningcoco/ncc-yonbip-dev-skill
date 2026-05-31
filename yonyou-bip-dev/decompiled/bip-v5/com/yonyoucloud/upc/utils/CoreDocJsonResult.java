/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 */
package com.yonyoucloud.upc.utils;

import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import java.util.ArrayList;
import java.util.List;

public class CoreDocJsonResult<T> {
    private static final long serialVersionUID = -7532190660864165247L;
    private boolean success = true;
    private String message = null;
    private Long code = 200L;
    private String displayCode;
    private List<T> data = new ArrayList<T>();
    private Integer totalCount = 0;

    public CoreDocJsonResult() {
    }

    public CoreDocJsonResult(List<T> data, Long code, String message, String displayCode, boolean success) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
        this.displayCode = displayCode;
    }

    public CoreDocJsonResult(List<T> data, Long code, String message, boolean success) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CoreDocJsonResult(List<T> data, Long code, String message, boolean success, Integer totalCount) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
        this.totalCount = totalCount;
    }

    public CoreDocJsonResult(BusinessException exception) {
        if (exception != null) {
            this.success = false;
            this.code = exception.getErrorCode() == null ? 999L : Long.parseLong(exception.getErrorCode());
            this.message = exception.getDetailMsg() == null ? exception.getMessage() : exception.getDetailMsg();
            this.displayCode = exception.getDisplayCode();
        }
    }

    public CoreDocJsonResult(List<T> data) {
        if (data != null && !data.isEmpty()) {
            this.data = data;
        }
    }

    public CoreDocJsonResult(T data) {
        if (data != null) {
            this.data.add(data);
        }
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return this.message;
    }

    public Long getCode() {
        return this.code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDisplayCode() {
        return this.displayCode;
    }

    public void setDisplayCode(String displayCode) {
        this.displayCode = displayCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getData() {
        return this.data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public static <T> CoreDocJsonResult<T> success(List<T> data) {
        return new CoreDocJsonResult<T>(data, 200L, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C60", (String)"\u5904\u7406\u6210\u529f"), true);
    }

    public static <T> CoreDocJsonResult<T> success(T data) {
        ArrayList<T> value = new ArrayList<T>();
        if (data != null) {
            value.add(data);
        }
        return new CoreDocJsonResult(value, 200L, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C60", (String)"\u5904\u7406\u6210\u529f"), true);
    }

    public static <T> CoreDocJsonResult<T> success(T data, String message) {
        ArrayList<T> value = new ArrayList<T>();
        if (data != null) {
            value.add(data);
        }
        return new CoreDocJsonResult(value, 200L, message, true);
    }

    public static <T> CoreDocJsonResult<T> success(List<T> data, String message) {
        return new CoreDocJsonResult<T>(data, 200L, message, true);
    }

    public static CoreDocJsonResult<Void> success() {
        return new CoreDocJsonResult<Void>(null, 200L, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C60", (String)"\u5904\u7406\u6210\u529f"), true);
    }

    public static CoreDocJsonResult<Void> successWithMessage(String message) {
        return new CoreDocJsonResult<Void>(null, 200L, message, true);
    }

    public static <T> CoreDocJsonResult<T> error(Long code, String message) {
        return new CoreDocJsonResult<T>(null, code, message, false);
    }

    public static <T> CoreDocJsonResult<T> error(Long code, String displayCode, String message) {
        return new CoreDocJsonResult<T>(null, code, message, displayCode, false);
    }

    public static <T> CoreDocJsonResult<T> error(T data, Long code, String message) {
        return CoreDocJsonResult.error(data, code, null, message);
    }

    public static <T> CoreDocJsonResult<T> error(T data, Long code, String displayCode, String message) {
        ArrayList<T> value = new ArrayList<T>();
        if (data != null) {
            value.add(data);
        }
        return new CoreDocJsonResult(value, code, message, displayCode, false);
    }

    public static <T> CoreDocJsonResult<T> error(List<T> data, Long code, String message) {
        return new CoreDocJsonResult<T>(data, code, message, false);
    }

    public static <T> CoreDocJsonResult<T> error(List<T> data, Long code, String displayCode, String message) {
        return new CoreDocJsonResult<T>(data, code, displayCode, message, false);
    }

    public static <T> CoreDocJsonResult<T> error(BusinessException exception) {
        return new CoreDocJsonResult<T>(null, (Long)CoreDocJsonResult.getErrorCode(exception), exception.getDetailMsg() == null ? exception.getMessage() : exception.getDetailMsg(), exception.getDisplayCode(), false);
    }

    public static <T> CoreDocJsonResult<T> error(T data, BusinessException exception) {
        ArrayList<T> value = new ArrayList<T>();
        if (data != null) {
            value.add(data);
        }
        return new CoreDocJsonResult(value, (Long)CoreDocJsonResult.getErrorCode(exception), exception.getDetailMsg() == null ? exception.getMessage() : exception.getDetailMsg(), exception.getDisplayCode(), false);
    }

    public static <T> CoreDocJsonResult<T> error(List<T> data, BusinessException exception) {
        return new CoreDocJsonResult<T>(data, (Long)CoreDocJsonResult.getErrorCode(exception), exception.getDetailMsg() == null ? exception.getMessage() : exception.getDetailMsg(), exception.getDisplayCode(), false);
    }

    private static long getErrorCode(BusinessException exception) {
        long code = 999L;
        if (exception.getErrorCode() != null) {
            try {
                code = Long.parseLong(exception.getErrorCode());
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return code;
    }
}

