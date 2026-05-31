/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.arap.gathering.GatheringBillItemVO
 *  nc.vo.arap.pay.PayBillItemVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDouble
 *  org.apache.commons.collections4.CollectionUtils
 */
package nc.bs.arap.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import nc.bs.arap.billact.BusiUpdateBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.util.BillEffectUtils;
import nc.bs.framework.common.NCLocator;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.arap.tally.ITallyService;
import nc.vo.arap.gathering.GatheringBillItemVO;
import nc.vo.arap.pay.PayBillItemVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDouble;
import org.apache.commons.collections4.CollectionUtils;

public class BillPrepayBSAction
extends BusiUpdateBSAction {
    private List<String> changedKeys;

    public BillPrepayBSAction(List<String> changedKeys) {
        this.changedKeys = changedKeys;
    }

    @Override
    protected void doAfterUpdate(AggregatedValueObject bill) throws BusinessException {
        String pk_billtype = "DF";
        String old_type = (String)bill.getParentVO().getAttributeValue("pk_billtype");
        String old_tradetype = (String)bill.getParentVO().getAttributeValue("pk_tradetype");
        UFDouble old_money = (UFDouble)bill.getParentVO().getAttributeValue("money");
        UFDouble new_money = UFDouble.ZERO_DBL;
        if (Objects.equals("F2", bill.getParentVO().getAttributeValue("pk_billtype"))) {
            pk_billtype = "DE";
        }
        bill.getParentVO().setAttributeValue("pk_billtype", (Object)pk_billtype);
        bill.getParentVO().setAttributeValue("pk_tradetype", (Object)pk_billtype);
        ArrayList<CircularlyAccessibleValueObject> items = new ArrayList<CircularlyAccessibleValueObject>();
        ArrayList<CircularlyAccessibleValueObject> old_items = new ArrayList<CircularlyAccessibleValueObject>();
        for (CircularlyAccessibleValueObject item : bill.getChildrenVO()) {
            item.setAttributeValue("pk_billtype", (Object)pk_billtype);
            item.setAttributeValue("pk_tradetype", (Object)pk_billtype);
            if (this.changedKeys.contains(item.getPrimaryKey())) {
                items.add(item);
                new_money = "DE".equals(pk_billtype) ? new_money.add((UFDouble)item.getAttributeValue("money_cr")) : new_money.add((UFDouble)item.getAttributeValue("money_de"));
            }
            old_items.add(item);
        }
        if (pk_billtype.equals("DE")) {
            bill.setChildrenVO((CircularlyAccessibleValueObject[])items.toArray(new GatheringBillItemVO[0]));
        } else {
            bill.setChildrenVO((CircularlyAccessibleValueObject[])items.toArray(new PayBillItemVO[0]));
        }
        ((ITallyService)NCLocator.getInstance().lookup(ITallyService.class)).billRevise4PreTally(Arrays.asList(bill));
        bill.getParentVO().setAttributeValue("money", (Object)new_money);
        if (CollectionUtils.isNotEmpty(this.changedKeys)) {
            bill.getParentVO().setAttributeValue("ChangeItemKeys", (Object)String.join((CharSequence)"-", this.changedKeys));
        }
        BillEffectUtils.sendDAPMessge(new AggregatedValueObject[]{bill});
        bill.setChildrenVO(old_items.toArray(bill.getChildrenVO()));
        bill.getParentVO().setAttributeValue("money", (Object)old_money);
        bill.getParentVO().setAttributeValue("pk_billtype", (Object)old_type);
        bill.getParentVO().setAttributeValue("pk_tradetype", (Object)old_tradetype);
        for (CircularlyAccessibleValueObject item : bill.getChildrenVO()) {
            item.setAttributeValue("pk_billtype", (Object)old_type);
            item.setAttributeValue("pk_tradetype", (Object)old_tradetype);
        }
    }

    @Override
    protected void doBeforeUpdate(AggregatedValueObject bill) throws BusinessException {
    }

    @Override
    protected AggregatedValueObject doBusiness(AggregatedValueObject bill) throws BusinessException {
        MDPersistenceService.lookupPersistenceService().saveBill((Object)bill);
        return bill;
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        return null;
    }
}

