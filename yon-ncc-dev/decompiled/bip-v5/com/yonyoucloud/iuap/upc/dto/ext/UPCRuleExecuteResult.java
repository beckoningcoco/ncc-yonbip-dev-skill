/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.dto.ext;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class UPCRuleExecuteResult
implements Serializable {
    private static final long serialVersionUID = -4932651332894530294L;
    private int msgCode = 1;
    private boolean isCancel = false;
    private boolean isActionCancel = false;
    private Object data;
    private String message;
    private Map<String, Object> outParams;
    private List<Object> messages = Collections.synchronizedList(new ArrayList());
    public int code = 0;

    public UPCRuleExecuteResult() {
    }

    public UPCRuleExecuteResult(Object data) {
        this.data = data;
    }

    public UPCRuleExecuteResult(int msgCode, String message) {
        this.msgCode = msgCode;
        this.message = message;
    }

    public UPCRuleExecuteResult(int msgCode, int code, String message) {
        this.msgCode = msgCode;
        this.code = code;
        this.message = message;
    }

    public int getMsgCode() {
        return this.msgCode;
    }

    public boolean isCancel() {
        return this.isCancel;
    }

    public boolean isActionCancel() {
        return this.isActionCancel;
    }

    public Object getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, Object> getOutParams() {
        return this.outParams;
    }

    public List<Object> getMessages() {
        return this.messages;
    }

    public int getCode() {
        return this.code;
    }

    public void setMsgCode(int msgCode) {
        this.msgCode = msgCode;
    }

    public void setCancel(boolean isCancel) {
        this.isCancel = isCancel;
    }

    public void setActionCancel(boolean isActionCancel) {
        this.isActionCancel = isActionCancel;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setOutParams(Map<String, Object> outParams) {
        this.outParams = outParams;
    }

    public void setMessages(List<Object> messages) {
        this.messages = messages;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

