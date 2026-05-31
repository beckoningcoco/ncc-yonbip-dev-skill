/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.StringUtils
 */
package nc.bs.arap.validator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class CuSupCheckNoValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;
    private static final String CHECKNO = "checkno";
    private String billType = null;

    public ValidationFailure validate(Object obj) {
        if (this.checkObj(obj).booleanValue()) {
            AggregatedValueObject[] aggVOs = (AggregatedValueObject[])obj;
            Object[] childrenVO = aggVOs[0].getChildrenVO();
            if (ArrayUtils.isEmpty((Object[])childrenVO)) {
                return null;
            }
            String errormessage = null;
            if (this.billType != null && this.billType.equals("F3")) {
                errormessage = this.validatorData((CircularlyAccessibleValueObject[])childrenVO, "supplier");
            } else if (this.billType != null && this.billType.equals("F2")) {
                errormessage = this.validatorData((CircularlyAccessibleValueObject[])childrenVO, "customer");
            }
            return errormessage == null ? null : new ValidationFailure(errormessage);
        }
        return null;
    }

    @Override
    public UFBoolean checkObj(Object obj) {
        if (null != obj && obj instanceof AggregatedValueObject[]) {
            AggregatedValueObject[] aggVOs = (AggregatedValueObject[])obj;
            this.billType = (String)aggVOs[0].getParentVO().getAttributeValue("pk_billtype");
            if (this.billType != null && (this.billType.equals("F2") || this.billType.equals("F3"))) {
                return UFBoolean.TRUE;
            }
            return UFBoolean.FALSE;
        }
        return UFBoolean.FALSE;
    }

    private String validatorData(CircularlyAccessibleValueObject[] childrenVO, String field) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        Map<Integer, String> errorMap = Collections.synchronizedMap(new IdentityHashMap());
        ArrayList<String> errormsg = new ArrayList<String>();
        int i = 1;
        int bodylenth = childrenVO.length;
        if (bodylenth == 1) {
            return null;
        }
        ArrayList<String> checkNoList = new ArrayList<String>();
        for (CircularlyAccessibleValueObject vo : childrenVO) {
            map.put((String)vo.getAttributeValue(field) + "-" + (String)vo.getAttributeValue(CHECKNO), i);
            ++i;
        }
        for (Map.Entry entry : map.entrySet()) {
            String checknoValue = ((String)entry.getKey()).split("-")[1];
            if (StringUtils.isEmpty((CharSequence)checknoValue) || "null".equals(checknoValue)) continue;
            if (checkNoList.contains(checknoValue)) {
                Integer fieldvvalue = (Integer)entry.getValue();
                errorMap.put(fieldvvalue, checknoValue);
            }
            checkNoList.add(checknoValue);
        }
        if (errorMap.size() == 0) {
            return null;
        }
        for (Map.Entry entry : errorMap.entrySet()) {
            String error = null;
            String cuSp = this.billType != null && this.billType.equals("F2") ? NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1234") : NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1235");
            error = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1232", null, new String[]{((Integer)entry.getKey()).toString(), cuSp});
            errormsg.add(error);
        }
        String msg = String.join((CharSequence)"\n", errormsg);
        return msg;
    }
}

