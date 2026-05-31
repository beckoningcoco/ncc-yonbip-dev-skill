/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.pcm.contract.pub.IContractService
 *  nc.vo.pcm.consts.SummaryForArapConst
 *  nc.vo.pcm.contract.ContrHeadVO
 *  nc.vo.pcm.contractbalance.ContractBalanceHeadVO
 *  nc.vo.pf.change.ChangeVOAdjustContext
 *  nc.vo.pm.proxy.PMProxy
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.payable.vochange;

import java.util.Map;
import nc.itf.pcm.contract.pub.IContractService;
import nc.vo.arap.payable.PayableBillItemVO;
import nc.vo.arap.payable.PayableBillVO;
import nc.vo.arap.payable.vochange.ArapF1VOChange;
import nc.vo.pcm.consts.SummaryForArapConst;
import nc.vo.pcm.contract.ContrHeadVO;
import nc.vo.pcm.contractbalance.ContractBalanceHeadVO;
import nc.vo.pf.change.ChangeVOAdjustContext;
import nc.vo.pm.proxy.PMProxy;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public class Arap4D50ToF1VOChange
extends ArapF1VOChange {
    private IContractService iContractService;

    public AggregatedValueObject[] batchAdjustAfterChange(AggregatedValueObject[] srcVOs, AggregatedValueObject[] destVOs, ChangeVOAdjustContext adjustContext) throws BusinessException {
        if (srcVOs != null && destVOs != null) {
            String[] pk_contrs = new String[srcVOs.length];
            for (int i = 0; i < srcVOs.length; ++i) {
                pk_contrs[i] = (String)srcVOs[i].getParentVO().getAttributeValue("pk_contr");
            }
            Map pkToHeadVOMap = this.getService().queryContrHeadVOByPK(pk_contrs);
            for (int i = 0; i < destVOs.length; ++i) {
                ContractBalanceHeadVO srcHeadVO = (ContractBalanceHeadVO)srcVOs[i].getParentVO();
                PayableBillVO headVO = (PayableBillVO)destVOs[i].getParentVO();
                PayableBillItemVO[] bodyVOs = (PayableBillItemVO[])destVOs[i].getChildrenVO();
                String pk_contr = (String)srcHeadVO.getAttributeValue("pk_contr");
                String bill_code = (String)((ContrHeadVO)pkToHeadVOMap.get(pk_contr)).getAttributeValue("bill_code");
                for (PayableBillItemVO bodyVO : bodyVOs) {
                    bodyVO.setSupplier(headVO.getSupplier());
                    bodyVO.setContractno(bill_code);
                    if (SummaryForArapConst.CONTR_BAL_PAY.equals(bodyVO.getScomment())) {
                        bodyVO.setSrc_billid(null);
                        bodyVO.setOccupationmny(bodyVO.getMoney_cr());
                        continue;
                    }
                    if (SummaryForArapConst.CONTR_BAL_EXPE.equals(bodyVO.getScomment())) {
                        bodyVO.setSrc_billid(srcHeadVO.getPk_contr());
                        bodyVO.setOccupationmny(UFDouble.ZERO_DBL);
                        continue;
                    }
                    if (!SummaryForArapConst.CONTR_BAL_QUAL.equals(bodyVO.getScomment())) continue;
                    bodyVO.setSrc_itemid(null);
                    bodyVO.setSrc_billid(null);
                    bodyVO.setOccupationmny(bodyVO.getMoney_cr());
                }
            }
        }
        return super.batchAdjustAfterChange(srcVOs, destVOs, adjustContext);
    }

    protected boolean isFillRate() {
        return true;
    }

    private IContractService getService() {
        this.iContractService = (IContractService)PMProxy.lookup(IContractService.class);
        return this.iContractService;
    }
}

