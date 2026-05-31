/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 *  nc.vo.pubapp.pattern.model.transfer.bill.ClientBillToServer
 *  nc.vo.pubapp.pattern.model.transfer.bill.ServerBillCombinClient
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.bs.arap.util;

import nc.vo.pub.AggregatedValueObject;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.vo.pubapp.pattern.model.transfer.bill.ClientBillToServer;
import nc.vo.pubapp.pattern.model.transfer.bill.ServerBillCombinClient;
import org.apache.commons.lang3.ArrayUtils;

public class LightVOProducer {
    public static AggregatedValueObject[] produceLightVO(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) {
        Object lightVOs = null;
        lightVOs = ArrayUtils.isEmpty((Object[])orginBills) ? bills : (ArrayUtils.isEmpty((Object[])bills) ? null : LightVOProducer.castToAggVO(new ClientBillToServer().construct(LightVOProducer.castToIBill(bills), LightVOProducer.castToIBill(orginBills))));
        return lightVOs;
    }

    public static void combinLightVO(AggregatedValueObject[] bills, AggregatedValueObject[] lightVOs) {
        new ServerBillCombinClient().combine(LightVOProducer.castToIBill(bills), LightVOProducer.castToIBill(lightVOs));
    }

    private static IBill[] castToIBill(AggregatedValueObject[] bills) {
        IBill[] ibills = null;
        if (bills instanceof IBill[]) {
            ibills = (IBill[])bills;
        } else if (!ArrayUtils.isEmpty((Object[])bills) && bills[0] instanceof IBill) {
            ibills = new IBill[bills.length];
            System.arraycopy(bills, 0, ibills, 0, bills.length);
        }
        return ibills;
    }

    private static AggregatedValueObject[] castToAggVO(IBill[] bills) {
        AggregatedValueObject[] ibills = null;
        if (bills instanceof AggregatedValueObject[]) {
            ibills = (AggregatedValueObject[])bills;
        } else if (!ArrayUtils.isEmpty((Object[])bills) && bills[0] instanceof AggregatedValueObject) {
            ibills = new AggregatedValueObject[bills.length];
            System.arraycopy(bills, 0, ibills, 0, bills.length);
        }
        return ibills;
    }
}

