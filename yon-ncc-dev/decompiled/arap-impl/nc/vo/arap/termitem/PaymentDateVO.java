/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.SuperVO
 */
package nc.vo.arap.termitem;

import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.SuperVO;

public class PaymentDateVO
extends SuperVO {
    private static final long serialVersionUID = -1602881634675069121L;
    private String billtype = null;
    private String billid = null;
    private String itemid = null;
    private int dateType;

    public String getBilltype() {
        return this.billtype;
    }

    public void setBilltype(String billtype) {
        this.billtype = billtype;
    }

    public String getBillid() {
        return this.billid;
    }

    public void setBillid(String billid) {
        this.billid = billid;
    }

    public String getItemid() {
        return this.itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public int getDateType() {
        return this.dateType;
    }

    public void setDateType(int dateType) {
        this.dateType = dateType;
    }

    public static enum AccountDate {
        PURCHASE_CONTRACT_EFFECTIVE_DATE(4),
        PURCHASE_INVOICE_APPROVE_DATE(10),
        PURCHASE_INVOICE_DATE(6),
        PURCHASE_ORDER_APPROVE_DATE(5),
        RECEIPT_APPROVE_DATE(7),
        STORE_RECEIPT_DATE(8),
        STORE_RECEIPT_SIGNATURE_DATE(9);

        private final int value;

        private AccountDate(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

        public static AccountDate valueOf(int value) {
            AccountDate obj = null;
            switch (value) {
                case 4: {
                    obj = PURCHASE_CONTRACT_EFFECTIVE_DATE;
                    break;
                }
                case 5: {
                    obj = PURCHASE_ORDER_APPROVE_DATE;
                    break;
                }
                case 6: {
                    obj = PURCHASE_INVOICE_DATE;
                    break;
                }
                case 7: {
                    obj = RECEIPT_APPROVE_DATE;
                    break;
                }
                case 8: {
                    obj = STORE_RECEIPT_DATE;
                    break;
                }
                case 9: {
                    obj = STORE_RECEIPT_SIGNATURE_DATE;
                    break;
                }
                case 10: {
                    obj = PURCHASE_INVOICE_APPROVE_DATE;
                    break;
                }
                default: {
                    throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0324"));
                }
            }
            return obj;
        }
    }
}

