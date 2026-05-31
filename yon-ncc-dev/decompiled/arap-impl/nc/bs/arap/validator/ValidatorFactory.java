/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.impl.pubapp.env.BSContext
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.validator.ACrossRuleValidator;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.arap.validator.AccountIsNullValidator;
import nc.bs.arap.validator.AccountRelationValidator;
import nc.bs.arap.validator.AccperiodNotNullValidator;
import nc.bs.arap.validator.ApproveBillDateValidator;
import nc.bs.arap.validator.ArapExpAmortizeSaveValidator;
import nc.bs.arap.validator.BankAccountValidator;
import nc.bs.arap.validator.BankaccCashValidator;
import nc.bs.arap.validator.BeginAndEndDateValidator;
import nc.bs.arap.validator.BillDateValidator;
import nc.bs.arap.validator.BillInfoNotNullValidator;
import nc.bs.arap.validator.BillMoneyDisposeValidator;
import nc.bs.arap.validator.BillPreVerifyValidator;
import nc.bs.arap.validator.BillRefundValidator;
import nc.bs.arap.validator.BillStatusApproveValidator;
import nc.bs.arap.validator.BillStatusCommitValidator;
import nc.bs.arap.validator.BillStatusDelValidator;
import nc.bs.arap.validator.BillStatusEditValidator;
import nc.bs.arap.validator.BillStatusUnApproveValidator;
import nc.bs.arap.validator.BodyRowsNotNullValidator;
import nc.bs.arap.validator.BodyRowsValidator;
import nc.bs.arap.validator.CMPSettlementValidator;
import nc.bs.arap.validator.ChangeBillCurrencyDirectionValidator;
import nc.bs.arap.validator.CheckDocAvailabilityValidator;
import nc.bs.arap.validator.CheckMoneyLegalValidator;
import nc.bs.arap.validator.ChecknoValidator;
import nc.bs.arap.validator.CloseAccCtrlValidator;
import nc.bs.arap.validator.CmpPayBillExsitValidator;
import nc.bs.arap.validator.CommissionPayValidator;
import nc.bs.arap.validator.CooperateBillDelValidator;
import nc.bs.arap.validator.CooperateMoneyValidator;
import nc.bs.arap.validator.CoorflagValidator;
import nc.bs.arap.validator.CortrolItemValidator;
import nc.bs.arap.validator.CreditMoneyValidator;
import nc.bs.arap.validator.CuSupCheckNoValidator;
import nc.bs.arap.validator.CurrTypeConsistencyValidator;
import nc.bs.arap.validator.CurrencyTypeValidator;
import nc.bs.arap.validator.CustomerSupplierValidator;
import nc.bs.arap.validator.DeleteOtherBillValidator;
import nc.bs.arap.validator.EbankDirectValidator;
import nc.bs.arap.validator.EffectStatusValidator;
import nc.bs.arap.validator.EstimateBillValidator;
import nc.bs.arap.validator.EuroRuleValidator;
import nc.bs.arap.validator.ExpenseApplyValidator;
import nc.bs.arap.validator.FaCardValidator;
import nc.bs.arap.validator.FrozenStatusValidator;
import nc.bs.arap.validator.HasFlowBillsValidator;
import nc.bs.arap.validator.ImgScanBeforeSaveValidator;
import nc.bs.arap.validator.InitCloseCtrlValidator;
import nc.bs.arap.validator.InitDateValidator;
import nc.bs.arap.validator.InterceptorValidator;
import nc.bs.arap.validator.InvoiceValidator;
import nc.bs.arap.validator.IsCancelApproveValidator;
import nc.bs.arap.validator.MaxValueValidator;
import nc.bs.arap.validator.MoneyBalanceValidator;
import nc.bs.arap.validator.MoneyRelationValidator;
import nc.bs.arap.validator.NetPayValidator;
import nc.bs.arap.validator.NoteInfoValidator;
import nc.bs.arap.validator.NoteTypeAndNoteNUMValidator;
import nc.bs.arap.validator.NoteTypeValidator;
import nc.bs.arap.validator.ObjectTypeValidator;
import nc.bs.arap.validator.OriAmountNotNullValidator;
import nc.bs.arap.validator.OriginCMPAPPLYBillValidator;
import nc.bs.arap.validator.OriginFTSBillValidator;
import nc.bs.arap.validator.OriginOTHERBillValidator;
import nc.bs.arap.validator.OriginPOBillValidator;
import nc.bs.arap.validator.OriginSystemValidator;
import nc.bs.arap.validator.PauseTransactValidator;
import nc.bs.arap.validator.PayBillChecknoValidator;
import nc.bs.arap.validator.PayBillValidator;
import nc.bs.arap.validator.PayFreezeFlag;
import nc.bs.arap.validator.PriceValueValidator;
import nc.bs.arap.validator.RecpaytypeValidator;
import nc.bs.arap.validator.ReferenceItemValidator;
import nc.bs.arap.validator.RemitAccountBillValidator;
import nc.bs.arap.validator.SettleAccountValidator;
import nc.bs.arap.validator.SettlementStateValidator;
import nc.bs.arap.validator.TaxRateValueValidator;
import nc.bs.arap.validator.TradeTypeValidator;
import nc.bs.arap.validator.VoucherValidator;
import nc.bs.arap.validator.isQzcantUnApproveValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.impl.pubapp.env.BSContext;
import nc.vo.pub.lang.UFBoolean;

