/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.util.IrisDynamicInvokeUtil
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.api.interfaces.rpc.IComOperateApi
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.pc.userdef.UserDefClassEnum
 *  com.yonyoucloud.upc.pc.userdef.UserDefineClass
 *  com.yonyoucloud.upc.pc.userdef.Userdefine
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.InitializingBean
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.cloud.util.IrisDynamicInvokeUtil;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.api.interfaces.rpc.IComOperateApi;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.billrule.userdefine.UserdefineUtils;
import com.yonyoucloud.upc.pc.userdef.UserDefClassEnum;
import com.yonyoucloud.upc.pc.userdef.UserDefineClass;
import com.yonyoucloud.upc.pc.userdef.Userdefine;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="upc.userdefineService")
public class UserdefineService
implements InitializingBean {
    private static final Logger log = LoggerFactory.getLogger(UserdefineService.class);
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    private ExecutorService fixedThreadPoolExecutor;
    @Autowired
    private YmsThreadPoolConfig4UPC ymsThreadPoolConfig4UPC;

    public List<Map<String, Object>> getDmain() throws Exception {
        List<Map<String, Object>> userConfigs = UserdefineUtils.getInstance().getDmain(this.iupcControlRuleService);
        return userConfigs;
    }

    public List<Map<String, Object>> getAchiveRefList(String achiveDomain) throws Exception {
        List<Map<String, Object>> refs = UserdefineUtils.getInstance().getAchiveRefList(achiveDomain);
        return refs;
    }

    public void syncItemByUserdef(Map data) throws Exception {
        List userDefineClasses;
        Object domain = data.get("domain");
        if (domain == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801512);
        }
        Object billnum = data.get("billnums");
        List billnums = null;
        if (billnum != null) {
            if (billnum instanceof List) {
                billnums = (List)billnum;
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801513);
            }
        }
        Object tenant = data.get("tenants");
        List tenants = null;
        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        if (tenant != null) {
            if (tenant instanceof List) {
                tenants = (List)tenant;
                if (tenants.size() > 0) {
                    paramMap.put("tenants", tenants);
                }
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801514);
            }
        }
        if (!CollectionUtils.isEmpty((Collection)(userDefineClasses = SqlHelper.selectList((String)"com.yonyoucloud.upc.userdef.dao.UserDefClass.getEnabledUserdefByTenantid", paramMap)))) {
            StringBuilder sql = new StringBuilder();
            if (billnums != null && billnums.size() > 0) {
                for (UserDefineClass udc : userDefineClasses) {
                    sql.append(this.buildUpdateItemSql(udc, billnums));
                }
            } else {
                for (UserDefineClass udc : userDefineClasses) {
                    sql.append(UserdefineUtils.getInstance().buildUpdateItemSql(udc));
                }
            }
            paramMap.put("sql", sql.toString());
            log.info(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804A3", (String)"{0}.syncItemByUserdef \u66f4\u65b0{1} sql\uff1a{2}"), this.getClass(), domain.toString(), sql.toString()));
            this.fixedThreadPoolExecutor.execute(() -> {
                try {
                    IComOperateApi comOperateApi = (IComOperateApi)IrisDynamicInvokeUtil.getService((String)"productcenter", (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IComOperateApi.class);
                    comOperateApi.executeSql("com.yonyou.ucf.mdd.ext.meta.dao.update", (Object)paramMap);
                }
                catch (Exception e) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801515, new Object[]{this.getClass(), domain.toString(), e.getMessage()});
                }
            });
        }
    }

    public String buildUpdateItemSql(UserDefineClass udc, List<String> billnums) {
        StringBuilder sql = new StringBuilder();
        Object showItem = null;
        if (udc.containsKey((Object)"showItem")) {
            showItem = MultilangUtil.getAttr((String)"pc.userdef.UserDefineClass", (String)"showItem", (BizObject)udc, (String)"zh_CN");
        }
        for (String billnum : billnums) {
            sql.append(" update billitem_base a inner join bill_base b on a.ibillid = b.id set ");
            sql.append(" a.cShowCaption = '").append(showItem).append("' ");
            if (udc.get(" a.cControlType") != null) {
                sql.append(" , a.cControlType = '").append(udc.get("cControlType").toString()).append("' ");
            }
            if (udc.getMaxInputLen() != null) {
                sql.append(" , a.iMaxLength = ").append(udc.getMaxInputLen());
            }
            if ("Archive".equals(udc.getType())) {
                sql.append(" , a.cRefType = 'productcenter.pb_userdefine' , a.refReturn = 'name' ");
            } else if ("ReferArchive".equals(udc.getType())) {
                sql.append(" , a.cRefType = '" + udc.getAchiveDomain() + "." + udc.getAchiveCode() + "' , a.refReturn = '" + udc.getAchiveReturn() + "' ");
            } else {
                sql.append(" , a.cRefType = null, a.cRefRetId = null, a.refReturn = null ");
            }
            if (udc.getIsEnabled().booleanValue()) {
                sql.append(" ,a.bHidden=0,a.bShowIt=1,a.isExport=1 ");
            } else {
                sql.append(" ,a.bHidden=1,a.bShowIt=0,a.isExport=0 ");
            }
            if (udc.getDecimalDigits() != null) {
                sql.append(", a.iNumPoint = ").append(udc.getDecimalDigits());
            }
            if ("Date".equals(udc.getType())) {
                sql.append(" ,a.cFormatData='YYYY-MM-DD' ");
            } else if ("DateTime".equals(udc.getType())) {
                sql.append(" ,a.cFormatData='YYYY-MM-DD HH:mm:ss' ");
            } else {
                if ("Integer".equals(udc.getType())) {
                    sql.append(" ,a.INumPoint=0 ");
                }
                sql.append(" ,a.cFormatData=null ");
            }
            if (udc.getShowItemResid() != null) {
                sql.append(" ,a.cShowCaption_resid = '").append(udc.getShowItemResid()).append("' ");
            }
            sql.append(" where ");
            sql.append(" a.cSelfDefineType = '").append(udc.getDefineId()).append("' ");
            sql.append(" and a.tenant_id = ").append(udc.getTenant());
            sql.append(" and a.bSelfDefine=1 ");
            sql.append(" and b.cbillno = '").append(billnum).append("'; ");
        }
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
        } else {
            sql.append(" ,refercode = null");
        }
        if (udc.getShowItemResid() != null) {
            sql.append(" ,itemTitle_resid = '").append(udc.getShowItemResid()).append("' ");
        }
        sql.append(" where ");
        sql.append(" defineId = '").append(udc.getDefineId()).append("' ");
        sql.append(" and tenant_id = ").append(udc.getTenant()).append(";");
        return sql.toString();
    }

    public void afterPropertiesSet() throws Exception {
        this.fixedThreadPoolExecutor = this.ymsThreadPoolConfig4UPC.getYmsLongTaskExecutorService();
    }

    public void checkItemIsNull(UserDefineClass udc, String billNum) {
        if (udc == null) {
            return;
        }
        if (udc.containsKey((Object)"_fromApi") && ((Boolean)udc.get("_fromApi")).booleanValue() && (billNum.equals(UserDefClassEnum.PRODUCTSPEC.getBillnum()) || billNum.equals(UserDefClassEnum.PRODUCTSPEC.getListbillnum()))) {
            return;
        }
        if (EntityStatus.Insert.equals((Object)udc.getEntityStatus()) || EntityStatus.Update.equals((Object)udc.getEntityStatus())) {
            if ("CustArchive".equals(udc.getType())) {
                if (udc.getAchiveDomain() == null || udc.getAchiveDomain().length() == 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801516);
                }
                if (udc.getAchiveDefineCode() == null || udc.getAchiveDefineCode().length() == 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801517);
                }
                if (udc.getAchiveReturn() == null || udc.getAchiveReturn().length() == 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801518);
                }
                if (udc.getAchiveReturnCaption() == null || udc.getAchiveReturnCaption().length() == 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801518);
                }
            } else if ("ReferArchive".equals(udc.getType())) {
                if (udc.getAchiveDomain() == null || udc.getAchiveDomain().length() == 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801519);
                }
                if (udc.getAchiveCode() == null || udc.getAchiveCode().length() == 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801520);
                }
                if (udc.getAchiveReturn() == null || udc.getAchiveReturn().length() == 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801521);
                }
                if (udc.getAchiveReturnCaption() == null || udc.getAchiveReturnCaption().length() == 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801521);
                }
            }
        }
    }

    public void dealFromApiData(UserDefineClass udc, String billNum) {
        List userdefines;
        if (udc == null) {
            return;
        }
        if (udc.containsKey((Object)"_fromApi") && BooleanUtil.isTrue((Object)udc.get("_fromApi")) && (billNum.equals(UserDefClassEnum.PRODUCTORDER.getBillnum()) || billNum.equals(UserDefClassEnum.PRODUCTORDER.getListbillnum())) && !CollectionUtils.isEmpty((Collection)(userdefines = udc.userdefines())) && EntityStatus.Insert.equals((Object)udc.getEntityStatus())) {
            for (Userdefine userdefine : userdefines) {
                if (userdefine.getEntityStatus() != null) continue;
                userdefine.setEntityStatus(EntityStatus.Insert);
            }
        }
    }
}

