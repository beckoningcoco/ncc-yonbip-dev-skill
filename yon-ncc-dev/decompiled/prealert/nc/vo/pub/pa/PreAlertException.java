/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.vo.pub.pa;

import nc.vo.pub.BusinessException;

public class PreAlertException
extends BusinessException {
    private static final long serialVersionUID = -5755032883139082104L;

    public PreAlertException() {
    }

    public PreAlertException(String s) {
        super(s);
    }

    public PreAlertException(String message, Throwable cause) {
        super(message, cause);
    }

    public PreAlertException(Throwable cause) {
        super(cause);
    }
}

