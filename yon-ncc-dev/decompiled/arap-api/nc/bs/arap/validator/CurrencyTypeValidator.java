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
 *  nc.vo.pub.lang.UFDouble
 */
package nc.bs.arap.validator;

import java.util.HashMap;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.arap.utils.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;

public class CurrencyTypeValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 7968183353913646505L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            UFBoolean flag;
            this.setObj(aggvo);
            Integer billStatus = this.getHeadAttrValue("billstatus") == null ? null : (Integer)this.getHeadAttrValue("billstatus");
            Object object = flag = this.getHeadAttrValue("ismandatepay") == null ? UFBoolean.FALSE : this.getHeadAttrValue("ismandatepay");
            if (billStatus == -99 && !UFBoolean.TRUE.equals((Object)flag)) {
                return null;
            }
            HashMap<String, UFDouble> map = new HashMap<String, UFDouble>();
            if (null == this.getChildrenVO() || this.getChildrenVO().length <= 0) continue;
            for (CircularlyAccessibleValueObject vo : this.getChildrenVO()) {
                if (vo.getStatus() == 3) continue;
                if (null == this.getItemAttrValue(vo, "pk_currtype")) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0080"));
                }
                String top_billtype = (String)vo.getAttributeValue("top_billtype");
                if (StringUtil.isEmpty(top_billtype)) continue;
                UFDouble settlemoney = (UFDouble)vo.getAttributeValue("settlemoney");
                String key = Integer.parseInt(vo.getAttributeValue("direction").toString()) > 0 ? "money_de" : "money_cr";
                UFDouble money = (UFDouble)vo.getAttributeValue(key);
                String pk_billtype = (String)vo.getAttributeValue("pk_billtype");
                UFBoolean isrefund = (UFBoolean)this.getHeadAttrValue("isrefund");
                if (!pk_billtype.equals(top_billtype) && isrefund != null && !isrefund.booleanValue()) {
                    if (settlemoney == null || StringUtil.isEmpty(settlemoney.toString())) continue;
                    if (settlemoney.toDouble() > 0.0 && money.toDouble() < 0.0 || settlemoney.toDouble() < 0.0 && money.toDouble() > 0.0) {
                        return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0314"));
                    }
                    String top_itemid = (String)vo.getAttributeValue("top_itemid");
                    if (StringUtil.isEmpty(top_itemid)) continue;
                    if (map.get(top_itemid) == null) {
                        map.put(top_itemid, settlemoney);
                        continue;
                    }
                    if (!(settlemoney.toDouble() > 0.0 && ((UFDouble)map.get(top_itemid)).toDouble() < 0.0) && (!(settlemoney.toDouble() < 0.0) || !(((UFDouble)map.get(top_itemid)).toDouble() > 0.0))) continue;
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0314"));
                }
                if (pk_billtype.equals(top_billtype) && settlemoney != null && StringUtil.isEmpty(settlemoney.toString())) continue;
            }
        }
        return null;
    }
}

