/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Log
 *  nc.vo.fipub.utils.FipubTools
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.validator;

import java.util.ArrayList;
import java.util.List;
import nc.bs.logging.Log;
import nc.itf.arap.fieldmap.IBillFieldGet;
import nc.vo.fipub.utils.FipubTools;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;

public abstract class AbstractValidator
implements IBillFieldGet {
    protected Log LOG = Log.getInstance(this.getClass());
    private AggregatedValueObject obj = null;

    public UFBoolean checkObj(Object obj) {
        if (null != obj && obj instanceof AggregatedValueObject[]) {
            return UFBoolean.TRUE;
        }
        return UFBoolean.FALSE;
    }

    public boolean isDeletedRow(CircularlyAccessibleValueObject vo) {
        return vo.getStatus() == 3;
    }

    public CircularlyAccessibleValueObject getParentVO() {
        return this.obj.getParentVO();
    }

    public CircularlyAccessibleValueObject[] getChildrenVO() {
        return this.obj.getChildrenVO();
    }

    protected <T> T getHeadAttrValue(String fieldCode) {
        return (T)this.getParentVO().getAttributeValue(fieldCode);
    }

    protected <T> List<T> getItemAttrValue(String fieldCode) {
        CircularlyAccessibleValueObject[] childrenVO = this.getChildrenVO();
        ArrayList<Object> list = new ArrayList<Object>();
        for (CircularlyAccessibleValueObject vo : childrenVO) {
            list.add(this.getItemAttrValue(vo, fieldCode));
        }
        return list;
    }

    public Object getItemAttrValue(CircularlyAccessibleValueObject vo, String fieldCode) {
        if (fieldCode == null) {
            return null;
        }
        return vo.getAttributeValue(fieldCode);
    }

    public AggregatedValueObject getObj() {
        return this.obj;
    }

    public void setObj(AggregatedValueObject obj) {
        this.obj = obj;
    }

    public UFBoolean isSettleAccounts() throws BusinessException {
        String[] period = FipubTools.querySettledPeriod((String)((String)this.getHeadAttrValue("pk_org")), (String)this.getModuleCode((Integer)this.getHeadAttrValue("syscode")));
        if (null != period && period[0].length() > 0) {
            return UFBoolean.TRUE;
        }
        return UFBoolean.FALSE;
    }

    public String getModuleCode(Integer syscode) {
        String codes = null;
        if (syscode == 0) {
            codes = "2006";
        } else if (syscode == 1) {
            codes = "2008";
        }
        return codes;
    }
}

