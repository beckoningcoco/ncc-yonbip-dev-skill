/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.util.IrisDynamicInvokeUtil
 *  com.yonyou.iuap.apdoc.coredoc.constants.CheckLimitConstant
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.ucf.common.i18n.MessageUtils
 *  com.yonyou.ucf.mdd.api.interfaces.rpc.IComQueryApi
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.ext.bill.bathinit.service.BathInitUiMetaService
 *  com.yonyou.ucf.mdd.ext.bill.init.dto.InitUIMetaBO
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.utils.UserDefineUtil
 *  com.yonyoucloud.upc.data.productPro.ProductProDao
 *  com.yonyoucloud.upc.pc.userdef.UserDefClassEnum
 *  com.yonyoucloud.upc.pc.userdef.UserDefineClass
 *  com.yonyoucloud.upc.res.ResValue
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  com.yonyoucloud.upc.utils.RedisLockKeyConstants
 *  com.yonyoucloud.upc.utils.ResIdUtils
 *  iuap.yms.thread.api.YmsExecutors
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.userdefine;

import com.yonyou.cloud.util.IrisDynamicInvokeUtil;
import com.yonyou.iuap.apdoc.coredoc.constants.CheckLimitConstant;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.ucf.common.i18n.MessageUtils;
import com.yonyou.ucf.mdd.api.interfaces.rpc.IComQueryApi;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.ext.bill.bathinit.service.BathInitUiMetaService;
import com.yonyou.ucf.mdd.ext.bill.init.dto.InitUIMetaBO;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.utils.UserDefineUtil;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.data.productPro.ProductProDao;
import com.yonyoucloud.upc.pc.userdef.UserDefClassEnum;
import com.yonyoucloud.upc.pc.userdef.UserDefineClass;
import com.yonyoucloud.upc.res.ResValue;
import com.yonyoucloud.upc.utils.MultilangUtil;
import com.yonyoucloud.upc.utils.RedisLockKeyConstants;
import com.yonyoucloud.upc.utils.ResIdUtils;
import iuap.yms.thread.api.YmsExecutors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

public class UserdefineUtils {
    private static Logger logger = LoggerFactory.getLogger(UserdefineUtils.class);
    private static UserdefineUtils userdefineUtils = new UserdefineUtils();

    private UserdefineUtils() {
        if (userdefineUtils != null) {
            throw new RuntimeException("UserdefineUtils is singleton, do not use reflect");
        }
    }

    private Object readResolve() {
        return userdefineUtils;
    }

    public static UserdefineUtils getInstance() {
        return userdefineUtils;
    }

    public void getResId(UserDefineClass udc) throws Exception {
        Object showItem = udc.get("showItem");
        if (showItem != null) {
            ArrayList<ResValue> resValues = new ArrayList<ResValue>();
            if (showItem instanceof BizObject) {
                BizObject bShowItem = (BizObject)showItem;
                assert (bShowItem.size() < CheckLimitConstant.DEFAULT_LIMIT);
                for (String key : bShowItem) {
                    Object value = bShowItem.get(key);
                    ResValue resValue = new ResValue();
                    resValue.setLangCode(key);
                    resValue.setResourceText(value == null ? "" : value.toString());
                    resValues.add(resValue);
                }
            } else if (showItem instanceof String) {
                ResValue resValue = new ResValue();
                resValue.setLangCode("zh_CN");
                resValue.setResourceText(showItem.toString());
                resValues.add(resValue);
            }
            String resid = ResIdUtils.getInstance().getResid(resValues);
            udc.put("showItemResid", (Object)resid);
        }
    }

    public void updateItems(HashMap<String, Object> paramMap, ProductProDao productProDao, BathInitUiMetaService bathInitUiMetaService) throws Exception {
        this.initUIMeta(paramMap, bathInitUiMetaService);
        productProDao.updateBillItemBase(paramMap);
        productProDao.updatePCFilterSolutionCommon(paramMap);
    }

