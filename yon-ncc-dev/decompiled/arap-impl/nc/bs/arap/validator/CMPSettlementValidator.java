/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.cmp.settlement.SettleEnumCollection$OperateType
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.pubitf.cmp.settlementmanegement.ISettlementValidateService
 */
package nc.bs.arap.validator;

import nc.bs.arap.util.BillSettlementUtils;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.cmp.settlement.SettleEnumCollection;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.lang.UFBoolean;
import nccloud.pubitf.cmp.settlementmanegement.ISettlementValidateService;

public class CMPSettlementValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (this.checkObj(obj).booleanValue()) {
            String pk_billtype = (String)((AggregatedValueObject[])obj)[0].getParentVO().getAttributeValue("pk_billtype");
            String pk_group = InvocationInfoProxy.getInstance().getGroupId();
            if (("F2".equals(pk_billtype) || "F3".equals(pk_billtype)) && ARAPModuleEnableUtil.isCMPEnable(pk_group)) {
                try {
                    ((ISettlementValidateService)NCLocator.getInstance().lookup(ISettlementValidateService.class)).validate(BillSettlementUtils.settleInfo4Insert((AggregatedValueObject[])((AggregatedValueObject[])obj), (SettleEnumCollection.OperateType)SettleEnumCollection.OperateType.ADD));
                }
                catch (BusinessException e) {
                    throw new BusinessRuntimeException(e.getMessage());
                }
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

