/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.itf.fi.pub.SysInit
 *  nc.pubitf.uapbd.IBalaTypePubService
 *  nc.vo.bd.balatype.BalaTypeVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.validator;

import java.util.HashMap;
import java.util.HashSet;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.itf.fi.pub.SysInit;
import nc.pubitf.uapbd.IBalaTypePubService;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.bd.balatype.BalaTypeVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nccloud.commons.lang.StringUtils;

public class EuroRuleValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        return this.validatorInternational(obj);
    }

    private ValidationFailure validatorInternational(Object obj) {
        HashMap<String, BalaTypeVO> map = new HashMap<String, BalaTypeVO>();
        IBalaTypePubService qryService = (IBalaTypePubService)NCLocator.getInstance().lookup(IBalaTypePubService.class);
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            HashSet<String> invoicenos;
            this.setObj(aggvo);
            BaseBillVO headVO = (BaseBillVO)this.getParentVO();
            String pk_balatype = headVO.getPk_balatype();
            BalaTypeVO btvo = (BalaTypeVO)map.get(pk_balatype);
            if (btvo == null) {
                try {
                    btvo = qryService.findBalaTypeVOByPK(pk_balatype);
                }
                catch (BusinessException e) {
                    ExceptionHandler.consume((Throwable)e);
                }
                map.put(pk_balatype, btvo);
            }
            boolean vf = UFBoolean.TRUE.equals(headVO.getAttributeValue("sddreversalflag"));
            boolean di = btvo != null && UFBoolean.TRUE.equals((Object)btvo.getDirectincome());
            boolean cp = btvo != null && UFBoolean.TRUE.equals((Object)btvo.getConsignpay());
            StringBuilder sBuilder = new StringBuilder();
            if (di || cp) {
                HashSet<String> balatypeSet = new HashSet<String>();
                HashSet<String> creditRefInfoSet = new HashSet<String>();
                String creditRefInfo = null;
                boolean exp = headVO.getSyscode().intValue() == BillEnumCollection.FromSystem.AR.VALUE.intValue() || ArapBillPubUtil.isARSysBilltype(headVO.getPk_billtype());
                try {
                    creditRefInfo = SysInit.getParaString((String)headVO.getPk_org(), (String)(exp ? SysinitConst.AR36 : SysinitConst.AP36));
                }
                catch (BusinessException e) {
                    ExceptionHandler.handleRuntimeException((Exception)((Object)e));
                }
                if (StringUtils.isEmpty((CharSequence)headVO.getCreditrefstd())) {
                    sBuilder.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0058"));
                }
                for (CircularlyAccessibleValueObject vo : this.getChildrenVO()) {
                    if (vo.getStatus() == 3) continue;
                    BaseItemVO billDetailVO = (BaseItemVO)vo;
                    balatypeSet.add(billDetailVO.getPk_balatype());
                    String creditRef = (String)billDetailVO.getAttributeValue(creditRefInfo);
                    if (null != creditRef) {
                        creditRefInfoSet.add(creditRef);
                        continue;
                    }
                    sBuilder.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0059"));
                }
                if (balatypeSet.size() > 1) {
                    sBuilder.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0028"));
                }
                if (creditRefInfoSet.size() > 1) {
                    sBuilder.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0060"));
                }
            }
            if (di && cp) {
                sBuilder.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0029"));
            } else if (vf) {
                if (StringUtils.isEmpty((CharSequence)((String)headVO.getAttributeValue("consignagreement")))) {
                    sBuilder.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0030"));
                    sBuilder.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0031"));
                }
            } else if (di) {
                if (headVO.getAttributeValue("expectdealdate") == null) {
                    sBuilder.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0032"));
                }
                if (StringUtils.isEmpty((CharSequence)((String)headVO.getAttributeValue("consignagreement")))) {
                    sBuilder.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0031"));
                }
                invoicenos = new HashSet<String>();
                for (CircularlyAccessibleValueObject vo : this.getChildrenVO()) {
                    if (vo.getStatus() == 3) continue;
                    BaseItemVO itemVO = (BaseItemVO)vo;
                    if (StringUtils.isEmpty((CharSequence)((String)itemVO.getAttributeValue("payreason")))) {
                        sBuilder.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0033"));
                        break;
                    }
                    invoicenos.add((String)itemVO.getAttributeValue("invoiceno"));
                }
                if (sBuilder.length() > 0) {
                    sBuilder.delete(sBuilder.length() - 1, sBuilder.length()).append("!");
                    sBuilder = new StringBuilder().append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0034")).append((CharSequence)sBuilder);
                }
                if (invoicenos.size() > 1) {
                    sBuilder.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0035"));
                } else if (invoicenos.size() == 1) {
                    headVO.setAttributeValue("invoiceno", invoicenos.iterator().next());
                } else {
                    sBuilder.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0036"));
                }
            } else if (cp) {
                if (headVO.getAttributeValue("expectdealdate") == null) {
                    sBuilder.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0032"));
                }
                if (StringUtils.isEmpty((CharSequence)((String)headVO.getAttributeValue("creditorreference")))) {
                    invoicenos = new HashSet();
                    for (CircularlyAccessibleValueObject vo : this.getChildrenVO()) {
                        if (vo.getStatus() == 3) continue;
                        BaseItemVO itemVO = (BaseItemVO)vo;
                        invoicenos.add((String)itemVO.getAttributeValue("invoiceno"));
                    }
                    headVO.setAttributeValue("invoiceno", invoicenos.iterator().next());
                }
                if (sBuilder.length() > 0) {
                    sBuilder = new StringBuilder().append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0030")).append((CharSequence)sBuilder);
                }
            }
            if (sBuilder.length() <= 0) continue;
            return new ValidationFailure(sBuilder.toString());
        }
        return null;
    }
}

