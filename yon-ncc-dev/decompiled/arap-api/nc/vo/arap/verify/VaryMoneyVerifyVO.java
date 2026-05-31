/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 */
package nc.vo.arap.verify;

import java.util.Vector;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class VaryMoneyVerifyVO
extends ValueObject {
    private static final long serialVersionUID = 1L;
    public BaseAggVO bcaggVO;
    public Vector verifyResult;
    public String ationType;
    public boolean m_flag = true;

    public String getActionType() {
        return this.ationType;
    }

    public BaseAggVO getBillAggVO() {
        return this.bcaggVO;
    }

    public String getEntityName() {
        return null;
    }

    public Vector getResult() {
        return this.verifyResult;
    }

    public void setActionType(String type) {
        this.ationType = type;
    }

    public void setBillAggVO(BaseAggVO vo) {
        this.bcaggVO = vo;
    }

    public void setResult(Vector vRes) {
        this.verifyResult = vRes;
    }

    public void validate() throws ValidationException {
    }
}

