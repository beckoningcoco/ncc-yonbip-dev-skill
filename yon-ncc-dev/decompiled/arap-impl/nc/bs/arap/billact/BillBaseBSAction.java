/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uap.lock.PKLock
 *  nc.bs.uif2.LockFailedException
 *  nc.bs.uif2.validation.ValidationException
 *  nc.bs.uif2.validation.ValidationFrameworkUtil
 *  nc.bs.uif2.validation.Validator
 *  nc.impl.pubapp.pattern.data.bill.BillOperator
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 *  nc.vo.util.BDVersionValidationUtil
 */
package nc.bs.arap.billact;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.bs.arap.billact.IBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.uap.lock.PKLock;
import nc.bs.uif2.LockFailedException;
import nc.bs.uif2.validation.ValidationException;
import nc.bs.uif2.validation.ValidationFrameworkUtil;
import nc.bs.uif2.validation.Validator;
import nc.impl.pubapp.pattern.data.bill.BillOperator;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.vo.util.BDVersionValidationUtil;

public abstract class BillBaseBSAction
implements IBSAction {
    public static final String BEANID = "beanid";
    protected BillOperator<IBill> billoperator;
    protected Map<Object, Object> tmpMap = new HashMap<Object, Object>();
    protected IValidatorFactory vf;
    protected Set<Integer> validatorCode = new HashSet<Integer>();
    private int[] unionCode = null;

    public static String getTimeStampString(long l) {
        Date d = new Date();
        Calendar cl = Calendar.getInstance();
        cl.setTime(d);
        int[] ia = new int[5];
        int year = cl.get(1);
        ia[0] = cl.get(2) + 1;
        ia[1] = cl.get(5);
        ia[2] = cl.get(11);
        ia[3] = cl.get(12);
        ia[4] = cl.get(13);
        byte[] ba = new byte[19];
        ba[4] = 45;
        ba[7] = ba[4];
        ba[10] = 32;
        ba[13] = 58;
        ba[16] = ba[13];
        ba[0] = (byte)(year / 1000 + 48);
        ba[1] = (byte)(year / 100 % 10 + 48);
        ba[2] = (byte)(year / 10 % 10 + 48);
        ba[3] = (byte)(year % 10 + 48);
        for (int i = 0; i < 5; ++i) {
            ba[i * 3 + 5] = (byte)(ia[i] / 10 + 48);
            ba[i * 3 + 6] = (byte)(ia[i] % 10 + 48);
        }
        return new String(ba);
    }

    public String dynamicLock(AggregatedValueObject ... bills) throws BusinessException {
        String[] pks = new String[bills.length];
        int size = pks.length;
        for (int i = 0; i < size; ++i) {
            pks[i] = bills[i].getParentVO().getPrimaryKey();
        }
        if (!PKLock.getInstance().addBatchDynamicLock(pks)) {
            throw new LockFailedException(pks);
        }
        return null;
    }

    public BillOperator<IBill> getBilloperator() {
        if (null == this.billoperator) {
            this.billoperator = new BillOperator();
        }
        return this.billoperator;
    }

    public AggregatedValueObject getOriBillVO(AggregatedValueObject bill) throws BusinessException {
        return (AggregatedValueObject)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(bill.getClass(), bill.getParentVO().getPrimaryKey(), false);
    }

    public void setBilloperator(BillOperator<IBill> billoperator) {
        this.billoperator = billoperator;
    }

    protected void checkBillsTs(AggregatedValueObject ... bills) throws BusinessException {
        ArrayList<SuperVO> superVOs = new ArrayList<SuperVO>();
        for (AggregatedValueObject bill : bills) {
            superVOs.add((SuperVO)bill.getParentVO());
        }
        BDVersionValidationUtil.validateSuperVO((SuperVO[])superVOs.toArray(new SuperVO[0]));
    }

    protected abstract IValidatorFactory getValidatorFactory();

    protected void setbillsLock(AggregatedValueObject ... bills) throws BusinessException {
        this.dynamicLock(bills);
    }

    private int[] getUninCode() {
        if (this.unionCode == null) {
            Integer[] array = this.validatorCode.toArray(new Integer[0]);
            this.unionCode = new int[this.validatorCode.size()];
            for (int i = 0; i < this.unionCode.length; ++i) {
                this.unionCode[i] = array[i];
            }
        }
        return this.unionCode;
    }

    protected void validate(AggregatedValueObject ... bills) throws ValidationException {
        int[] unionCode;
        List<Validator> validatorList;
        if (null == this.vf) {
            this.vf = this.getValidatorFactory();
        }
        if (null != this.vf && null != (validatorList = this.vf.build(unionCode = this.getUninCode()))) {
            ValidationFrameworkUtil.createValidationService((Validator[])validatorList.toArray(new Validator[0])).validate((Object)bills);
        }
    }

    protected void validateWithPermission(AggregatedValueObject ... bills) throws ValidationException {
        this.validate(bills);
    }

    protected void setBillStatus(AggregatedValueObject[] bills, Integer value) throws BusinessException {
        this.checkBills(bills);
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setAttributeValue("billstatus", (Object)value);
        }
    }

    protected void setEffectstatus(AggregatedValueObject[] bills, Integer value) throws BusinessException {
        this.checkBills(bills);
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setAttributeValue("effectstatus", (Object)value);
        }
    }

    private void checkBills(AggregatedValueObject[] bills) throws BusinessException {
        if (null == bills || bills.length == 0) {
            throw new BusinessException("parameter is null!");
        }
    }
}