    public void initUIMeta(HashMap<String, Object> paramMap, BathInitUiMetaService bathInitUiMetaService) throws Exception {
        String copyUiTplConf = AppContext.getEnvConfig((String)"mdd.copyuitpl.whenopen", (String)"true");
        boolean copyUiTpl = Boolean.parseBoolean(copyUiTplConf);
        if (!copyUiTpl) {
            String tenantId = AppContext.getTenantId().toString();
            if (StringUtils.isEmpty((CharSequence)tenantId) || "0".equals(tenantId)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_TENANT_INFO_ERROR);
            }
            InitUIMetaBO initUIMetaBO = new InitUIMetaBO();
            initUIMetaBO.setTenantId(tenantId);
            initUIMetaBO.setDomain("productcenter");
            initUIMetaBO.setcBillNo(UserDefineUtil.needInitBillLiist((Object)paramMap.get("cSelfDefineType"), (Object)tenantId, (Object)1));
            if (!CollectionUtils.isEmpty((Collection)initUIMetaBO.getcBillNo())) {
                YmsExecutors.getYmsExecutor().execute(() -> {
                    try {
                        bathInitUiMetaService.bachInit(initUIMetaBO);
                    }
                    catch (Exception e) {
                        logger.error("\u5c5e\u6027\u540c\u6b65ui\u6a21\u677f\u6570\u636e\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
                    }
                });
            }
        }
    }

    public void updateProItems(UserDefineClass oldUDC, UserDefineClass udc, String billNum, ProductProDao productProDao, BathInitUiMetaService bathInitUiMetaService) throws Exception {
        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        this.getItemParam(oldUDC, udc, paramMap, billNum, productProDao);
        this.updateItems(paramMap, productProDao, bathInitUiMetaService);
    }

