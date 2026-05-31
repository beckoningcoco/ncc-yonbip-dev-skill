/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.itf.fbm.gather.IGatherQueryService
 *  nc.vo.fbm.register.AggRegisterVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.StringUtils
 */
package nc.bs.arap.validator;

import java.util.ArrayList;
import java.util.HashMap;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.itf.fbm.gather.IGatherQueryService;
import nc.vo.fbm.register.AggRegisterVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class PayBillChecknoValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;
    private static final String RECEIVEUNIT = "receiveunit";
    private static final String PK_BILLTYPECODE = "pk_billtypecode";
    private static final String PK_REGISTER = "pk_register";
    private static final String BILLTYPECODE = "36H2";

    public ValidationFailure validate(Object obj) {
        if (this.checkObj(obj).booleanValue()) {
            String errormessage;
            AggregatedValueObject[] aggVOs = (AggregatedValueObject[])obj;
            Object[] childrenVO = aggVOs[0].getChildrenVO();
            if (ArrayUtils.isEmpty((Object[])childrenVO)) {
                return null;
            }
            try {
                errormessage = this.validatorData((CircularlyAccessibleValueObject[])childrenVO);
            }
            catch (BusinessException e) {
                errormessage = e.getMessage();
            }
            return errormessage == null ? null : new ValidationFailure(errormessage);
        }
        return null;
    }

    @Override
    public UFBoolean checkObj(Object obj) {
        if (null != obj && obj instanceof AggregatedValueObject[]) {
            AggregatedValueObject[] aggVOs = (AggregatedValueObject[])obj;
            String billType = (String)aggVOs[0].getParentVO().getAttributeValue("pk_billtype");
            if (billType != null && billType.equals("F3")) {
                return UFBoolean.TRUE;
            }
            return UFBoolean.FALSE;
        }
        return UFBoolean.FALSE;
    }

    private String validatorData(CircularlyAccessibleValueObject[] childrenVO) throws BusinessException {
        ArrayList<String> pkcheckno = new ArrayList<String>();
        ArrayList<String> errorRowList = new ArrayList<String>();
        HashMap<String, String> comparemap = new HashMap<String, String>();
        int row = 1;
        for (CircularlyAccessibleValueObject vo : childrenVO) {
            String checkno = (String)vo.getAttributeValue("checkno");
            String supplier = (String)vo.getAttributeValue("supplier");
            if (StringUtils.isNotEmpty((CharSequence)checkno)) {
                pkcheckno.add(checkno);
                comparemap.put(supplier, checkno + "-" + row);
            }
            ++row;
        }
        AggRegisterVO[] vos = ((IGatherQueryService)NCLocator.getInstance().lookup(IGatherQueryService.class)).queryGatherVOByPKs(pkcheckno.toArray(new String[0]), new String[]{PK_REGISTER, RECEIVEUNIT, PK_BILLTYPECODE});
        String pkregister = null;
        for (AggRegisterVO vo : vos) {
            if (!BILLTYPECODE.equals(vo.getparentVO().getPk_billtypecode())) continue;
            pkregister = vo.getparentVO().getPk_register();
            String supplier = (String)vo.getParentVO().getAttributeValue(RECEIVEUNIT);
            if (supplier == null || pkregister.equals(comparemap.get(supplier))) continue;
            errorRowList.add(((String)comparemap.get(supplier)).split("-")[1]);
        }
        if (errorRowList.size() == 0) {
            return null;
        }
        String errormsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1236");
        String errorRow = String.join((CharSequence)",", errorRowList);
        errormsg = errormsg + errorRow + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1237");
        return errormsg;
    }
}

