/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.verify.AdjuestVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nccloud.pubitf.arap.sagascheck.IArapEstiPayableBillSagasCheck
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.pubimpl.arap.sagascheck;

import java.util.Map;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.verify.AdjuestVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.pubimpl.arap.sagascheck.AbstractEstiBillBO;
import nccloud.pubitf.arap.sagascheck.IArapEstiPayableBillSagasCheck;
import org.apache.commons.lang3.ArrayUtils;

public class ArapEstiPayableBillSagasCheckImpl
extends AbstractEstiBillBO
implements IArapEstiPayableBillSagasCheck {
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
        validatorCode.add(24);
        validatorCode.add(19);
    }

    public void addDeleteValidate() {
        super.addDeleteValidate();
        validatorCode.remove(7);
        validatorCode.add(11);
        validatorCode.add(12);
        validatorCode.add(27);
        validatorCode.add(32);
    }

    public String getBillType() {
        return "23E1";
    }

    @Override
    protected boolean isReceive() {
        return false;
    }

    public void billInsertSagasCheck(AggregatedValueObject ... bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        super.billInsertSagasCheck(bills);
        this.approveValidate(bills);
    }

    public void billDeleteSagasCheck(AggregatedValueObject ... bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        this.unApproveValidate(bills);
        this.fipDeleteValidate(bills);
        super.billDeleteSagasCheck(bills);
    }

    public void deleteBillBySrcItemKeyAndOrgSagasCheck(Map<String, String> param) throws BusinessException {
        AggregatedValueObject[] bills = this.queryEstiBillBySrcPKAndOrg(param);
        this.billDeleteSagasCheck(bills);
    }

    public void estiSagasCheck(AdjuestVO[] adjustVOs) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])adjustVOs)) {
            return;
        }
        BaseAggVO[] bills = this.constructEstiBill(adjustVOs);
        this.billInsertSagasCheck((AggregatedValueObject[])bills);
    }

    public void unEstiSagasCheck(String[] batchNos) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])batchNos)) {
            return;
        }
        AggregatedValueObject[] bills = this.queryEstiBillByBatchNo(batchNos);
        this.billDeleteSagasCheck(bills);
    }

    private void approveValidate(AggregatedValueObject ... bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        this.approveBeforeValidate(bills);
        this.addApproveValidate();
        this.validate(bills);
    }

    private void unApproveValidate(AggregatedValueObject ... bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
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

