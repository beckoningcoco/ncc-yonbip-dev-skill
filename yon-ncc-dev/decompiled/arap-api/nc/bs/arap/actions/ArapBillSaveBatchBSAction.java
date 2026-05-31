/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.vo.fipub.billcode.FinanceBillCodeUtils
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.bs.arap.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import nc.bs.arap.bill.ArapBillBO;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.billact.InsertBatchBSAction;
import nc.bs.arap.validator.ValidatorFactory;
import nc.bs.framework.common.NCLocator;
import nc.pubitf.arap.termitem.IArapTermItemPubService;
import nc.vo.arap.BusiStatus;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.fipub.billcode.FinanceBillCodeUtils;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDateTime;

@Deprecated
public abstract class ArapBillSaveBatchBSAction
extends InsertBatchBSAction {
    private ArapBillBO bo = null;
    protected UFBoolean isNew = UFBoolean.TRUE;
    protected IArapTermItemPubService termService = null;
    protected Map<String, Map<String, String>> fakeIds;

    public IArapTermItemPubService getTermService() {
        if (null == this.termService) {
            this.termService = (IArapTermItemPubService)NCLocator.getInstance().lookup(IArapTermItemPubService.class);
        }
        return this.termService;
    }

    @Override
    protected void doBeforeInsert(AggregatedValueObject[] bills) {
        this.fakeIds = new HashMap<String, Map<String, String>>();
        for (int index = 0; index < bills.length; ++index) {
            AggregatedValueObject bill = bills[index];
            BaseBillVO parentVO = (BaseBillVO)bill.getParentVO();
            String billNO = (String)parentVO.getAttributeValue("billno");
            BaseItemVO[] children = (BaseItemVO[])bill.getChildrenVO();
            parentVO.setBillstatus(BusiStatus.SAVE.getBillStatusKind());
            parentVO.setPrimaryKey(null);
            parentVO.setEffectstatus(BillEnumCollection.InureSign.NOINURE.VALUE);
            parentVO.setCreationtime(new UFDateTime());
            HashMap<String, String> fakeID = new HashMap<String, String>();
            for (BaseItemVO child : children) {
                String rowno = String.valueOf(child.getAttributeValue("rowno"));
                fakeID.put(rowno, child.getPrimaryKey());
                if (child != null && child.getObjtype() != null && child.getObjtype() == 0 && StringUtil.isEmptyWithTrim((String)child.getOrdercubasdoc())) {
                    child.setOrdercubasdoc(child.getCustomer());
                }
                if (null != child.getPrimaryKey() && child.getPrimaryKey().indexOf("ID_INDEX") != -1) {
                    child.setPrimaryKey(null);
                }
                child.setBillno(billNO);
                child.setStatus(2);
                if (parentVO.getPk_tradetype() == null || parentVO.getPk_tradetype().equals(child.getPk_tradetype())) continue;
                child.setPk_tradetype(parentVO.getPk_tradetype());
            }
            this.fakeIds.put(billNO, fakeID);
        }
    }

    @Override
    protected void doAfterInsert(AggregatedValueObject[] bills) throws BusinessException {
        ArrayList<BaseAggVO> voList = new ArrayList<BaseAggVO>();
        ArrayList<AggregatedValueObject> precodeAggList = new ArrayList<AggregatedValueObject>();
        FinanceBillCodeUtils util = ArapBillPubUtil.getBillCodeUtil(bills[0]);
        for (int index = 0; index < bills.length; ++index) {
            if (UFBoolean.FALSE.equals((Object)this.isNew)) {
                voList.add((BaseAggVO)bills[index]);
            }
            if (null != util && UFBoolean.TRUE.equals((Object)UFBoolean.valueOf((boolean)util.isPrecode(bills[index])))) {
                precodeAggList.add(bills[index]);
            }
            HashMap<String, String> idMap = new HashMap<String, String>();
            AggregatedValueObject aggVO = bills[index];
            SuperVO parentVO = (SuperVO)aggVO.getParentVO();
            String billNO = (String)parentVO.getAttributeValue("billno");
            Map<String, String> fakeId = this.fakeIds.get(billNO);
            for (SuperVO child : (SuperVO[])bills[index].getChildrenVO()) {
                String rowno = String.valueOf(child.getAttributeValue("rowno"));
                idMap.put(fakeId.get(rowno), child.getPrimaryKey());
            }
        }
        if (voList.size() > 0) {
            this.getArapBillBO().updateSourceBillBatchIsReded(voList.toArray(new BaseAggVO[0]), true);
        }
        if (precodeAggList.size() > 0) {
            this.getFinanceBillCodeUtils(bills).commitPreBillCode(precodeAggList.toArray(new AggregatedValueObject[0]));
        }
    }

    protected FinanceBillCodeUtils getFinanceBillCodeUtils(AggregatedValueObject[] bill) {
        FinanceBillCodeUtils util = ArapBillPubUtil.getBillCodeUtil(bill[0]);
        return util;
    }

    protected ArapBillBO getArapBillBO() {
        if (null == this.bo) {
            this.bo = new ArapBillBO();
        }
        return this.bo;
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        ValidatorFactory vf = new ValidatorFactory();
        return vf;
    }

    @Override
    protected void setBillCode(AggregatedValueObject[] bills) throws BusinessException {
        FinanceBillCodeUtils util = this.getFinanceBillCodeUtils(bills);
        ArrayList<AggregatedValueObject> lastVo = new ArrayList<AggregatedValueObject>();
        for (AggregatedValueObject bill : bills) {
            if (util.isPrecode(bill)) continue;
            lastVo.add(bill);
        }
        if (lastVo.size() > 0) {
            util.createBillCode(lastVo.toArray(new AggregatedValueObject[lastVo.size()]));
        }
    }
}

