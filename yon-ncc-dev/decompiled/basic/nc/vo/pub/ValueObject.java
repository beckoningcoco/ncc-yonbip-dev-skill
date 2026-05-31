/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.pub;

import java.io.Serializable;
import nc.bs.logging.Logger;
import nc.vo.pub.BusinessException;
import nc.vo.pub.ValidationException;

public abstract class ValueObject
implements Cloneable,
Serializable {
    private static final long serialVersionUID = -2144910174446136305L;
    private boolean m_isDirty = false;

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new RuntimeException("clone not supported!");
        }
        return o;
    }

    public abstract String getEntityName();

    public String getPrimaryKey() throws BusinessException {
        throw new BusinessException("Method getPrimaryKey() is not realized in class " + this.getClass().getName());
    }

    protected static void handleException(Throwable e) {
        Logger.error((Object)e.getMessage(), (Throwable)e);
    }

    public boolean isDirty() {
        return this.m_isDirty;
    }

    public void setDirty(boolean isDirty) {
        this.m_isDirty = isDirty;
    }

    public void setPrimaryKey(String key) throws BusinessException {
        throw new BusinessException("Method setPrimaryKey() is not realized in class " + this.getClass().getName());
    }

    public abstract void validate() throws ValidationException;
}

