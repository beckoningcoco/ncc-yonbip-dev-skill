/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.compiler.PfParameterVO
 */
package nc.bs.arap.validator;

import nc.vo.arap.billstatus.ARAPBillStatus;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.compiler.PfParameterVO;

public class BillStatusUNValidator {
    public void validateUNCommitStatus(PfParameterVO pfparametervo) throws BusinessException {
        AggregatedValueObject[] obj;
        for (AggregatedValueObject aggvo : obj = pfparametervo.m_preValueVos) {
            CircularlyAccessibleValueObject parentVO = aggvo.getParentVO();
            if (null == parentVO) continue;
            Integer billStatus = (Integer)parentVO.getAttributeValue("billstatus");
            Integer approvestatus = (Integer)parentVO.getAttributeValue("approvestatus");
            Integer n = approvestatus = approvestatus == null ? BillEnumCollection.ApproveStatus.NOSTATE.VALUE : approvestatus;
            if (billStatus.intValue() == ARAPBillStatus.TEMPSAVE.VALUE.intValue()) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0694"));
            }
            if (pfparametervo.is_unsave_noflow || approvestatus.intValue() != BillEnumCollection.ApproveStatus.NOSTATE.VALUE.intValue()) continue;
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0696"));
        }
    }

    public void validateUNApproveStatus(PfParameterVO pfparametervo) throws BusinessException {
        AggregatedValueObject[] obj;
        for (AggregatedValueObject aggvo : obj = pfparametervo.m_preValueVos) {
            CircularlyAccessibleValueObject parentVO = aggvo.getParentVO();
            if (null == parentVO) continue;
            Integer billStatus = (Integer)parentVO.getAttributeValue("billstatus");
            Integer approvestatus = (Integer)parentVO.getAttributeValue("approvestatus");
            Integer n = approvestatus = approvestatus == null ? BillEnumCollection.ApproveStatus.NOSTATE.VALUE : approvestatus;
            if (billStatus.intValue() == ARAPBillStatus.TEMPSAVE.VALUE.intValue()) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0755"));
            }
            if (!pfparametervo.is_unsave_noflow && approvestatus.intValue() == BillEnumCollection.ApproveStatus.COMMIT.VALUE.intValue()) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0757"));
            }
            if (pfparametervo.is_unsave_noflow && approvestatus.intValue() == BillEnumCollection.ApproveStatus.COMMIT.VALUE.intValue()) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0760"));
            }
            if (approvestatus.intValue() != BillEnumCollection.ApproveStatus.NOSTATE.VALUE.intValue()) continue;
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0756"));
        }
    }
}