    public void getItemParam(UserDefineClass oldUDC, UserDefineClass udc, HashMap<String, Object> paramMap, String billNum, ProductProDao productProDao) throws Exception {
        String tenantId = AppContext.getTenantId().toString();
        if (StringUtils.isEmpty((CharSequence)tenantId) || "0".equals(tenantId)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_TENANT_INFO_ERROR);
        }
        if (!billNum.equals(UserDefClassEnum.PRODUCTSPEC.getBillnum()) && !billNum.equals(UserDefClassEnum.PRODUCTSPEC.getListbillnum())) {
            if (udc.getEntityStatus().equals((Object)EntityStatus.Update) || udc.getEntityStatus().equals((Object)EntityStatus.Insert)) {
                oldUDC = productProDao.selectUserdefClassById((Long)udc.getId());
                Object showItem = null;
                if (udc.containsKey((Object)"showItem")) {
                    showItem = MultilangUtil.getAttr((String)"pc.userdef.UserDefineClass", (String)"showItem", (BizObject)udc, (String)"zh_CN");
                }
                if (showItem != null) {
                    paramMap.put("itemTitle", showItem);
                    paramMap.put("cShowCaption", showItem);
                }
                if (udc.getIsEnabled() != null) {
                    paramMap.put("bHidden", udc.getIsEnabled() == false);
                    paramMap.put("bhiddenn", udc.getIsEnabled() == false);
                    paramMap.put("bShowIt", udc.getIsEnabled());
                    paramMap.put("bCanModify", udc.getIsEnabled());
                }
                if (udc.getType() != null) {
                    String achiveDomain = "";
                    String achiveCode = "pc_userdefref";
                    String achiveReturn = "name";
                    String controltype = productProDao.selectUserdefType(udc.getType());
                    if (udc.getType().equals("String") && (udc.getUserdefMode() == 1 || udc.getUserdefMode() == 2)) {
                        controltype = "Refer";
                    }
                    if ("ReferArchive".equals(udc.getType())) {
                        if ("productcenter".equals(udc.getAchiveDomain())) {
                            achiveCode = udc.getAchiveCode();
                        } else {
                            achiveDomain = udc.getAchiveDomain() + ".";
                            achiveCode = udc.getAchiveCode();
                        }
                        if (udc.getAchiveReturn() != null) {
                            achiveReturn = udc.getAchiveReturn();
                        }
                    } else if ("CustArchive".equals(udc.getType())) {
                        achiveDomain = udc.getAchiveDomain() + ".";
                        achiveCode = udc.getAchiveDefineCode();
                        if (udc.getAchiveReturn() != null) {
                            achiveReturn = udc.getAchiveReturn();
                        }
                    }
                    paramMap.put("type", udc.getType());
                    paramMap.put("cControlType", controltype);
                    paramMap.put("cRefType", achiveDomain + achiveCode);
                    paramMap.put("refReturn", achiveReturn);
                }
                if (udc.getIsSerInput() != null || udc.getIsEnabled() != null) {
                    paramMap.put("bIsNull", udc.getIsSerInput() != null && udc.getIsSerInput() == false || udc.getIsEnabled() != null && udc.getIsEnabled() == false);
                }
                paramMap.put("cSelfDefineType", oldUDC.getDefineId());
            }
            if (udc.getEntityStatus().equals((Object)EntityStatus.Unchanged)) {
                paramMap.put("bHidden", 1);
                paramMap.put("bhiddenn", 1);
                paramMap.put("cSelfDefineType", oldUDC.getDefineId());
                paramMap.put("bIsNull", true);
                paramMap.put("bShowIt", 0);
                paramMap.put("bEnum", "0");
                paramMap.put("eEnumType", null);
            }
            paramMap.put("tenantId", tenantId);
            paramMap.put("length", udc.getLength() != null ? udc.getLength() : oldUDC.getLength());
            paramMap.put("maxInputLen", udc.getMaxInputLen() != null ? udc.getMaxInputLen() : oldUDC.getMaxInputLen());
            paramMap.put("decimalDigits", udc.getDecimalDigits() != null ? udc.getDecimalDigits() : oldUDC.getDecimalDigits());
            paramMap.put("showitem_resid", udc.get("showItemResid"));
        }
    }

    public String buildUpdateItemSql(UserDefineClass udc) {
        String tenantId = AppContext.getTenantId().toString();
        if (StringUtils.isEmpty((CharSequence)tenantId) || "0".equals(tenantId)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_TENANT_INFO_ERROR);
        }
        Object showItem = null;
        if (udc.containsKey((Object)"showItem")) {
            showItem = MultilangUtil.getAttr((String)"pc.userdef.UserDefineClass", (String)"showItem", (BizObject)udc, (String)"zh_CN");
        }
        StringBuilder sql = new StringBuilder();
        sql.append(" update billitem_base set ");
        sql.append(" cShowCaption = '").append(showItem).append("' ");
        if (udc.get("cControlType") != null) {
            sql.append(" , cControlType = '").append(udc.get("cControlType").toString()).append("' ");
        }
        if (udc.getMaxInputLen() != null) {
            sql.append(" , iMaxLength = ").append(udc.getMaxInputLen());
        }
        if ("Archive".equals(udc.getType())) {
            sql.append(" , cRefType = 'productcenter.pb_userdefine' , refReturn = 'name' ");
        } else if ("ReferArchive".equals(udc.getType())) {
            sql.append(" , cRefType = '" + udc.getAchiveDomain() + "." + udc.getAchiveCode() + "' , refReturn = '" + udc.getAchiveReturn() + "' ");
        } else if ("CustArchive".equals(udc.getType())) {
            sql.append(" , cRefType = '" + udc.getAchiveDomain() + "." + udc.getAchiveDefineCode() + "' , refReturn = '" + udc.getAchiveReturn() + "' ");
        } else {
            sql.append(" , cRefType = null, cRefRetId = null, refReturn = null ");
        }
        if (udc.getIsEnabled().booleanValue()) {
            sql.append(" ,bHidden=0,bShowIt=1,isExport=1 ");
        } else {
            sql.append(" ,bHidden=1,bShowIt=0,isExport=0 ");
        }
        if (udc.getDecimalDigits() != null) {
            sql.append(", iNumPoint = ").append(udc.getDecimalDigits());
        }
        if ("Date".equals(udc.getType())) {
            sql.append(" ,cFormatData='YYYY-MM-DD' ");
        } else if ("DateTime".equals(udc.getType())) {
            sql.append(" ,cFormatData='YYYY-MM-DD HH:mm:ss' ");
        } else {
            if ("Integer".equals(udc.getType())) {
                sql.append(" ,INumPoint=0 ");
            }
            sql.append(" ,cFormatData=null ");
        }
        if (udc.getShowItemResid() != null) {
            sql.append(" ,cShowCaption_resid = '").append(udc.getShowItemResid()).append("' ");
        }
        sql.append(" where ");
        sql.append(" cSelfDefineType = '").append(udc.getDefineId()).append("' ");
        sql.append(" and tenant_id = ").append(tenantId);
        sql.append(" and bSelfDefine=1 ; ");
        sql.append(" UPDATE pb_filter_solution_common SET ");
        sql.append(" itemTitle = '").append(showItem).append("' ");
        if (udc.getIsEnabled().booleanValue()) {
            sql.append(" , bHidden=0 ");
        } else {
            sql.append(" ,bHidden=1 ");
        }
        if (udc.get("cControlType") != null) {
            sql.append(" ,itemType= '").append(udc.get("cControlType").toString()).append("' ");
        }
        if ("Archive".equals(udc.getType())) {
            sql.append(" ,refercode = 'productcenter.pb_userdefine'");
        } else if ("ReferArchive".equals(udc.getType())) {
            sql.append(" , refercode = '" + udc.getAchiveDomain() + "." + udc.getAchiveCode() + "' ");
        } else if ("CustArchive".equals(udc.getType())) {
            sql.append(" , refercode = '" + udc.getAchiveDomain() + "." + udc.getAchiveDefineCode() + "' ");
        } else {
            sql.append(" ,refercode = null");
        }
        if (udc.getShowItemResid() != null) {
            sql.append(" ,itemTitle_resid = '").append(udc.getShowItemResid()).append("' ");
        }
        sql.append(" where ");
        sql.append(" defineId = '").append(udc.getDefineId()).append("' ");
        sql.append(" and tenant_id = ").append(tenantId).append(";");
        return sql.toString();
    }

    public String buildUpdateItemSqlByYhtTenantid(UserDefineClass udc) {
        String yhtTenantId = (String)AppContext.getYhtTenantId();
        if (StringUtils.isEmpty((CharSequence)yhtTenantId) || "0".equals(yhtTenantId)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_TENANT_INFO_ERROR);
        }
        Object showItem = null;
        if (udc.containsKey((Object)"showItem")) {
            showItem = MultilangUtil.getAttr((String)"pc.userdef.UserDefineClass", (String)"showItem", (BizObject)udc, (String)"zh_CN");
        }
        StringBuilder sql = new StringBuilder();
        sql.append(" update billitem_base set ");
        sql.append(" cShowCaption = '").append(showItem).append("' ");
        if (udc.get("cControlType") != null) {
            sql.append(" , cControlType = '").append(udc.get("cControlType").toString()).append("' ");
        }
        if (udc.getMaxInputLen() != null) {
            sql.append(" , iMaxLength = ").append(udc.getMaxInputLen());
        }
        if ("Archive".equals(udc.getType())) {
            sql.append(" , cRefType = 'productcenter.pb_userdefine' , refReturn = 'name' ");
        } else if ("ReferArchive".equals(udc.getType())) {
            sql.append(" , cRefType = '" + udc.getAchiveDomain() + "." + udc.getAchiveCode() + "' , refReturn = '" + udc.getAchiveReturn() + "' ");
        } else if ("CustArchive".equals(udc.getType())) {
            sql.append(" , cRefType = '" + udc.getAchiveDomain() + "." + udc.getAchiveDefineCode() + "' , refReturn = '" + udc.getAchiveReturn() + "' ");
        } else {
            sql.append(" , cRefType = null, cRefRetId = null, refReturn = null ");
        }
        if (udc.getIsEnabled().booleanValue()) {
            sql.append(" ,bHidden=0,bShowIt=1,isExport=1 ");
        } else {
            sql.append(" ,bHidden=1,bShowIt=0,isExport=0 ");
        }
        if (udc.getDecimalDigits() != null) {
            sql.append(", iNumPoint = ").append(udc.getDecimalDigits());
        }
        if ("Date".equals(udc.getType())) {
            sql.append(" ,cFormatData='YYYY-MM-DD' ");
        } else if ("DateTime".equals(udc.getType())) {
            sql.append(" ,cFormatData='YYYY-MM-DD HH:mm:ss' ");
        } else {
            if ("Integer".equals(udc.getType())) {
                sql.append(" ,INumPoint=0 ");
            }
            sql.append(" ,cFormatData=null ");
        }
        if (udc.getShowItemResid() != null) {
            sql.append(" ,cShowCaption_resid = '").append(udc.getShowItemResid()).append("' ");
        }
        sql.append(" where ");
        sql.append(" cSelfDefineType = '").append(udc.getDefineId()).append("' ");
        sql.append(" and tenant_id = '").append(yhtTenantId).append("' ");
        sql.append(" and bSelfDefine=1 ; ");
        sql.append(" UPDATE pb_filter_solution_common SET ");
        sql.append(" itemTitle = '").append(showItem).append("' ");
        if (udc.getIsEnabled().booleanValue()) {
            sql.append(" , bHidden=0 ");
        } else {
            sql.append(" ,bHidden=1 ");
        }
        if (udc.get("cControlType") != null) {
            sql.append(" ,itemType= '").append(udc.get("cControlType").toString()).append("' ");
        }
        if ("Archive".equals(udc.getType())) {
            sql.append(" ,refercode = 'productcenter.pb_userdefine'");
        } else if ("ReferArchive".equals(udc.getType())) {
            sql.append(" , refercode = '" + udc.getAchiveDomain() + "." + udc.getAchiveCode() + "' ");
        } else if ("CustArchive".equals(udc.getType())) {
            sql.append(" , refercode = '" + udc.getAchiveDomain() + "." + udc.getAchiveDefineCode() + "' ");
        } else {
            sql.append(" ,refercode = null");
        }
        if (udc.getShowItemResid() != null) {
            sql.append(" ,itemTitle_resid = '").append(udc.getShowItemResid()).append("' ");
        }
        sql.append(" where ");
        sql.append(" defineId = '").append(udc.getDefineId()).append("' ");
        sql.append(" and tenant_id = '").append(yhtTenantId).append("';");
        return sql.toString();
    }

    public List<Map<String, Object>> getDmain(IUPCControlRuleService iupcControlRuleService) throws Exception {
        String ytenantId = (String)AppContext.getYTenantId();
        if (ObjectUtils.isEmpty((Object)ytenantId) || "0".equals(ytenantId)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_TENANT_INFO_ERROR);
        }
        List<Map<String, Object>> userConfigs = this.getUserConfigs("userdef", ytenantId, iupcControlRuleService);
        return userConfigs;
    }

    public List<Map<String, Object>> getRefRetList(String achiveDomain, String refCode, String type) throws Exception {
        List<Map<String, Object>> refRetList = null;
        if ("CustArchive".equals(type)) {
            refRetList = new ArrayList();
            HashMap<String, String> nameMap = new HashMap<String, String>();
            nameMap.put("cName", "name");
            nameMap.put("cShowCaption", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804DB", (String)"\u540d\u79f0"));
            nameMap.put("id", "1");
            HashMap<String, String> codeMap = new HashMap<String, String>();
            codeMap.put("cName", "code");
            codeMap.put("cShowCaption", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804DC", (String)"\u7f16\u7801"));
            nameMap.put("id", "2");
            refRetList.add(nameMap);
            refRetList.add(codeMap);
        } else {
            HashMap<String, String> params = new HashMap<String, String>(4);
            params.put("tenantId", "0");
            if (refCode == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800073);
            }
            params.put("refCode", refCode);
            String sql = "select a.cFieldName, a.cName, a.cShowCaption, a.cShowCaption_resid from billitem_base a " + "inner join bill_base b on a.iBillId=b.id and a.ytenant_id=b.ytenant_id " + "inner join pub_ref c on b.cBillNo=c.cbillnum " + "where b.ytenant_id='0' and c.code='" + refCode + "' and a.bHidden = 0 and a.bShowIt = 1 and a.ytenant_id = '0'";
            params.put("sql", sql);
            if (StringUtils.isEmpty((CharSequence)achiveDomain)) {
                refRetList = SqlHelper.selectList((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
            } else {
                IComQueryApi comQueryApi = (IComQueryApi)IrisDynamicInvokeUtil.getService((String)achiveDomain, (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IComQueryApi.class);
                refRetList = comQueryApi.selectList("com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
                if (refRetList == null || refRetList.size() == 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800074);
                }
            }
            for (Map map : refRetList) {
                String cShowCaption;
                if (null == map.get("cShowCaption_resid") || !StringUtils.isNotEmpty((CharSequence)(cShowCaption = MessageUtils.getMessage((String)map.get("cShowCaption_resid").toString())))) continue;
                map.put("cShowCaption", cShowCaption);
            }
        }
        return refRetList;
    }

    public List<Map<String, Object>> getAchiveRefList(String achiveDomain) throws Exception {
        List refs = null;
        if (null != achiveDomain && !"productcenter".equals(achiveDomain)) {
            String sql = "select id, code, name, domain from pub_ref where id not in (select id from pub_ref where cbillnum not in (select cbillno from bill_base where tenant_id = 0) and datasourcetype = 'meta')";
            HashMap<String, String> params = new HashMap<String, String>();
            params.put("sql", sql);
            IComQueryApi iComQueryApi = (IComQueryApi)IrisDynamicInvokeUtil.getService((String)achiveDomain, (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IComQueryApi.class);
            refs = iComQueryApi.selectList("com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
        } else {
            HashMap<String, Object> paramMap = new HashMap<String, Object>();
            paramMap.put("tenantId", AppContext.getTenantId());
            refs = SqlHelper.selectList((String)"com.yonyoucloud.upc.userdef.dao.UserDefClass.getRefList", paramMap);
        }
        return refs;
    }

    public void deleteUserdefByFK(UserDefineClass udc, ProductProDao productProDao) throws Exception {
        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        if (udc.getEntityStatus() == EntityStatus.Unchanged) {
            paramMap.put("userdefid", udc.getId());
            productProDao.deleteUserdefByFK(paramMap);
        }
        if (udc.getUserdefMode() != null && udc.getUserdefMode() != 1 && udc.getUserdefMode() != 2) {
            paramMap.put("userdefid", udc.getId());
            productProDao.deleteUserdefByFK(paramMap);
        }
    }

    public void dealPagerResult(Map<String, Object> paramMap, List<Map<String, Object>> list) {
        Object aReturn = paramMap.get("return");
        if (aReturn != null) {
            Pager pager = (Pager)aReturn;
            pager.setRecordList(list);
            pager.setRecordCount(list.size());
        }
    }

    public List<Map<String, Object>> getUserConfigs(String configKey, Object ytenantId, IUPCControlRuleService iupcControlRuleService) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("ytenantId", ytenantId);
        map.put("configKey", configKey);
        List userConfigs = SqlHelper.selectList((String)"com.yonyoucloud.upc.userdef.dao.UserDefClass.selectRegistConfigList", map);
        List upcUserConfigs = SqlHelper.selectList((String)"com.yonyoucloud.upc.userdef.dao.UserDefClass.selectUPCRegistConfigList", map);
        userConfigs.addAll(upcUserConfigs);
        List notOpenConfigs = SqlHelper.selectList((String)"com.yonyoucloud.upc.userdef.dao.UserDefClass.selectAuthList", map);
        for (Map notOpenConfig : notOpenConfigs) {
            if (!notOpenConfig.containsKey("appcode") || notOpenConfig.get("appcode") == null || !iupcControlRuleService.checkAppOpen(notOpenConfig.get("appcode").toString()).booleanValue()) continue;
            userConfigs.add(notOpenConfig);
        }
        return userConfigs;
    }

    public String getLockKey(String billnum, String defineId) {
        String yhtTenantId = (String)AppContext.getYhtTenantId();
        if (StringUtils.isEmpty((CharSequence)yhtTenantId) || "0".equals(yhtTenantId)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_TENANT_INFO_ERROR);
        }
        return RedisLockKeyConstants.USERDEF_CONCURRENCY + billnum + RedisLockKeyConstants.CONACTOR + yhtTenantId + RedisLockKeyConstants.CONACTOR + defineId;
    }

    public static void main(String[] args) {
        UserDefineClass udc = new UserDefineClass();
        udc.setType("String");
        udc.setDefineId("free1");
        udc.setShowItem("wwdcs");
        udc.setUserdefMode(Integer.valueOf(1));
        udc.setShowItemResid("pt_34324324324");
        udc.setIsEnabled(Boolean.valueOf(true));
        if ("String".equals(udc.getType()) && 1 == udc.getUserdefMode()) {
            udc.setType("Archive");
        }
        udc.set("cControlType", (Object)"Refer");
        udc.set("tenantId", (Object)"123");
        String s = userdefineUtils.buildUpdateItemSql(udc);
        logger.info(s);
    }
}

