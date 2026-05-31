/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.pubitf.bd.accessor.IGeneralAccessor
 *  nc.pubitf.uapbd.ISupplierPubService
 *  nc.vo.bd.accessor.IBDData
 *  nc.vo.bd.supplier.finance.SupFinanceVO
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.pubitf.bd.accessor.IGeneralAccessor;
import nc.pubitf.uapbd.ISupplierPubService;
import nc.vo.bd.accessor.IBDData;
import nc.vo.bd.supplier.finance.SupFinanceVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class PayFreezeFlag
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        HashMap orgMsupplier = new HashMap();
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            for (CircularlyAccessibleValueObject item : aggvo.getChildrenVO()) {
                String supplier = (String)item.getAttributeValue("supplier");
                String key = (String)item.getAttributeValue("pk_org");
                if (orgMsupplier.get(key) == null) {
                    HashSet<String> val = new HashSet<String>();
                    val.add(supplier);
                    orgMsupplier.put(key, val);
                    continue;
                }
                ((Set)orgMsupplier.get(key)).add(supplier);
            }
        }
        ValidationFailure failures = null;
        if (orgMsupplier.size() == 0) {
            failures = null;
        } else if (orgMsupplier.size() == 1) {
            String msg = this.getPayFreezeFlagMsg(orgMsupplier.values().toArray(new Set[0])[0].toArray(new String[0]), orgMsupplier.keySet().toArray(new String[0])[0]);
            if (StringUtils.isNotEmpty((CharSequence)msg)) {
                msg = msg + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0534");
                failures = new ValidationFailure(msg);
            }
        } else {
            String msg = "";
            for (Map.Entry entry : orgMsupplier.entrySet()) {
                msg = msg + this.getPayFreezeFlagMsg(((Set)entry.getValue()).toArray(new String[0]), (String)entry.getKey());
            }
            if (StringUtils.isNotEmpty((CharSequence)msg)) {
                msg = msg + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0534");
                failures = new ValidationFailure(msg);
            }
        }
        return failures;
    }

    private String getPayFreezeFlagMsg(String[] suppliers, String pk_org) {
        ISupplierPubService qryservice = (ISupplierPubService)NCLocator.getInstance().lookup(ISupplierPubService.class);
        SupFinanceVO[] supfivos = null;
        try {
            supfivos = qryservice.getSupFinanceVO(suppliers, pk_org, new String[]{"payfreezeflag", "pk_supplier"});
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        StringBuffer msg = new StringBuffer();
        UFBoolean flag = UFBoolean.FALSE;
        if (!ArrayUtils.isEmpty(supfivos)) {
            IGeneralAccessor accessor = GeneralAccessorFactory.getAccessor((String)"985be8a4-3a36-4778-8afe-2d8ed3902659");
            IGeneralAccessor supaccessor = GeneralAccessorFactory.getAccessor((String)"720dcc7c-ff19-48f4-b9c5-b90906682f45");
            ArrayList<String> withfreezepk = new ArrayList<String>();
            for (SupFinanceVO vo : supfivos) {
                flag = vo.getPayfreezeflag();
                if (flag == null || !flag.booleanValue()) continue;
                withfreezepk.add(vo.getPk_supplier());
            }
            if (withfreezepk.size() > 0) {
                msg.append(accessor.getDocByPk(pk_org).getName()).append("[");
                IBDData[] supdocs = supaccessor.getDocbyPks(withfreezepk.toArray(new String[0]));
                for (int i = 0; i < supdocs.length; ++i) {
                    IBDData ibdData = supdocs[i];
                    msg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0000275") + ibdData.getName());
                    if (i == supdocs.length - 1) continue;
                    msg.append(",");
                }
                msg.append("]");
            }
        }
        return msg.toString();
    }
}

