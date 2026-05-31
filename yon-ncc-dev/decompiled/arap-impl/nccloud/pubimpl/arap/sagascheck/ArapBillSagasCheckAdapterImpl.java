/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nccloud.pubitf.arap.sagascheck.IArapBillSagasCheck
 *  nccloud.pubitf.arap.sagascheck.IArapBillSagasCheckAdapter
 *  nccloud.pubitf.arap.sagascheck.IArapEstiPayableBillSagasCheck
 *  nccloud.pubitf.arap.sagascheck.IArapEstiRecBillSagasCheck
 *  nccloud.pubitf.arap.sagascheck.IArapGatheringBillSagasCheck
 *  nccloud.pubitf.arap.sagascheck.IArapPayBillSagasCheck
 *  nccloud.pubitf.arap.sagascheck.IArapPayableBillSagasCheck
 *  nccloud.pubitf.arap.sagascheck.IArapRecBillSagasCheck
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.pubimpl.arap.sagascheck;

import nc.bs.framework.common.NCLocator;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.pubitf.arap.sagascheck.IArapBillSagasCheck;
import nccloud.pubitf.arap.sagascheck.IArapBillSagasCheckAdapter;
import nccloud.pubitf.arap.sagascheck.IArapEstiPayableBillSagasCheck;
import nccloud.pubitf.arap.sagascheck.IArapEstiRecBillSagasCheck;
import nccloud.pubitf.arap.sagascheck.IArapGatheringBillSagasCheck;
import nccloud.pubitf.arap.sagascheck.IArapPayBillSagasCheck;
import nccloud.pubitf.arap.sagascheck.IArapPayableBillSagasCheck;
import nccloud.pubitf.arap.sagascheck.IArapRecBillSagasCheck;
import org.apache.commons.lang3.ArrayUtils;

public class ArapBillSagasCheckAdapterImpl
implements IArapBillSagasCheckAdapter {
    public void billInsertSagasCheck(AggregatedValueObject ... bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        this.sagasCheck(bills, true);
    }

    public void billDeleteSagasCheck(AggregatedValueObject ... bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        this.sagasCheck(bills, false);
    }

    private void sagasCheck(AggregatedValueObject[] bills, boolean isInsert) throws BusinessException {
        String pk_billtype = null;
        for (AggregatedValueObject bill : bills) {
            pk_billtype = (String)bill.getParentVO().getAttributeValue("pk_billtype");
            IArapBillSagasCheck checkService = this.getSagasCheckService(pk_billtype);
            if (isInsert) {
                checkService.billInsertSagasCheck(new AggregatedValueObject[]{bill});
                continue;
            }
            checkService.billDeleteSagasCheck(new AggregatedValueObject[]{bill});
        }
    }

    private IArapBillSagasCheck getSagasCheckService(String pk_billtype) throws BusinessException {
        Class<IArapRecBillSagasCheck> sagasCheckClass = null;
        switch (pk_billtype) {
            case "F0": {
                sagasCheckClass = IArapRecBillSagasCheck.class;
                break;
            }
            case "F1": {
                sagasCheckClass = IArapPayableBillSagasCheck.class;
                break;
            }
            case "F2": {
                sagasCheckClass = IArapGatheringBillSagasCheck.class;
                break;
            }
            case "F3": {
                sagasCheckClass = IArapPayBillSagasCheck.class;
                break;
            }
            case "23E0": {
                sagasCheckClass = IArapEstiRecBillSagasCheck.class;
                break;
            }
            case "23E1": {
                sagasCheckClass = IArapEstiPayableBillSagasCheck.class;
                break;
            }
        }
        return (IArapBillSagasCheck)NCLocator.getInstance().lookup(sagasCheckClass);
    }
}

