/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nccloud.pubitf.platform.saga.CheckInfo
 *  nccloud.pubitf.platform.saga.ISagaStatusCheck
 */
package nc.bs.arap.validator;

import java.util.ArrayList;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nccloud.bs.arap.sagas.util.SagasUtils;
import nccloud.pubitf.platform.saga.CheckInfo;
import nccloud.pubitf.platform.saga.ISagaStatusCheck;

public class FrozenStatusValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (!SagasUtils.isCompensateStage() && this.checkObj(obj).booleanValue()) {
            String billtype = null;
            ArrayList<String> pks = new ArrayList<String>();
            for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
                billtype = (String)aggvo.getParentVO().getAttributeValue("pk_billtype");
                String pk = (String)aggvo.getParentVO().getAttributeValue(ArapBillTypeInfo.getInstance(billtype).getTablePrimaryKeyBill());
                pks.add(pk);
            }
            try {
                CheckInfo checkInfo = new CheckInfo();
                checkInfo.setPkfieldName(ArapBillTypeInfo.getInstance(billtype).getTablePrimaryKeyBill());
                checkInfo.setPks(pks.toArray(new String[0]));
                checkInfo.setTableName(ArapBillTypeInfo.getInstance(billtype).getTableNameBill());
                ((ISagaStatusCheck)NCLocator.getInstance().lookup(ISagaStatusCheck.class)).checkSagaStatus(new CheckInfo[]{checkInfo});
            }
            catch (BusinessException e) {
                throw new BusinessRuntimeException(e.getMessage());
            }
        }
        return null;
    }
}

