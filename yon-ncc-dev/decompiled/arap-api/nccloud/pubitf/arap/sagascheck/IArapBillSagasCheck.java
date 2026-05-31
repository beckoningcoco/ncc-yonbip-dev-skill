/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.EventDispatcher
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.uap.lock.PKLock
 *  nc.bs.uif2.LockFailedException
 *  nc.bs.uif2.validation.ValidationFrameworkUtil
 *  nc.bs.uif2.validation.Validator
 *  nc.impl.pubapp.env.BSContext
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nc.vo.util.BDVersionValidationUtil
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.pubitf.arap.sagascheck;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.util.ArapBillVOUtils;
import nc.bs.arap.util.BillAccountCalendarUtils;
import nc.bs.arap.util.BillDateUtils;
import nc.bs.arap.util.BillMoneyVUtils;
import nc.bs.arap.validator.CrossRuleCheckValidator;
import nc.bs.arap.validator.ValidatorFactory;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.EventDispatcher;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.uap.lock.PKLock;
import nc.bs.uif2.LockFailedException;
import nc.bs.uif2.validation.ValidationFrameworkUtil;
import nc.bs.uif2.validation.Validator;
import nc.impl.pubapp.env.BSContext;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.util.BDVersionValidationUtil;
import nccloud.bs.arap.sagas.util.SagasUtils;
import org.apache.commons.lang3.ArrayUtils;

public interface IArapBillSagasCheck {
    public static final Set<Integer> validatorCode = new HashSet<Integer>();

    public String getBillType();

    default public void addInsertValidate() {
        this.clearValidateCode();
        validatorCode.add(74);
        validatorCode.add(39);
        validatorCode.add(37);
        validatorCode.add(72);
        validatorCode.add(73);
    }

    default public void addDeleteValidate() {
        this.clearValidateCode();
        validatorCode.add(77);
        validatorCode.add(74);
        validatorCode.add(7);
        validatorCode.add(45);
        validatorCode.add(6);
        validatorCode.add(66);
        validatorCode.add(67);
        validatorCode.add(68);
        validatorCode.add(72);
        validatorCode.add(73);
    }

    default public void billInsertSagasCheck(AggregatedValueObject ... bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills) || SagasUtils.isMerged) {
            return;
        }
        try {
            this.setPrecheckflag("arap_precheck_insert");
            this.doBeforeInsert(bills);
            this.addInsertValidate();
            this.doBeforeInsertFireEvent(bills);
            this.validate(bills);
        }
        catch (Exception e) {
            ExceptionUtils.wrappException((Exception)e);
        }
        finally {
            this.clearPrecheckflag();
        }
    }

    default public void billDeleteSagasCheck(AggregatedValueObject ... bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills) || SagasUtils.isMerged) {
            return;
        }
        try {
            this.setPrecheckflag("arap_precheck_delete");
            this.addDynamicLock(bills);
            this.checkBillsTs(bills);
            this.doBeforeDelete(bills);
            this.addDeleteValidate();
            this.doBeforeDeleteFireEvent(bills);
            this.validate(bills);
        }
        catch (Exception e) {
            ExceptionUtils.wrappException((Exception)e);
        }
        finally {
            this.clearPrecheckflag();
        }
    }

    default public void setPrecheckflag(String stage) {
        BSContext.getInstance().setSession("arap_precheck_stage", (Object)stage);
    }

    default public void clearPrecheckflag() {
        BSContext.getInstance().removeSession("arap_precheck_stage");
    }

    default public void deleteBillBySourceKeySagasCheck(String[] sourceKeys) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])sourceKeys)) {
            return;
        }
        IArapBilltypeInfo billTypeInfo = ArapBillTypeInfo.getInstance(this.getBillType());
        BaseAggVO[] bills = new ArapBillDAO().queryBillByTopBillKeys(sourceKeys, billTypeInfo);
        this.billDeleteSagasCheck((AggregatedValueObject[])bills);
    }

    default public void deleteBillBySourceItemKeySagasCheck(String[] sourceItemKeys) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])sourceItemKeys)) {
            return;
        }
        IArapBilltypeInfo billTypeInfo = ArapBillTypeInfo.getInstance(this.getBillType());
        BaseAggVO[] bills = new ArapBillDAO().queryBillByTopItemKeys(sourceItemKeys, billTypeInfo);
        this.billDeleteSagasCheck((AggregatedValueObject[])bills);
    }

    default public void doBeforeInsert(AggregatedValueObject ... bills) throws BusinessException {
        ArapBillPubUtil.fillTradeTypeInfo(bills);
        BillDateUtils.setBillDateByNow(bills);
        BillAccountCalendarUtils.setAccperiodYearMonth(bills);
        ArapBillVOUtils.prepareDefaultInfo(bills);
        BillMoneyVUtils.sumAllVoBodyToHead(bills);
        new CrossRuleCheckValidator().validate(bills);
        ArapBillPubUtil.resetDestVODoc(bills);
        ArapBillVOUtils.setMaterialInfo(bills);
    }

    default public void doBeforeDelete(AggregatedValueObject ... bills) throws BusinessException {
        BillAccountCalendarUtils.setAccperiodYearMonth(bills);
    }

    default public void doBeforeInsertFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(bills[0].getClass().getName());
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent(bean.getID(), "1001", (Object[])bills));
    }

    default public void doBeforeDeleteFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(bills[0].getClass().getName());
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent(bean.getID(), "1005", (Object[])bills));
    }

    default public void validate(AggregatedValueObject ... bills) throws BusinessException {
        List<Validator> validatorList;
        IValidatorFactory vf = this.getValidatorFactory();
        int[] unionCode = this.getUninCode();
        if (null != vf && null != unionCode && null != (validatorList = vf.build(unionCode))) {
            ValidationFrameworkUtil.createValidationService((Validator[])validatorList.toArray(new Validator[0])).validate((Object)bills);
        }
    }

    default public int[] getUninCode() {
        if (validatorCode.size() == 0) {
            return null;
        }
        return ArrayUtils.toPrimitive((Integer[])validatorCode.toArray(new Integer[0]));
    }

    default public void clearValidateCode() {
        validatorCode.clear();
    }

    default public IValidatorFactory getValidatorFactory() {
        ValidatorFactory factory = new ValidatorFactory();
        return factory;
    }

    default public void addDynamicLock(AggregatedValueObject ... bills) throws BusinessException {
        String[] pks = new String[bills.length];
        int size = pks.length;
        for (int i = 0; i < size; ++i) {
            pks[i] = bills[i].getParentVO().getPrimaryKey();
        }
        if (!PKLock.getInstance().addBatchDynamicLock(pks)) {
            throw new LockFailedException(pks);
        }
    }

    default public void checkBillsTs(AggregatedValueObject ... bills) throws BusinessException {
        ArrayList<SuperVO> superVOs = new ArrayList<SuperVO>();
        for (AggregatedValueObject bill : bills) {
            superVOs.add((SuperVO)bill.getParentVO());
        }
        BDVersionValidationUtil.validateSuperVO((SuperVO[])superVOs.toArray(new SuperVO[0]));
    }
}

