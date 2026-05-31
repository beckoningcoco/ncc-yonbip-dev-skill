/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.itf.fi.pub.SysInit
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.pub.MathTool
 *  nccloud.pubitf.arap.arappub.ICurrencyService
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.bs.arap.validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.itf.fi.pub.SysInit;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.pub.MathTool;
import nccloud.pubitf.arap.arappub.ICurrencyService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

public class CheckMoneyLegalValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;
    private static final List<String> LOCALFIELD = Arrays.asList("local_money_cr", "local_money_de");
    private static final List<String> GROUPFIELD = Arrays.asList("groupcrebit", "groupdebit");
    private static final List<String> GLOBALFIELD = Arrays.asList("globalcrebit", "globaldebit");
    private static final List<String> CREBIT = Arrays.asList("F1", "F2", "23E1");
    private static final List<String> DEBIT = Arrays.asList("F0", "F3", "23E0");
    private String NC001 = null;
    private String NC002 = null;

    public ValidationFailure validate(Object obj) {
        AggregatedValueObject[] aggVOs = (AggregatedValueObject[])obj;
        Object[] childrenVO = aggVOs[0].getChildrenVO();
        if (ArrayUtils.isEmpty((Object[])childrenVO)) {
            return null;
        }
        String pk_org = (String)aggVOs[0].getParentVO().getAttributeValue("pk_org");
        String pk_group = (String)aggVOs[0].getParentVO().getAttributeValue("pk_group");
        String pk_billtype = (String)aggVOs[0].getParentVO().getAttributeValue("pk_billtype");
        int crOrDe = 0;
        if (DEBIT.contains(pk_billtype)) {
            crOrDe = 1;
        }
        ArrayList<String> errorList = new ArrayList<String>();
        int rownum = 1;
        try {
            Map<String, List<String>> currtyprMap = this.getCurrtypeList(pk_org, pk_group);
            this.NC002 = SysInit.getParaString((String)"GLOBLE00000000000000", (String)"NC002");
            this.NC001 = SysInit.getParaString((String)pk_group, (String)"NC001");
            for (Object vo : childrenVO) {
                String pk_currtype = (String)vo.getAttributeValue("pk_currtype");
                String message = this.checkMoney(currtyprMap.get(pk_currtype + "-ORG"), currtyprMap.get(pk_currtype + "-GROUP"), currtyprMap.get(pk_currtype + "-GLOBAL"), (CircularlyAccessibleValueObject)vo, crOrDe);
                String taxmessage = this.checkTaxByIn((CircularlyAccessibleValueObject)vo, crOrDe);
                String error = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1267", null, new String[]{rownum + ""});
                if (message != null) {
                    errorList.add(error + message);
                } else if (taxmessage != null) {
                    errorList.add(error + taxmessage);
                }
                ++rownum;
            }
            if (CollectionUtils.isNotEmpty(errorList)) {
                return new ValidationFailure(String.join((CharSequence)"\n", errorList));
            }
        }
        catch (BusinessException e) {
            throw new BusinessRuntimeException(e.getMessage());
        }
        return null;
    }

    private Map<String, List<String>> getCurrtypeList(String pk_org, String pk_group) throws BusinessException {
        if (pk_org == null || pk_group == null) {
            return null;
        }
        String orgCurrType = ((ICurrencyService)NCLocator.getInstance().lookup(ICurrencyService.class)).getOrgLocalCurrPK(pk_org);
        String groupCurrType = ((ICurrencyService)NCLocator.getInstance().lookup(ICurrencyService.class)).getGroupLocalCurrPK(pk_group);
        String globalCurrType = ((ICurrencyService)NCLocator.getInstance().lookup(ICurrencyService.class)).getGlobalCurrPk(pk_org);
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        map.put(orgCurrType + "-ORG", LOCALFIELD);
        map.put(groupCurrType + "-GROUP", GROUPFIELD);
        map.put(globalCurrType + "-GLOBAL", GLOBALFIELD);
        return map;
    }

    private String checkMoney(List<String> orgList, List<String> groupList, List<String> globalList, CircularlyAccessibleValueObject vo, int crOrDe) {
        if (CollectionUtils.isEmpty(orgList) && CollectionUtils.isEmpty(groupList) && CollectionUtils.isEmpty(globalList)) {
            return null;
        }
        String message = "";
        UFDouble mny = (UFDouble)vo.getAttributeValue(crOrDe == 0 ? "money_cr" : "money_de");
        UFDouble money = mny == null ? UFDouble.ZERO_DBL : mny;
        UFDouble grouprate = UFDouble.ZERO_DBL;
        UFDouble groupMoney = UFDouble.ZERO_DBL;
        UFDouble globalprate = UFDouble.ZERO_DBL;
        UFDouble globalMoney = UFDouble.ZERO_DBL;
        if (!CollectionUtils.isEmpty(groupList)) {
            grouprate = (UFDouble)vo.getAttributeValue("grouprate") == null ? UFDouble.ZERO_DBL : (UFDouble)vo.getAttributeValue("grouprate");
            Object object = groupMoney = vo.getAttributeValue(groupList.get(crOrDe)) == null ? UFDouble.ZERO_DBL : vo.getAttributeValue(groupList.get(crOrDe));
        }
        if (!CollectionUtils.isEmpty(globalList)) {
            globalprate = (UFDouble)vo.getAttributeValue("globalrate") == null ? UFDouble.ZERO_DBL : (UFDouble)vo.getAttributeValue("globalrate");
            globalMoney = vo.getAttributeValue(globalList.get(crOrDe)) == null ? UFDouble.ZERO_DBL : vo.getAttributeValue(globalList.get(crOrDe));
        }
        boolean isBaseOriGroup = SysinitConst.NC001_BASE_ORIG.equals(this.NC001);
        boolean isBaseOriGlobal = SysinitConst.NC002_BASE_ORIG.equals(this.NC002);
        if (CollectionUtils.isNotEmpty(orgList) && !money.equals(vo.getAttributeValue(orgList.get(crOrDe)))) {
            message = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1268");
            return message;
        }
        if (CollectionUtils.isNotEmpty(groupList) && (!money.equals((Object)groupMoney) && UFDouble.ZERO_DBL.compareTo((Object)grouprate) != 0 && UFDouble.ZERO_DBL.compareTo((Object)groupMoney) != 0 && isBaseOriGroup || isBaseOriGroup && UFDouble.ZERO_DBL.compareTo((Object)groupMoney) == 0)) {
            message = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1269");
            return message;
        }
        if (CollectionUtils.isNotEmpty(globalList) && (!money.equals((Object)globalMoney) && UFDouble.ZERO_DBL.compareTo((Object)globalprate) != 0 && UFDouble.ZERO_DBL.compareTo((Object)globalMoney) != 0 && isBaseOriGlobal || isBaseOriGlobal && UFDouble.ZERO_DBL.compareTo((Object)globalMoney) == 0)) {
            message = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1270");
            return message;
        }
        return null;
    }

    private String checkTaxByIn(CircularlyAccessibleValueObject vo, int crOrDe) throws BusinessException {
        UFDouble globalmoney;
        UFDouble localtax = vo.getAttributeValue(crOrDe == 0 ? "local_tax_cr" : "local_tax_de") == null ? UFDouble.ZERO_DBL : vo.getAttributeValue(crOrDe == 0 ? "local_tax_cr" : "local_tax_de");
        UFDouble localnotax = vo.getAttributeValue(crOrDe == 0 ? "local_notax_cr" : "local_notax_de") == null ? UFDouble.ZERO_DBL : vo.getAttributeValue(crOrDe == 0 ? "local_notax_cr" : "local_notax_de");
        UFDouble localmoney = vo.getAttributeValue(crOrDe == 0 ? "local_money_cr" : "local_money_de") == null ? UFDouble.ZERO_DBL : vo.getAttributeValue(crOrDe == 0 ? "local_money_cr" : "local_money_de");
        UFDouble groupmoney = vo.getAttributeValue(crOrDe == 0 ? "groupcrebit" : "groupdebit") == null ? UFDouble.ZERO_DBL : vo.getAttributeValue(crOrDe == 0 ? "groupcrebit" : "groupdebit");
        UFDouble groupnotax = vo.getAttributeValue(crOrDe == 0 ? "groupnotax_cre" : "groupnotax_de") == null ? UFDouble.ZERO_DBL : vo.getAttributeValue(crOrDe == 0 ? "groupnotax_cre" : "groupnotax_de");
        UFDouble globalnotax = vo.getAttributeValue(crOrDe == 0 ? "globalnotax_cre" : "globalnotax_de") == null ? UFDouble.ZERO_DBL : vo.getAttributeValue(crOrDe == 0 ? "globalnotax_cre" : "globalnotax_de");
        Object object = vo.getAttributeValue(crOrDe == 0 ? "globalcrebit" : "globaldebit") == null ? UFDouble.ZERO_DBL : (globalmoney = vo.getAttributeValue(crOrDe == 0 ? "globalcrebit" : "globaldebit"));
        if (BillEnumCollection.BuySellType.OUT_SELL.VALUE.intValue() == ((Integer)vo.getAttributeValue("buysellflag")).intValue() || BillEnumCollection.BuySellType.OUT_BUY.VALUE.intValue() == ((Integer)vo.getAttributeValue("buysellflag")).intValue()) {
            if (localmoney.compareTo((Object)localnotax) != 0) {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1271");
            }
            if (groupmoney.compareTo((Object)groupnotax) != 0) {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1272");
            }
            if (globalmoney.compareTo((Object)globalnotax) != 0) {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1273");
            }
        } else {
            if (UFDouble.ZERO_DBL.compareTo((Object)localtax) == 0) {
                return null;
            }
            if (localmoney.compareTo((Object)MathTool.add((UFDouble)localtax, (UFDouble)localnotax)) != 0) {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1274");
            }
        }
        return null;
    }
}

