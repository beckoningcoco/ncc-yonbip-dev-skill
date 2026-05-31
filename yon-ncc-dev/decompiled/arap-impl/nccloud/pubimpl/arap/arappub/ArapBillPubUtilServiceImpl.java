/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bd.accperiod.AccperiodParamAccessor
 *  nc.bd.accperiod.AccperiodmonthAccessor
 *  nc.bd.accperiod.InvalidAccperiodExcetion
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.util.ArapBillType2TableMapping
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Log
 *  nc.bs.logging.Logger
 *  nc.impl.am.db.processor.ColumnSetProcessor
 *  nc.itf.fi.pub.Currency
 *  nc.itf.pubbd.profitcenter.IProfitCenterPubService
 *  nc.itf.uap.IUAPQueryBS
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.pubitf.arap.bill.IArapBillPubQueryService
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.pubitf.bd.accessor.IGeneralAccessor
 *  nc.pubitf.para.SysInitQuery
 *  nc.pubitf.uapbd.CurrencyRateUtilHelper
 *  nc.pubitf.uapbd.DefaultCurrtypeQryUtil
 *  nc.ui.format.NCFormater
 *  nc.ui.pub.print.IDataSource
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.utils.StringUtil
 *  nc.vo.bd.currtype.CurrtypeVO
 *  nc.vo.bd.period2.AccperiodmonthVO
 *  nc.vo.fipub.utils.SqlBuilder
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.platform.workbench.model.MultiAppButtonVO
 *  nc.vo.profitcenter.ProfitcenterVersionVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.format.exception.FormatException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.lang.UFLiteralDate
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nccloud.bs.arap.datasource.ArapDocPrintDatasource
 *  nccloud.pubitf.arap.arappub.IArapBillPubUtilService
 *  nccloud.pubitf.arap.arappub.IArapRatePubService
 *  nccloud.pubitf.baseapp.apprbac.IAppQueryService
 *  nccloud.putitf.riart.billtype.IBilltypeService
 *  nccloud.putitf.riart.billtype.ITranstypePublishAppService
 *  nccloud.riart.vo.pub.transtype.PublishAppVO
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.StringUtils
 */
