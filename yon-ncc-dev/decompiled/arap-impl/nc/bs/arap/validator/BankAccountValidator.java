/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.itf.bd.bankacc.subinfo.IBankAccSubInfoQueryService
 *  nc.itf.bd.cashaccount.ICashAccountQuerySerivce
 *  nc.vo.bd.bankaccount.BankAccSubVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.validator;

import java.util.HashMap;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.itf.bd.bankacc.subinfo.IBankAccSubInfoQueryService;
import nc.itf.bd.cashaccount.ICashAccountQuerySerivce;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.util.SqlUtils_Pub;
import nc.vo.bd.bankaccount.BankAccSubVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class BankAccountValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            ValidationFailure ret;
            this.setObj(aggvo);
            if (null != this.getChildrenVO() && this.getChildrenVO().length > 0) {
                int i = 0;
                for (CircularlyAccessibleValueObject vo : this.getChildrenVO()) {
                    if (vo.getStatus() == 3) continue;
                    if (null != this.getItemAttrValue(vo, "cashaccount") && null != this.getItemAttrValue(vo, "payaccount") && 1 == (Integer)this.getItemAttrValue(vo, "direction")) {
                        return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0067", null, new String[]{String.valueOf(i + 1)}));
                    }
                    if (null != this.getItemAttrValue(vo, "cashaccount") && null != this.getItemAttrValue(vo, "recaccount") && -1 == (Integer)this.getItemAttrValue(vo, "direction")) {
                        return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0066", null, new String[]{String.valueOf(i + 1)}));
                    }
                    ++i;
                }
            }
            if ((ret = this.currtypeConsisitency((BaseItemVO[])aggvo.getChildrenVO())) != null) {
                return ret;
            }
            ret = this.getCashAccount((BaseItemVO[])aggvo.getChildrenVO());
            if (ret == null) continue;
            return ret;
        }
        return null;
    }

    private ValidationFailure getCashAccount(BaseItemVO[] vo) {
        HashMap<String, String> acc2currMap = new HashMap<String, String>();
        for (BaseItemVO itemVO : vo) {
            if (!StringUtils.isNotEmpty((CharSequence)itemVO.getCashaccount())) continue;
            acc2currMap.put(itemVO.getCashaccount(), itemVO.getPk_currtype());
        }
        if (acc2currMap.size() == 0) {
            return null;
        }
        try {
            String conditionIn = SqlUtils_Pub.getInStr("pk_cashaccount", acc2currMap.keySet().toArray(new String[0]));
            Object[] cashAccountVOs = ((ICashAccountQuerySerivce)NCLocator.getInstance().lookup(ICashAccountQuerySerivce.class)).queryCashAccountVOsByCondition(conditionIn);
            if (ArrayUtils.isEmpty((Object[])cashAccountVOs)) {
                return null;
            }
            for (Object cashAccountVO : cashAccountVOs) {
                if (acc2currMap.get(cashAccountVO.getPk_cashaccount()) == null || cashAccountVO.getPk_moneytype().equals(acc2currMap.get(cashAccountVO.getPk_cashaccount()))) continue;
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0068"));
            }
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        return null;
    }

    private ValidationFailure currtypeConsisitency(BaseItemVO[] vo) {
        HashMap<String, String> acc2currMap = new HashMap<String, String>();
        for (BaseItemVO baseItemVO : vo) {
            if (StringUtils.isNotEmpty((CharSequence)baseItemVO.getRecaccount())) {
                acc2currMap.put(baseItemVO.getRecaccount(), baseItemVO.getPk_currtype());
            }
            if (!StringUtils.isNotEmpty((CharSequence)baseItemVO.getPayaccount())) continue;
            acc2currMap.put(baseItemVO.getPayaccount(), baseItemVO.getPk_currtype());
        }
        if (acc2currMap.size() > 0) {
            try {
                StringBuffer msg = new StringBuffer();
                IBankAccSubInfoQueryService basinfo = (IBankAccSubInfoQueryService)NCLocator.getInstance().lookup(IBankAccSubInfoQueryService.class);
                BankAccSubVO[] subInfos = basinfo.querySubInfosByPKs(acc2currMap.keySet().toArray(new String[0]));
                if (subInfos != null && subInfos.length > 0) {
                    for (BankAccSubVO subVO : subInfos) {
                        if (acc2currMap.get(subVO.getPk_bankaccbas()) == null || subVO.getPk_currtype().equals(acc2currMap.get(subVO.getPk_bankaccbas()))) continue;
                        msg.append(subVO.getAccname() + ",");
                    }
                    if (msg.length() > 0) {
                        String string2 = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0069");
                        string2 = string2 + ",[" + msg.substring(0, msg.lastIndexOf(",")).toString() + "]";
                        return new ValidationFailure(string2);
                    }
                }
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        return null;
    }
}

