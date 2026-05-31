/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pfxx.ISwapContext
 *  nc.itf.arap.initgatheringbill.IArapInitGatheringService
 *  nc.itf.arap.initpayablebill.IArapInitPayableService
 *  nc.itf.arap.initpaybill.IArapInitPaybillService
 *  nc.itf.arap.initreceivable.IArapInitRecService
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.arap.bill.IArapBillPubService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.gathering.AggGatheringBillVO
 *  nc.vo.arap.pay.AggPayBillVO
 *  nc.vo.arap.payable.AggPayableBillVO
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pfxx.util.PfxxPluginUtils
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.workflownote.WorkflownoteVO
 *  nc.vo.pubapp.pflow.PfUserObject
 *  nc.vo.pubapp.util.NCPfServiceUtils
 *  nccloud.pubitf.arap.arappub.IImportBillService
 */
package nccloud.pubimpl.arap.arappub;

import nc.bs.framework.common.NCLocator;
import nc.bs.pfxx.ISwapContext;
import nc.itf.arap.initgatheringbill.IArapInitGatheringService;
import nc.itf.arap.initpayablebill.IArapInitPayableService;
import nc.itf.arap.initpaybill.IArapInitPaybillService;
import nc.itf.arap.initreceivable.IArapInitRecService;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.arap.bill.IArapBillPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.gathering.AggGatheringBillVO;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pfxx.util.PfxxPluginUtils;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.workflownote.WorkflownoteVO;
import nc.vo.pubapp.pflow.PfUserObject;
import nc.vo.pubapp.util.NCPfServiceUtils;
import nccloud.pubitf.arap.arappub.IImportBillService;

