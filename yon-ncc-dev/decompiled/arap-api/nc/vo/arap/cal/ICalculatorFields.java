/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap.cal;

import java.util.List;
import java.util.Map;

public interface ICalculatorFields {
    public static final String SUMMNY_ORIGINAL = "SUMMNY_ORIGINAL";
    public static final String MONEY_ORIGINAL = "MONEY_ORIGINAL";
    public static final String TAX_ORIGINAL = "TAX_ORIGINAL";
    public static final String NUM = "NUM";
    public static final String TAXRATE = "TAXRATE";
    public static final String NET_TAXPRICE_ORIGINAL = "NET_TAXPRICE_ORIGINAL";
    public static final String NET_PRICE_ORIGINAL = "NET_PRICE_ORIGINAL";
    public static final String DISCOUNT_TAX_TYPE_KEY = "DISCOUNT_TAX_TYPE_KEY";
    public static final String SUMMNY_LOCAL = "SUMMNY_LOCAL";
    public static final String MONEY_LOCAL = "MONEY_LOCAL";
    public static final String TAX_LOCAL = "TAX_LOCAL";
    public static final String EXCHANGE_O_TO_BRATE = "EXCHANGE_O_TO_BRATE";
    public static final String CURRTYPEPK = "CURRTYPEPk";
    public static final String PK_ORG = "PK_ORG";
    public static final String BILLDATE = "BILLDATE";
    public static final String DISCOUNT_TAX_TYPE = "DISCOUNT_TAX_TYPE";
    public static final String BALANCE_ORIGINAL = "BALANCE_ORIGINAL";
    public static final String BALANCE_LOCAL = "BALANCE_LOCAL";
    public static final String BALANCE_NUM = "BALANCE_NUM";

    public List<Map<String, String>> getCalFields(String var1);
}