public class ValidatorFactory
implements IValidatorFactory {
    @Override
    public List<Validator> build(int[] codes) {
        if (null == codes) {
            return null;
        }
        UFBoolean transferWriteBack = (UFBoolean)BSContext.getInstance().getSession("transferWriteBack");
        if (transferWriteBack != null && transferWriteBack.booleanValue()) {
            return Arrays.asList(new NullValidator());
        }
        ArrayList<Validator> ls = new ArrayList<Validator>();
        for (int code : codes) {
            Validator valida = this.build(code);
            if (null == valida) continue;
            ls.add(valida);
        }
        return ls;
    }

    public Validator build(int code) {
        AbstractValidator ret = null;
        switch (code) {
            case 0: {
                ret = new AccountIsNullValidator();
                break;
            }
            case 1: {
                ret = new AccountRelationValidator();
                break;
            }
            case 2: {
                ret = new ACrossRuleValidator();
                break;
            }
            case 3: {
                ret = new BillStatusApproveValidator();
                break;
            }
            case 4: {
                ret = new BeginAndEndDateValidator();
                break;
            }
            case 5: {
                ret = new BillDateValidator();
                break;
            }
            case 6: {
                ret = new BillMoneyDisposeValidator();
                break;
            }
            case 7: {
                ret = new BillStatusDelValidator();
                break;
            }
            case 8: {
                ret = new BillStatusEditValidator();
                break;
            }
            case 9: {
                ret = new BodyRowsValidator();
                break;
            }
            case 17: {
                ret = new CommissionPayValidator();
                break;
            }
            case 11: {
                ret = new CooperateBillDelValidator();
                break;
            }
            case 12: {
                ret = new CooperateMoneyValidator();
                break;
            }
            case 13: {
                ret = new CortrolItemValidator();
                break;
            }
            case 14: {
                ret = new CreditMoneyValidator();
                break;
            }
            case 15: {
                ret = new CurrencyTypeValidator();
                break;
            }
            case 16: {
                ret = new CurrTypeConsistencyValidator();
                break;
            }
            case 19: {
                ret = new EffectStatusValidator();
                break;
            }
            case 20: {
                ret = new EstimateBillValidator();
                break;
            }
            case 21: {
                ret = new ExpenseApplyValidator();
                break;
            }
            case 22: {
                ret = new MoneyBalanceValidator();
                break;
            }
            case 23: {
                ret = new MoneyRelationValidator();
                break;
            }
            case 24: {
                ret = new NoteInfoValidator();
                break;
            }
            case 25: {
                ret = new NoteTypeValidator();
                break;
            }
            case 26: {
                ret = new ObjectTypeValidator();
                break;
            }
            case 27: {
                ret = new OriginFTSBillValidator();
                break;
            }
            case 28: {
                ret = new OriginPOBillValidator();
                break;
            }
            case 29: {
                ret = new OriginSystemValidator();
                break;
            }
            case 30: {
                ret = new PauseTransactValidator();
                break;
            }
            case 31: {
                ret = new PriceValueValidator();
                break;
            }
            case 32: {
                ret = new ReferenceItemValidator();
                break;
            }
            case 33: {
                ret = new RemitAccountBillValidator();
                break;
            }
            case 34: {
                ret = new SettleAccountValidator();
                break;
            }
            case 35: {
                ret = new SettlementStateValidator();
                break;
            }
            case 36: {
                ret = new TaxRateValueValidator();
                break;
            }
            case 37: {
                ret = new TradeTypeValidator();
                break;
            }
            case 39: {
                ret = new BankAccountValidator();
                break;
            }
            case 40: {
                ret = new CustomerSupplierValidator();
                break;
            }
            case 41: {
                ret = new BankaccCashValidator();
                break;
            }
            case 42: {
                ret = new BodyRowsNotNullValidator();
                break;
            }
            case 43: {
                ret = new ChangeBillCurrencyDirectionValidator();
                break;
            }
            case 44: {
                ret = new OriAmountNotNullValidator();
                break;
            }
            case 45: {
                ret = new HasFlowBillsValidator();
                break;
            }
            case 46: {
                ret = new AccperiodNotNullValidator();
                break;
            }
            case 47: {
                ret = new isQzcantUnApproveValidator();
                break;
            }
            case 48: {
                ret = new PayFreezeFlag();
                break;
            }
            case 49: {
                ret = new MaxValueValidator();
                break;
            }
            case 50: {
                ret = new ApproveBillDateValidator();
                break;
            }
            case 51: {
                ret = new VoucherValidator();
                break;
            }
            case 52: {
                ret = new CoorflagValidator();
                break;
            }
            case 18: {
                ret = new DeleteOtherBillValidator();
                break;
            }
            case 38: {
                ret = new BillStatusUnApproveValidator();
                break;
            }
            case 53: {
                ret = new InitDateValidator();
                break;
            }
            case 54: {
                ret = new BillInfoNotNullValidator();
                break;
            }
            case 55: {
                ret = new NetPayValidator();
                break;
            }
            case 57: {
                ret = new EuroRuleValidator();
                break;
            }
            case 58: {
                ret = new PayBillValidator();
                break;
            }
            case 59: {
                ret = new ChecknoValidator();
                break;
            }
            case 60: {
                ret = new FaCardValidator();
                break;
            }
            case 61: {
                ret = new ImgScanBeforeSaveValidator();
                break;
            }
            case 62: {
                ret = new RecpaytypeValidator();
                break;
            }
            case 63: {
                ret = new ArapExpAmortizeSaveValidator();
                break;
            }
            case 64: {
                ret = new BillStatusCommitValidator();
                break;
            }
            case 66: {
                ret = new BillPreVerifyValidator();
                break;
            }
            case 67: {
                ret = new OriginCMPAPPLYBillValidator();
                break;
            }
            case 68: {
                ret = new OriginOTHERBillValidator();
                break;
            }
            case 69: {
                ret = new IsCancelApproveValidator();
                break;
            }
            case 70: {
                ret = new BillRefundValidator();
                break;
            }
            case 71: {
                ret = new InvoiceValidator();
                break;
            }
            case 72: {
                ret = new InitCloseCtrlValidator();
                break;
            }
            case 73: {
                ret = new CloseAccCtrlValidator();
                break;
            }
            case 74: {
                ret = new InterceptorValidator();
                break;
            }
            case 76: {
                ret = new CMPSettlementValidator();
                break;
            }
            case 77: {
                ret = new FrozenStatusValidator();
                break;
            }
            case 78: {
                ret = new NoteTypeAndNoteNUMValidator();
                break;
            }
            case 79: {
                ret = new CheckDocAvailabilityValidator();
                break;
            }
            case 80: {
                ret = new EbankDirectValidator();
                break;
            }
            case 81: {
                ret = new CuSupCheckNoValidator();
                break;
            }
            case 82: {
                ret = new PayBillChecknoValidator();
                break;
            }
            case 83: {
                ret = new CmpPayBillExsitValidator();
                break;
            }
            case 84: {
                ret = new CheckMoneyLegalValidator();
                break;
            }
        }
        return ret == null ? null : (Validator)ret;
    }

    public class NullValidator
    implements Validator {
        private static final long serialVersionUID = 1L;

        public ValidationFailure validate(Object obj) {
            return null;
        }
    }
}

