/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.NullFieldException
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 */
package nc.vo.arap.pub;

import java.io.Serializable;
import java.util.ArrayList;
import nc.bs.logging.Logger;
import nc.vo.arap.pub.PubConstData;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.NullFieldException;
import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class QryCondVO
extends ValueObject
implements PubConstData,
Serializable {
    private static final long serialVersionUID = 470705833828828242L;
    public String m_qryfld;
    public Integer m_fldtype = 0;
    public String m_fldorigin;
    public String m_boolopr;
    public String m_value;
    private Object m_ObjValues;

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage());
        }
        QryCondVO qryCond = o == null ? new QryCondVO() : (QryCondVO)o;
        qryCond.setQryfld(this.m_qryfld);
        qryCond.setFldtype(this.m_fldtype);
        qryCond.setFldorigin(this.m_fldorigin);
        qryCond.setBoolopr(this.m_boolopr);
        qryCond.setValue(this.m_value);
        qryCond.setObjValues(this.m_ObjValues);
        return qryCond;
    }

    public String getBoolopr() {
        return this.m_boolopr;
    }

    public String getEntityName() {
        return "QryCond";
    }

    public String getFldorigin() {
        return this.m_fldorigin;
    }

    public Integer getFldtype() {
        return this.m_fldtype;
    }

    public Object getObjValues() {
        return this.m_ObjValues;
    }

    public String getQryfld() {
        return this.m_qryfld;
    }

    public String getValue() {
        return this.m_value;
    }

    public void setBoolopr(String newBoolopr) {
        this.m_boolopr = newBoolopr;
    }

    public void setFldorigin(String newFldorigin) {
        this.m_fldorigin = newFldorigin;
    }

    public void setFldtype(Integer newFldtype) {
        this.m_fldtype = newFldtype;
    }

    public void setObjValues(Object obj) {
        this.m_ObjValues = obj;
    }

    public void setQryfld(String newQryfld) {
        this.m_qryfld = newQryfld;
    }

    public void setValue(String newValue) {
        this.m_value = newValue;
    }

    public void validate() throws ValidationException {
        ArrayList errFields = new ArrayList();
        StringBuffer message = new StringBuffer();
        String msg = "";
        if (errFields.size() > 0) {
            String[] temp = errFields.toArray(new String[0]);
            message.append(temp[0]);
            for (int i = 1; i < temp.length; ++i) {
                msg = msg + NCLangRes4VoTransl.getNCLangRes().getStrByID("20060504", "UPP20060504-000276");
                msg = msg + temp[i];
            }
            message.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("20060504", "UPP20060504-000275", null, new String[]{msg}));
            throw new NullFieldException(message.toString());
        }
    }
}

