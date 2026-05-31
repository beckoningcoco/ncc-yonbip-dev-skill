/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.bd.income.IncomeChVO
 *  nc.vo.bd.payment.PaymentChVO
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 *  nc.vo.pub.lang.UFDate
 */
package nc.vo.arap.termitem;

import nc.vo.bd.income.IncomeChVO;
import nc.vo.bd.payment.PaymentChVO;
import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;
import nc.vo.pub.lang.UFDate;

public class ArapTermDateVO
extends ValueObject {
    private static final long serialVersionUID = 1L;
    private UFDate paydate;
    private UFDate expiredate;
    private boolean isIncome = true;
    private PaymentChVO paymentvo;
    private IncomeChVO incomevo;

    public UFDate getPaydate() {
        return this.paydate;
    }

    public void setPaydate(UFDate paydate) {
        this.paydate = paydate;
    }

    public UFDate getExpiredate() {
        return this.expiredate;
    }

    public void setExpiredate(UFDate expiredate) {
        this.expiredate = expiredate;
    }

    public boolean isIncome() {
        return this.isIncome;
    }

    public void setIncome(boolean isIncome) {
        this.isIncome = isIncome;
    }

    public PaymentChVO getPaymentvo() {
        return this.paymentvo;
    }

    public void setPaymentvo(PaymentChVO paymentvo) {
        this.paymentvo = paymentvo;
    }

    public IncomeChVO getIncomevo() {
        return this.incomevo;
    }

    public void setIncomevo(IncomeChVO incomevo) {
        this.incomevo = incomevo;
    }

    public String getEntityName() {
        return null;
    }

    public void validate() throws ValidationException {
    }
}