public class ArapImportBillServiceImpl
implements IImportBillService {
    public boolean queryBillPKBeforeSaveOrUpdate(BaseBillVO head, ISwapContext swapContext) throws BusinessException {
        String oldPk = PfxxPluginUtils.queryBillPKBeforeSaveOrUpdate((String)swapContext.getBilltype(), (String)swapContext.getDocID());
        if (oldPk != null) {
            if (swapContext.getReplace().equalsIgnoreCase("N")) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0319"));
            }
            BaseAggVO preVO = null;
            if (head.getPk_billtype().equals("F2")) {
                preVO = (BaseAggVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(AggGatheringBillVO.class, oldPk, false);
            } else if (head.getPk_billtype().equals("F3")) {
                preVO = (BaseAggVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(AggPayBillVO.class, oldPk, false);
            } else if (head.getPk_billtype().equals("F0")) {
                preVO = (BaseAggVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(AggReceivableBillVO.class, oldPk, false);
            } else if (head.getPk_billtype().equals("F1")) {
                preVO = (BaseAggVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(AggPayableBillVO.class, oldPk, false);
            }
            if (preVO != null && preVO.getParentVO() != null) {
                if (((BaseBillVO)preVO.getParentVO()).getBillstatus() == null) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0320"));
                }
                if (((BaseBillVO)preVO.getParentVO()).getBillstatus() == BillEnumCollection.BillSatus.AUDIT.VALUE) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0321"));
                }
                if (head.getIsinit().booleanValue()) {
                    this.deleteInitBill(preVO);
                } else {
                    ((IArapBillPubService)NCLocator.getInstance().lookup(IArapBillPubService.class)).delete(preVO);
                }
            }
        }
        return false;
    }

    public boolean importBill(BaseBillVO head, BaseAggVO bill) throws BusinessException {
        head.setBillno(null);
        if (head.getIsinit().booleanValue()) {
            this.insertInitBill(bill);
        } else {
            this.insertBill(bill);
        }
        return false;
    }

    private void deleteInitBill(BaseAggVO bill) throws BusinessException {
        if (bill.getHeadVO().getPk_billtype().equals("F0")) {
            ((IArapInitRecService)NCLocator.getInstance().lookup(IArapInitRecService.class)).delete(bill);
        } else if (bill.getHeadVO().getPk_billtype().equals("F1")) {
            ((IArapInitPayableService)NCLocator.getInstance().lookup(IArapInitPayableService.class)).delete(bill);
        } else if (bill.getHeadVO().getPk_billtype().equals("F2")) {
            ((IArapInitGatheringService)NCLocator.getInstance().lookup(IArapInitGatheringService.class)).delete(bill);
        } else if (bill.getHeadVO().getPk_billtype().equals("F3")) {
            ((IArapInitPaybillService)NCLocator.getInstance().lookup(IArapInitPaybillService.class)).delete(bill);
        }
    }

    private BaseAggVO insertInitBill(BaseAggVO bill) throws BusinessException {
        BaseAggVO res = null;
        if (bill.getHeadVO().getPk_billtype().equals("F0")) {
            res = ((IArapInitRecService)NCLocator.getInstance().lookup(IArapInitRecService.class)).save(bill);
        } else if (bill.getHeadVO().getPk_billtype().equals("F1")) {
            res = ((IArapInitPayableService)NCLocator.getInstance().lookup(IArapInitPayableService.class)).save(bill);
        } else if (bill.getHeadVO().getPk_billtype().equals("F2")) {
            res = ((IArapInitGatheringService)NCLocator.getInstance().lookup(IArapInitGatheringService.class)).save(bill);
        } else if (bill.getHeadVO().getPk_billtype().equals("F3")) {
            res = ((IArapInitPaybillService)NCLocator.getInstance().lookup(IArapInitPaybillService.class)).save(bill);
        }
        return res;
    }

    private AggregatedValueObject insertBill(BaseAggVO bill) throws BusinessException {
        AggReceivableBillVO res = null;
        if (bill.getHeadVO().getPk_billtype().equals("F0")) {
            res = (AggReceivableBillVO)ArrayUtil.getFirstInArrays((Object[])((Object[])NCPfServiceUtils.processBatch((String)"SAVE", (String)bill.getHeadVO().getPk_billtype(), (AggregatedValueObject[])new AggReceivableBillVO[]{(AggReceivableBillVO)bill}, (Object[])this.getUserObj(), (WorkflownoteVO)new WorkflownoteVO())));
        } else if (bill.getHeadVO().getPk_billtype().equals("F1")) {
            res = (AggPayableBillVO)ArrayUtil.getFirstInArrays((Object[])((Object[])NCPfServiceUtils.processBatch((String)"SAVE", (String)bill.getHeadVO().getPk_billtype(), (AggregatedValueObject[])new AggPayableBillVO[]{(AggPayableBillVO)bill}, (Object[])this.getUserObj(), (WorkflownoteVO)new WorkflownoteVO())));
        } else if (bill.getHeadVO().getPk_billtype().equals("F2")) {
            res = (AggGatheringBillVO)ArrayUtil.getFirstInArrays((Object[])((Object[])NCPfServiceUtils.processBatch((String)"SAVE", (String)bill.getHeadVO().getPk_billtype(), (AggregatedValueObject[])new AggGatheringBillVO[]{(AggGatheringBillVO)bill}, (Object[])this.getUserObj(), (WorkflownoteVO)new WorkflownoteVO())));
        } else if (bill.getHeadVO().getPk_billtype().equals("F3")) {
            res = (AggPayBillVO)ArrayUtil.getFirstInArrays((Object[])((Object[])NCPfServiceUtils.processBatch((String)"SAVE", (String)bill.getHeadVO().getPk_billtype(), (AggregatedValueObject[])new AggPayBillVO[]{(AggPayBillVO)bill}, (Object[])this.getUserObj(), (WorkflownoteVO)new WorkflownoteVO())));
        }
        return res;
    }

    public PfUserObject[] getUserObj() {
        PfUserObject[] userObjs = new PfUserObject[]{new PfUserObject()};
        return userObjs;
    }
}

