/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.pubapp.pub.exception.IResumeException
 *  nc.vo.pub.BusinessException
 */
package nc.vo.arap.exception;

import nc.itf.pubapp.pub.exception.IResumeException;
import nc.vo.pub.BusinessException;

public class ArapTbbException
extends BusinessException
implements IResumeException {
    private static final long serialVersionUID = 1L;
    private String message;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArapTbbException(String s) {
        super(s);
        this.message = s;
    }

    public String getBusiExceptionType() {
        return null;
    }
}

