/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.pubapp.pub.exception.IResumeException
 *  nc.vo.cmp.exception.CmpAuthorizationException
 *  nc.vo.pub.BusinessException
 */
package nc.vo.arap.exception;

import nc.itf.pubapp.pub.exception.IResumeException;
import nc.vo.cmp.exception.CmpAuthorizationException;
import nc.vo.pub.BusinessException;

public class ARAP4CmpAuthorizationException
extends BusinessException
implements IResumeException {
    private static final long serialVersionUID = 1L;
    private CmpAuthorizationException cmpAuthorizationException;

    public ARAP4CmpAuthorizationException() {
    }

    public ARAP4CmpAuthorizationException(String s) {
        super(s);
    }

    public CmpAuthorizationException getCmpAuthorizationException() {
        return this.cmpAuthorizationException;
    }

    public void setCmpAuthorizationException(CmpAuthorizationException cmpAuthorizationException) {
        this.cmpAuthorizationException = cmpAuthorizationException;
    }

    public String getBusiExceptionType() {
        return null;
    }
}

