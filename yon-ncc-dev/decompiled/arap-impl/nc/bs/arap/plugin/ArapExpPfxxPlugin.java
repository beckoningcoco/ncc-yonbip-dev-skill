/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.plugin.ArapExpPfxxValidater
 *  nc.bs.arap.util.ArapVOUtils
 *  nc.bs.arap.util.BillMoneyVUtils
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.pf.pub.PfDataCache
 *  nc.bs.pfxx.ISwapContext
 *  nc.bs.pfxx.plugin.AbstractPfxxPlugin
 *  nc.itf.arap.initgatheringbill.IArapInitGatheringService
 *  nc.itf.arap.initpayablebill.IArapInitPayableService
 *  nc.itf.arap.initpaybill.IArapInitPaybillService
 *  nc.itf.arap.initreceivable.IArapInitRecService
 *  nc.itf.uap.pf.IPFConfig
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.pubitf.arap.bill.IArapBillPubService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.gathering.AggGatheringBillVO
 *  nc.vo.arap.pay.AggPayBillVO
 *  nc.vo.arap.payable.AggPayableBillVO
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.pub.BillEnumCollection$FromSystem
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pfxx.auxiliary.AggxsysregisterVO
 *  nc.vo.pfxx.util.PfxxPluginUtils
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.workflownote.WorkflownoteVO
 *  nc.vo.pubapp.pflow.PfUserObject
 *  nc.vo.pubapp.util.NCPfServiceUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.plugin;

import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.plugin.ArapExpPfxxValidater;
import nc.bs.arap.util.ArapVOUtils;
import nc.bs.arap.util.BillMoneyVUtils;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.pf.pub.PfDataCache;
import nc.bs.pfxx.ISwapContext;
import nc.bs.pfxx.plugin.AbstractPfxxPlugin;
import nc.itf.arap.initgatheringbill.IArapInitGatheringService;
import nc.itf.arap.initpayablebill.IArapInitPayableService;
import nc.itf.arap.initpaybill.IArapInitPaybillService;
import nc.itf.arap.initreceivable.IArapInitRecService;
import nc.itf.uap.pf.IPFConfig;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.accperiod.AccountCalendar;
import nc.pubitf.arap.bill.IArapBillPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.gathering.AggGatheringBillVO;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pfxx.auxiliary.AggxsysregisterVO;
import nc.vo.pfxx.util.PfxxPluginUtils;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.workflownote.WorkflownoteVO;
import nc.vo.pubapp.pflow.PfUserObject;
import nc.vo.pubapp.util.NCPfServiceUtils;
import nccloud.commons.lang.StringUtils;

