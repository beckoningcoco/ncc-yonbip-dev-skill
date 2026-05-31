/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.validator;

import java.util.List;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;

public class EffectStatusValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            if (null == this.getParentVO()) continue;
            Object isinit = this.getHeadAttrValue("isinit");
            if (null != isinit && UFBoolean.TRUE.equals(isinit)) {
                return null;
            }
            Object value = this.getHeadAttrValue("effectstatus");
            if (null != value && 10 == (Integer)value) {
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0083"));
            }
            String top_billType = (String)this.getItemAttrValue(this.getChildrenVO()[0], "top_billtype");
            if (!"23E0".equals(top_billType) && !"23E1".equals(top_billType)) continue;
            String topBillID = (String)this.getItemAttrValue(this.getChildrenVO()[0], "top_billid");
            StringBuffer exceptionMsg = "23E0".equals(top_billType) ? new StringBuffer(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006est_0", "02006est-0002")) : new StringBuffer(NCLangRes4VoTransl.getNCLangRes().getStrByID("2008est_0", "02008est-0000"));
            return this.checkTopBilleffectStatus(top_billType, topBillID, exceptionMsg);
        }
        return null;
    }

    private ValidationFailure checkTopBilleffectStatus(String top_billType, String topBillID, StringBuffer exceptionMsg) {
        try {
            List<BaseBillVO> bill = ArapBillDAO.getInstance().queryParentVOByPKs(new String[]{topBillID}, top_billType);
            if (bill == null || bill.size() == 0) {
                return null;
            }
            BaseBillVO baseBillVO = bill.get(0);
            Object topBillEffectStatus = baseBillVO.getAttributeValue("effectstatus");
            if (!BillEnumCollection.InureSign.OKINURE.VALUE.equals(topBillEffectStatus)) {
                return new ValidationFailure(exceptionMsg.append(baseBillVO.getAttributeValue("billno") + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006est_0", "02006est-0003")).toString());
            }
        }
        catch (BusinessException e) {
            ExceptionHandler.handleRuntimeException((Exception)((Object)e));
        }
        return null;
    }
}

