/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.pubitf.cmp.settlement.ICmpSettlementPubQueryService
 *  nc.pubitf.org.IOrgUnitPubService
 *  nc.vo.cmp.settlement.SettlementAggVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 */
package nc.bs.arap.validator;

import nc.bs.arap.util.BillTradetypeUtils;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.pubitf.accperiod.AccountCalendar;
import nc.pubitf.cmp.settlement.ICmpSettlementPubQueryService;
import nc.pubitf.org.IOrgUnitPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.cmp.settlement.SettlementAggVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;

public class isQzcantUnApproveValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        AggregatedValueObject[] bills = (AggregatedValueObject[])obj;
        StringBuffer sb = new StringBuffer();
        if (BillTradetypeUtils.isqr(bills) && ((BaseAggVO)bills[0]).getHeadVO().getEffectstatus() != null && ((BaseAggVO)bills[0]).getHeadVO().getEffectstatus().intValue() == BillEnumCollection.InureSign.OKINURE.VALUE.intValue()) {
            boolean isCmpEnable;
            block12: {
                isCmpEnable = ARAPModuleEnableUtil.isCMPEnable((String)bills[0].getParentVO().getAttributeValue("pk_group"));
                if (isCmpEnable) {
                    try {
                        SettlementAggVO[] settvos = ((ICmpSettlementPubQueryService)NCLocator.getInstance().lookup(ICmpSettlementPubQueryService.class)).queryBillsBySourceBillID(BaseAggVO.getParentPks(bills));
                        if (settvos == null || settvos.length == 0) {
                            return null;
                        }
                    }
                    catch (BusinessException e2) {
                        ExceptionHandler.consume((Throwable)e2);
                    }
                    IOrgUnitPubService orgUnitPubService = (IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class);
                    String createdrt = null;
                    try {
                        String org = (String)bills[0].getParentVO().getAttributeValue("pk_org");
                        createdrt = orgUnitPubService.getOrgModulePeriodByOrgIDAndModuleID(org, "3607");
                        if (createdrt != null) {
                            String initEnabledYear = createdrt.substring(0, 4);
                            String initEnabledMonth = createdrt.substring(5, 7);
                            AccountCalendar instanceByPkOrg = AccountCalendar.getInstanceByPk_org((String)org);
                            instanceByPkOrg.set(initEnabledYear, initEnabledMonth);
                            UFDate createDate2 = instanceByPkOrg.getMonthVO().getBegindate();
                            if (createDate2.after((UFDate)bills[0].getParentVO().getAttributeValue("billdate"))) {
                                isCmpEnable = false;
                            }
                            break block12;
                        }
                        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0119"));
                    }
                    catch (BusinessException e) {
                        isCmpEnable = false;
                    }
                }
            }
            if (isCmpEnable) {
                sb.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0518"));
            }
        }
        if (sb.length() > 0) {
            return new ValidationFailure(sb.toString());
        }
        return null;
    }
}

