/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.pubitf.cmp.paybill.ICmpPayBillPubQueryService
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.validator;

import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.pubitf.cmp.paybill.ICmpPayBillPubQueryService;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;

public class CmpPayBillExsitValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            CircularlyAccessibleValueObject[] childrenVOs = this.getChildrenVO();
            BaseItemVO itemvo = (BaseItemVO)childrenVOs[0];
            String src_billtype = itemvo.getSrc_billtype();
            if (!"21".equals(src_billtype)) continue;
            try {
                boolean isexist = ((ICmpPayBillPubQueryService)NCLocator.getInstance().lookup(ICmpPayBillPubQueryService.class)).isExistBillByPuOrderPk(itemvo.getSrc_billid());
                if (!isexist) continue;
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1252"));
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
                return new ValidationFailure(e.getMessage());
            }
        }
        return null;
    }

    @Override
    public UFBoolean checkObj(Object obj) {
        if (null != obj && obj instanceof AggregatedValueObject[]) {
            AggregatedValueObject[] aggVOs = (AggregatedValueObject[])obj;
            boolean isCmpEnable = ARAPModuleEnableUtil.isCMPEnable((String)aggVOs[0].getParentVO().getAttributeValue("pk_group"));
            if (isCmpEnable) {
                return UFBoolean.TRUE;
            }
            return UFBoolean.FALSE;
        }
        return UFBoolean.FALSE;
    }
}

