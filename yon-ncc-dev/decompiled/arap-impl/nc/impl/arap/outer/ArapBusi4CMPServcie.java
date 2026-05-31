/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.BillDeleteBatchBSAction
 *  nc.bs.arap.actions.BillEffectBatchBSAction
 *  nc.bs.arap.actions.BillSignBatchBSAction
 *  nc.bs.arap.actions.BillTmpDelBthBSAction
 *  nc.bs.arap.actions.BillUnEffectBatchBSAction
 *  nc.bs.arap.actions.BillUnSignBatchBSAction
 *  nc.bs.arap.bill.ArapBillBO
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.bd.util.DBAUtil
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Log
 *  nc.bs.pf.pub.PfDataCache
 *  nc.bs.sscrp.rpbill.util.RPBillConvertUtil
 *  nc.impl.pubapp.env.BSContext
 *  nc.itf.arap.bill.IArapBillBaseService
 *  nc.itf.arap.bill.IArapBillQueryBaseService
 *  nc.itf.arap.pay.IArapPayBillService
 *  nc.itf.cmp.busi.IBusi4CMPServcie
 *  nc.itf.cmp.busi.ISettleNotifyPayTypeBusiBillService
 *  nc.itf.cmp.busi.ISettleNotifyReceiveTypeBusiBillService
 *  nc.itf.fi.pub.SysInit
 *  nc.itf.fts.innertransfer.IInnerTransferQueryService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.cache.FiPubDataCache
 *  nc.vo.arap.djlx.DjLXVO
 *  nc.vo.arap.global.ArapBillVOConsts
 *  nc.vo.arap.pay.PayBillItemVO
 *  nc.vo.arap.pay.PayBillVO
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.pub.BillEnumCollection$CommissionPayStatus
 *  nc.vo.arap.pub.BillEnumCollection$CommissionPayType
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.arap.pub.BillEnumCollection$PayStatus
 *  nc.vo.arap.pub.BillEnumCollection$SettlementState
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.cmp.BusiInfo
 *  nc.vo.cmp.BusiStateTrans
 *  nc.vo.cmp.BusiStatus
 *  nc.vo.cmp.CMPExecStatus
 *  nc.vo.cmp.NetPayExecInfo
 *  nc.vo.cmp.ReturnBill4BusiVO
 *  nc.vo.cmp.ReturnBillRetDetail
 *  nc.vo.cmp.bill.BillUtils
 *  nc.vo.cmp.fts.MoneyDetail
 *  nc.vo.cmp.settlement.SettlementAggVO
 *  nc.vo.cmp.settlement.SettlementBodyVO
 *  nc.vo.cmp.settlement.SettlementHeadVO
 *  nc.vo.cmp.settlement.batch.BusiStateChangeVO
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.fts.innertransfer.AggInnerTransferVO
 *  nc.vo.fts.innertransfer.InnerTransferVO
 *  nc.vo.fts.innertransfer.util.AggInnerTransferToSettleVOUtil
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.sscrp.rpbill.AggRPBillVO
 *  nccloud.bs.arap.sagas.util.SagasUtils
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 *  nccloud.itf.arap.sagas.compensate.itface.ISettleSagasCompensateService
 *  nccloud.pubitf.sscrp.rpbill.IRPBillQueryService
 *  nccloud.pubitf.sscrp.rpbill.IRPBillService
 *  nccloud.pubitf.sscrp.rpbill.IRPBillSyncService
 */
package nc.impl.arap.outer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import nc.bs.arap.actions.BillDeleteBatchBSAction;
import nc.bs.arap.actions.BillEffectBatchBSAction;
import nc.bs.arap.actions.BillSignBatchBSAction;
import nc.bs.arap.actions.BillTmpDelBthBSAction;
import nc.bs.arap.actions.BillUnEffectBatchBSAction;
import nc.bs.arap.actions.BillUnSignBatchBSAction;
import nc.bs.arap.actions.CommGatheringBSAction;
import nc.bs.arap.actions.CommPayAndGatherBSAction;
import nc.bs.arap.actions.NetPayBSAction;
import nc.bs.arap.bill.ArapBillBO;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.bd.util.DBAUtil;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Log;
import nc.bs.pf.pub.PfDataCache;
import nc.bs.sscrp.rpbill.util.RPBillConvertUtil;
import nc.impl.pubapp.env.BSContext;
import nc.itf.arap.bill.IArapBillBaseService;
import nc.itf.arap.bill.IArapBillQueryBaseService;
import nc.itf.arap.pay.IArapPayBillService;
import nc.itf.cmp.busi.IBusi4CMPServcie;
import nc.itf.cmp.busi.ISettleNotifyPayTypeBusiBillService;
import nc.itf.cmp.busi.ISettleNotifyReceiveTypeBusiBillService;
import nc.itf.fi.pub.SysInit;
import nc.itf.fts.innertransfer.IInnerTransferQueryService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.cache.FiPubDataCache;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.arap.global.ArapBillVOConsts;
import nc.vo.arap.pay.PayBillItemVO;
import nc.vo.arap.pay.PayBillVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.cmp.BusiInfo;
import nc.vo.cmp.BusiStateTrans;
import nc.vo.cmp.BusiStatus;
import nc.vo.cmp.CMPExecStatus;
import nc.vo.cmp.NetPayExecInfo;
import nc.vo.cmp.ReturnBill4BusiVO;
import nc.vo.cmp.ReturnBillRetDetail;
import nc.vo.cmp.bill.BillUtils;
import nc.vo.cmp.fts.MoneyDetail;
import nc.vo.cmp.settlement.SettlementAggVO;
import nc.vo.cmp.settlement.SettlementBodyVO;
import nc.vo.cmp.settlement.SettlementHeadVO;
import nc.vo.cmp.settlement.batch.BusiStateChangeVO;
import nc.vo.fi.pub.SqlUtils;
import nc.vo.fts.innertransfer.AggInnerTransferVO;
import nc.vo.fts.innertransfer.InnerTransferVO;
import nc.vo.fts.innertransfer.util.AggInnerTransferToSettleVOUtil;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.sscrp.rpbill.AggRPBillVO;
import nccloud.bs.arap.sagas.util.SagasUtils;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;
import nccloud.itf.arap.sagas.compensate.itface.ISettleSagasCompensateService;
import nccloud.pubitf.sscrp.rpbill.IRPBillQueryService;
import nccloud.pubitf.sscrp.rpbill.IRPBillService;
import nccloud.pubitf.sscrp.rpbill.IRPBillSyncService;

