/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.compiler.PfParameterVO
 *  nccloud.pubitf.arap.sagascheck.IArapRecBillSagasCheck
 *  nccloud.riart.crossservice.pf.ICrossServicePrepareFwdBusiCheck
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;
import nccloud.pubitf.arap.sagascheck.IArapRecBillSagasCheck;
import nccloud.riart.crossservice.pf.ICrossServicePrepareFwdBusiCheck;
import org.apache.commons.lang3.ArrayUtils;

public class N_F0_PreCheck_SAVE
implements ICrossServicePrepareFwdBusiCheck {
    public void runComPrepareCheck(PfParameterVO paraVo) throws BusinessException {
        Object[] bills = null;
        if (paraVo != null) {
            bills = paraVo.m_preValueVos;
            if (ArrayUtils.isEmpty((Object[])paraVo.m_preValueVos)) {
                return;
            }
        }
        ((IArapRecBillSagasCheck)NCLocator.getInstance().lookup(IArapRecBillSagasCheck.class)).billInsertSagasCheck((AggregatedValueObject[])bills);
    }
}

