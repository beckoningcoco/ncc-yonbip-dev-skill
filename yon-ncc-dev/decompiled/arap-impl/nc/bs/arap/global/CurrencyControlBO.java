/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.fi.pub.Currency
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.bs.arap.global;

import java.util.Hashtable;
import nc.itf.fi.pub.Currency;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.lang.UFDouble;

public class CurrencyControlBO {
    int m_iCurrPosition = 2;
    private int m_iCurrRoundmode = 4;
    Hashtable<String, Integer[]> m_hCurrency = new Hashtable();

    public static UFDouble getFormat(int iPos, UFDouble je) {
        return CurrencyControlBO.getFormat(iPos, 4, je);
    }

    public static UFDouble getFormat(int iPos, int roundmode, UFDouble je) {
        if (je == null) {
            je = new UFDouble(0.0);
        }
        return je.setScale(iPos, roundmode);
    }

    public UFDouble getFormat(String currencyOID, UFDouble je) {
        if (je == null) {
            je = new UFDouble(0.0);
        }
        if (currencyOID != null) {
            this.setCurrencyType(currencyOID);
        }
        return this.getFormat(je);
    }

    public UFDouble getFormat(UFDouble je) {
        if (je == null) {
            je = new UFDouble(0.0);
        }
        return je.setScale(this.m_iCurrPosition, this.m_iCurrRoundmode);
    }

    public void setCurrencyType(String currOID) {
        if (currOID == null || currOID.trim().length() == 0) {
            return;
        }
        if (this.m_hCurrency.containsKey(currOID)) {
            this.m_iCurrPosition = this.m_hCurrency.get(currOID)[0];
            this.m_iCurrRoundmode = this.m_hCurrency.get(currOID)[1];
        } else {
            try {
                int[] values = Currency.getCurrDigitAndRoundtype((String)currOID);
                this.m_hCurrency.put(currOID, new Integer[]{values[0], values[1]});
                this.m_iCurrPosition = this.m_hCurrency.get(currOID)[0];
                this.m_iCurrRoundmode = this.m_hCurrency.get(currOID)[1];
            }
            catch (Exception e) {
                throw new BusinessRuntimeException(e.getMessage(), (Throwable)e);
            }
        }
    }
}

