/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.pubitf.arap.payable.IArapPayableBillPubService
 *  nc.pubitf.arap.receivable.IArapReceivableBillPubService
 *  nc.vo.arap.payable.AggPayableBillVO
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nccloud.pubitf.arap.pub.IArapBillPubServiceAdapterForAM
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.pubimpl.arap.arappub;

import nc.bs.framework.common.NCLocator;
import nc.pubitf.arap.payable.IArapPayableBillPubService;
import nc.pubitf.arap.receivable.IArapReceivableBillPubService;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.pubitf.arap.pub.IArapBillPubServiceAdapterForAM;
import org.apache.commons.lang3.ArrayUtils;

public class ArapBillPubServiceAdapterForAMImpl
implements IArapBillPubServiceAdapterForAM {
    public AggregatedValueObject[] combinSaveForEWM(AggregatedValueObject[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return null;
        }
        AggregatedValueObject[] resultBills = new AggregatedValueObject[bills.length];
        String pk_billtype = null;
        block8: for (int i = 0; i < bills.length; ++i) {
            switch (pk_billtype = (String)bills[i].getParentVO().getAttributeValue("pk_billtype")) {
                case "F0": {
                    resultBills[i] = ((IArapReceivableBillPubService)NCLocator.getInstance().lookup(IArapReceivableBillPubService.class)).save((AggReceivableBillVO)bills[i]);
                    continue block8;
                }
                case "F1": {
                    resultBills[i] = ((IArapPayableBillPubService)NCLocator.getInstance().lookup(IArapPayableBillPubService.class)).save((AggPayableBillVO)bills[i]);
                    continue block8;
                }
                default: {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1207"));
                }
            }
        }
        return resultBills;
    }

    public void combinDeleteForEWM(AggregatedValueObject[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        String pk_billtype = null;
        block8: for (int i = 0; i < bills.length; ++i) {
            switch (pk_billtype = (String)bills[i].getParentVO().getAttributeValue("pk_billtype")) {
                case "F0": {
                    ((IArapReceivableBillPubService)NCLocator.getInstance().lookup(IArapReceivableBillPubService.class)).delete((AggReceivableBillVO)bills[i]);
                    continue block8;
                }
                case "F1": {
                    ((IArapPayableBillPubService)NCLocator.getInstance().lookup(IArapPayableBillPubService.class)).delete((AggPayableBillVO)bills[i]);
                    continue block8;
                }
                default: {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1207"));
                }
            }
        }
    }
}