public class ArapBusi4CMPServcie
implements IBusi4CMPServcie,
ISettleNotifyPayTypeBusiBillService,
ISettleNotifyReceiveTypeBusiBillService {
    private Integer oribillstatus = -20;

    public List<SettlementBodyVO> autoBX(List<SettlementBodyVO> bodyList) throws BusinessException {
        return bodyList;
    }

    public List<SettlementBodyVO> autoUsed(List<SettlementBodyVO> bodyList) throws BusinessException {
        return bodyList;
    }

    public void billChange(BusiInfo busiInfo, Map<String, MoneyDetail> value) throws BusinessException {
        new CommGatheringBSAction().billChange(busiInfo, value);
    }

    public void billStateChange(BusiInfo busiInfo, BusiStateTrans trans) throws BusinessException {
        BusiInfo[] busiInfoArr = new BusiInfo[]{busiInfo};
        this.billStateChange(busiInfoArr, trans);
    }

    public void billStateChange(BusiInfo[] busiInfos, BusiStateTrans trans) throws BusinessException {
        BaseAggVO vo = this.getBusiBillVO(busiInfos[0]);
        ArrayList<BaseAggVO> oriList = new ArrayList<BaseAggVO>();
        BaseBillVO parent = (BaseBillVO)vo.getParentVO();
        int status = -1;
        ArrayList<BaseAggVO> list = new ArrayList<BaseAggVO>();
        for (BusiInfo busiInfo : busiInfos) {
            BaseAggVO busiBillVO = this.getBusiBillVO(busiInfo);
            BaseAggVO orivo = (BaseAggVO)busiBillVO.clone();
            oriList.add(orivo);
            parent = (BaseBillVO)busiBillVO.getParentVO();
            if (BusiStatus.Sign.equals((Object)trans.getTo())) {
                status = 0;
                if (parent.getSettleflag() == null) {
                    parent.setSettleflag(BillEnumCollection.SettlementState.DEFAULT.VALUE);
                }
                parent.setSignuser(busiInfo.getOperator());
                parent.setSigndate(busiInfo.getOperatorDate());
                if (busiInfo.isSettle()) {
                    vo.setCashPlanCheck(UFBoolean.valueOf((!busiInfo.isHasZjjhCheck() ? 1 : 0) != 0));
                    vo.setBudgetCheck(UFBoolean.valueOf((!busiInfo.isBudgetCheck() ? 1 : 0) != 0));
                }
                if (BillEnumCollection.BillSatus.AUDIT.VALUE.equals(parent.getBillstatus())) {
                    parent.setBillstatus(BillEnumCollection.BillSatus.SIGN.VALUE);
                }
            } else if (BusiStatus.Sign.equals((Object)trans.getFrom())) {
                status = 1;
                if (BillEnumCollection.BillSatus.SIGN.VALUE.equals(parent.getBillstatus())) {
                    parent.setBillstatus(BillEnumCollection.BillSatus.AUDIT.VALUE);
                }
                parent.setSignyear(null);
                parent.setSignperiod(null);
                parent.setSignuser(null);
                parent.setSigndate(null);
            } else if (BusiStatus.Tempeorary.equals((Object)trans.getFrom()) && BusiStatus.Save.equals((Object)trans.getTo())) {
                status = 2;
                parent.setBillstatus(BillEnumCollection.BillSatus.TEMPEORARY.VALUE);
            } else if (BusiStatus.Save.equals((Object)trans.getFrom()) && BusiStatus.Tempeorary.equals((Object)trans.getTo())) {
                status = 3;
            }
            list.add(busiBillVO);
        }
        if (list.size() == 0) {
            return;
        }
        String oper = null;
        switch (status) {
            case 0: {
                oper = "sign";
                new BillSignBatchBSAction().updateVO((AggregatedValueObject[])list.toArray(ArrayUtil.newEmptyArrays(list)));
                break;
            }
            case 1: {
                oper = "unsign";
                new BillUnSignBatchBSAction().updateVO((AggregatedValueObject[])list.toArray(ArrayUtil.newEmptyArrays(list)));
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                break;
            }
        }
        if (!StringUtils.isEmpty((CharSequence)oper)) {
            SagasUtils.setBSContextSagaStage((String)"SAGACOMPENSTATEFLAGFORSIGN");
            SagasUtils.setCompensateService((String)oper, (AggregatedValueObject[])((AggregatedValueObject[])oriList.toArray(new BaseAggVO[0])));
        }
    }

    public boolean checkCancelEffect(BusiInfo info) throws BusinessException {
        return true;
    }

    public boolean checkCancelSign(BusiInfo info) throws BusinessException {
        return true;
    }

    public void coerceDelete(BusiInfo busiInfo) throws BusinessException {
        BaseAggVO vo = this.getBusiBillVO(busiInfo);
        if (null == vo) {
            return;
        }
        BaseBillVO parent = (BaseBillVO)vo.getParentVO();
        if (-99 == parent.getBillstatus()) {
            new BillTmpDelBthBSAction().deleteVOs(new AggregatedValueObject[]{vo});
        } else if (-1 == parent.getBillstatus()) {
            new BillDeleteBatchBSAction().deleteVOs((AggregatedValueObject[])new BaseAggVO[]{vo});
        }
        if (10 == parent.getEffectstatus()) {
            parent.setTransientFlag(ArapBillVOConsts.ACT_DELEFF_BILL);
        }
    }

    public void effectStateChange(BusiInfo busiInfo, BusiStateTrans trans) throws BusinessException {
        BusiInfo[] busiInfos = new BusiInfo[]{busiInfo};
        this.effectStateChange(busiInfos, trans);
    }

    public void effectStateChange(BusiInfo[] busiInfos, BusiStateTrans trans) throws BusinessException {
        if (null == busiInfos || busiInfos.length == 0) {
            return;
        }
        HashMap busiInfoMap = new HashMap();
        for (BusiInfo busiInfo : busiInfos) {
            String bill_type = busiInfo.getBill_type();
            if (busiInfoMap.containsKey(bill_type)) {
                ((List)busiInfoMap.get(bill_type)).add(busiInfo);
                continue;
            }
            ArrayList<BusiInfo> busiInfoList = new ArrayList<BusiInfo>();
            busiInfoList.add(busiInfo);
            busiInfoMap.put(bill_type, busiInfoList);
        }
        ArrayList<BaseAggVO> vos = new ArrayList<BaseAggVO>();
        for (String bill_type : busiInfoMap.keySet()) {
            vos.addAll(this.getBusiBillVOs((List)busiInfoMap.get(bill_type), bill_type));
        }
        if (null == vos || vos.size() == 0) {
            return;
        }
        BaseAggVO[] bills = new BaseAggVO[vos.size()];
        bills = vos.toArray(bills);
        boolean isAr = true;
        String cmpSysint = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0866");
        String SignaturesSuccess = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0866");
        SagasUtils.setBSContextSagaStage((String)"SAGACOMPENSTATEFLAG");
        if (BusiStatus.Effet == trans.getTo()) {
            ArrayList<BaseAggVO> effectVOs = new ArrayList<BaseAggVO>();
            for (BaseAggVO vo : bills) {
                BaseBillVO parent = (BaseBillVO)vo.getParentVO();
                String pkOrg = parent.getPk_org();
                Integer settleflag = parent.getSettleflag();
                if (parent instanceof PayBillVO) {
                    isAr = false;
                }
                cmpSysint = this.getCMPSysint(pkOrg, isAr).equals("\u7b7e\u5b57\u6210\u529f") ? cmpSysint : this.getCMPSysint(pkOrg, isAr);
                DjLXVO billType = FiPubDataCache.getBillType((String)vo.getHeadVO().getPk_tradetype(), (String)vo.getHeadVO().getPk_group());
                if (SignaturesSuccess.equals(cmpSysint) && billType != null && (billType.getIsqr() == null || !billType.getIsqr().booleanValue())) {
                    vo.setFromCmpSignEffect(false);
                } else {
                    vo.setFromCmpSignEffect(true);
                }
                if (!SignaturesSuccess.equals(cmpSysint) && !BillEnumCollection.SettlementState.TRANSSUCCED.VALUE.equals(settleflag)) continue;
                parent.setEffectstatus(BillEnumCollection.InureSign.OKINURE.VALUE);
                parent.setEffectuser(busiInfos[0].getOperator());
                parent.setEffectdate(busiInfos[0].getOperatorDate());
                effectVOs.add(vo);
            }
            if (effectVOs != null && !effectVOs.isEmpty()) {
                new BillEffectBatchBSAction().updateVO((AggregatedValueObject[])effectVOs.toArray(new BaseAggVO[0]));
                if (!StringUtil.isEmpty((String)((BaseAggVO)effectVOs.get(0)).getTbbMsg())) {
                    busiInfos[0].setReturnMsg(((BaseAggVO)effectVOs.get(0)).getTbbMsg());
                }
            }
        } else if (BusiStatus.EffectNever.equals((Object)trans.getTo())) {
            ArrayList<BaseAggVO> unEffectVOs = new ArrayList<BaseAggVO>();
            for (BaseAggVO vo : bills) {
                BaseBillVO parent = (BaseBillVO)vo.getParentVO();
                Integer effectstatus = parent.getEffectstatus();
                if (!BillEnumCollection.InureSign.OKINURE.VALUE.equals(effectstatus)) continue;
                parent.setEffectstatus(BillEnumCollection.InureSign.NOINURE.VALUE);
                parent.setBillstatus(this.oribillstatus);
                unEffectVOs.add(vo);
            }
            if (unEffectVOs != null && !unEffectVOs.isEmpty()) {
                new BillUnEffectBatchBSAction().updateVO((AggregatedValueObject[])unEffectVOs.toArray(new BaseAggVO[0]));
            }
        }
    }

    public void execStatuesChange(BusiInfo busiInfo, CMPExecStatus statues) throws BusinessException {
        BaseAggVO vo = this.getBusiBillVO(busiInfo);
        this.checkPauseTransact(new BaseAggVO[]{vo});
        BaseBillVO parent = (BaseBillVO)vo.getParentVO();
        BilltypeVO billTypevo = PfDataCache.getBillTypeInfo((String)parent.getPk_group(), (String)busiInfo.getBill_type());
        BaseAggVO updateVO1 = new ArapBillDAO().queryBillByPrimaryKey(parent.getPrimaryKey(), billTypevo.getParentbilltype());
        if (((BaseBillVO)updateVO1.getParentVO()).getSettleflag() != null && ((BaseBillVO)updateVO1.getParentVO()).getSettleflag() == 1 && (statues.equals((Object)CMPExecStatus.PayFinish) || statues.equals((Object)CMPExecStatus.ReciveFinish))) {
            return;
        }
        SagasUtils.setBSContextSagaStage((String)"SAGACOMPENSTATEFLAG");
        CommPayAndGatherBSAction bsAction = new CommPayAndGatherBSAction();
        bsAction.initBillInfo(busiInfo, statues);
        bsAction.updateVO((AggregatedValueObject)vo);
        String operator = busiInfo.getOperator();
        UFDate operatorDate = busiInfo.getOperatorDate();
        this.setSagasCompenstate(new BaseAggVO[]{vo}, statues, operator, operatorDate);
        BaseAggVO updateVO = new ArapBillDAO().queryBillByPrimaryKey(parent.getPrimaryKey(), billTypevo.getParentbilltype());
        BaseBillVO updateVOParent = (BaseBillVO)updateVO.getParentVO();
        Integer effectstatus = updateVOParent.getEffectstatus();
        Integer settleflag = updateVOParent.getSettleflag();
        Integer approvestatus = updateVOParent.getApprovestatus();
        String pk_org = updateVOParent.getPk_org();
        boolean isAr = true;
        String cmpSysint = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0867");
        String SettlementOfSuccess = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0867");
        if (updateVOParent instanceof PayBillVO) {
            isAr = false;
        }
        cmpSysint = this.getCMPSysint(pk_org, isAr).equals("\u7ed3\u7b97\u6210\u529f") ? cmpSysint : this.getCMPSysint(pk_org, isAr);
        DjLXVO billType = FiPubDataCache.getBillType((String)updateVO.getHeadVO().getPk_tradetype(), (String)updateVO.getHeadVO().getPk_group());
        if (!BillEnumCollection.InureSign.OKINURE.VALUE.equals(effectstatus) && BillEnumCollection.SettlementState.TRANSSUCCED.VALUE.equals(settleflag) && BillEnumCollection.ApproveStatus.PASSING.VALUE.equals(approvestatus)) {
            if (SettlementOfSuccess.equals(cmpSysint) && billType != null && billType.getIscommit() != null && !billType.getIscommit().booleanValue()) {
                updateVO.setFromCmpSettleEffect(true);
            } else {
                updateVO.setFromCmpSettleEffect(false);
            }
            if (SettlementOfSuccess.equals(cmpSysint) && billType != null && billType.getIscommit() != null && billType.getIsqr() != null && billType.getIscommit().booleanValue() && billType.getIsqr().booleanValue()) {
                updateVO.setFromCmpSignAndAutoSettleEffect(true);
            } else {
                updateVO.setFromCmpSignAndAutoSettleEffect(false);
            }
            updateVOParent.setEffectstatus(BillEnumCollection.InureSign.OKINURE.VALUE);
            updateVOParent.setEffectuser(busiInfo.getOperator());
            updateVOParent.setEffectdate(busiInfo.getOperatorDate());
            SagasUtils.setBSContextSagaStage((String)"SAGACOMPENSTATEFLAG");
            new BillEffectBatchBSAction().updateVO(new AggregatedValueObject[]{updateVO});
            if (!StringUtil.isEmpty((String)updateVO.getTbbMsg())) {
                busiInfo.setReturnMsg(updateVO.getTbbMsg());
            }
        }
    }

    private void setSagasCompenstate(BaseAggVO[] writBackVO, CMPExecStatus statues, String operator, UFDate operatorDate) {
        HashMap param = new HashMap();
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Integer billstatus = writBackVO[0].getHeadVO().getBillstatus();
        hashMap.put("SAGAS_BILLDATA", writBackVO);
        hashMap.put("SAGAS_SETTLE_STATUS", statues);
        hashMap.put("SAGAS_OPERATOR", operator);
        hashMap.put("SAGAS_OPERATTIME", operatorDate);
        param.put("SAGAS_CALL_DATA", hashMap);
        String payman = writBackVO[0].getHeadVO().getPayman();
        if (StringUtil.isEmptyWithTrim((String)payman) && BillEnumCollection.BillSatus.SIGN.VALUE == billstatus || StringUtil.isEmptyWithTrim((String)payman) && BillEnumCollection.BillSatus.AUDIT.VALUE == billstatus) {
            return;
        }
        SagasUtils.setCompensateService(ISettleSagasCompensateService.class, param);
    }

    public Object getBillVO(BusiInfo info) throws BusinessException {
        return this.getBusiBillVO(info);
    }

    public void checkPauseTransact(BaseAggVO[] bills) throws BusinessException {
        for (BaseAggVO bill : bills) {
            BaseItemVO[] items = bill.getItems();
            if (items == null) continue;
            for (BaseItemVO item : items) {
                if (!UFBoolean.TRUE.equals((Object)item.getPausetransact())) continue;
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0664"));
            }
        }
    }

    public boolean isAutoFillEbankInfo(String pk_org, String pk_billtype, String pk_group) throws BusinessException {
        return false;
    }

    public void netPayExecChange(NetPayExecInfo payInfo) throws BusinessException {
        new NetPayBSAction().doNetPay(payInfo);
        BusiInfo vo1 = new BusiInfo();
        vo1.setPk_group(InvocationInfoProxy.getInstance().getGroupId());
        vo1.setPk_bill(payInfo.getBillid());
        vo1.setBill_type(payInfo.getBilltype());
        BaseAggVO busiBillVO = this.getBusiBillVO(vo1);
        this.checkPauseTransact(new BaseAggVO[]{busiBillVO});
    }

    public void notify4HandSettle(List<String> idList, boolean isOpp, UFDate operateDate, String operator) throws BusinessException {
        if (isOpp) {
            // empty if block
        }
    }

    public List<ReturnBillRetDetail> processReturnBill(ReturnBill4BusiVO bill4BusiVO) throws BusinessException {
        return null;
    }

    public void setoffRed(NetPayExecInfo payInfo, Map<String, SettlementBodyVO[]> map) throws BusinessException {
        ((IArapPayBillService)NCLocator.getInstance().lookup(IArapPayBillService.class)).settleRedHandleSaveAndSign(payInfo, map);
    }

    private BaseAggVO getBusiBillVO(BusiInfo busiInfo) throws BusinessException {
        BaseAggVO vo = (BaseAggVO)busiInfo.getRawBill();
        BaseAggVO[] vos = null;
        if (null == vo) {
            String billtype = PfDataCache.getBillTypeInfo((String)busiInfo.getPk_group(), (String)busiInfo.getBill_type()).getParentbilltype();
            vos = (BaseAggVO[])new ArapBillBO().queryBillByPrimaryKeys(new String[]{busiInfo.getPk_bill()}, billtype);
            if (null != vos && vos.length > 0) {
                vo = vos[0];
            }
        }
        busiInfo.setRawBill((Object)vo);
        return vo;
    }

    private List<BaseAggVO> getBusiBillVOs(List<BusiInfo> busiInfos, String bill_type) throws BusinessException {
        BaseAggVO[] vosbydb;
        ArrayList<BaseAggVO> vos = new ArrayList<BaseAggVO>();
        ArrayList<String> pks = new ArrayList<String>();
        for (BusiInfo busiInfo : busiInfos) {
            BaseAggVO vo = (BaseAggVO)busiInfo.getRawBill();
            if (null == vo) {
                pks.add(busiInfo.getPk_bill());
                continue;
            }
            vos.add(vo);
        }
        String[] arrPks = new String[pks.size()];
        if (pks.size() > 0 && null != (vosbydb = (BaseAggVO[])new ArapBillBO().queryBillByPrimaryKeys(arrPks = pks.toArray(arrPks), PfDataCache.getBillTypeInfo((String)busiInfos.get(0).getPk_group(), (String)bill_type).getParentbilltype())) && vosbydb.length != 0) {
            for (BaseAggVO vo : vosbydb) {
                vos.add(vo);
            }
        }
        return vos;
    }

    public void writeBackInnerStatus(boolean isTransfer, SettlementAggVO ... aggVOs) throws BusinessException {
        boolean upIscommpay;
        SettlementHeadVO parentVO = (SettlementHeadVO)aggVOs[0].getParentVO();
        boolean bl = upIscommpay = parentVO.getIscommpay() == null ? false : parentVO.getIscommpay().booleanValue();
        if (upIscommpay) {
            if (isTransfer) {
                this.transferWriteBack(isTransfer, aggVOs);
            } else {
                this.transferWriteBack(isTransfer, aggVOs);
            }
        }
    }

    private String[] writeBackPaybill(boolean isTransfer, UFDate ts, String pk_bill) {
        String[] sqls = new String[2];
        StringBuffer itemSql = new StringBuffer();
        itemSql.append(" update ").append(new PayBillVO().getTableName()).append(" set ");
        itemSql.append("payflag").append(" = ").append(isTransfer ? BillEnumCollection.PayStatus.PAYFINISH.VALUE : BillEnumCollection.PayStatus.PAYING.VALUE);
        itemSql.append(", ts= '").append(ts.toPersisted()).append("'");
        itemSql.append(" where ").append("pk_gatherbill").append(" = '").append(pk_bill).append("'");
        StringBuffer headSql = new StringBuffer();
        headSql.append(" update ").append(new PayBillItemVO().getTableName()).append(" set ");
        headSql.append("settleflag").append(" = ").append(isTransfer ? BillEnumCollection.SettlementState.TRANSSUCCED.VALUE : BillEnumCollection.SettlementState.TRANSING.VALUE);
        headSql.append(", ts = '").append(ts.toPersisted()).append("'");
        headSql.append(" where ").append("pk_gatherbill").append(" = '").append(pk_bill).append("'");
        sqls[0] = itemSql.toString();
        sqls[1] = headSql.toString();
        return sqls;
    }

    /*
     * WARNING - void declaration
     */
    private void transferWriteBack(boolean isTransfer, SettlementAggVO ... aggVOs) throws BusinessException {
        void var18_41;
        int n;
        SettlementHeadVO settHeaddVO = (SettlementHeadVO)aggVOs[0].getParentVO();
        BilltypeVO billType = PfDataCache.getBillType((String)settHeaddVO.getPk_tradetype());
        if (billType != null && "F3".equals(billType.getParentbilltype())) {
            UFDate ts = new UFDate();
            ArrayList<String> sqlList = new ArrayList<String>();
            for (SettlementAggVO vo : aggVOs) {
                settHeaddVO = (SettlementHeadVO)vo.getParentVO();
                String[] sql = this.writeBackPaybill(isTransfer, ts, settHeaddVO.getPk_busibill());
                sqlList.addAll(Arrays.asList(sql));
            }
            DBAUtil.execBatchSql((String[])sqlList.toArray(new String[0]));
            return;
        }
        BSContext.getInstance().setSession("transferWriteBack", (Object)UFBoolean.TRUE);
        HashSet<String> gatherPks = new HashSet<String>();
        for (SettlementAggVO vo : aggVOs) {
            gatherPks.add(((SettlementHeadVO)vo.getParentVO()).getPk_busibill());
        }
        BaseAggVO[] oriBaseAggVos = ((IArapBillQueryBaseService)NCLocator.getInstance().lookup(ArapBillTypeInfo.getInstance((Object)"F2").getBillQueryService())).findBillByPrimaryKey(gatherPks.toArray(new String[0]));
        IArapBillBaseService billService = (IArapBillBaseService)NCLocator.getInstance().lookup(ArapBillTypeInfo.getInstance((Object)oriBaseAggVos[0]).getBillService());
        billService.unapprove(oriBaseAggVos);
        BaseAggVO[] baseAggVos = ((IArapBillQueryBaseService)NCLocator.getInstance().lookup(ArapBillTypeInfo.getInstance((Object)"F2").getBillQueryService())).findBillByPrimaryKey(gatherPks.toArray(new String[0]));
        this.checkPauseTransact(baseAggVos);
        IRPBillQueryService rp_qryservice = (IRPBillQueryService)NCLocator.getInstance().lookup(IRPBillQueryService.class);
        IRPBillService rp_service = (IRPBillService)NCLocator.getInstance().lookup(IRPBillService.class);
        AggRPBillVO[] oldvos = rp_qryservice.queryBillsByCondition("and billtypecode = 'F2' and " + SqlUtils.getInStr((String)"busiid", (String[])gatherPks.toArray(new String[0]), (boolean)true), true, null);
        HashSet<String> unfinishedPKs = new HashSet<String>();
        if (oldvos != null && oldvos.length > 0) {
            for (AggRPBillVO oldvo : oldvos) {
                unfinishedPKs.add(oldvo.getParentVO().getBusiid());
            }
        }
        IRPBillSyncService lookup = (IRPBillSyncService)NCLocator.getInstance().lookup(IRPBillSyncService.class);
        for (BaseAggVO baseAggVo : baseAggVos) {
            String string = baseAggVo.getParentVO().getPrimaryKey();
            Integer effectstatus = (Integer)baseAggVo.getParentVO().getAttributeValue("effectstatus");
            if (effectstatus != 10 || !unfinishedPKs.contains(string)) continue;
            String pk_tradetype = (String)baseAggVo.getParentVO().getAttributeValue("pk_tradetype");
            BaseItemVO[] aggRPBillVO = RPBillConvertUtil.convertBill2AggRPBillVO((String)pk_tradetype, (AggregatedValueObject)baseAggVo);
            lookup.syncRPBill(pk_tradetype, (AggRPBillVO)aggRPBillVO, RPBillConvertUtil.OPER_UNFINISH);
        }
        HashMap<String, BaseAggVO> billMap = new HashMap<String, BaseAggVO>();
        for (BaseAggVO baseAggVO : baseAggVos) {
            billMap.put(baseAggVO.getParentVO().getPrimaryKey(), baseAggVO);
        }
        for (BaseAggVO baseAggVO : aggVOs) {
            settHeaddVO = (SettlementHeadVO)baseAggVO.getParentVO();
            BaseAggVO baseAggVO2 = (BaseAggVO)billMap.get(settHeaddVO.getPk_busibill());
            HashMap<String, BaseItemVO> itemMap = new HashMap<String, BaseItemVO>();
            for (BaseItemVO itemVO : baseAggVO2.getItems()) {
                itemMap.put(itemVO.getPrimaryKey(), itemVO);
            }
            UFDouble money = UFDouble.ZERO_DBL;
            UFDouble local_money = UFDouble.ZERO_DBL;
            UFDouble grouplocal = UFDouble.ZERO_DBL;
            UFDouble globallocal = UFDouble.ZERO_DBL;
            for (SettlementBodyVO settByVO : (SettlementBodyVO[])baseAggVO.getChildrenVO()) {
                if (StringUtils.isEmpty((CharSequence)settHeaddVO.getPk_busibill()) || StringUtils.isEmpty((CharSequence)settByVO.getPk_billdetail())) {
                    throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0261", null, new String[]{settHeaddVO.getPk_busibill()}) + settByVO.getPk_billdetail());
                }
                BaseItemVO baseItemVO = (BaseItemVO)itemMap.get(settByVO.getPk_billdetail());
                this.adjustItemVO(settByVO, baseItemVO, isTransfer);
                money = money.add(ArapBusi4CMPServcie.nvl(settByVO.getReceive()));
                local_money = local_money.add(ArapBusi4CMPServcie.nvl(settByVO.getReceivelocal()));
                grouplocal = grouplocal.add(ArapBusi4CMPServcie.nvl(settByVO.getGroupreceivelocal()));
                globallocal = globallocal.add(ArapBusi4CMPServcie.nvl(settByVO.getGlobalreceivelocal()));
            }
            BaseBillVO headVO = baseAggVO2.getHeadVO();
            headVO.setSettleflag(isTransfer ? BillEnumCollection.SettlementState.TRANSSUCCED.VALUE : BillEnumCollection.SettlementState.TRANSING.VALUE);
            headVO.setCommpaybegindate(settHeaddVO.getCommpaybegindate());
            headVO.setCommpayenddate(settHeaddVO.getCommpayenddate());
            headVO.setIsforce(isTransfer ? settHeaddVO.getIscommpay() : UFBoolean.FALSE);
            headVO.setMoney(money);
            headVO.setLocal_money(local_money);
            headVO.setGrouplocal(grouplocal);
            headVO.setGloballocal(globallocal);
            headVO.setStatus(1);
        }
        BaseAggVO[] updateBaseAggVOs = billService.update(baseAggVos);
        billService.approve(updateBaseAggVOs);
        oldvos = rp_qryservice.queryBillsByCondition("and billtypecode = 'F2' and " + SqlUtils.getInStr((String)"busiid", (String[])gatherPks.toArray(new String[0]), (boolean)true), false, null);
        unfinishedPKs = new HashSet();
        if (oldvos != null && oldvos.length > 0) {
            void var18_39;
            AggRPBillVO[] aggRPBillVOArray = oldvos;
            n = aggRPBillVOArray.length;
            boolean bl = false;
            while (var18_39 < n) {
                AggRPBillVO oldvo = aggRPBillVOArray[var18_39];
                unfinishedPKs.add(oldvo.getParentVO().getBusiid());
                ++var18_39;
            }
        }
        BaseAggVO[] baseAggVOArray = baseAggVos;
        n = baseAggVOArray.length;
        boolean bl = false;
        while (var18_41 < n) {
            BaseAggVO baseAggVo = baseAggVOArray[var18_41];
            String pk_bill = baseAggVo.getParentVO().getPrimaryKey();
            Integer effectstatus = (Integer)baseAggVo.getParentVO().getAttributeValue("effectstatus");
            if (effectstatus == 10 && unfinishedPKs.contains(pk_bill)) {
                String pk_tradetype = (String)baseAggVo.getParentVO().getAttributeValue("pk_tradetype");
                AggRPBillVO aggRPBillVO = RPBillConvertUtil.convertBill2AggRPBillVO((String)pk_tradetype, (AggregatedValueObject)baseAggVo);
                lookup.syncRPBill(pk_tradetype, aggRPBillVO, RPBillConvertUtil.OPER_FINISH);
            }
            ++var18_41;
        }
        BSContext.getInstance().setSession("transferWriteBack", (Object)UFBoolean.FALSE);
    }

    private void adjustItemVO(SettlementBodyVO item, BaseItemVO itemVO, boolean isTransfer) {
        boolean direction = "sk".equals(itemVO.getBillclass());
        itemVO.setCommpaystatus(isTransfer ? item.getCommpaystatus() : null);
        itemVO.setCommpaytype(isTransfer ? item.getCommpaytype() : null);
        itemVO.setCommpayer(isTransfer ? item.getCommpayer() : null);
        Integer commpaytype = item.getCommpaytype();
        if (item.getIsrefused() == null && (BillEnumCollection.CommissionPayType.REFUSECOMMPAY.VALUE == commpaytype || BillEnumCollection.CommissionPayType.COMMPAYPARTLY.VALUE == commpaytype)) {
            itemVO.setIsrefused(UFBoolean.TRUE);
        } else {
            itemVO.setIsrefused(UFBoolean.FALSE);
        }
        itemVO.setRefuse_reason(item.getRefusereason());
        itemVO.setMoney_cr(direction ? item.getReceive() : item.getPay());
        itemVO.setNotax_cr(direction ? item.getReceive() : item.getPay());
        itemVO.setLocal_money_cr(direction ? item.getReceivelocal() : item.getPaylocal());
        itemVO.setLocal_notax_cr(direction ? item.getReceivelocal() : item.getPaylocal());
        itemVO.setGroupcrebit(direction ? item.getGroupreceivelocal() : item.getGrouppaylocal());
        itemVO.setGlobalcrebit(direction ? item.getGlobalreceivelocal() : item.getGlobalpaylocal());
        itemVO.setMoney_bal(direction ? item.getReceive() : item.getPay());
        itemVO.setLocal_money_bal(direction ? item.getReceivelocal() : item.getPaylocal());
        itemVO.setGroupbalance(direction ? item.getGroupreceivelocal() : item.getGrouppaylocal());
        itemVO.setGlobalbalance(direction ? item.getGlobalreceivelocal() : item.getGlobalpaylocal());
        itemVO.setOccupationmny(direction ? item.getReceive() : item.getPay());
        itemVO.setPayflag(isTransfer ? BillEnumCollection.PayStatus.PAYFINISH.VALUE : BillEnumCollection.PayStatus.PAYING.VALUE);
        itemVO.setStatus(1);
    }

    private static UFDouble nvl(UFDouble money) {
        if (money == null) {
            return UFDouble.ZERO_DBL;
        }
        return money;
    }

    public void notifyPayTypeBillCancelCommitToFts(BusiInfo ... busiInfos) throws BusinessException {
    }

    public void notifyPayTypeBillCancelInnertansferAndCancelEffect(BusiStateChangeVO ... busiStateChangeVOs) throws BusinessException {
    }

    public void notifyPayTypeBillCommitToFts(BusiInfo ... busiInfos) throws BusinessException {
    }

    public void notifyPayTypeBillFtsRefuseDeal(BusiInfo ... busiInfos) throws BusinessException {
        this.notifyReceiveTypeBillFtsRefuseDeal(busiInfos);
    }

    private BaseAggVO[] getBillAggVOsByBusiInfos(BusiInfo ... busiInfos) throws BusinessException {
        ArrayList<String> pk_paybillList = new ArrayList<String>();
        for (BusiInfo busiInfo : busiInfos) {
            pk_paybillList.add(busiInfo.getPk_bill());
        }
        IArapBillQueryBaseService qrySrv = (IArapBillQueryBaseService)NCLocator.getInstance().lookup(ArapBillTypeInfo.getInstance((Object)"F3").getBillQueryService());
        return qrySrv.findBillByPrimaryKey(pk_paybillList.toArray(new String[0]));
    }

    protected BaseDAO getBasedao() {
        return new BaseDAO();
    }

    public void notifyPayTypeBillInnertansferForcePay(BusiInfo ... busiInfos) throws BusinessException {
        BaseAggVO[] billaggs = this.getBillAggVOsByBusiInfos(busiInfos);
        Map PkBusibillToBusiInfoMap = BillUtils.convertBusiInfosToPk_busibillToBusiInfoMap((BusiInfo[])busiInfos);
        String operator = null;
        ArrayList<BaseItemVO> billDetailVOList = new ArrayList<BaseItemVO>();
        ArrayList<BaseBillVO> billVOList = new ArrayList<BaseBillVO>();
        for (BaseAggVO billAggVO : billaggs) {
            BaseItemVO[] bodys;
            BaseBillVO billVO = (BaseBillVO)billAggVO.getParentVO();
            billVOList.add(billVO);
            BusiInfo busiInfo = (BusiInfo)PkBusibillToBusiInfoMap.get(billVO.getPrimaryKey());
            operator = busiInfo.getOperator();
            BaseItemVO[] baseItemVOArray = bodys = (BaseItemVO[])billAggVO.getChildrenVO();
            int n = baseItemVOArray.length;
            for (int i = 0; i < n; ++i) {
                BaseItemVO billDetailVO = baseItemVOArray[i];
                billDetailVO.setCommpayer(operator);
                billDetailVO.setCommpaystatus(BillEnumCollection.CommissionPayStatus.COMMISSIONPAYSUSSCESS.VALUE);
                billDetailVO.setCommpaytype(BillEnumCollection.CommissionPayType.FORCECOMMPAYALL.VALUE);
                billDetailVO.setStatus(1);
                billDetailVOList.add(billDetailVO);
            }
        }
        this.getBasedao().updateVOArray((SuperVO[])billVOList.toArray(new BaseBillVO[0]), new String[]{"isforce"});
        this.getBasedao().updateVOArray((SuperVO[])billDetailVOList.toArray(new BaseItemVO[0]), new String[]{"commpayer", "commpaystatus", "commpaytype"});
        BaseAggVO[] gatherBills = this.queryGatherBills(billaggs);
        if (gatherBills != null && gatherBills.length > 0 && gatherBills[0] != null) {
            billDetailVOList.clear();
            for (BaseAggVO billAggVO : gatherBills) {
                BaseItemVO[] bodys;
                for (BaseItemVO billDetailVO : bodys = (BaseItemVO[])billAggVO.getChildrenVO()) {
                    billDetailVO.setCommpayer(operator);
                    billDetailVO.setCommpaystatus(BillEnumCollection.CommissionPayStatus.COMMISSIONPAYSUSSCESS.VALUE);
                    billDetailVO.setCommpaytype(BillEnumCollection.CommissionPayType.FORCECOMMPAYALL.VALUE);
                    billDetailVO.setStatus(1);
                    billDetailVOList.add(billDetailVO);
                }
            }
            this.getBasedao().updateVOArray((SuperVO[])billDetailVOList.toArray(new BaseItemVO[0]), new String[]{"commpayer", "commpaystatus", "commpaytype"});
        }
    }

    private BaseAggVO[] queryGatherBills(BaseAggVO[] billaggs) throws BusinessException {
        ArrayList<String> list = new ArrayList<String>();
        for (BaseAggVO bill : billaggs) {
            for (BaseItemVO item : bill.getItems()) {
                list.add(item.getTop_billid());
            }
        }
        List innerVOs = (List)((IInnerTransferQueryService)NCLocator.getInstance().lookup(IInnerTransferQueryService.class)).queryInnerTransferByPKS(list.toArray(new String[0]));
        ArrayList<String> srcPks = new ArrayList<String>();
        for (int i = 0; i < innerVOs.size(); ++i) {
            AggInnerTransferVO innerVO = (AggInnerTransferVO)innerVOs.get(i);
            AggInnerTransferVO innerBeginVO = AggInnerTransferToSettleVOUtil.getDeliverOriginalBill((AggInnerTransferVO)innerVO);
            String pkSrccmpbill = ((InnerTransferVO)innerBeginVO.getParent()).getPk_srccmpbill();
            if (StringUtils.isEmpty((CharSequence)pkSrccmpbill)) {
                if (billaggs.length <= i || ArrayUtils.isEmpty((Object[])billaggs[i].getItems()) || !StringUtils.isNotEmpty((CharSequence)billaggs[i].getItems()[0].getSrc_billid())) continue;
                srcPks.add(billaggs[i].getItems()[0].getSrc_billid());
                continue;
            }
            srcPks.add(pkSrccmpbill);
        }
        BaseAggVO[] paybillvo = ((IArapBillQueryBaseService)NCLocator.getInstance().lookup(ArapBillTypeInfo.getInstance((Object)"F2").getBillQueryService())).findBillByPrimaryKey(srcPks.toArray(new String[0]));
        return paybillvo;
    }

    public void notifyPayTypeBillInnertansferCancelForcePay(BusiInfo ... busiInfos) throws BusinessException {
        BaseAggVO[] billaggs = this.getBillAggVOsByBusiInfos(busiInfos);
        ArrayList<BaseItemVO> billDetailVOList = new ArrayList<BaseItemVO>();
        for (BaseAggVO billAggVO : billaggs) {
            BaseItemVO[] bodys;
            for (BaseItemVO billDetailVO : bodys = (BaseItemVO[])billAggVO.getChildrenVO()) {
                billDetailVO.setCommpayer(null);
                billDetailVO.setCommpaystatus(BillEnumCollection.CommissionPayStatus.UNCOMMISSIONPAY.VALUE);
                billDetailVO.setCommpaytype(null);
                billDetailVO.setStatus(1);
                billDetailVOList.add(billDetailVO);
            }
        }
        this.getBasedao().updateVOArray((SuperVO[])billDetailVOList.toArray(new BaseItemVO[0]), new String[]{"commpayer", "commpaystatus", "commpaytype"});
        Object[] gatherBillVO = this.queryGatherBills(billaggs);
        if (!ArrayUtils.isEmpty((Object[])gatherBillVO) && gatherBillVO[0] != null) {
            billDetailVOList.clear();
            for (Object billAggVO : gatherBillVO) {
                BaseItemVO[] bodys;
                for (BaseItemVO billDetailVO : bodys = (BaseItemVO[])billAggVO.getChildrenVO()) {
                    billDetailVO.setCommpayer(null);
                    billDetailVO.setCommpaystatus(BillEnumCollection.CommissionPayStatus.COMMISSIONPAYSUSSCESS.VALUE);
                    billDetailVO.setCommpaytype(BillEnumCollection.CommissionPayType.FORCECOMMPAYALL.VALUE);
                    billDetailVO.setStatus(1);
                    billDetailVOList.add(billDetailVO);
                }
            }
            this.getBasedao().updateVOArray((SuperVO[])billDetailVOList.toArray(new BaseItemVO[0]), new String[]{"commpayer", "commpaystatus", "commpaytype"});
        }
    }

    public void notifyPayTypeBillInnertansferRefuseCommisionPay(BusiInfo ... busiInfos) throws BusinessException {
        BaseAggVO[] billaggs = this.getBillAggVOsByBusiInfos(busiInfos);
        Map<String, BusiInfo> PkBusibillToBusiInfoMap = this.constBusiInfo(busiInfos);
        List billDetailVOList = ArrayUtil.makeList();
        ArrayList<BaseBillVO> billVOList = new ArrayList<BaseBillVO>();
        for (BaseAggVO billAggVO : billaggs) {
            BaseBillVO billVO = billAggVO.getHeadVO();
            BusiInfo busiInfo = PkBusibillToBusiInfoMap.get(billVO.getPrimaryKey());
            UFDouble money = UFDouble.ZERO_DBL;
            UFDouble local_money = UFDouble.ZERO_DBL;
            UFDouble grouplocal = UFDouble.ZERO_DBL;
            UFDouble globallocal = UFDouble.ZERO_DBL;
            for (BaseItemVO billDetailVO : billAggVO.getItems()) {
                billDetailVO.setCommpayer(null);
                billDetailVO.setCommpaystatus(BillEnumCollection.CommissionPayStatus.UNCOMMISSIONPAY.VALUE);
                billDetailVO.setCommpaytype(null);
                billDetailVO.setRefuse_reason(busiInfo.getBodyRefuseReason());
                billDetailVO.setMoney_de(billDetailVO.getAgentreceiveprimal());
                billDetailVO.setMoney_bal(billDetailVO.getAgentreceiveprimal());
                billDetailVO.setNotax_de(billDetailVO.getAgentreceiveprimal());
                billDetailVO.setLocal_money_de(billDetailVO.getAgentreceivelocal());
                billDetailVO.setLocal_money_bal(billDetailVO.getAgentreceivelocal());
                billDetailVO.setNotax_de(billDetailVO.getAgentreceiveprimal());
                billDetailVO.setGroupdebit(billDetailVO.getGroupagentreceivelocal());
                billDetailVO.setGroupbalance(billDetailVO.getGroupagentreceivelocal());
                billDetailVO.setGlobaldebit(billDetailVO.getGlobalagentreceivelocal());
                billDetailVO.setGlobalbalance(billDetailVO.getGlobalagentreceivelocal());
                billDetailVO.setGroupnotax_de(billDetailVO.getGroupagentreceivelocal());
                billDetailVO.setGlobalnotax_de(billDetailVO.getGlobalagentreceivelocal());
                billDetailVO.setLocal_notax_de(billDetailVO.getAgentreceivelocal());
                billDetailVO.setOccupationmny(billDetailVO.getAgentreceiveprimal());
                billDetailVO.setStatus(1);
                money = money.add(ArapBusi4CMPServcie.nvl(billDetailVO.getMoney_de()));
                local_money = local_money.add(ArapBusi4CMPServcie.nvl(billDetailVO.getLocal_money_de()));
                grouplocal = grouplocal.add(ArapBusi4CMPServcie.nvl(billDetailVO.getGroupdebit()));
                globallocal = globallocal.add(ArapBusi4CMPServcie.nvl(billDetailVO.getGlobaldebit()));
                billDetailVOList.add(billDetailVO);
            }
            billVO.setMoney(money);
            billVO.setLocal_money(local_money);
            billVO.setGrouplocal(grouplocal);
            billVO.setGloballocal(globallocal);
            billVOList.add(billVO);
        }
        String[] itemFields = new String[]{"commpayer", "commpaystatus", "commpaytype", "refuse_reason", "money_de", "money_bal", "local_money_de", "local_money_bal", "groupdebit", "globaldebit", "globalbalance", "groupbalance", "occupationmny", "groupnotax_de", "globalnotax_de", "local_notax_de", "notax_de"};
        ArrayList<String> headFields = new ArrayList<String>(BaseBillVO.MONEYFIELD_LIST);
        headFields.add("billstatus");
        this.getBasedao().updateVOArray((SuperVO[])billDetailVOList.toArray(new BaseItemVO[0]), itemFields);
        this.getBasedao().updateVOArray((SuperVO[])billVOList.toArray(new BaseBillVO[0]), headFields.toArray(new String[0]));
    }

    public void notifyPayTypeBillInnertansferSuccessAndEffect(BusiStateChangeVO ... busiStateChangeVOs) throws BusinessException {
    }

    public void notifyReceiveTypeBillCancelCommitToFts(BusiInfo ... busiInfos) throws BusinessException {
    }

    public void notifyReceiveTypeBillCancelInnertansferAndCancelEffect(BusiStateChangeVO ... busiStateChangeVOs) throws BusinessException {
    }

    public void notifyReceiveTypeBillCommitToFts(BusiInfo ... busiInfos) throws BusinessException {
    }

    public void notifyReceiveTypeBillFtsRefuseDeal(BusiInfo ... busiInfos) throws BusinessException {
        List<BaseAggVO> recBillaggs = this.getBusiBillVOs(Arrays.asList(busiInfos), busiInfos[0].getBill_type());
        ArrayList<BaseItemVO> items = new ArrayList<BaseItemVO>();
        Map<String, BusiInfo> busiinfoMap = this.constBusiInfo(busiInfos);
        for (BaseAggVO recBillAggVO : recBillaggs) {
            BusiInfo busiInfo = busiinfoMap.get(recBillAggVO.getHeadVO().getPrimaryKey());
            for (BaseItemVO item : recBillAggVO.getItems()) {
                item.setIsrefused(UFBoolean.TRUE);
                Map bodyReasonMap = busiInfo.getBodyReasonMap();
                if (busiInfo.getBodyReasonMap() == null) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0265"));
                }
                item.setRefuse_reason((String)bodyReasonMap.get(item.getPrimaryKey()));
                items.add(item);
            }
        }
        this.getBasedao().updateVOArray((SuperVO[])items.toArray(new BaseItemVO[0]), new String[]{"isrefused", "refuse_reason"});
    }

    private Map<String, BusiInfo> constBusiInfo(BusiInfo[] busiInfos) {
        HashMap<String, BusiInfo> map = new HashMap<String, BusiInfo>();
        for (BusiInfo info : busiInfos) {
            map.put(info.getPk_bill(), info);
        }
        return map;
    }

    public void notifyReceiveTypeBillInnertansferSuccessAndEffect(BusiStateChangeVO ... busiStateChangeVOs) throws BusinessException {
    }

    private String getCMPSysint(String pkOrg, boolean isAr) {
        String cmpSysinit = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0866");
        String ParameterError = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0868");
        String initCode = "CMP37";
        if (isAr) {
            initCode = "CMP36";
        }
        try {
            cmpSysinit = SysInit.getParaString((String)pkOrg, (String)initCode);
        }
        catch (BusinessException e) {
            Log.getInstance(this.getClass()).error((Object)(initCode + ParameterError));
            cmpSysinit = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0866");
        }
        if (StringUtils.isEmpty((CharSequence)cmpSysinit)) {
            Log.getInstance(this.getClass()).error((Object)(initCode + ParameterError));
            cmpSysinit = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0866");
        }
        return cmpSysinit;
    }

    public boolean isAutoSettle(String arg0, String arg1, SettlementAggVO ... arg2) throws BusinessException {
        return false;
    }
}

