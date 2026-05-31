/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.framework.jmx;

public class JMXRuntimeException
extends RuntimeException {
    private static final long serialVersionUID = 181081759654068197L;

    public JMXRuntimeException() {
    }

    public JMXRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public JMXRuntimeException(String message) {
        super(message);
    }

    public JMXRuntimeException(Throwable cause) {
        super(cause);
    }
}

