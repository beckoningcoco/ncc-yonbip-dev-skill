/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ufida.dataset.IContext
 *  com.ufida.iufo.table.drill.SimpleRowDataParam
 *  com.ufida.iufo.table.webdrill.WebReportDrillItem
 *  com.ufida.report.anareport.base.BaseQueryCondition
 *  com.ufida.report.anareport.base.BaseSearchTemplateCondition
 *  com.ufida.report.anareport.base.DefaultConditionProcessor
 *  com.ufida.report.anareport.base.FreeReportDrillParam
 *  com.ufida.report.anareport.model.AbsAnaReportModel
 *  com.ufsoft.table.ReportStyleSet
 *  nc.bd.accperiod.InvalidAccperiodExcetion
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.fipub.report.IReportQueryCond
 *  nc.itf.fipub.report.IReportQueryDlg
 *  nc.itf.iufo.freereport.extend.IQueryCondition
 *  nc.pub.smart.model.descriptor.Descriptor
 *  nc.pub.smart.model.descriptor.FilterDescriptor
 *  nc.pub.smart.model.descriptor.FilterItem
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.ui.format.FormatMetaAccessor
 *  nc.ui.querytemplate.filter.IFilter
 *  nc.ui.querytemplate.querytree.IQueryScheme
 *  nc.vo.bd.format.FormatDocVO
 *  nc.vo.bd.period2.AccperiodmonthVO
 *  nc.vo.fipub.report.AggReportInitializeVO
 *  nc.vo.fipub.report.FipubBaseQueryCondition
 *  nc.vo.fipub.report.QryObj
 *  nc.vo.fipub.report.RecivableExeQueryCondition4SCM
 *  nc.vo.fipub.report.ReportInitializeItemVO
 *  nc.vo.fipub.report.ReportInitializeVO
 *  nc.vo.fipub.report.ReportQueryCondVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.query.ConditionVO
 *  nc.vo.pubapp.pattern.log.Log
 *  nc.vo.querytemplate.QueryTemplateConvertor
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 *  nccloud.dto.baseapp.querytree.dataformat.Condition
 *  nccloud.dto.baseapp.querytree.dataformat.CustCondition
 *  nccloud.dto.baseapp.querytree.dataformat.QueryCondition
 *  nccloud.dto.baseapp.querytree.dataformat.QueryTreeFormatVO
 */
package nc.web.arap.report;

import com.ufida.dataset.IContext;
import com.ufida.iufo.table.drill.SimpleRowDataParam;
import com.ufida.iufo.table.webdrill.WebReportDrillItem;
import com.ufida.report.anareport.base.BaseQueryCondition;
import com.ufida.report.anareport.base.BaseSearchTemplateCondition;
import com.ufida.report.anareport.base.DefaultConditionProcessor;
import com.ufida.report.anareport.base.FreeReportDrillParam;
import com.ufida.report.anareport.model.AbsAnaReportModel;
import com.ufsoft.table.ReportStyleSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;
import nc.bd.accperiod.InvalidAccperiodExcetion;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.fipub.report.IReportQueryCond;
import nc.itf.fipub.report.IReportQueryDlg;
import nc.itf.iufo.freereport.extend.IQueryCondition;
import nc.pub.smart.model.descriptor.Descriptor;
import nc.pub.smart.model.descriptor.FilterDescriptor;
import nc.pub.smart.model.descriptor.FilterItem;
import nc.pubitf.accperiod.AccountCalendar;
import nc.ui.format.FormatMetaAccessor;
import nc.ui.querytemplate.filter.IFilter;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.arap.comreport.ArapCommonReportMethod;
import nc.vo.arap.comreport.ArapReportPubUtil;
import nc.vo.bd.format.FormatDocVO;
import nc.vo.bd.period2.AccperiodmonthVO;
import nc.vo.fipub.report.AggReportInitializeVO;
import nc.vo.fipub.report.FipubBaseQueryCondition;
import nc.vo.fipub.report.QryObj;
import nc.vo.fipub.report.RecivableExeQueryCondition4SCM;
import nc.vo.fipub.report.ReportInitializeItemVO;
import nc.vo.fipub.report.ReportInitializeVO;
import nc.vo.fipub.report.ReportQueryCondVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.query.ConditionVO;
import nc.vo.pubapp.pattern.log.Log;
import nc.vo.querytemplate.QueryTemplateConvertor;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;
import nccloud.dto.baseapp.querytree.dataformat.Condition;
import nccloud.dto.baseapp.querytree.dataformat.CustCondition;
import nccloud.dto.baseapp.querytree.dataformat.QueryCondition;
import nccloud.dto.baseapp.querytree.dataformat.QueryTreeFormatVO;

