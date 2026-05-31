/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.pubitf.para.SysInitQuery
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.validator;

import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.pubitf.para.SysInitQuery;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;

public class CooperateBillDelValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            if (null == this.getParentVO() || this.canDelCooperateBill((BaseAggVO)aggvo)) continue;
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0078"));
        }
        return null;
    }

    private boolean canDelCooperateBill(BaseAggVO aggvo) {
        BaseBillVO headVO = aggvo.getHeadVO();
        return headVO.getSrc_syscode().intValue() != BillEnumCollection.FromSystem.XTDJ.VALUE.intValue() || this.arp20(headVO);
    }

    private boolean arp20(BaseBillVO headVO) {
        UFBoolean flag = UFBoolean.FALSE;
        try {
            boolean exp = headVO.getSyscode().intValue() == BillEnumCollection.FromSystem.AR.VALUE.intValue() || ArapBillPubUtil.isARSysBilltype(headVO.getPk_billtype());
            flag = SysInitQuery.getParaBoolean((String)headVO.getPk_org(), (String)(exp ? "AR20" : SysinitConst.AP20));
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        return flag.booleanValue();
    }
}