package nccloud.pubimpl.arap.arappub;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.bd.accperiod.AccperiodParamAccessor;
import nc.bd.accperiod.AccperiodmonthAccessor;
import nc.bd.accperiod.InvalidAccperiodExcetion;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Log;
import nc.bs.logging.Logger;
import nc.impl.am.db.processor.ColumnSetProcessor;
import nc.itf.fi.pub.Currency;
import nc.itf.pubbd.profitcenter.IProfitCenterPubService;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pubitf.accperiod.AccountCalendar;
import nc.pubitf.arap.bill.IArapBillPubQueryService;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.pubitf.bd.accessor.IGeneralAccessor;
import nc.pubitf.para.SysInitQuery;
import nc.pubitf.uapbd.CurrencyRateUtilHelper;
import nc.pubitf.uapbd.DefaultCurrtypeQryUtil;
import nc.ui.format.NCFormater;
import nc.ui.pub.print.IDataSource;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.utils.StringUtil;
import nc.vo.bd.currtype.CurrtypeVO;
import nc.vo.bd.period2.AccperiodmonthVO;
import nc.vo.fipub.utils.SqlBuilder;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.platform.workbench.model.MultiAppButtonVO;
import nc.vo.profitcenter.ProfitcenterVersionVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.format.exception.FormatException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.lang.UFLiteralDate;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nccloud.bs.arap.datasource.ArapDocPrintDatasource;
import nccloud.pubimpl.arap.arappub.InterceptorUtil;
import nccloud.pubitf.arap.arappub.IArapBillPubUtilService;
import nccloud.pubitf.arap.arappub.IArapRatePubService;
import nccloud.pubitf.baseapp.apprbac.IAppQueryService;
import nccloud.putitf.riart.billtype.IBilltypeService;
import nccloud.putitf.riart.billtype.ITranstypePublishAppService;
import nccloud.riart.vo.pub.transtype.PublishAppVO;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class ArapBillPubUtilServiceImpl
implements IArapBillPubUtilService {
    public void processMoney(AggregatedValueObject bill) {
        ArapBillPubUtil.processMoney((AggregatedValueObject)bill);
    }

    public BaseAggVO billWriteBack(BaseAggVO bill, UFDate date, String userid) {
        BaseAggVO aggvo = null;
        try {
            aggvo = ArapBillPubUtil.getWriteBackBillVO((BaseAggVO)bill, (UFDate)date, (String)userid);
        }
        catch (InvalidAccperiodExcetion e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
        return aggvo;
    }

    public boolean isARSysBilltype(String str) {
        return ArapBillPubUtil.isARSysBilltype((String)str);
    }

    public UFDate getArapCreateDate(boolean b, String str) {
        return ArapBillPubUtil.getArapCreateDate((boolean)b, (String)str);
    }

    public void checkSupplierAndrecaccount(Map<String, String> supplierMap, Map<String, String> recaccountMap) {
        try {
            ArapBillPubUtil.checkSupplierAndrecaccount(supplierMap, recaccountMap);
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappBusinessException((String)e.getMessage());
        }
    }

    public AccountCalendar getAccountCalendar(String pk_org, UFDate date) {
        AccountCalendar calendar = AccountCalendar.getInstanceByPk_org((String)pk_org);
        if (date != null) {
            try {
                calendar.setDate(date);
            }
            catch (InvalidAccperiodExcetion e) {
                ExceptionUtils.wrappBusinessException((String)e.getMessage());
            }
        }
        return calendar;
    }

    public AccountCalendar getAccountCalendar(String pk_org, String year, String month) {
        AccountCalendar calendar = AccountCalendar.getInstanceByPk_org((String)pk_org);
        if (!StringUtil.isEmptyWithTrim((String)year)) {
            try {
                if (StringUtil.isEmptyWithTrim((String)month)) {
                    calendar.set(year);
                } else {
                    calendar.set(year, month);
                }
            }
            catch (InvalidAccperiodExcetion e) {
                ExceptionUtils.wrappBusinessException((String)e.getMessage());
            }
        }
        return calendar;
    }

    public String getParaString(String pk_corp, String initCode) throws BusinessException {
        return SysInitQuery.getParaString((String)pk_corp, (String)initCode);
    }

    public String getAccperiodschemePkByPk_org(String pk_corp) {
        return AccperiodParamAccessor.getInstance().getAccperiodschemePkByPk_org(pk_corp);
    }

    public AccperiodmonthVO queryAccperiodmonthVOByDate(String accperiodscheme, UFDate calDate) {
        return AccperiodmonthAccessor.getInstance().queryAccperiodmonthVOByDate(accperiodscheme, calDate);
    }

    public String getOrgLocalCurrPK(String pk_org) throws BusinessException {
        return CurrencyRateUtilHelper.getInstance().getLocalCurrtypeByOrgID(pk_org);
    }

    public CurrtypeVO getCurrInfo(String key) {
        return Currency.getCurrInfo((String)key);
    }

    public CurrtypeVO getGlobeDefaultCurrtype() {
        return DefaultCurrtypeQryUtil.getInstance().getGlobeDefaultCurrtype();
    }

    public CurrtypeVO getDefaultCurrtypeByOrgID(String pk_org) {
        return DefaultCurrtypeQryUtil.getInstance().getDefaultCurrtypeByOrgID(pk_org);
    }

    public UFDouble getAdjustGroupRate(String pk_group, String pk_currtype, String pk_accperiodscheme, String year, String month) throws BusinessException {
        return Currency.getAdjustGroupRate((String)pk_group, (String)pk_currtype, (String)pk_accperiodscheme, (String)year, (String)month);
    }

    public int getGroupRateDigit(String pk_org, String pk_group, String pk_currtype) {
        return Currency.getGroupRateDigit((String)pk_org, (String)pk_group, (String)pk_currtype);
    }

    public int getGlobalRateDigit(String pk_org, String pk_currtype) {
        return Currency.getGlobalRateDigit((String)pk_org, (String)pk_currtype);
    }

    public UFDouble getAdjustGlobalRate(String pk_corp, String pk_currtype, String pk_accperiodscheme, String year, String month) throws BusinessException {
        return Currency.getAdjustGlobalRate((String)pk_corp, (String)pk_currtype, (String)pk_accperiodscheme, (String)year, (String)month);
    }

    public int getDigitForGroup(String pk_group) {
        int groupdigit = 2;
        try {
            String local_currtype = Currency.getGroupCurrpk((String)pk_group);
            if (local_currtype != null && local_currtype.trim().length() > 0) {
                groupdigit = ArapBillPubUtilServiceImpl.getCurrtypeScale(local_currtype);
            }
        }
        catch (BusinessException e) {
            Log.getInstance((String)"arapExceptionLog").error((Object)e);
        }
        return groupdigit;
    }

    public int getDigitForGlobal() {
        int globaldigit = 2;
        try {
            String local_currtype = Currency.getGlobalCurrPk((String)"GLOBLE00000000000000");
            if (local_currtype != null && local_currtype.trim().length() > 0) {
                globaldigit = ArapBillPubUtilServiceImpl.getCurrtypeScale(local_currtype);
            }
        }
        catch (BusinessException e) {
            Log.getInstance((String)"arapExceptionLog").error((Object)e);
        }
        return globaldigit;
    }

    public UFDouble[] getAdjustRateBoth(String pk_corp, String pk_currtype, String pk_accperiodscheme, String year, String month) throws BusinessException {
        return Currency.getAdjustRateBoth((String)pk_corp, (String)pk_currtype, (String)pk_accperiodscheme, (String)year, (String)month);
    }

    private static int getCurrtypeScale(String pk_currtype) {
        return Currency.getCurrDigit((String)pk_currtype);
    }

    public IGeneralAccessor getAccessor() {
        return GeneralAccessorFactory.getAccessor((String)"b498bc9a-e5fd-4613-8da8-bdae2a05704a");
    }

    public int[] getCurrDigitAndRoundtypeByOrg(String pk_org) throws BusinessException {
        return Currency.getCurrDigitAndRoundtypeByOrg((String)pk_org);
    }

    public Object formatCurrency(Object obj) throws FormatException {
        new NCFormater();
        String object = NCFormater.formatCurrency((Object)obj).getValue();
        return object;
    }

    public Object formatDate(Object obj) throws FormatException {
        new NCFormater();
        String object = NCFormater.formatDate((Object)obj).getValue();
        return object;
    }

    public int getRateDigit(String pk_corp, String pk_currtype) throws BusinessException {
        return Currency.getRateDigit((String)pk_corp, (String)pk_currtype, (String)Currency.getLocalCurrPK((String)pk_corp));
    }

    public UFDouble getRate(String pk_org, String pk_currtype, UFDate date, int rateType) throws BusinessException {
        return Currency.getRate((String)pk_org, (String)pk_currtype, (UFDate)date, (int)rateType);
    }

    public UFBoolean getParaBoolean(String pk_org, String initCode) throws BusinessException {
        return SysInitQuery.getParaBoolean((String)pk_org, (String)initCode);
    }

    public String getLocalCurrPK(String pk_org) throws BusinessException {
        return Currency.getLocalCurrPK((String)pk_org);
    }

    public int getRateDigit(String pk_corp, String pk_currtype, String oppCurrtype) throws BusinessException {
        return Currency.getRateDigit((String)pk_corp, (String)pk_currtype, (String)oppCurrtype);
    }

    public int[] getCurrDigitAndRoundtype(String pk_currtype) {
        return Currency.getCurrDigitAndRoundtype((String)pk_currtype);
    }

    public String getBillType(String pk_tradeTypeId, String pk_group) {
        Set ob = new HashSet();
        try {
            ob = (Set)((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).executeQuery("select parentbilltype from bd_billtype where pk_group='" + pk_group + "' and pk_billtypeid='" + pk_tradeTypeId + "'", (ResultSetProcessor)new ColumnSetProcessor());
        }
        catch (BusinessException e) {
            Logger.error((Object)e.getMessage());
        }
        String billType = "";
        if (ob != null) {
            for (Object str : ob) {
                billType = (String)str;
            }
        }
        return billType;
    }

    public void interceptorVaildator(AggregatedValueObject[] aggvo, String actionCode) throws BusinessException {
        InterceptorUtil interceptor = new InterceptorUtil();
        if (!interceptor.interceptorDoAction(aggvo, actionCode)) {
            StringBuilder error = new StringBuilder();
            error.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0045"));
            error.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0274", null, null));
            throw new BusinessException(error.toString());
        }
    }

    public BaseAggVO[] filterAggObjByOperPower(AggregatedValueObject[] aggvo, String actionCode) throws BusinessException {
        ArrayList<BaseAggVO> filterResult = new ArrayList<BaseAggVO>();
        InterceptorUtil interceptor = new InterceptorUtil();
        BusinessRuntimeException ex = null;
        for (int i = 0; i < aggvo.length; ++i) {
            try {
                interceptor.isUserHasPermissionForUI((BaseAggVO)aggvo[i], actionCode);
                filterResult.add((BaseAggVO)aggvo[i]);
                continue;
            }
            catch (BusinessRuntimeException e) {
                ex = e;
            }
        }
        if (filterResult.size() == 0 && ex != null) {
            throw ex;
        }
        return filterResult.toArray(new BaseAggVO[0]);
    }

    public AggregatedValueObject[] filterDebtAggObjByOperPower(AggregatedValueObject[] aggvo, String actionCode) throws BusinessException {
        ArrayList<AggregatedValueObject> filterResult = new ArrayList<AggregatedValueObject>();
        InterceptorUtil interceptor = new InterceptorUtil();
        BusinessRuntimeException ex = null;
        for (int i = 0; i < aggvo.length; ++i) {
            try {
                interceptor.isUserHasPermissionForUI(aggvo[i], actionCode);
                filterResult.add(aggvo[i]);
                continue;
            }
            catch (BusinessRuntimeException e) {
                ex = e;
            }
        }
        if (filterResult.size() == 0 && ex != null) {
            throw ex;
        }
        return filterResult.toArray(new AggregatedValueObject[0]);
    }

    public int getDatabaseType() {
        return SqlBuilder.getDatabaseType();
    }

    public IDataSource getPrintDataSource(String pkBills, String tradeType) {
        ArapDocPrintDatasource ds = new ArapDocPrintDatasource(new String[]{pkBills}, tradeType, null);
        return ds;
    }

    public void dealFieldVersionByDate(BaseAggVO vo) throws BusinessException {
        String[] field = new String[]{"pk_pcorg"};
        HashMap<String, String> versionMap = new HashMap<String, String>();
        versionMap.put("pk_pcorg", "pk_pcorg_v");
        UFDate bizDate = new UFDate(InvocationInfoProxy.getInstance().getBizDateTime());
        UFDate date = (UFDate)vo.getParentVO().getAttributeValue("billdate") == null ? bizDate : (UFDate)vo.getParentVO().getAttributeValue("billdate");
        HashMap<String, String> valueMap = new HashMap<String, String>();
        for (String en : field) {
            valueMap.put(en, (String)vo.getParentVO().getAttributeValue(en));
        }
        Map<String, String> resultMap = this.getVersionValue(valueMap, date);
        if (resultMap != null && resultMap.size() > 0) {
            for (Map.Entry<String, String> parm : resultMap.entrySet()) {
                vo.getParentVO().setAttributeValue(parm.getKey(), (Object)parm.getValue());
                for (BaseItemVO chilvo : vo.getItems()) {
                    chilvo.setAttributeValue((String)versionMap.get(parm.getKey()), (Object)parm.getValue());
                }
            }
        }
    }

    private Map<String, String> getVersionValue(Map<String, String> map, UFDate date) {
        try {
            HashMap<String, String> result = new HashMap<String, String>();
            block8: for (Map.Entry<String, String> parm : map.entrySet()) {
                switch (parm.getKey()) {
                    case "pk_pcorg": {
                        Map queryVersion = ((IProfitCenterPubService)NCLocator.getInstance().lookup(IProfitCenterPubService.class)).queryVersion(new String[]{parm.getValue()}, date);
                        if (queryVersion == null || queryVersion != null && queryVersion.size() == 0) {
                            result.put(parm.getKey(), null);
                            continue block8;
                        }
                        result.put(parm.getKey(), ((ProfitcenterVersionVO)queryVersion.get(parm.getValue())).getPrimaryKey());
                        continue block8;
                    }
                }
                return null;
            }
            return result;
        }
        catch (BusinessException e) {
            throw new BusinessRuntimeException(e.getMessage());
        }
    }

    public List<MultiAppButtonVO> filterAuthBtn(List<MultiAppButtonVO> flowButtons, Map<String, String> paramMap) throws BusinessException {
        String appcode = paramMap.get("appcode");
        String pk_group = paramMap.get("pk_group");
        String userId = paramMap.get("userId");
        ArrayList<MultiAppButtonVO> newflowButtons = new ArrayList<MultiAppButtonVO>();
        boolean isAppButtonPowerEnable = ((IAppQueryService)NCLocator.getInstance().lookup(IAppQueryService.class)).isAppButtonPowerEnableByAppcode(pk_group, appcode);
        if (isAppButtonPowerEnable) {
            List userPermBtnList = ((IAppQueryService)NCLocator.getInstance().lookup(IAppQueryService.class)).queryUserPermBtnCodesByAppcode(pk_group, appcode, userId);
            if (userPermBtnList != null && userPermBtnList.size() > 0) {
                List<String> newbuttons = this.getNewButtonVos(userPermBtnList);
                ArapBillDAO dao = new ArapBillDAO();
                List busiActionCode = dao.getBusiActionCode(pk_group, appcode, userId);
                if (newbuttons != null && newbuttons.size() == 0) {
                    return flowButtons;
                }
                for (MultiAppButtonVO vo : flowButtons) {
                    if (newbuttons.contains(vo.getKey())) {
                        newflowButtons.add(vo);
                    }
                    if (!busiActionCode.contains("Add") || !"Add".equals(vo.getKey())) continue;
                    newflowButtons.add(vo);
                }
                return newflowButtons;
            }
            if (userPermBtnList != null && userPermBtnList.size() == 0) {
                return newflowButtons;
            }
            return flowButtons;
        }
        return flowButtons;
    }

    private List<String> getNewButtonVos(List<String> buttons) {
        ArrayList<String> btns = new ArrayList<String>();
        for (String btn : buttons) {
            if (btn.contains("-BusiBtn")) {
                btns.add(btn.split("-")[0]);
                continue;
            }
            btns.add(btn);
        }
        return btns;
    }

    public List<String> filterStopBusitype(List<String> pk_busitypes) throws BusinessException {
        if (CollectionUtils.isEmpty(pk_busitypes)) {
            return new ArrayList<String>();
        }
        ArapBillDAO dao = new ArapBillDAO();
        List enableBusitype = dao.getEnableBusitype(pk_busitypes.toArray(new String[0]));
        return CollectionUtils.isEmpty((Collection)enableBusitype) ? new ArrayList() : enableBusitype;
    }

    public String getAppcodeByPublishapp(String transtype, String pk_group, int sence) throws BusinessException {
        String appid;
        if (StringUtils.isEmpty((CharSequence)transtype) || StringUtils.isEmpty((CharSequence)pk_group)) {
            return null;
        }
        ArrayList list = ((IBilltypeService)NCLocator.getInstance().lookup(IBilltypeService.class)).getBilltypeAllTranstype(transtype, pk_group);
        if (CollectionUtils.isEmpty((Collection)list)) {
            return null;
        }
        PublishAppVO appVO = ((ITranstypePublishAppService)NCLocator.getInstance().lookup(ITranstypePublishAppService.class)).queryPublishSenceAppVO((String)list.get(0), sence, pk_group);
        String string = appid = appVO == null ? null : appVO.getPublishappid();
        if (StringUtils.isEmpty((CharSequence)appid)) {
            return null;
        }
        ArapBillDAO dao = new ArapBillDAO();
        String appcode = dao.getAppCodeByAppid(appid);
        return appcode;
    }

    public void checkTs4FlowBill(AggregatedValueObject[] bills) throws BusinessException {
        List<String> arapBilltyp = Arrays.asList("F0", "F1", "F2", "F3");
        HashMap<String, UFDateTime> itemMap = new HashMap<String, UFDateTime>();
        HashMap<String, UFDateTime> headMap = new HashMap<String, UFDateTime>();
        ArrayList<String> pkslist = new ArrayList<String>();
        String top_billtype = null;
        for (AggregatedValueObject pvo : bills) {
            CircularlyAccessibleValueObject[] childrenVO = pvo.getChildrenVO();
            top_billtype = (String)childrenVO[0].getAttributeValue("top_billtype");
            if (top_billtype == null || !arapBilltyp.contains(top_billtype)) continue;
            UFDateTime topHeadts = (UFDateTime)childrenVO[0].getAttributeValue("top_changets");
            headMap.put((String)childrenVO[0].getAttributeValue("top_billid"), topHeadts);
            for (CircularlyAccessibleValueObject vo : childrenVO) {
                UFDateTime topts = (UFDateTime)vo.getAttributeValue("top_changeitemts");
                if (topts == null) continue;
                itemMap.put((String)vo.getAttributeValue("top_itemid"), topts);
                pkslist.add((String)vo.getAttributeValue("top_billid"));
            }
        }
        if (CollectionUtils.isNotEmpty(pkslist) && itemMap.size() != 0) {
            BaseAggVO[] aggVOs;
            for (BaseAggVO vo : aggVOs = ((IArapBillPubQueryService)NCLocator.getInstance().lookup(IArapBillPubQueryService.class)).findBillByPrimaryKey(pkslist.toArray(new String[0]), new String[]{top_billtype})) {
                CircularlyAccessibleValueObject[] childrenVO = vo.getChildrenVO();
                if (headMap.size() != 0) {
                    UFDateTime dateTime = (UFDateTime)headMap.get(vo.getParent().getPrimaryKey());
                    UFDateTime oldHeadts = (UFDateTime)vo.getParent().getAttributeValue("ts");
                    if (dateTime != null && dateTime.compareTo(oldHeadts) != 0) {
                        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1250"));
                    }
                }
                for (CircularlyAccessibleValueObject chilvo : childrenVO) {
                    UFDateTime ts = (UFDateTime)itemMap.get(chilvo.getAttributeValue(ArapBillType2TableMapping.getChildrenTablePK((String)top_billtype).split("\\.")[1]));
                    UFDateTime oldts = (UFDateTime)chilvo.getAttributeValue("ts");
                    if (ts == null || ts.compareTo(oldts == null ? new UFDateTime() : oldts) == 0) continue;
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1250"));
                }
            }
        }
    }

    public Map<String, String> getBatchParaString(String[] pk_corps, String initCode) throws BusinessException {
        return SysInitQuery.getBatchParaString((String[])pk_corps, (String)initCode);
    }

    public void doChangeRate4Copy(AggregatedValueObject bills) throws BusinessException {
        CircularlyAccessibleValueObject parentVO = bills.getParentVO();
        String pk_ratetype = (String)parentVO.getAttributeValue("pk_ratetype");
        UFLiteralDate ratetime = (UFLiteralDate)parentVO.getAttributeValue("ratedate");
        if (pk_ratetype == null || ratetime == null) {
            return;
        }
        UFDate billdate = (UFDate)parentVO.getAttributeValue("billdate");
        String pk_org = (String)parentVO.getAttributeValue("pk_org");
        String pk_curr = (String)parentVO.getAttributeValue("pk_currtype");
        Map rateDate = ((IArapRatePubService)NCLocator.getInstance().lookup(IArapRatePubService.class)).getRateDate(pk_ratetype, pk_curr, pk_org, billdate);
        if (rateDate == null || rateDate != null && rateDate.size() == 0) {
            this.setNewValueForRateField(bills, UFDouble.ZERO_DBL, null);
        } else {
            UFDouble newrates = rateDate.values().toArray(new UFDouble[0])[0];
            UFLiteralDate ratesrctime = rateDate.keySet().toArray(new UFLiteralDate[0])[0];
            this.setNewValueForRateField(bills, newrates, ratesrctime);
        }
    }

    private void setNewValueForRateField(AggregatedValueObject bills, UFDouble newrates, UFLiteralDate ratesrctime) {
        CircularlyAccessibleValueObject[] chilVO = bills.getChildrenVO();
        CircularlyAccessibleValueObject parentVO = bills.getParentVO();
        parentVO.setAttributeValue("rate", (Object)newrates);
        parentVO.setAttributeValue("ratedate", (Object)ratesrctime);
        for (CircularlyAccessibleValueObject vo : chilVO) {
            vo.setAttributeValue("rate", (Object)newrates);
            vo.setAttributeValue("ratedate", (Object)ratesrctime);
        }
    }

    public boolean deffFieldCheckWithTopBill(String field, String top_billType, Map<String, String> parmmap, int scene) throws BusinessException {
        boolean isSame = true;
        if (StringUtil.isEmptyWithTrim((String)field) || StringUtil.isEmptyWithTrim((String)top_billType) || parmmap == null || parmmap != null && parmmap.size() == 0) {
            return isSame;
        }
        try {
            switch (scene) {
                case 0: {
                    isSame = this.deffFieldrefundScene(field, top_billType, parmmap, scene);
                    break;
                }
            }
        }
        catch (SQLException e) {
            throw new BusinessException(e.getMessage());
        }
        return isSame;
    }

    private boolean deffFieldrefundScene(String field, String top_billType, Map<String, String> parmmap, int scene) throws DAOException, SQLException {
        boolean isSame = true;
        ArrayList<String> topitemid = new ArrayList<String>();
        for (Map.Entry<String, String> p : parmmap.entrySet()) {
            topitemid.add(p.getKey());
        }
        String sql = " isrefund = 'Y' ";
        Map billFieldBypk = new ArapBillDAO().getBillFieldBypk(topitemid.toArray(new String[0]), top_billType, Arrays.asList(field), Arrays.asList(sql));
        if (billFieldBypk == null || billFieldBypk != null && billFieldBypk.size() == 0) {
            return isSame;
        }
        for (String topotem : topitemid) {
            String topFieldValue = CollectionUtils.isEmpty((Collection)((Collection)billFieldBypk.get(topotem))) ? null : (String)((List)billFieldBypk.get(topotem)).get(0);
            String fieldValue = parmmap.get(topotem);
            if (StringUtil.isEmptyWithTrim((String)topFieldValue) || topFieldValue.equals(fieldValue)) continue;
            isSame = false;
            break;
        }
        return isSame;
    }
}

