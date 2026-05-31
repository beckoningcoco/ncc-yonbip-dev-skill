/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.initbill.IInitBillCloseService
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.initclose;

import nc.bs.framework.common.NCLocator;
import nc.itf.arap.initbill.IInitBillCloseService;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;

public class InitCloseCtrlBO {
    public void checkIsInitClose(AggregatedValueObject bill) throws BusinessException {
        if (bill == null) {
            return;
        }
        BaseBillVO head = (BaseBillVO)bill.getParentVO();
        UFBoolean isinit = head.getIsinit();
        if (isinit == null || !isinit.booleanValue()) {
            return;
        }
        String billtype = head.getPk_billtype();
        String pk_org = head.getPk_org();
        String moduleCode = this.getSysCodeByBillType(billtype);
        if (((IInitBillCloseService)NCLocator.getInstance().lookup(IInitBillCloseService.class)).isInitBillClosed(moduleCode, pk_org)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0264"));
        }
    }

    private String getSysCodeByBillType(String billtype) {
        if ("F0".equals(billtype)) {
            return String.valueOf(ArapConstant.ARAP_FUNCODE_RECBILL_I);
        }
        if ("F1".equals(billtype)) {
            return String.valueOf(ArapConstant.ARAP_FUNCODE_PAYABLEBILL_I);
        }
        if ("F2".equals(billtype)) {
            return String.valueOf(ArapConstant.ARAP_FUNCODE_GATHERBILL_I);
        }
        if ("F3".equals(billtype)) {
            return String.valueOf(ArapConstant.ARAP_FUNCODE_PAYBILL_I);
        }
        return null;
    }
}

