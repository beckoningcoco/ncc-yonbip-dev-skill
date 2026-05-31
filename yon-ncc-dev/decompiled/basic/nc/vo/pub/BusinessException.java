/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

public class BusinessException
extends Exception {
    static final long serialVersionUID = -35466L;
    private String hint;
    private String errorCodeString = "";

    public BusinessException() {
    }

    public BusinessException(String s) {
        super(s);
        this.setErrorCodeString("-32000");
    }

    public BusinessException(String s, String errorCode) {
        super(s);
        this.setErrorCodeString(errorCode);
    }

    public String getHint() {
        return this.hint;
    }

    public void setHint(String newHint) {
        this.hint = newHint;
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public String getErrorCodeString() {
        return this.errorCodeString;
    }

    public void setErrorCodeString(String errorCode) {
        this.errorCodeString = errorCode;
    }
}

