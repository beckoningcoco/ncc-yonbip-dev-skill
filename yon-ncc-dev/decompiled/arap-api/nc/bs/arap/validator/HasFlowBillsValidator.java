/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.arap.pub.E0Billtype
 *  nc.vo.arap.pub.E1Billtype
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.validator;

import java.util.ArrayList;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.itf.arap.pub.IArapBillService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.E0Billtype;
import nc.vo.arap.pub.E1Billtype;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;

public class HasFlowBillsValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        AggregatedValueObject[] bills = (AggregatedValueObject[])obj;
        ArrayList<String> pks = new ArrayList<String>(bills.length);
        for (AggregatedValueObject aggvo : bills) {
            String billtype = (String)aggvo.getParentVO().getAttributeValue("pk_billtype");
            UFBoolean isrefund = (UFBoolean)aggvo.getParentVO().getAttributeValue("isrefund");
            if (billtype.equals("23E0") || billtype.equals("23E1")) {
                E0Billtype arapBilltypeInfo = new E0Billtype();
                if (billtype.equals("23E1")) {
                    arapBilltypeInfo = new E1Billtype();
                }
                return this.checkflowbill(aggvo, (ArapBillTypeInfo)arapBilltypeInfo);
            }
            if (billtype.equals("F3") && isrefund != null && isrefund.booleanValue()) continue;
            this.setObj(aggvo);
            try {
                pks.add(aggvo.getParentVO().getPrimaryKey());
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        UFBoolean[] checkHasFlowBills = new UFBoolean[]{};
        IArapBillService service = (IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class);
        try {
            String billtype = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
            checkHasFlowBills = service.checkHasFlowBills(pks.toArray(new String[0]), billtype);
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < checkHasFlowBills.length; ++index) {
            UFBoolean ufBoolean = checkHasFlowBills[index];
            if (!ufBoolean.booleanValue()) continue;
            sb.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0045")).append(bills[index].getParentVO().getAttributeValue("billno")).append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            sb.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0512"));
            return new ValidationFailure(sb.toString());
        }
        UFBoolean[] checkHasPreVerifyLinkBills = null;
        try {
            checkHasPreVerifyLinkBills = service.checkHasPreVerifyLinkBills(pks.toArray(new String[0]));
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        if (checkHasPreVerifyLinkBills != null && checkHasPreVerifyLinkBills.length > 0) {
            for (int index = 0; index < checkHasPreVerifyLinkBills.length; ++index) {
                UFBoolean ufBoolean = checkHasPreVerifyLinkBills[index];
                if (!ufBoolean.booleanValue()) continue;
                sb.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0045")).append(bills[index].getParentVO().getAttributeValue("billno")).append(",");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
                sb.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0762"));
                return new ValidationFailure(sb.toString());
            }
        }
        return null;
    }

    private ValidationFailure checkflowbill(AggregatedValueObject aggvo, ArapBillTypeInfo arapBilltypeInfo) {
        try {
            String primaryKey = aggvo.getParentVO().getPrimaryKey();
            BaseAggVO[] bill = ArapBillDAO.getInstance().queryBillByTopBillKeys(new String[]{primaryKey}, arapBilltypeInfo);
            if (bill != null && bill.length != 0) {
                return new ValidationFailure(aggvo.getParentVO().getAttributeValue("billno") + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0512"));
            }
        }
        catch (BusinessException e) {
            ExceptionHandler.handleRuntimeException((Exception)((Object)e));
        }
        return null;
    }
}

