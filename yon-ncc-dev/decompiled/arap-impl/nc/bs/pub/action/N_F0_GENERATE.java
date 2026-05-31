/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.ArapBillGenerateUtil
 *  nc.bs.pub.compiler.AbstractCompiler2
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.compiler.PfParameterVO
 */
package nc.bs.pub.action;

import nc.bs.arap.util.ArapBillGenerateUtil;
import nc.bs.pub.compiler.AbstractCompiler2;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;

public class N_F0_GENERATE
extends AbstractCompiler2 {
    public Object runComClass(PfParameterVO paraVo) throws BusinessException {
        AggregatedValueObject bill = paraVo.m_preValueVo;
        boolean frontflag = false;
        if (paraVo.getCustomProperty("ArapIsFromFront") != null) {
            frontflag = (Boolean)paraVo.getCustomProperty("ArapIsFromFront");
        }
        try {
            bill = ArapBillGenerateUtil.validateGenerateBill((AggregatedValueObject)bill);
        }
        catch (BusinessException e) {
            if (frontflag) {
                throw new BusinessException(e.getMessage());
            }
            bill.getParentVO().setAttributeValue("driveaction", (Object)"N");
            return bill;
        }
        return bill;
    }
}