public class ArapExpPfxxPlugin<T extends BaseAggVO>
extends AbstractPfxxPlugin {
    private PfUserObject[] userObjs;

    protected Object processBill(Object vo, ISwapContext swapContext, AggxsysregisterVO aggxsysvo) throws BusinessException {
        BaseAggVO newBill = null;
        BaseAggVO bill = (BaseAggVO)vo;
        BaseBillVO head = this.setHeaderDefault(bill.getHeadVO());
        if (head.getPk_billtype() == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0316"));
        }
        if (!(head.getPk_billtype().equals("F0") || head.getPk_billtype().equals("F1") || head.getPk_billtype().equals("F2") || head.getPk_billtype().equals("F3"))) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0650"));
        }
        if (head.getPk_tradetype() == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0649"));
        }
        if (head.getPk_group() == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0317"));
        }
        if (head.getPk_org() == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0318"));
        }
        try {
            IPFConfig ipf = (IPFConfig)NCLocator.getInstance().lookup(IPFConfig.class);
            if (!StringUtils.isEmpty((CharSequence)head.getPk_billtype()) && !StringUtils.isEmpty((CharSequence)head.getPk_tradetype())) {
                String pk_busitype;
                if (head.getCreator() == null) {
                    head.setCreator(InvocationInfoProxy.getInstance().getUserId());
                }
                if ((pk_busitype = ipf.retBusitypeCanStart(head.getPk_billtype(), head.getPk_tradetype(), head.getPk_org(), head.getCreator())) == null) {
                    throw new BusinessException("busitype is null");
                }
                head.setPk_busitype(pk_busitype);
            }
        }
        catch (Exception e) {
            String msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0127") + head.getPk_tradetype() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0239") + head.getPk_tradetype() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0240");
            throw new BusinessRuntimeException(msg);
        }
        if (head.getIsinit().booleanValue()) {
            boolean isAr = ArapBillPubUtil.isARSysBilltype((String)head.getPk_billtype());
            UFDate billdate = ArapBillPubUtil.getArapCreateDate((boolean)isAr, (String)head.getPk_org());
            if (null == billdate) {
                throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0007"));
            }
            if (head.getBilldate().after(billdate)) {
                head.setBilldate(billdate);
                for (BaseItemVO item : (BaseItemVO[])bill.getChildrenVO()) {
                    item.setBilldate(billdate);
                }
            }
        }
        this.setBodyDefault(head, (BaseItemVO[])bill.getChildrenVO());
        BillMoneyVUtils.sumBodyToHead((BaseBillVO)head, (BaseItemVO[])((BaseItemVO[])bill.getChildrenVO()));
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
        ArapExpPfxxValidater.getInstance().validate(bill);
        ArapVOUtils.validateVoCopyRed((BaseAggVO)bill);
        head.setBillno(null);
        newBill = head.getIsinit().booleanValue() ? this.insertInitBill(bill) : this.insertBill(bill);
        String pk = null;
        if (newBill != null) {
            pk = newBill.getParent().getPrimaryKey();
        }
        if (oldPk != null) {
            PfxxPluginUtils.deleteIDvsPKByDocPK((String)oldPk);
        }
        PfxxPluginUtils.addDocIDVsPKContrast((String)swapContext.getBilltype(), (String)swapContext.getDocID(), (String)pk);
        return pk;
    }

    private BaseAggVO insertBill(BaseAggVO bill) throws BusinessException {
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

    public PfUserObject[] getUserObj() {
        if (this.userObjs == null) {
            this.userObjs = new PfUserObject[]{new PfUserObject()};
        }
        return this.userObjs;
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

    private BaseBillVO setHeaderDefault(BaseBillVO header) throws BusinessException {
        Integer ZERO = 0;
        header.setBillstatus(BillEnumCollection.BillSatus.SAVE.VALUE);
        header.setEffectstatus(BillEnumCollection.InureSign.NOINURE.VALUE);
        header.setDr(ZERO);
        header.setSrc_syscode(BillEnumCollection.FromSystem.WBJHPT.VALUE);
        header.setCreationtime(new UFDateTime());
        header.setCoordflag(null);
        try {
            AccountCalendar ac = AccountCalendar.getInstanceByPk_org((String)header.getPk_org());
            ac.setDate(header.getBilldate());
            header.setBillyear(ac.getYearVO().getPeriodyear());
            header.setBillperiod(ac.getMonthVO().getAccperiodmth());
        }
        catch (BusinessException ex) {
            Logger.error((Object)ex.getMessage(), (Throwable)ex);
        }
        header.setPk_tradetypeid(PfDataCache.getBillTypeInfo((String)header.getPk_group(), (String)header.getPk_tradetype()).getPk_billtypeid());
        return header;
    }

    void setBodyDefault(BaseBillVO head, BaseItemVO[] items) throws BusinessException {
        int len = items == null ? 0 : items.length;
        for (int i = 0; i < len; ++i) {
            this.setBodyDefault(head, items[i]);
        }
    }

    void setBodyDefault(BaseBillVO head, BaseItemVO item) throws BusinessException {
        item.setPk_org(head.getPk_org());
        item.setDr(Integer.valueOf(0));
        item.setPk_tradetypeid(PfDataCache.getBillTypeInfo((String)head.getPk_group(), (String)head.getPk_tradetype()).getPk_billtypeid());
        item.setCoordflag(null);
    }
}

