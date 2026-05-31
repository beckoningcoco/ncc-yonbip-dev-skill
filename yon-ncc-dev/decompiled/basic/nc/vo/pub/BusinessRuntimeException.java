/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

public class BusinessRuntimeException
extends RuntimeException {
    public BusinessRuntimeException() {
    }

    public BusinessRuntimeException(String msg) {
        super(msg);
    }

    public BusinessRuntimeException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}

