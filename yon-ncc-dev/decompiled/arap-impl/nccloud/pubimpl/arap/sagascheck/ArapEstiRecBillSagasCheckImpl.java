/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.verify.AdjuestVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nccloud.pubitf.arap.sagascheck.IArapEstiRecBillSagasCheck
 */
package nccloud.pubimpl.arap.sagascheck;

import java.util.Map;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.verify.AdjuestVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.pubimpl.arap.sagascheck.AbstractEstiBillBO;
import nccloud.pubitf.arap.sagascheck.IArapEstiRecBillSagasCheck;

public class ArapEstiRecBillSagasCheckImpl
extends AbstractEstiBillBO
implements IArapEstiRecBillSagasCheck {
    public void addInsertValidate() {
        super.addInsertValidate();
        validatorCode.add(15);
        validatorCode.add(29);
        validatorCode.add(37);
        validatorCode.add(31);
        validatorCode.add(36);
        validatorCode.add(23);
        validatorCode.add(26);
        validatorCode.add(2);
        validatorCode.add(28);
        validatorCode.add(8);
        validatorCode.add(24);
        validatorCode.add(19);
        validatorCode.add(28);
        validatorCode.add(37);
    }

    public void addDeleteValidate() {
        super.addDeleteValidate();
        validatorCode.remove(7);
        validatorCode.add(11);
        validatorCode.add(27);
        validatorCode.add(32);
    }

    public String getBillType() {
        return "23E0";
    }

    @Override
    protected boolean isReceive() {
        return true;
    }

    public void billInsertSagasCheck(AggregatedValueObject ... bills) throws BusinessException {
        super.billInsertSagasCheck(bills);
        this.approveValidate(bills);
    }

    public void billDeleteSagasCheck(AggregatedValueObject ... bills) throws BusinessException {
        this.unApproveValidate(bills);
        this.fipDeleteValidate(bills);
        super.billDeleteSagasCheck(bills);
    }

    public void deleteBillBySrcItemKeyAndOrgSagasCheck(Map<String, String> param) throws BusinessException {
        AggregatedValueObject[] bills = this.queryEstiBillBySrcPKAndOrg(param);
        this.billDeleteSagasCheck(bills);
    }

    public void estiSagasCheck(AdjuestVO[] adjustVOs) throws BusinessException {
        if (adjustVOs == null || adjustVOs.length == 0) {
            return;
        }
        BaseAggVO[] bills = this.constructEstiBill(adjustVOs);
        this.billInsertSagasCheck((AggregatedValueObject[])bills);
    }

    public void unEstiSagasCheck(String[] batchNos) throws BusinessException {
        if (batchNos == null || batchNos.length == 0) {
            return;
        }
        AggregatedValueObject[] bills = this.queryEstiBillByBatchNo(batchNos);
        this.billDeleteSagasCheck(bills);
    }

    private void approveValidate(AggregatedValueObject ... bills) throws BusinessException {
        this.approveBeforeValidate(bills);
        this.addApproveValidate();
        this.validate(bills);
    }

    private void unApproveValidate(AggregatedValueObject ... bills) throws BusinessException {
        this.unApproveBeforeValidate(bills);
        this.addUnApproveValidate();
        this.validate(bills);
    }

    private void addApproveValidate() {
        validatorCode.clear();
        validatorCode.add(3);
        validatorCode.add(50);
        validatorCode.add(30);
    }

    private void addUnApproveValidate() {
        validatorCode.clear();
        validatorCode.add(38);
        validatorCode.add(45);
        validatorCode.add(69);
    }
}

