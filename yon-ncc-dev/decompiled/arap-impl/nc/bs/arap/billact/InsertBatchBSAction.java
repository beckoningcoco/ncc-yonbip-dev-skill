/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.EventDispatcher
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.NCLocator
 *  nc.impl.pubapp.env.BSContext
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.vo.fipub.annotation.Business
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 */
package nc.bs.arap.billact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.billact.BillBaseBSAction;
import nc.bs.arap.billact.LogTime;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.EventDispatcher;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.env.BSContext;
import nc.itf.arap.bill.IArapBillQueryBaseService;
import nc.itf.arap.pub.IArapBillService;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.fipub.annotation.Business;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nccloud.bs.arap.sagas.util.SagasUtils;

public abstract class InsertBatchBSAction
extends BillBaseBSAction {
    public AggregatedValueObject[] insertVOs(AggregatedValueObject[] bills) throws BusinessException {
        return this.insertVOs(bills, UFBoolean.FALSE);
    }

    public AggregatedValueObject[] insertVOs(AggregatedValueObject[] pbills, UFBoolean withPK) throws BusinessException {
        AggregatedValueObject[] bills = pbills;
        if (null == bills || bills.length == 0) {
            throw new BusinessException("parameter is null!");
        }
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(bills[0].getClass().getName());
        String id = bean.getID();
        this.tmpMap.put("beanid", id);
        long t1 = System.currentTimeMillis();
        this.doBeforeInsert(bills);
        LogTime.debug("\u5355\u636e\u65b0\u589e\u524d\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.setBillCode(bills);
        LogTime.debug("\u83b7\u53d6\u5355\u636e\u53f7", t1);
        t1 = System.currentTimeMillis();
        this.setBillStatus(bills);
        LogTime.debug("\u8bbe\u7f6e\u5355\u636e\u72b6\u6001", t1);
        t1 = System.currentTimeMillis();
        this.validate(bills);
        LogTime.debug("\u5355\u636e\u6821\u9a8c", t1);
        t1 = System.currentTimeMillis();
        this.doBeforeFireEvent(bills);
        LogTime.debug("\u5355\u636e\u65b0\u589e\u524d\u901a\u77e5\u76d1\u542c\u8005", t1);
        t1 = System.currentTimeMillis();
        bills = UFBoolean.TRUE.equals((Object)withPK) ? this.doInsertWithPK(bills) : this.doInsert(bills);
        LogTime.debug("\u5355\u636e\u4fdd\u5b58\u5230\u6570\u636e\u5e93", t1);
        t1 = System.currentTimeMillis();
        SagasUtils.frozenAndAddSaga("save", bills);
        LogTime.debug("\u6dfb\u52a0sagas\u4e8b\u52a1\u4ee5\u53ca\u51bb\u7ed3\u5355\u636e", System.currentTimeMillis() - t1);
        t1 = System.currentTimeMillis();
        LogTime.debug("\u5355\u636e\u65b0\u589e\u540e\u6743\u9650\u9a8c\u8bc1", System.currentTimeMillis() - t1);
        t1 = System.currentTimeMillis();
        this.doAfterInsert(bills);
        LogTime.debug("\u5355\u636e\u65b0\u589e\u540e\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.doAfterFireEvent(bills);
        LogTime.debug("\u5355\u636e\u65b0\u589e\u524d\u901a\u77e5\u76d1\u542c\u8005", t1);
        this.tmpMap.clear();
        this.doAfterHcApprove(bills);
        bills = this.dealFoutPaulBill(bills);
        t1 = System.currentTimeMillis();
        SagasUtils.setCompensateService("save", bills);
        LogTime.debug("\u6ce8\u518c\u8865\u507f\u63a5\u53e3", t1);
        return bills;
    }

    protected AggregatedValueObject[] dealFoutPaulBill(AggregatedValueObject[] bills) {
        if ("F2".equals(bills[0].getParentVO().getAttributeValue("pk_billtype")) && "30".equals(bills[0].getChildrenVO()[0].getAttributeValue("top_billtype"))) {
            try {
                CircularlyAccessibleValueObject[] newitems;
                CircularlyAccessibleValueObject[] olditems;
                HashMap<String, String> rowidmap = new HashMap<String, String>();
                boolean saveAndCommit = ((BaseAggVO)bills[0]).isSaveorSaveAndCommit();
                Map commitMap = (Map)bills[0].getParentVO().getAttributeValue("commitMap");
                for (CircularlyAccessibleValueObject item : olditems = bills[0].getChildrenVO()) {
                    rowidmap.put(item.getPrimaryKey(), (String)item.getAttributeValue("rowid"));
                }
                ArrayList<String> pk = new ArrayList<String>();
                for (AggregatedValueObject object : bills) {
                    pk.add(object.getParentVO().getPrimaryKey());
                }
                bills = ((IArapBillQueryBaseService)NCLocator.getInstance().lookup(ArapBillTypeInfo.getInstance(bills[0].getParentVO().getAttributeValue("pk_billtype")).getBillQueryService())).findBillByPrimaryKey(pk.toArray(new String[pk.size()]));
                for (CircularlyAccessibleValueObject item : newitems = bills[0].getChildrenVO()) {
                    item.setAttributeValue("rowid", rowidmap.get(item.getPrimaryKey()));
                }
                if (saveAndCommit) {
                    ((BaseAggVO)bills[0]).setSaveorSaveAndCommit(saveAndCommit);
                }
                if (commitMap != null) {
                    bills[0].getParentVO().setAttributeValue("commitMap", (Object)commitMap);
                }
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        return bills;
    }

    @Business(business="\u57fa\u7840\u5355\u636e", subBusiness="\u7ea2\u51b2", description="\u540e\u53f0\u4fdd\u5b58\u5355\u636e\u540e\u5224\u65ad\u7ea2\u51b2\u5355\u636e\u8fdb\u884c\u5ba1\u6279\u64cd\u4f5c\uff0c\u5e76\u56de\u5199\u6765\u6e90\u5355\u636e\u662f\u5426\u7ea2\u51b2\u5b57\u6bb5", type="\u666e\u901a\u4e1a\u52a1")
    protected void doAfterHcApprove(AggregatedValueObject[] bills) throws BusinessException {
        ArrayList<BaseAggVO> list = new ArrayList<BaseAggVO>();
        HashMap<String, String> redMap = new HashMap<String, String>();
        for (AggregatedValueObject object : bills) {
            BaseAggVO aggVO = (BaseAggVO)object;
            BaseBillVO pvo = (BaseBillVO)aggVO.getParentVO();
            boolean isHc = false;
            if (!"F0".equals(pvo.getPk_billtype()) && !"F1".equals(pvo.getPk_billtype()) && !"F2".equals(pvo.getPk_billtype()) && !"F3".equals(pvo.getPk_billtype())) continue;
            if (ArapBillPubUtil.isRedBill((AggregatedValueObject)aggVO)) {
                for (CircularlyAccessibleValueObject cObject : aggVO.getChildrenVO()) {
                    BaseItemVO vo = (BaseItemVO)cObject;
                    if (!(vo.getMoney_de().toDouble() < 0.0) && !(vo.getMoney_cr().toDouble() < 0.0) || !vo.getPk_billtype().equals(vo.getTop_billtype()) || vo.getOccupationmny().compareTo((Object)UFDouble.ZERO_DBL) != 0) continue;
                    isHc = true;
                    redMap.put(pvo.getPKFieldName() + " = '" + vo.getTop_billid() + "'", pvo.getTableName());
                    break;
                }
            }
            if (!isHc) continue;
            list.add(aggVO);
        }
        if (list.size() > 0) {
            ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).doIsredUpdate(redMap);
        }
    }

    protected void doAfterFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1002", (Object[])bills));
    }

    protected abstract void doAfterInsert(AggregatedValueObject[] var1) throws BusinessException;

    protected void doBeforeFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        ArapConstant constant = new ArapConstant();
        BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_ACTIONNAME, (Object)constant.ARAP_NTB_SAVE_KEY);
        if (bills != null && bills.length > 0 && ((BaseAggVO)bills[0]).isAlarmPassed()) {
            BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_FLAG, (Object)ArapConstant.ARAP_TBB_NOCHECK);
        }
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1001", (Object[])bills));
    }

    protected abstract void doBeforeInsert(AggregatedValueObject[] var1) throws BusinessException;

    protected AggregatedValueObject[] doInsert(AggregatedValueObject[] bills) throws BusinessException {
        if (bills instanceof IBill[]) {
            this.getBilloperator().insert((IBill[])bills);
        } else if (bills != null && bills.length > 0 && bills[0] instanceof IBill) {
            IBill[] ibills = new IBill[bills.length];
            System.arraycopy(bills, 0, ibills, 0, bills.length);
            this.getBilloperator().insert(ibills);
        }
        return bills;
    }

    protected AggregatedValueObject[] doInsertWithPK(AggregatedValueObject[] bills) throws DAOException {
        return null;
    }

    protected void setBillCode(AggregatedValueObject[] bills) throws BusinessException {
    }

    protected void setBillStatus(AggregatedValueObject[] bills) throws BusinessException {
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setStatus(2);
        }
    }
}

