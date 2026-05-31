/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pubapp.scale.BillScaleProcessor
 *  nc.vo.pubapp.scale.BillVOScaleProcessor
 *  nc.vo.pubapp.scale.PosEnum
 */
package nc.vo.arap.goldentax;

import nc.vo.pub.AggregatedValueObject;
import nc.vo.pubapp.scale.BillScaleProcessor;
import nc.vo.pubapp.scale.BillVOScaleProcessor;
import nc.vo.pubapp.scale.PosEnum;

public class GoldTaxPrecionScale {
    private BillScaleProcessor scale;

    public GoldTaxPrecionScale(String pk_group, AggregatedValueObject[] bills) {
        this.scale = new BillVOScaleProcessor(pk_group, bills);
    }

    protected BillScaleProcessor getScale() {
        return this.scale;
    }

    protected void setMoneyScale() {
        String[] mnykeys = new String[]{"notaxmny", "money", "discounttaxmny", "discountmny", "taxmny"};
        this.scale.setMnyCtlInfo(mnykeys, PosEnum.body, null, "ccurrencyid", PosEnum.body, null);
    }

    protected void setNumScale() {
        String[] numkeys = new String[]{"quentity"};
        this.scale.setNumCtlInfo(numkeys, PosEnum.body, null, "cunitid", PosEnum.body, null);
    }

    protected void setRateScale() {
        String[] taxRateKey_B = new String[]{"taxrate"};
        this.scale.setTaxRateCtlInfo(taxRateKey_B, PosEnum.body, null);
    }
}

