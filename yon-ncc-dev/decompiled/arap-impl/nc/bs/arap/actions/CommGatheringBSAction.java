/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.BillEffectBatchBSAction
 *  nc.bs.arap.actions.EditTempBillBSAction
 *  nc.bs.arap.bill.ArapBillBO
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.billact.BusiUpdateBSAction
 *  nc.bs.arap.billact.IValidatorFactory
 *  nc.bs.pf.pub.PfDataCache
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.global.ArapBillVOConsts
 *  nc.vo.arap.global.ArapCommonTool
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.arap.pub.BillEnumCollection$SettlementState
 *  nc.vo.cmp.BusiInfo
 *  nc.vo.cmp.fts.MoneyDetail
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 */
package nc.bs.arap.actions;

import java.util.HashMap;
import java.util.Map;
import nc.bs.arap.actions.BillEffectBatchBSAction;
import nc.bs.arap.actions.EditTempBillBSAction;
import nc.bs.arap.bill.ArapBillBO;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.billact.BusiUpdateBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.pf.pub.PfDataCache;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.global.ArapBillVOConsts;
import nc.vo.arap.global.ArapCommonTool;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.cmp.BusiInfo;
import nc.vo.cmp.fts.MoneyDetail;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;

public class CommGatheringBSAction
extends BusiUpdateBSAction {
    private BusiInfo busiInfo = null;
    Map<String, MoneyDetail> map = new HashMap<String, MoneyDetail>();

    protected void doAfterUpdate(AggregatedValueObject bill) throws BusinessException {
    }

    protected void doBeforeUpdate(AggregatedValueObject bill) throws BusinessException {
    }

    protected AggregatedValueObject doBusiness(AggregatedValueObject bill) throws BusinessException {
        BaseBillVO parent = (BaseBillVO)bill.getParentVO();
        BaseItemVO[] children = (BaseItemVO[])bill.getChildrenVO();
        UFDouble sum = this.dealSunMoney(children);
        if (ArapCommonTool.isZero((UFDouble)sum)) {
            throw ExceptionHandler.createException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0290"));
        }
        this.dealBusiStatus(parent, children);
        if (UFBoolean.FALSE.equals((Object)this.busiInfo.getIsSucc())) {
            new EditTempBillBSAction().updateVO(bill);
        }
        return null;
    }

    public void billChange(BusiInfo busiInfo, Map<String, MoneyDetail> map1) throws BusinessException {
        BaseAggVO bill = new ArapBillBO().queryBillByPrimaryKey(busiInfo.getPk_bill(), busiInfo.getBill_type());
        if (null == bill) {
            throw ExceptionHandler.createException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0291"));
        }
        this.busiInfo = busiInfo;
        for (String key : busiInfo.getPk_bill_detail()) {
            if (!map1.containsKey(key)) continue;
            this.map.put(key, map1.get(key));
        }
        if (null == this.map) {
            throw ExceptionHandler.createException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0292"));
        }
        this.updateVO((AggregatedValueObject)bill);
        BaseBillVO parent = (BaseBillVO)bill.getParentVO();
        BilltypeVO billTypevo = PfDataCache.getBillType((String)busiInfo.getBill_type());
        BaseAggVO updateVO = new ArapBillDAO().queryBillByPrimaryKey(parent.getPrimaryKey(), billTypevo.getParentbilltype());
        BaseBillVO updateVOParent = (BaseBillVO)updateVO.getParentVO();
        if (!BillEnumCollection.InureSign.OKINURE.VALUE.equals(parent.getEffectstatus()) && BillEnumCollection.SettlementState.TRANSSUCCED.VALUE.equals(parent.getSettleflag())) {
            updateVOParent.setEffectstatus(BillEnumCollection.InureSign.OKINURE.VALUE);
            updateVOParent.setEffectuser(this.busiInfo.getOperator());
            updateVOParent.setEffectdate(this.busiInfo.getOperatorDate());
            new BillEffectBatchBSAction().updateVO(new AggregatedValueObject[]{updateVO});
        }
    }

    private UFDouble dealSunMoney(BaseItemVO[] children) throws BusinessException {
        UFDouble sum = ArapCommonTool.getZero();
        Map itemMap = ArapBillPubUtil.getMapByChildren((BaseItemVO[])children);
        for (String key : this.map.keySet()) {
            UFDouble money = this.map.get(key).getOriginalMoney();
            BaseItemVO item = (BaseItemVO)itemMap.get(key);
            if (null == money || ArapCommonTool.isZero((UFDouble)money)) {
                throw ExceptionHandler.createException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0292"));
            }
            if (!money.equals((Object)item.getMoney_cr())) {
                item.setMoney_cr(money);
            }
            item.setStatus(1);
            sum = sum.add(money);
        }
        return sum;
    }

    private void dealBusiStatus(BaseBillVO parent, BaseItemVO[] children) {
        if (UFBoolean.FALSE.equals((Object)this.busiInfo.getIsSucc())) {
            parent.setBillstatus(Integer.valueOf(-99));
            parent.setSettleflag(ArapBillVOConsts.FTS_RECEIVER_GOING);
            parent.setIsmandatepay(UFBoolean.TRUE);
            for (BaseItemVO item : children) {
                item.setPayflag(ArapBillVOConsts.BODY_RECEIVE_GONING);
                item.setPaydate(this.busiInfo.getOperatorDate());
                item.setPayman(this.busiInfo.getOperator());
            }
        } else {
            parent.setBillstatus(Integer.valueOf(-99));
            parent.setSettleflag(ArapBillVOConsts.FTS_RECEIVER_SUCCESS);
            parent.setIsmandatepay(UFBoolean.TRUE);
            for (BaseItemVO item : children) {
                item.setPayflag(ArapBillVOConsts.BODY_RECEIVE_OK);
                item.setPaydate(this.busiInfo.getOperatorDate());
                item.setPayman(this.busiInfo.getOperator());
            }
        }
    }

    protected IValidatorFactory getValidatorFactory() {
        return null;
    }
}

