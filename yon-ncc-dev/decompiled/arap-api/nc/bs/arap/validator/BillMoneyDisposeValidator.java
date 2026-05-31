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
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.validator;

import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.bill.util.BillEventHandlerUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nccloud.commons.lang.StringUtils;

public class BillMoneyDisposeValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;
    final int VERIFY_STAT = 1;
    final int RED_STAT = 2;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            Integer dispose;
            this.setObj(aggvo);
            if (null == this.getParentVO()) continue;
            if (((BaseBillVO)this.getParentVO()).getIsreded() != null && ((BaseBillVO)this.getParentVO()).getIsreded().booleanValue()) {
                for (CircularlyAccessibleValueObject item : aggvo.getChildrenVO()) {
                    Integer noteclass;
                    String pkNoteType = ((BaseItemVO)item).getChecktype();
                    if (StringUtils.isEmpty((CharSequence)pkNoteType) || (noteclass = BillEventHandlerUtil.getNoteClassByPK(pkNoteType)) != 2) continue;
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("20062006v61013_0", "020062006v61013-0006"));
                }
            }
            if (null == (dispose = this.getDisposeFlag())) continue;
            String msg = null;
            switch (dispose) {
                case 0: {
                    break;
                }
                case 1: {
                    msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0490");
                    break;
                }
                case 2: {
                    msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0305");
                    break;
                }
            }
            if (msg == null) continue;
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0306", null, new String[]{msg}));
        }
        return null;
    }

    private Integer getDisposeFlag() {
        UFBoolean redflag;
        if (this.getObj() != null && (redflag = (UFBoolean)this.getHeadAttrValue("isreded")) != null && redflag.booleanValue()) {
            return 2;
        }
        return null;
    }
}

