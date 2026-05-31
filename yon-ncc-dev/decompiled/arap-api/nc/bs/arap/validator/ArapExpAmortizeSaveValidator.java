/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bd.accperiod.InvalidAccperiodExcetion
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.pubitf.org.ICloseAccPubServicer
 *  nc.pubitf.org.IOrgPeriodPubService
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 */
package nc.bs.arap.validator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import nc.bd.accperiod.InvalidAccperiodExcetion;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.pubitf.accperiod.AccountCalendar;
import nc.pubitf.org.ICloseAccPubServicer;
import nc.pubitf.org.IOrgPeriodPubService;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;

public class ArapExpAmortizeSaveValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        ValidationFailure valida = null;
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        AggregatedValueObject[] aggVOs = (AggregatedValueObject[])obj;
        try {
            BaseBillVO billVO;
            boolean isUse = ARAPModuleEnableUtil.isEnable(pk_group, "2011");
            for (AggregatedValueObject vo : aggVOs) {
                this.setObj(vo);
                billVO = (BaseBillVO)vo.getParentVO();
                String start_period = billVO.getStart_period();
                if (null == this.getParentVO()) continue;
                Integer total_period = billVO.getTotal_period();
                if (StringUtil.isEmptyWithTrim((String)start_period) && null == total_period) {
                    return null;
                }
                if (isUse || StringUtil.isEmptyWithTrim((String)start_period) && null == total_period) continue;
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0698"));
            }
            if (!isUse) {
                return null;
            }
            HashSet<String> orgSet = new HashSet<String>();
            for (AggregatedValueObject vo : aggVOs) {
                orgSet.add((String)vo.getParentVO().getAttributeValue("pk_org"));
            }
            Map org2ymn = ((IOrgPeriodPubService)NCLocator.getInstance().lookup(IOrgPeriodPubService.class)).getPeriodByOrgPKs("2011", pk_group, orgSet.toArray(new String[0]));
            HashMap<String, String> key2ymn = new HashMap<String, String>();
            for (AggregatedValueObject vo : aggVOs) {
                this.setObj(vo);
                billVO = (BaseBillVO)vo.getParentVO();
                String start_period = billVO.getStart_period();
                Integer total_period = billVO.getTotal_period();
                String pk_org = billVO.getPk_org();
                if (StringUtil.isEmptyWithTrim((String)start_period) && null == total_period) {
                    return null;
                }
                if (null == this.getParentVO()) continue;
                if ((org2ymn == null || StringUtil.isEmptyWithTrim((String)((String)org2ymn.get(pk_org)))) && !StringUtil.isEmptyWithTrim((String)start_period) && null != total_period) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0698"));
                }
                if (StringUtil.isEmptyWithTrim((String)start_period) && null != total_period || !StringUtil.isEmptyWithTrim((String)start_period) && null == total_period) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0131"));
                }
                if (total_period != null && total_period <= 0) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0132"));
                }
                String speriod = AccountCalendar.getInstanceByAccperiodMonth((String)billVO.getStart_period()).getMonthVO().getYearmth();
                if (speriod.compareTo((String)org2ymn.get(billVO.getPk_org())) < 0) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0699"));
                }
                key2ymn.put(pk_org + start_period, speriod);
            }
            Map org2maxSettleYmn = ((ICloseAccPubServicer)NCLocator.getInstance().lookup(ICloseAccPubServicer.class)).getMaxEndedAccByOrg("2011", orgSet.toArray(new String[0]));
            for (AggregatedValueObject vo : aggVOs) {
                this.setObj(vo);
                billVO = (BaseBillVO)vo.getParentVO();
                String start_period = billVO.getStart_period();
                Integer total_period = billVO.getTotal_period();
                if (StringUtil.isEmptyWithTrim((String)start_period) && null == total_period) {
                    return null;
                }
                billVO = (BaseBillVO)vo.getParentVO();
                String maxSettleYmn = (String)org2maxSettleYmn.get(billVO.getPk_org());
                if (StringUtil.isEmptyWithTrim((String)maxSettleYmn) || ((String)key2ymn.get(billVO.getPk_org() + billVO.getStart_period())).compareTo(maxSettleYmn) > 0) continue;
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0700", null, new String[]{maxSettleYmn}));
            }
            UFDate nowdate = new UFDate();
            for (AggregatedValueObject vo : aggVOs) {
                this.setObj(vo);
                billVO = (BaseBillVO)vo.getParentVO();
                String start_period = billVO.getStart_period();
                Integer total_period = billVO.getTotal_period();
                if (StringUtil.isEmptyWithTrim((String)start_period) && null == total_period) {
                    return null;
                }
                AccountCalendar ac = AccountCalendar.getInstanceByAccperiodMonth((String)start_period);
                String[] ymn = ((String)key2ymn.get(billVO.getPk_org() + start_period)).split("-");
                ac.set(ymn[0], ymn[1]);
                try {
                    ac.roll(AccountCalendar.MONTH, billVO.getTotal_period().intValue());
                }
                catch (InvalidAccperiodExcetion e) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0701"));
                }
                String endYmn = ac.getMonthVO().getYearmth();
                ac.setDate(nowdate);
                String nowYmn = ac.getMonthVO().getYearmth();
                if (endYmn.compareTo(nowYmn) >= 0) continue;
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0702"));
            }
        }
        catch (BusinessException e1) {
            ExceptionHandler.consume((Throwable)e1);
        }
        return valida;
    }
}

