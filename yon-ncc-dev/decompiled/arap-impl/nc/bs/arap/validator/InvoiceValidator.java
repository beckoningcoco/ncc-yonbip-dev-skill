/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.itf.sscivm.ivsale.service.ExchangeToIvAppService
 */
package nc.bs.arap.validator;

import java.util.Map;
import java.util.Objects;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nccloud.itf.sscivm.ivsale.service.ExchangeToIvAppService;

public class InvoiceValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj)) || !ARAPModuleEnableUtil.isSscivmEnabled(pk_group)) {
            return null;
        }
        ValidationFailure valida = null;
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            String billtype;
            this.setObj(aggvo);
            if (null == this.getParentVO() || !Objects.equals(billtype = (String)this.getHeadAttrValue("pk_billtype"), "F0")) continue;
            ExchangeToIvAppService servive = (ExchangeToIvAppService)NCLocator.getInstance().lookup(ExchangeToIvAppService.class);
            Map hasfalgMap = null;
            try {
                hasfalgMap = servive.checkApplicationStatus(new String[]{this.getParentVO().getPrimaryKey()});
            }
            catch (BusinessException e) {
                return new ValidationFailure(e.getMessage());
            }
            if (hasfalgMap == null) continue;
            for (String key : hasfalgMap.keySet()) {
                if (((Boolean)hasfalgMap.get(key)).booleanValue() || !Objects.equals(key, this.getHeadAttrValue("pk_recbill"))) continue;
                valida = new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0975"));
            }
        }
        return valida;
    }
}

