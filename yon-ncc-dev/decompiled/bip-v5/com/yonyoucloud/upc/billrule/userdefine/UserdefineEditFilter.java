/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.bathinit.service.BathInitUiMetaService
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.meta.loader.ViewModelLoader
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.data.productPro.ProductProDao
 *  com.yonyoucloud.upc.pc.userdef.ProductProColumn
 *  com.yonyoucloud.upc.pc.userdef.UserDefClassEnum
 *  com.yonyoucloud.upc.pc.userdef.UserDefClassMapEnum
 *  com.yonyoucloud.upc.pc.userdef.UserDefineClass
 *  com.yonyoucloud.upc.pc.userdef.Userdefine
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.userdefine;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.bathinit.service.BathInitUiMetaService;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.meta.loader.ViewModelLoader;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.upc.billrule.userdefine.UserDefineUretailRule;
import com.yonyoucloud.upc.billrule.userdefine.UserdefineUtils;
import com.yonyoucloud.upc.cache.BizCache;
import com.yonyoucloud.upc.data.productPro.ProductProDao;
import com.yonyoucloud.upc.pc.userdef.ProductProColumn;
import com.yonyoucloud.upc.pc.userdef.UserDefClassEnum;
import com.yonyoucloud.upc.pc.userdef.UserDefClassMapEnum;
import com.yonyoucloud.upc.pc.userdef.UserDefineClass;
import com.yonyoucloud.upc.pc.userdef.Userdefine;
import com.yonyoucloud.upc.service.UserdefineService;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Component(value="userdefineEditFilter")
public class UserdefineEditFilter
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(UserdefineEditFilter.class);
    private static Logger logger = LoggerFactory.getLogger(UserdefineEditFilter.class);
    private static final Integer lockOutTime = 60;
    public static final String LOCKKEY_REQUESTID = "lockKeyRequestId";
    public static final String PRODUCT_REF_CODES = "pc_nomalproductref,pc_productquerytreeref,pc_productskuquerytreeref";
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;
    @Autowired
    private ProductProDao productProDao;
    @Autowired
    private UserDefineUretailRule userDefineUretailRule;
    @Autowired
    private UserdefineService userdefineService;
    @Autowired
    BizCache cache;
    @Autowired
    BathInitUiMetaService bathInitUiMetaService;
    private static final int SPEC_NUM = 10;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        RuleExecuteResult checkResult;
        QuerySchema schema;
        List brandAttr;
        Long tenantId = (Long)AppContext.getCurrentUser().getTenant();
        if (tenantId == null || tenantId == 0L) {
            new RuleExecuteResult(0, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808D6", (String)"\u64cd\u4f5c\u89c4\u683c\u65f6\uff0c\u83b7\u53d6\u79df\u6237\u6570\u636e\u5931\u8d25"));
        }
        List bills = this.getBills(billContext, map);
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        String billNum = billDataDto.getBillnum();
        if (!billNum.equals(UserDefClassEnum.PRODUCTORDER.getBillnum()) && !billNum.equals(UserDefClassEnum.PRODUCTORDER.getListbillnum())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_SPEC_TYPE_AND_MORE_NOT_SUPPORT_NEW_ARCHITECTURE);
        }
        UserDefineClass udc = (UserDefineClass)bills.get(0);
        UserDefineClass oldUDC = null;
        if (udc.getEntityStatus().equals((Object)EntityStatus.Unchanged) || udc.getEntityStatus().equals((Object)EntityStatus.Update)) {
            oldUDC = this.productProDao.selectUserdefClassById((Long)udc.getId());
        }
        if (udc.getIsEnabled() != null) {
            udc.setStopstatus(Boolean.valueOf(udc.getIsEnabled() == false));
        }
        if (EntityStatus.Update.equals((Object)udc.getEntityStatus()) && udc.getId() != null && (brandAttr = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)(schema = QuerySchema.create().addSelect("isEnabled,isWebShow,isWebInput,isSerInput").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(udc.getId())}))))) != null && brandAttr.size() != 0) {
            Map attr = (Map)brandAttr.get(0);
            if (udc.getIsSerInput() == null && attr.get("isSerInput") != null) {
                if (attr.get("isSerInput").toString().equalsIgnoreCase("true") || attr.get("isSerInput").toString().equals("1")) {
                    udc.setIsSerInput(Boolean.valueOf(true));
                } else if (attr.get("isSerInput").toString().equalsIgnoreCase("false") || attr.get("isSerInput").toString().equals("0")) {
                    udc.setIsSerInput(Boolean.valueOf(false));
                }
            }
            if (udc.getIsEnabled() == null && attr.get("isEnabled") != null) {
                if (attr.get("isEnabled").toString().equalsIgnoreCase("true") || attr.get("isEnabled").toString().equals("1")) {
                    udc.setIsEnabled(Boolean.valueOf(true));
                    udc.setStopstatus(Boolean.valueOf(false));
                } else if (attr.get("isEnabled").toString().equalsIgnoreCase("false") || attr.get("isEnabled").toString().equals("0")) {
                    udc.setIsEnabled(Boolean.valueOf(false));
                    udc.setStopstatus(Boolean.valueOf(true));
                }
            } else {
                udc.setStopstatus(Boolean.valueOf(udc.getIsEnabled() == false));
            }
            if (udc.getIsWebInput() == null && attr.get("isWebInput") != null) {
                if (attr.get("isWebInput").toString().equalsIgnoreCase("true") || attr.get("isWebInput").toString().equals("1")) {
                    udc.setIsWebInput(Boolean.valueOf(true));
                } else if (attr.get("isWebInput").toString().equalsIgnoreCase("false") || attr.get("isWebInput").toString().equals("0")) {
                    udc.setIsWebInput(Boolean.valueOf(false));
                }
            }
            if (udc.getIsWebShow() == null && attr.get("isWebShow") != null) {
                if (attr.get("isWebShow").toString().equalsIgnoreCase("true") || attr.get("isWebShow").toString().equals("1")) {
                    udc.setIsWebShow(Boolean.valueOf(true));
                } else if (attr.get("isWebShow").toString().equalsIgnoreCase("false") || attr.get("isWebShow").toString().equals("0")) {
                    udc.setIsWebShow(Boolean.valueOf(false));
                }
            }
        }
        if ((checkResult = this.usderfinCheck(udc)) != null) {
            return checkResult;
        }
        if (EntityStatus.Insert == udc.getEntityStatus()) {
            this.checkData(udc, billNum);
        } else {
            this.setDefaultValue(udc, billNum);
        }
        UserdefineUtils.getInstance().getResId(udc);
        ArrayList<ProductProColumn> productProColumnlist = new ArrayList<ProductProColumn>();
        String classId = "";
        if (billNum.equals(UserDefClassEnum.PRODUCTORDER.getBillnum())) {
            classId = UserDefClassEnum.PRODUCTORDER.getClassIdValue();
            udc.put("classname", (Object)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808C8", (String)"\u7269\u6599\u5c5e\u6027"));
        } else {
            udc.setClassId(classId);
        }
        this.userdefineService.dealFromApiData(udc, billNum);
        RuleExecuteResult rr = this.editDataProductPro(billNum, tenantId, bills, udc, oldUDC, productProColumnlist, classId);
        ViewModelLoader.clearCacheByTenant();
        if (rr != null) {
            return rr;
        }
        if (udc.userdefines() != null && udc.userdefines().size() > 0 && udc.getEntityStatus().equals((Object)EntityStatus.Update)) {
            UserDefineClass utemp = this.productProDao.selectUserdefClassById((Long)udc.getId());
            for (Userdefine ud : udc.userdefines()) {
                ud.setDefineId(utemp.getDefineId());
            }
        }
        this.userdefineService.checkItemIsNull(udc, billNum);
        return new RuleExecuteResult();
    }

    private void setDefaultValue(UserDefineClass udc, String billNum) {
        if (udc.containsKey((Object)"_fromApi") && udc.get("_fromApi").equals(true) && !billNum.equals(UserDefClassEnum.PRODUCTSPEC.getBillnum())) {
            this.checkData(udc, billNum);
        }
    }

    private void checkData(UserDefineClass udc, String billNum) {
        Boolean isEnabled;
        Boolean isWebShow;
        Boolean isWebInput;
        Integer orderNum;
        Integer maxInputLen;
        String achiveCode;
        String showItem = (String)MultilangUtil.getAttr((String)"pc.userdef.UserDefineClass", (String)"showItem", (BizObject)udc, null);
        if (showItem == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800060);
        }
        String userdefAlias = (String)MultilangUtil.getAttr((String)"pc.userdef.UserDefineClass", (String)"userdefAlias", (BizObject)udc, null);
        if (userdefAlias == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800061);
        }
        String type = udc.getType();
        if (type == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800062);
        }
        String types = "Double, String, Integer, Date, Time, DateTime, ReferArchive, CustArchive";
        if (types.indexOf(type) < 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800063);
        }
        if ("String".equals(type)) {
            Integer userdefMode = udc.getUserdefMode();
            if (userdefMode == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800064);
            }
            if (billNum.equals(UserDefClassEnum.PRODUCTORDER.getBillnum()) && userdefMode != 0 && userdefMode != 1 && userdefMode != 2 && userdefMode != 3) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800065);
            }
            if (!billNum.equals(UserDefClassEnum.PRODUCTORDER.getBillnum()) && userdefMode != 0 && userdefMode != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800065);
            }
            if (0 == userdefMode) {
                udc.setUserdefines(null);
            }
        }
        if ("ReferArchive".equals(type) && StringUtils.isNotEmpty((CharSequence)(achiveCode = udc.getAchiveCode())) && PRODUCT_REF_CODES.contains(achiveCode)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800066);
        }
        if ("Double".equals(type) || "String".equals(type) || "Integer".equals(type)) {
            maxInputLen = udc.getMaxInputLen();
            if (maxInputLen == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800067);
            }
            if (maxInputLen > 255) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800068);
            }
        }
        if (!"Double".equals(type)) {
            udc.setDecimalDigits(null);
        }
        if ("Double".equals(type)) {
            Integer decimalDigits = udc.getDecimalDigits();
            if (decimalDigits == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800069);
            }
            Integer maxInputLen2 = udc.getMaxInputLen();
            if (maxInputLen2 == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800067);
            }
            if (maxInputLen2 < decimalDigits + 2) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800070);
            }
            if (maxInputLen2 > 15) {
                udc.setMaxInputLen(Integer.valueOf(15));
            }
        }
        if ("Integer".equals(type)) {
            udc.setDecimalDigits(Integer.valueOf(0));
            maxInputLen = udc.getMaxInputLen();
            if (maxInputLen != null && maxInputLen > 15) {
                udc.setMaxInputLen(Integer.valueOf(15));
            }
        }
        if ((orderNum = udc.getOrderNum()) == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800071);
        }
        Boolean isSerInput = udc.getIsSerInput();
        if (isSerInput == null) {
            udc.setIsSerInput(Boolean.valueOf(false));
        }
        if ((isWebInput = udc.getIsWebInput()) == null) {
            udc.setIsWebInput(Boolean.valueOf(false));
        }
        if ((isWebShow = udc.getIsWebShow()) == null) {
            udc.setIsWebShow(Boolean.valueOf(false));
        }
        if ((isEnabled = udc.getIsEnabled()) == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800072);
        }
    }

    private RuleExecuteResult usderfinCheck(UserDefineClass udc) {
        String achiveCode;
        String type;
        if (udc.userdefines() != null && udc.userdefines().size() > 1) {
            HashSet<String> nameSet = new HashSet<String>();
            HashSet<String> codeSet = new HashSet<String>();
            HashSet<String> erpNameSet = new HashSet<String>();
            for (Userdefine userdefine : udc.userdefines()) {
                Object name = userdefine.get("name");
                if (name != null) {
                    String cname = null;
                    if (name instanceof String) {
                        cname = name.toString();
                    } else if (name instanceof BizObject) {
                        Object zhName = ((BizObject)name).get("zh_CN");
                        cname = zhName.toString();
                    }
                    if (nameSet.contains(cname) && cname != null) {
                        return new RuleExecuteResult(0, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808B1", (String)"\u5c5e\u6027\u503c\u91cd\u590d"));
                    }
                    nameSet.add(cname);
                }
                if (codeSet.contains(userdefine.getCode()) && userdefine.getCode() != null) {
                    return new RuleExecuteResult(0, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808B3", (String)"\u7f16\u7801\u91cd\u590d"));
                }
                codeSet.add(userdefine.getCode());
                if (erpNameSet.contains(userdefine.getErpName()) && userdefine.getErpName() != null) {
                    return new RuleExecuteResult(0, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808B7", (String)"\u5546\u5bb6\u503c\u91cd\u590d"));
                }
                erpNameSet.add(userdefine.getErpName());
            }
        }
        if ("ReferArchive".equals(type = udc.getType()) && StringUtils.isNotEmpty((CharSequence)(achiveCode = udc.getAchiveCode())) && PRODUCT_REF_CODES.contains(achiveCode)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800066);
        }
        return null;
    }

    private RuleExecuteResult editDataProductPro(String billNum, Long tenantId, List<BizObject> bills, UserDefineClass udc, UserDefineClass oldUDC, List<ProductProColumn> productProColumnlist, String classId) throws Exception {
        HashMap<String, Object> paramMap;
        String showItem = (String)MultilangUtil.getAttr((String)"pc.userdef.UserDefineClass", (String)"showItem", (BizObject)udc, null);
        if (EntityStatus.Update == udc.getEntityStatus() && productProColumnlist != null && productProColumnlist.size() > 0 && (udc.getIsEnabled() != null || udc.getShowItem() != null || udc.getType() != null)) {
            paramMap = new HashMap();
            paramMap.put("tenantId", tenantId);
            UserdefineUtils.getInstance().updateProItems(null, udc, billNum, this.productProDao, this.bathInitUiMetaService);
            UserdefineUtils.getInstance().deleteUserdefByFK(udc, this.productProDao);
        }
        if (EntityStatus.Insert == udc.getEntityStatus()) {
            paramMap = new HashMap<String, Object>();
            paramMap.put("tenant_id", tenantId);
            paramMap.put("classId", classId);
            paramMap.put("isDeleted", true);
            paramMap.put("sourcetype", udc.getSourcetype());
            paramMap.put("iorder", "iorder ASC");
            final String requestId = UUID.randomUUID().toString();
            udc.put(LOCKKEY_REQUESTID, (Object)requestId);
            int tryLockNum = 0;
            while (true) {
                if (tryLockNum > 60) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_SYNC_DATA_RETRY_MORE_THAN_120_TIMES);
                }
                ++tryLockNum;
                List userdefClassListASC = this.productProDao.selectUserdefClassByMap(paramMap);
                if (userdefClassListASC == null || userdefClassListASC.size() <= 0) break;
                UserDefineClass utemp = (UserDefineClass)userdefClassListASC.get(0);
                Long id = (Long)utemp.getId();
                final String lockKey = UserdefineUtils.getInstance().getLockKey(billNum, utemp.getDefineId());
                if (RedisTool.tryGetLock((String)lockKey, (String)((String)udc.get(LOCKKEY_REQUESTID)), (int)lockOutTime)) {
                    try {
                        TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

                            public void afterCompletion(int status) {
                                RedisTool.releaseLock((String)lockKey, (String)requestId);
                            }
                        });
                        log.info(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808BE", (String)"\u52a0\u9501\u6210\u529f\uff01lockKey\uff1a{0},requestId:{1},\u5c5e\u6027\u540d\u79f0showItem:{2},\u83b7\u53d6id\uff1a{3}"), lockKey, requestId, showItem, utemp.getId()), new Object[0]);
                        List userdefClassListASCRepeat = this.productProDao.selectUserdefClassByMap(paramMap);
                        if (CollectionUtils.isEmpty((Collection)userdefClassListASCRepeat)) {
                            RedisTool.releaseLock((String)lockKey, (String)((String)udc.get(LOCKKEY_REQUESTID)));
                            TimeUnit.MILLISECONDS.sleep(200L);
                            continue;
                        }
                        UserDefineClass utempRepeat = (UserDefineClass)userdefClassListASC.get(0);
                        if (!utemp.getDefineId().equals(utempRepeat.getDefineId())) {
                            RedisTool.releaseLock((String)lockKey, (String)((String)udc.get(LOCKKEY_REQUESTID)));
                            TimeUnit.MILLISECONDS.sleep(200L);
                            continue;
                        }
                        udc.setId((Object)id);
                        udc.setDefineId(utemp.getDefineId());
                        udc.setIsDeleted(Boolean.valueOf(false));
                        udc.setEntityStatus(EntityStatus.Update);
                        String type = udc.getType();
                        if (billNum.equals(UserDefClassEnum.PRODUCTARCHIVE.getBillnum()) && "CustArchive".equals(type)) {
                            this.inserBillforeignkey(utemp);
                        }
                        if (udc.userdefines() == null || udc.userdefines().size() <= 0) break;
                        for (Userdefine ud : udc.userdefines()) {
                            ud.setUserdefid(id);
                        }
                        break;
                    }
                    catch (Exception e) {
                        RedisTool.releaseLock((String)lockKey, (String)((String)udc.get(LOCKKEY_REQUESTID)));
                        continue;
                    }
                }
                TimeUnit.MILLISECONDS.sleep(200L);
            }
            if (EntityStatus.Insert == udc.getEntityStatus()) {
                String name = "";
                if (billNum.equals(UserDefClassEnum.PRODUCTSPEC.getBillnum())) {
                    name = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808C4", (String)"\u7269\u6599\u89c4\u683c");
                } else if (billNum.equals(UserDefClassEnum.PRODUCTARCHIVE.getBillnum())) {
                    name = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808C8", (String)"\u7269\u6599\u5c5e\u6027");
                } else if (billNum.equals(UserDefClassEnum.PRODUCTSKU.getBillnum())) {
                    name = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808D8", (String)"sku\u5c5e\u6027");
                } else if (billNum.equals(UserDefClassEnum.PRODUCTORDER.getBillnum())) {
                    name = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808DA", (String)"\u8ba2\u5355\u5c5e\u6027");
                } else if (billNum.equals(UserDefClassEnum.PRODUCTBRAND.getBillnum())) {
                    name = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808DC", (String)"\u54c1\u724c\u5c5e\u6027");
                } else if (billNum.equals(UserDefClassEnum.PRODUCTVENDOR.getBillnum())) {
                    name = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808DD", (String)"\u4f9b\u5e94\u5546\u5c5e\u6027");
                } else if (billNum.equals(UserDefClassEnum.AACUSTOMERPRO.getBillnum())) {
                    name = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808DE", (String)"\u5ba2\u6237\u5c5e\u6027");
                }
                return new RuleExecuteResult(0, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808DF", (String)"\u65b0\u589e\u5931\u8d25:") + name + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808E0", (String)"\u6570\u91cf\u8fbe\u5230\u4e0a\u9650\uff01"));
            }
            if (productProColumnlist != null && productProColumnlist.size() > 0) {
                UserdefineUtils.getInstance().updateProItems(null, udc, billNum, this.productProDao, this.bathInitUiMetaService);
                UserdefineUtils.getInstance().deleteUserdefByFK(udc, this.productProDao);
            }
        }
        if (EntityStatus.Unchanged == udc.getEntityStatus()) {
            if (oldUDC != null && !oldUDC.getSourcetype().booleanValue()) {
                paramMap = new HashMap(16);
                udc.setIsDeleted(Boolean.valueOf(true));
                udc.setShowItem("");
                udc.setEntityStatus(EntityStatus.Update);
                udc.setIsEnabled(Boolean.valueOf(false));
                udc.setDecimalDigits(null);
                udc.setUserdefDesc(null);
                udc.setUserdefAlias("");
                udc.setAchiveCode(null);
                udc.setAchiveName(null);
                udc.setAchiveDefineCode(null);
                udc.setAchiveDefineName(null);
                udc.setAchiveDomain(null);
                udc.setAchiveDomainName(null);
                udc.setAchiveReturn(null);
                udc.setAchiveReturnCaption(null);
                MetaDaoHelper.update((String)"pc.userdef.UserDefineClass", bills);
                if (productProColumnlist != null && productProColumnlist.size() > 0) {
                    UserdefineUtils.getInstance().updateProItems(null, udc, billNum, this.productProDao, this.bathInitUiMetaService);
                }
                paramMap.put("userdefid", udc.getId());
                this.productProDao.deleteUserdefByFK(paramMap);
                paramMap.put("defineId", oldUDC.getDefineId());
                paramMap.put("ytenant_id", AppContext.getYTenantId());
                UserDefineClass userDefineClass = (UserDefineClass)SqlHelper.selectOne((String)"com.yonyoucloud.upc.aa.industryinit.getUserDefByDefineId", paramMap);
                if (userDefineClass != null) {
                    userDefineClass.setIsEnabled(Boolean.valueOf(false));
                    this.userDefineUretailRule.updateBillByUserDef(userDefineClass);
                    this.userDefineUretailRule.updateU8cprint(udc, userDefineClass.getDefineId());
                }
                String type = udc.getType();
                if (billNum.equals(UserDefClassEnum.PRODUCTARCHIVE.getBillnum()) && "CustArchive".equals(type)) {
                    this.deleteBillforeignkey(oldUDC);
                }
                RuleExecuteResult rr = new RuleExecuteResult();
                rr.setCancel(true);
                return rr;
            }
            if (oldUDC != null && oldUDC.getSourcetype().booleanValue()) {
                return new RuleExecuteResult(0, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808B6", (String)"\u7cfb\u7edf\u9884\u7f6e\u7981\u6b62\u5220\u9664"));
            }
            return new RuleExecuteResult(0, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808B8", (String)"\u672a\u77e5\u9519\u8bef"));
        }
        return null;
    }

    private void inserBillforeignkey(UserDefineClass oldUDC) throws Exception {
        HashMap<String, Object> billforeignkeyMap = new HashMap<String, Object>();
        billforeignkeyMap.put("billno", "pc_productimport");
        billforeignkeyMap.put("tenantId", AppContext.getTenantId());
        String define = UserDefClassMapEnum.findName((String)oldUDC.getDefineId());
        if (define != null) {
            billforeignkeyMap.put("define", define);
            List billforeignkeyIds = this.productProDao.selectBillforeignkey(billforeignkeyMap);
            if (CollectionUtils.isEmpty((Collection)billforeignkeyIds)) {
                billforeignkeyMap.put("ytenantId", AppContext.getYTenantId());
                billforeignkeyMap.put("id", IdManager.getInstance().nextId());
                billforeignkeyMap.put("entityname", "ProductDefine");
                this.productProDao.inserBillforeignkey(billforeignkeyMap);
            }
        }
    }

    private void deleteBillforeignkey(UserDefineClass oldUDC) throws Exception {
        HashMap<String, Object> billforeignkeyMap = new HashMap<String, Object>();
        billforeignkeyMap.put("billno", "pc_productimport");
        billforeignkeyMap.put("tenantId", AppContext.getTenantId());
        String define = UserDefClassMapEnum.findName((String)oldUDC.getDefineId());
        if (define != null) {
            billforeignkeyMap.put("define", define);
            List billforeignkeyIds = this.productProDao.selectBillforeignkey(billforeignkeyMap);
            if (!CollectionUtils.isEmpty((Collection)billforeignkeyIds)) {
                this.productProDao.deleteBillforeignkey(billforeignkeyMap);
            }
        }
    }
}

