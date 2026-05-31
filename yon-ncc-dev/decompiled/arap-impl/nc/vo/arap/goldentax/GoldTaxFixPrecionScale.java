/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.goldentax;

import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDouble;

public class GoldTaxFixPrecionScale {
    private static final int DISCOUNTPOWER = 3;
    private static final int MNYPOWER = 2;
    private static final int NUMBERPOWER = 6;
    private static final int PRICEPOWER = 6;
    private static final int TAXCATEPOWER = 2;
    private AggregatedValueObject[] bills;

    public GoldTaxFixPrecionScale(AggregatedValueObject[] bills) {
        this.bills = bills;
    }

    public void setScale() {
        this.setPriceScale();
        this.setNumScale();
        this.setMoneyScale();
        this.setRateScale();
        this.setDiscountRateScale();
    }

    protected void setDiscountRateScale() {
        for (AggregatedValueObject vo : this.bills) {
            CircularlyAccessibleValueObject[] bvos;
            for (CircularlyAccessibleValueObject bvo : bvos = vo.getChildrenVO()) {
                UFDouble value = (UFDouble)bvo.getAttributeValue("discountrate");
                if (null == value) continue;
                bvo.setAttributeValue("discountrate", (Object)value.setScale(3, 4));
            }
        }
    }

    protected void setMoneyScale() {
        String[] mnykeys = new String[]{"notaxmny", "money", "discounttaxmny", "discountmny", "taxmny"};
        for (AggregatedValueObject vo : this.bills) {
            CircularlyAccessibleValueObject[] bvos;
            for (CircularlyAccessibleValueObject bvo : bvos = vo.getChildrenVO()) {
                for (String key : mnykeys) {
                    UFDouble value = (UFDouble)bvo.getAttributeValue(key);
                    if (null == value) continue;
                    bvo.setAttributeValue(key, (Object)value.setScale(2, 4));
                }
            }
        }
    }

    protected void setNumScale() {
        for (AggregatedValueObject vo : this.bills) {
            CircularlyAccessibleValueObject[] bvos;
            for (CircularlyAccessibleValueObject bvo : bvos = vo.getChildrenVO()) {
                UFDouble value = (UFDouble)bvo.getAttributeValue("quentity");
                if (null == value) continue;
                bvo.setAttributeValue("quentity", (Object)value.setScale(6, 4));
            }
        }
    }

    protected void setPriceScale() {
        for (AggregatedValueObject vo : this.bills) {
            CircularlyAccessibleValueObject[] bvos;
            for (CircularlyAccessibleValueObject bvo : bvos = vo.getChildrenVO()) {
                UFDouble value = (UFDouble)bvo.getAttributeValue("notaxprice");
                if (null == value) continue;
                bvo.setAttributeValue("notaxprice", (Object)value.setScale(6, 4));
                value = (UFDouble)bvo.getAttributeValue("price");
                if (null == value) continue;
                bvo.setAttributeValue("price", (Object)value.setScale(6, 4));
            }
        }
    }

    protected void setRateScale() {
        for (AggregatedValueObject vo : this.bills) {
            CircularlyAccessibleValueObject[] bvos;
            for (CircularlyAccessibleValueObject bvo : bvos = vo.getChildrenVO()) {
                UFDouble value = (UFDouble)bvo.getAttributeValue("taxrate");
                if (null == value) continue;
                bvo.setAttributeValue("taxrate", (Object)value.setScale(2, 4));
            }
        }
    }
}