public class ARAPConditionProcessor
extends DefaultConditionProcessor {
    public IQueryCondition doQueryByWebScheme(IContext context, AbsAnaReportModel reportModel, IQueryScheme queryScheme) {
        List conditions;
        BaseSearchTemplateCondition templateCondition = (BaseSearchTemplateCondition)context.getAttribute("FreeReport_All_Condition");
        QueryTreeFormatVO conditionTree = templateCondition.getConditionTree();
        QueryCondition querycondition = conditionTree.getQuerycondition();
        if (querycondition == null) {
            return null;
        }
        List queryConditions = querycondition.getConditions();
        String funcode = conditionTree.getAppcode();
        ReportQueryCondVO qryCondVO = new ReportQueryCondVO();
        CustCondition custcondition = conditionTree.getCustcondition();
        String flag = "";
        String[][] dataVals = null;
        if (custcondition != null && (conditions = custcondition.getConditions()) != null && conditions.size() > 0) {
            for (Condition condition : conditions) {
                if ("flag".equals(condition.getField())) {
                    flag = condition.getValue().getFirstvalue();
                    continue;
                }
                if ("queryObjsVal".equals(condition.getField())) {
                    String[] vals = condition.getValue().getFirstvalue().split(",");
                    dataVals = new String[vals.length / 4][4];
                    for (int i = 0; i < vals.length; ++i) {
                        dataVals[i / 4][i % 4] = vals[i];
                    }
                    continue;
                }
                if ("datas".equals(condition.getField())) {
                    Object[][] datas = null;
                    String[] data = condition.getValue().getFirstvalue().split(",");
                    if (data == null || data.length == 0 || data[0] == null || data[0].length() == 0) {
                        datas = null;
                        continue;
                    }
                    datas = new String[data.length / 4][4];
                    for (int i = 0; i < data.length; ++i) {
                        if ("noval".equals(data[i])) {
                            data[i] = "";
                        } else if ("Invalid date".equals(data[i])) {
                            data[i] = "";
                        }
                        datas[i / 4][i % 4] = data[i];
                    }
                    qryCondVO.setDatas(this.convert2AccountAgeInterval(datas));
                    continue;
                }
                if ("syscode".equals(condition.getField())) {
                    qryCondVO.setSyscode(Integer.parseInt(condition.getValue().getFirstvalue()));
                    continue;
                }
                if (!"qryDirect".equals(condition.getField())) continue;
                qryCondVO.setQryDirect(condition.getValue().getFirstvalue());
            }
        }
        if ("forecastData".equals(flag)) {
            qryCondVO.getUserObject().put("recpaycheck", UFBoolean.valueOf((String)"N"));
            qryCondVO.getUserObject().put("recpaybalcheck", UFBoolean.valueOf((String)"N"));
            qryCondVO.getUserObject().put("prerecpaybalcheck", UFBoolean.valueOf((String)"N"));
        }
        if ("balance".equals(flag)) {
            qryCondVO.getUserObject().put("nooccur_noshow", UFBoolean.valueOf((boolean)false));
            qryCondVO.getUserObject().put("nobal_nooccur_noshow", UFBoolean.valueOf((boolean)false));
        }
        if ("detail".equals(flag)) {
            qryCondVO.getUserObject().put("showDateTotalComb", UFBoolean.valueOf((boolean)false));
            qryCondVO.getUserObject().put("notshowBackEstiComb", UFBoolean.valueOf((boolean)false));
        }
        if ("general".equals(flag)) {
            qryCondVO.setQryMode("byMonth");
        }
        String searchValue = null;
        String[] pk_orgs = null;
        UFBoolean exec = UFBoolean.valueOf((String)"N");
        for (Condition con : queryConditions) {
            String string = searchValue = con.getValue().getFirstvalue() != null ? con.getValue().getFirstvalue().toString() : new String();
            if (!"pk_orgs".equals(con.getField())) continue;
            pk_orgs = searchValue.split(",");
            qryCondVO.setPk_orgs(pk_orgs);
        }
        for (Condition con : queryConditions) {
            if ("endDate".equals(con.getField())) {
                String string = searchValue = con.getValue().getSecondvalue() != null ? con.getValue().getSecondvalue().toString() : new String();
                if (searchValue.isEmpty()) {
                    searchValue = con.getValue().getFirstvalue() != null ? con.getValue().getFirstvalue().toString() : new String();
                }
            } else {
                searchValue = con.getValue().getFirstvalue() != null ? con.getValue().getFirstvalue().toString() : new String();
            }
            this.setQueryCond(qryCondVO, con.getField(), searchValue, queryScheme, exec);
        }
        qryCondVO.setOwnModule("arap");
        qryCondVO.setPk_group(InvocationInfoProxy.getInstance().getGroupId());
        qryCondVO.getUserObject().put("ds_for_exec", exec);
        if (queryScheme == null || queryScheme.getTableJoinFromWhereSQL() == null) {
            qryCondVO.setWhereSql("");
        } else {
            qryCondVO.setWhereSql(ArapCommonReportMethod.convertQueryTemplateSql(queryScheme.getTableJoinFromWhereSQL().getWhere()));
        }
        AggReportInitializeVO repInitVO = null;
        try {
            repInitVO = ((IReportQueryDlg)NCLocator.getInstance().lookup(IReportQueryDlg.class)).getAllQueryObj(funcode, true);
        }
        catch (BusinessException e) {
            Log.error((Throwable)e);
        }
        if (repInitVO.getParentVO() != null) {
            qryCondVO.setModuleId(ArapReportPubUtil.getModuleIdByDirect(((ReportInitializeVO)repInitVO.getParentVO()).getRec_pay_direct()));
        }
        qryCondVO.setRepInitContext(repInitVO);
        this.setQryObjCond(qryCondVO, repInitVO, pk_orgs, dataVals);
        FipubBaseQueryCondition queryCondition = new FipubBaseQueryCondition(true, (IReportQueryCond)qryCondVO);
        if ("recivableExeQry".equals(flag)) {
            Object obj;
            IQueryCondition condition = this.createQueryCondition(context);
            String whereSql = queryScheme.getWhereSQLOnly();
            FilterItem item = new FilterItem();
            item.setExpression(whereSql);
            item.setManualExpression(true);
            FilterDescriptor filterDesc = new FilterDescriptor();
            filterDesc.addFilter(item);
            if (condition instanceof BaseQueryCondition) {
                ((BaseQueryCondition)condition).setDescriptors(new Descriptor[]{filterDesc});
            }
            if ((obj = queryScheme.get("filters")) instanceof IFilter[]) {
                IFilter[] iFilters = (IFilter[])obj;
                int len = iFilters.length;
                ConditionVO[] conditionVOs = new ConditionVO[len];
                for (int i = 0; i < len; ++i) {
                    conditionVOs[i] = QueryTemplateConvertor.convert2ConditionVO((IFilter)iFilters[i]);
                }
                context.setAttribute("freereport_querycondition_vos", (Object)conditionVOs);
            }
            return condition;
        }
        return queryCondition;
    }

    public IQueryCondition doQueryByWebDrill(IContext context, AbsAnaReportModel reportModel, FreeReportDrillParam drillParam) {
        IQueryCondition srcCondition = drillParam.getSrcCondition();
        if (srcCondition == null || ((BaseQueryCondition)srcCondition).getUserObject() == null) {
            return new BaseQueryCondition(false);
        }
        ReportQueryCondVO qryCondVO = (ReportQueryCondVO)((BaseQueryCondition)srcCondition).getUserObject();
        qryCondVO.setQueryDetail(false);
        List qryObjList = qryCondVO.getQryObjs();
        ArrayList<QryObj> qryObjListClone = new ArrayList<QryObj>();
        for (QryObj qryObj : qryObjList) {
            qryObjListClone.add((QryObj)qryObj.clone());
        }
        if (drillParam.getWebdrillRule() != null && drillParam.getWebdrillRule().getDrillItem() != null) {
            for (QryObj qryObj : qryObjList) {
                qryObj.getValues().clear();
            }
            String drillItemName = null;
            Object drillItemVaule = null;
            SimpleRowDataParam[] traceDatas = drillParam.getTraceDatas();
            WebReportDrillItem[] drillItems = drillParam.getWebdrillRule().getDrillItem();
            for (SimpleRowDataParam traceData : traceDatas) {
                for (int i = 0; i < drillItems.length; ++i) {
                    drillItemName = drillItems[i].getConditionName();
                    drillItemVaule = traceData.getValue(drillItemName);
                    if (drillItemVaule == null || "".equals(drillItemVaule) || ((QryObj)qryObjList.get(i)).getValues().contains(drillItemVaule)) continue;
                    ((QryObj)qryObjList.get(i)).getValues().add(drillItemVaule);
                }
            }
            for (int i = 0; i < qryObjList.size(); ++i) {
                if (((QryObj)qryObjList.get(i)).getValues().size() != 0) continue;
                ((QryObj)qryObjList.get(i)).getValues().addAll(((QryObj)qryObjListClone.get(i)).getValues());
            }
            ReportInitializeVO initHeadVO = (ReportInitializeVO)qryCondVO.getRepInitContext().getParentVO();
            if ("foreign".equals(initHeadVO.getReportformat())) {
                HashSet<String> currSet = new HashSet<String>();
                for (SimpleRowDataParam traceData : traceDatas) {
                    drillItemVaule = traceData.getValue("pk_currtype");
                    if (drillItemVaule == null || "".equals(drillItemVaule)) continue;
                    currSet.add(drillItemVaule.toString());
                }
                if (currSet.size() == 1) {
                    qryCondVO.setPk_currency((String)currSet.iterator().next());
                } else {
                    qryCondVO.setPk_currency(null);
                }
            }
            ((BaseQueryCondition)drillParam.getSrcCondition()).setUserObject((Object)qryCondVO);
        }
        return drillParam.getSrcCondition();
    }

    public static void setExecRoomToContext(IContext context) {
        try {
            if (context.getAttribute("key_time_offset") == null) {
                context.setAttribute("key_time_offset", (Object)ARAPConditionProcessor.getOffset(TimeZone.getDefault()));
                context.setAttribute("key_time_format", (Object)ARAPConditionProcessor.getLocalTimeFmt());
            }
            if (context.getAttribute("report_exce_timezone") == null) {
                context.setAttribute("report_exce_timezone", (Object)TimeZone.getDefault());
            }
        }
        catch (Exception e) {
            Log.error((Throwable)e);
        }
    }

    public static int getOffset(TimeZone zone) {
        int offset = zone.getRawOffset();
        offset /= 3600000;
        return offset -= 8;
    }

    public static String getLocalTimeFmt() {
        try {
            FormatDocVO docvo = FormatMetaAccessor.getFormat();
            if (docvo != null && docvo.getFm() != null) {
                String fm = docvo.getFm().getDfm().toNCFormatMeta().getFormat();
                return fm;
            }
        }
        catch (Exception e) {
            Logger.error((Object)e);
        }
        return null;
    }

    protected void setQueryCond(ReportQueryCondVO qryCondVO, String code, String val, IQueryScheme queryScheme, UFBoolean exec) {
        this.setValueByName(code, val, qryCondVO);
        if ("ds_for_exec".equals(code)) {
            exec = UFBoolean.valueOf((String)val);
        } else if ("ycgc".equals(code)) {
            String[] ycgcs = val.split(",");
            if (ycgcs != null && ycgcs.length > 0) {
                for (String ycgc : ycgcs) {
                    if ("recpaycheck".equals(ycgc)) {
                        qryCondVO.getUserObject().put("recpaycheck", UFBoolean.valueOf((String)"Y"));
                        continue;
                    }
                    if ("recpaybalcheck".equals(ycgc)) {
                        qryCondVO.getUserObject().put("recpaybalcheck", UFBoolean.valueOf((String)"Y"));
                        continue;
                    }
                    if (!"prerecpaybalcheck".equals(ycgc)) continue;
                    qryCondVO.getUserObject().put("prerecpaybalcheck", UFBoolean.valueOf((String)"Y"));
                }
            }
        } else {
            switch (code) {
                case "nooccur_noshow": {
                    qryCondVO.getUserObject().put("nooccur_noshow", UFBoolean.valueOf((String)val));
                    break;
                }
                case "showDateTotalComb": {
                    qryCondVO.getUserObject().put("showDateTotalComb", UFBoolean.valueOf((String)val));
                    break;
                }
                case "notshowBackEstiComb": {
                    qryCondVO.getUserObject().put("notshowBackEstiComb", UFBoolean.valueOf((String)val));
                    break;
                }
                case "nobal_nooccur_noshow": {
                    qryCondVO.getUserObject().put("nobal_nooccur_noshow", UFBoolean.valueOf((String)val));
                    break;
                }
                case "showexpiredate": {
                    qryCondVO.getUserObject().put("showexpiredate", UFBoolean.valueOf((String)val));
                    break;
                }
                case "querydate": {
                    Boolean isSensitiveTimeZone = InvocationInfoProxy.getInstance().getSensitiveTimeZone();
                    if (isSensitiveTimeZone.booleanValue()) {
                        TimeZone clientTimeZone = TimeZone.getTimeZone(InvocationInfoProxy.getInstance().getTimeZone());
                        String datelineDate = new UFDateTime(val).getDate().toStdString(clientTimeZone);
                        qryCondVO.getUserObject().put("querydate", new UFDate(datelineDate, clientTimeZone, true));
                        break;
                    }
                    qryCondVO.getUserObject().put("querydate", new UFDateTime(val).getDate());
                    break;
                }
                case "alarmDay": {
                    qryCondVO.getUserObject().put("alarmday", Integer.parseInt(val));
                    break;
                }
                case "tradetype": {
                    qryCondVO.getUserObject().put("tradetype", val.split(","));
                    break;
                }
            }
        }
    }

    protected void setQryObjCond(ReportQueryCondVO qryCondVO, AggReportInitializeVO tempVO, String[] pk_orgs, String[][] dataVals) {
        Object[] bodyItemVOs = (ReportInitializeItemVO[])tempVO.getChildrenVO();
        ReportInitializeVO headItemVO = (ReportInitializeVO)tempVO.getParentVO();
        if (headItemVO == null || ArrayUtils.isEmpty((Object[])bodyItemVOs)) {
            return;
        }
        String ownModule = headItemVO.getOwnmodule();
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        String pk_org = ArrayUtils.isEmpty((Object[])pk_orgs) ? null : pk_orgs[0];
        QryObj qryObj = null;
        Boolean lowlevel = null;
        Boolean showSubtotal = null;
        for (int i = 0; i < bodyItemVOs.length; ++i) {
            qryObj = new QryObj();
            qryObj.setDspName(bodyItemVOs[i].getDsp_objname());
            qryObj.setOriginTbl(bodyItemVOs[i].getQry_objtablename());
            qryObj.setOriginFld(bodyItemVOs[i].getQry_objfieldname());
            qryObj.setPk_bdinfo(bodyItemVOs[i].getBd_mdid());
            qryObj.setPk_group(pk_group);
            qryObj.setPk_org(pk_org);
            qryObj.setBd_name(bodyItemVOs[i].getBd_refname());
            qryObj.setBd_table(bodyItemVOs[i].getBd_tablename());
            qryObj.setBd_pkField(bodyItemVOs[i].getBd_pkfield());
            qryObj.setBd_codeField(bodyItemVOs[i].getBd_codefield());
            qryObj.setBd_nameField(bodyItemVOs[i].getBd_namefield());
            qryObj.setBillFieldName(bodyItemVOs[i].getBillfieldname());
            qryObj.setTallyFieldName(bodyItemVOs[i].getTallyfieldname());
            qryObj.setBalFieldName(bodyItemVOs[i].getBalfieldname());
            if (dataVals != null && dataVals.length != 0) {
                for (String[] val : dataVals) {
                    if (!val[0].equals(qryObj.getBillFieldName())) continue;
                    if (val[1] != null && val[1].length() != 0) {
                        String[] objs = val[1].split("@");
                        qryObj.getValues().addAll(Arrays.asList(objs));
                    }
                    lowlevel = Boolean.parseBoolean(val[2]);
                    showSubtotal = Boolean.parseBoolean(val[3]);
                }
            }
            qryObj.setIncludeLowLevel(lowlevel == null ? false : lowlevel);
            qryObj.setShowSubtotal(showSubtotal == null ? false : showSubtotal);
            qryObj.setOwnModule(ownModule);
            qryCondVO.getQryObjs().add(qryObj);
        }
    }

    private void setValueByName(String fieldName, Object value, ReportQueryCondVO qryCondVO) {
        switch (fieldName) {
            case "pk_billtypes": {
                String pk_billtypes = (String)value;
                if (pk_billtypes.contains("@")) {
                    qryCondVO.setPk_billtypes(((String)value).split("@"));
                    break;
                }
                qryCondVO.setPk_billtypes(((String)value).split(","));
                break;
            }
            case "assoObj": {
                qryCondVO.setAssoObj((String)value);
                break;
            }
            case "qryMode": {
                qryCondVO.setQryMode((String)value);
                break;
            }
            case "qryDirect": {
                qryCondVO.setQryDirect((String)value);
                break;
            }
            case "qryScope": {
                qryCondVO.setQryScope((String)value);
                break;
            }
            case "billState": {
                qryCondVO.setBillState((String)value);
                break;
            }
            case "beginDate": {
                String dateStr = (String)value;
                if (dateStr.length() <= 7) {
                    AccperiodmonthVO monthVO = this.getAccountCalendar(qryCondVO, dateStr);
                    qryCondVO.setBeginDate(monthVO.getBegindate());
                    break;
                }
                qryCondVO.setBeginDate(new UFDateTime(dateStr).getDate());
                break;
            }
            case "endDate": {
                String endDateStr = (String)value;
                if (endDateStr.length() <= 7) {
                    AccperiodmonthVO monthVO = this.getAccountCalendar(qryCondVO, endDateStr);
                    qryCondVO.setEndDate(monthVO.getEnddate());
                    break;
                }
                qryCondVO.setEndDate(new UFDateTime(endDateStr).getDate());
                break;
            }
            case "pk_currency": {
                qryCondVO.setPk_currency((String)value);
                break;
            }
            case "customer": {
                qryCondVO.setCustomer((String)value);
                break;
            }
            case "supplier": {
                qryCondVO.setSupplier((String)value);
                break;
            }
            case "dept": {
                qryCondVO.setDept((String)value);
                break;
            }
            case "psndoc": {
                qryCondVO.setPsndoc((String)value);
                break;
            }
            case "syscode": {
                qryCondVO.setSyscode(Integer.parseInt((String)value));
                break;
            }
            case "areapk": {
                qryCondVO.setAreapk((String)value);
                break;
            }
            case "showVouch": {
                qryCondVO.setShowVouch(UFBoolean.valueOf((String)((String)value)));
                break;
            }
            case "dateline": {
                Boolean isSensitiveTimeZone;
                String dateline = (String)value;
                if (dateline.length() <= 7) {
                    int year;
                    String[] datelines = dateline.split("-");
                    dateline = "04".equals(datelines[1]) || "06".equals(datelines[1]) || "09".equals(datelines[1]) || "11".equals(datelines[1]) ? dateline + "-30  23:59:59" : ("02".equals(datelines[1]) ? ((year = Integer.parseInt(datelines[0])) % 100 == 0 || year % 4 != 0 ? dateline + "-28  23:59:59" : dateline + "-29  23:59:59") : dateline + "-31  23:59:59");
                }
                if ((isSensitiveTimeZone = Boolean.valueOf(InvocationInfoProxy.getInstance().getSensitiveTimeZone())).booleanValue()) {
                    TimeZone clientTimeZone = TimeZone.getTimeZone(InvocationInfoProxy.getInstance().getTimeZone());
                    String datelineDate = new UFDateTime(dateline).getDate().toStdString(clientTimeZone);
                    qryCondVO.setDateline(new UFDate(datelineDate, clientTimeZone, false));
                    break;
                }
                qryCondVO.setDateline(new UFDateTime(dateline).getDate());
                break;
            }
            case "accAgePlan": {
                qryCondVO.setAccAgePlan((String)value);
                break;
            }
            case "anaMode": {
                qryCondVO.setAnaMode((String)value);
                break;
            }
            case "anaDirect": {
                qryCondVO.setAnaDirect((String)value);
                break;
            }
            case "anaDate": {
                qryCondVO.setAnaDate((String)value);
                break;
            }
            case "anaPattern": {
                qryCondVO.setAnaPattern((String)value);
                break;
            }
            case "anaType": {
                qryCondVO.setAnaType((String)value);
                break;
            }
            case "showPattern": {
                qryCondVO.setShowPattern((String)value);
                break;
            }
            case "alarmDay": {
                qryCondVO.setAlarmDay(Integer.parseInt((String)value));
                break;
            }
            case "showFrontN": {
                qryCondVO.setShowFrontN(Integer.parseInt((String)value));
                break;
            }
            case "queryDetail": {
                qryCondVO.setQueryDetail(Boolean.parseBoolean((String)value));
                break;
            }
            case "localCurrencyType": {
                qryCondVO.setLocalCurrencyType((String)value);
                break;
            }
        }
    }

    private AccperiodmonthVO getAccountCalendar(ReportQueryCondVO qryCondVO, String date) {
        String[] pk_orgs = qryCondVO.getPk_orgs();
        String pk_org = pk_orgs == null || pk_orgs.length == 0 ? null : pk_orgs[0];
        AccountCalendar calendar = AccountCalendar.getInstanceByPk_org(pk_org);
        String[] objs = date.split("-");
        try {
            calendar.set(objs[0], objs[1]);
            return calendar.getMonthVO();
        }
        catch (InvalidAccperiodExcetion e) {
            Logger.error((Object)e.getMessage());
            return null;
        }
    }

    private Object[][] convert2AccountAgeInterval(Object[][] datas) {
        for (int i = 0; i < datas.length; ++i) {
            Boolean isSensitiveTimeZone = InvocationInfoProxy.getInstance().getSensitiveTimeZone();
            if (isSensitiveTimeZone.booleanValue()) {
                TimeZone clientTimeZone = TimeZone.getTimeZone(InvocationInfoProxy.getInstance().getTimeZone());
                if (!(StringUtils.isEmpty((CharSequence)datas[i][1].toString()) || "Invalid date".equals(datas[i][1].toString()) || "Invalid Date".equals(datas[i][1].toString()))) {
                    String datelineDate1 = new UFDate(datas[i][1].toString()).toStdString(clientTimeZone);
                    datas[i][1] = new UFDate(datelineDate1, clientTimeZone, true).toString();
                }
                if (!(StringUtils.isEmpty((CharSequence)datas[i][2].toString()) || "Invalid date".equals(datas[i][2].toString()) || "Invalid Date".equals(datas[i][2].toString()))) {
                    String datelineDate2 = new UFDate(datas[i][2].toString()).toStdString(clientTimeZone);
                    datas[i][2] = new UFDate(datelineDate2, clientTimeZone, true).toString();
                }
            }
            if (datas[i][3] == null || "".equals(datas[i][3])) {
                if (StringUtils.isEmpty((CharSequence)datas[i][1].toString()) || "Invalid date".equals(datas[i][1].toString()) || "Invalid Date".equals(datas[i][1].toString())) {
                    datas[i][1] = new UFDate("1900-01-01").toString();
                    datas[i][3] = datas[i][2] + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0064");
                    datas[i][2] = new UFDate(datas[i][2].toString(), false).toString();
                    continue;
                }
                if (StringUtils.isEmpty((CharSequence)datas[i][2].toString()) || "Invalid date".equals(datas[i][1].toString()) || "Invalid Date".equals(datas[i][1].toString())) {
                    datas[i][2] = new UFDate("7099-12-31", false).toString();
                    datas[i][3] = datas[i][1] + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0065");
                    datas[i][1] = new UFDate(datas[i][1].toString()).toString();
                    continue;
                }
                datas[i][3] = datas[i][1] + NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0003365") + datas[i][2];
                datas[i][1] = new UFDate(datas[i][1].toString()).toString();
                datas[i][2] = new UFDate(datas[i][2].toString(), false).toString();
                continue;
            }
            if (StringUtils.isEmpty((CharSequence)datas[i][1].toString()) || "Invalid date".equals(datas[i][1].toString()) || "Invalid Date".equals(datas[i][1].toString())) {
                datas[i][1] = new UFDate("1900-01-01").toString();
                datas[i][2] = new UFDate(datas[i][2].toString(), false).toString();
                continue;
            }
            if (StringUtils.isEmpty((CharSequence)datas[i][2].toString()) || "Invalid date".equals(datas[i][1].toString()) || "Invalid Date".equals(datas[i][1].toString())) {
                datas[i][2] = new UFDate("7099-12-31", false).toString();
                datas[i][1] = new UFDate(datas[i][1].toString()).toString();
                continue;
            }
            datas[i][1] = new UFDate(datas[i][1].toString()).toString();
            datas[i][2] = new UFDate(datas[i][2].toString(), false).toString();
        }
        return datas;
    }

    protected IQueryCondition createQueryCondition(IContext context) {
        ReportStyleSet.setShowZero((boolean)false);
        return new RecivableExeQueryCondition4SCM(true);
    }
}

