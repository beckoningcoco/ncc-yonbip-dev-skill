/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.pub.IArapBillService
 *  nc.itf.cmp.settlement.ISettlementQueryService
 *  nc.vo.cmp.settlement.SettlementAggVO
 *  nc.vo.cmp.settlement.SettlementHeadVO
 *  nc.vo.pub.BusinessException
 *  nccloud.pubitf.arap.arappub.IGetArapVOsByCmpSrcService
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.pub.IArapBillService;
import nc.itf.cmp.settlement.ISettlementQueryService;
import nc.vo.cmp.settlement.SettlementAggVO;
import nc.vo.cmp.settlement.SettlementHeadVO;
import nc.vo.pub.BusinessException;
import nccloud.pubitf.arap.arappub.IGetArapVOsByCmpSrcService;

public class GetArapVOsByCmpSrcServiceImpl
implements IGetArapVOsByCmpSrcService {
    public Object[] getArapVOs(String pk_src, String billType) throws BusinessException {
        ArrayList<String> srcBillPks = new ArrayList<String>();
        ISettlementQueryService settleQueryService = (ISettlementQueryService)NCLocator.getInstance().lookup(ISettlementQueryService.class);
        SettlementAggVO[] settleAggVOs = settleQueryService.querySettlementAggsByPk_ftsbill(pk_src);
        if (settleAggVOs != null && settleAggVOs.length > 0) {
            for (SettlementAggVO settleAggVO : settleAggVOs) {
                SettlementHeadVO headVO = (SettlementHeadVO)settleAggVO.getParentVO();
                if (headVO.getPk_busibill() == null || headVO.getPk_busibill().length() == 0) continue;
                srcBillPks.add(headVO.getPk_busibill());
            }
        }
        String[] pk_bills = srcBillPks.toArray(new String[0]);
        IArapBillService service = (IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class);
        return service.queryArapBillByPKs(pk_bills, billType);
    }
}

