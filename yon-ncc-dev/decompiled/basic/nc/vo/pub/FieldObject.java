/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.pub;

import java.lang.reflect.InvocationTargetException;
import nc.bs.logging.Logger;
import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public abstract class FieldObject {
    private String m_strLabel = null;
    private String m_strName = null;
    private boolean m_bAllowNull = true;

    public abstract Class getFieldType();

    public String getLabel() {
        return this.m_strLabel;
    }

    public String getName() {
        return this.m_strName;
    }

    public Object getValue(ValueObject eo) {
        Object val = null;
        try {
            String strMethod = "get" + this.getName();
            val = eo.getClass().getMethod(strMethod, new Class[0]).invoke(eo, new Object[0]);
        }
        catch (Throwable e) {
            this.handleException(e);
        }
        return val;
    }

    protected void handleException(Throwable e) {
        Logger.error((Object)e.getMessage(), (Throwable)e);
    }

    public boolean isAllowNull() {
        return this.m_bAllowNull;
    }

    public void setAllowNull(boolean newAllowNull) {
        this.m_bAllowNull = newAllowNull;
    }

    public void setLabel(String newvalue) {
        this.m_strLabel = newvalue;
    }

    public void setName(String newvalue) {
        this.m_strName = newvalue;
    }

    public void setValue(ValueObject eo, Object val) throws ValidationException {
        String strMethod = "set" + this.getName();
        Class[] aryParamTypes = new Class[1];
        Object[] aryParams = new Object[1];
        try {
            aryParamTypes[0] = this.getFieldType();
            aryParams[0] = val;
            eo.getClass().getMethod(strMethod, aryParamTypes).invoke(eo, aryParams);
        }
        catch (NoSuchMethodException nsme) {
            this.handleException(nsme);
        }
        catch (IllegalAccessException iae) {
            this.handleException(iae);
        }
        catch (InvocationTargetException ite) {
            if (ite.getTargetException() instanceof ValidationException) {
                throw (ValidationException)ite.getTargetException();
            }
            this.handleException(ite);
        }
    }

    public abstract boolean validate(Object var1) throws ValidationException;
}

