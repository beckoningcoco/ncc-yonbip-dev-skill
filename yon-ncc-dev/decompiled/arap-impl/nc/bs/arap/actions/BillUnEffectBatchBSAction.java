/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.so.m30.sobalance.ISOBalanceQuery
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.bs.arap.actions;

import java.util.ArrayList;
import java.util.HashSet;
import nc.bs.arap.billact.BusiUpdateBatchBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.util.BillEffectUtils;
import nc.bs.arap.util.BillPersistenceUtils;
import nc.bs.arap.validator.ValidatorFactory;
import nc.bs.framework.common.NCLocator;
import nc.itf.so.m30.sobalance.ISOBalanceQuery;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import org.apache.commons.lang3.ArrayUtils;

public class BillUnEffectBatchBSAction
extends BusiUpdateBatchBSAction {
    public BillUnEffectBatchBSAction() {
        this.validatorCode.add(34);
        this.validatorCode.add(30);
        this.validatorCode.add(45);
        this.setBeforeEventType("200605");
        this.setAfterEventType("200606");
    }

    @Override
    protected void doAfterUpdate(AggregatedValueObject[] bills) throws BusinessException {
        BillEffectUtils.cancelRefundF3TOF2(bills);
    }

    @Override
    protected void doBeforeUpdate(AggregatedValueObject[] bills) throws BusinessException {
        String pk_billtype = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        boolean isSOEnable = ARAPModuleEnableUtil.isSOEnable((String)bills[0].getParentVO().getAttributeValue("pk_group"));
        if ("F2".equals(pk_billtype) && isSOEnable) {
            this.checkF2ForSOVerify(bills);
        }
    }

    @Override
    protected AggregatedValueObject[] doBusiness(AggregatedValueObject[] bills) throws BusinessException {
        ArrayList<String> fields = new ArrayList<String>(BillPersistenceUtils.EFFICTFIELD);
        for (AggregatedValueObject vo : bills) {
            BaseBillVO parent = (BaseBillVO)vo.getParentVO();
            parent.setEffectstatus(BillEnumCollection.InureSign.NOINURE.VALUE);
            parent.setBillstatus(BillEnumCollection.BillSatus.AUDIT.VALUE);
            parent.setEffectuser(null);
            parent.setEffectdate(null);
        }
        return BillPersistenceUtils.persistenceHeadVOs((AggregatedValueObject[])bills, fields);
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        ValidatorFactory factory = new ValidatorFactory();
        return factory;
    }

    @Override
    protected String getBusiType() {
        return "uneffect";
    }

    private void checkF2ForSOVerify(AggregatedValueObject[] bills) throws BusinessException {
        Object[] retVOs;
        ArrayList<String> pks = new ArrayList<String>();
        ArrayList<String> error = new ArrayList<String>();
        HashSet<String> topbilltype = new HashSet<String>();
        for (AggregatedValueObject bill : bills) {
            CircularlyAccessibleValueObject[] childrenVO;
            for (CircularlyAccessibleValueObject vo : childrenVO = bill.getChildrenVO()) {
                pks.add(vo.getPrimaryKey());
                topbilltype.add((String)vo.getAttributeValue("top_billtype"));
            }
        }
        if (topbilltype.size() >= 1) {
            String[] arapBilltype = new String[]{"F0", "F1", "F2", "F3"};
            boolean isreturn = false;
            for (String type : arapBilltype) {
                if (!topbilltype.contains(type)) continue;
                isreturn = true;
                break;
            }
            if (isreturn) {
                return;
            }
        }
        if (ArrayUtils.isEmpty((Object[])(retVOs = ((ISOBalanceQuery)NCLocator.getInstance().lookup(ISOBalanceQuery.class)).querySoBalanceViewByGatheringBillBodyIDs(pks.toArray(new String[0]))))) {
            return;
        }
        for (Object vo : retVOs) {
            error.add(vo.getBody().getVarbillcode());
        }
        String errorMsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0388") + String.join((CharSequence)",", error);
        throw new BusinessException(errorMsg);
    }
}

