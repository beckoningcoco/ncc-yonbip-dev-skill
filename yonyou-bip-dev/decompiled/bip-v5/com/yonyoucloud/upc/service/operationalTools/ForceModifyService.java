/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.lang.Validator
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.http.YmsHttpClient
 *  com.yonyou.iuap.yms.http.YmsHttpHeader
 *  com.yonyou.iuap.yms.http.YmsHttpMethod
 *  com.yonyou.iuap.yms.http.YmsHttpRequest
 *  com.yonyou.iuap.yms.http.YmsHttpRequestBuilder
 *  com.yonyou.iuap.yms.http.YmsHttpResponse
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.upc.utils.excel.eventmodel.XLSXEventModel
 *  com.yonyou.upc.utils.excel.util.ExcelType
 *  com.yonyou.upc.utils.excel.util.GridExcel
 *  com.yonyoucloud.upc.aa.batchModifField.BatchModifFields
 *  com.yonyoucloud.upc.aa.batchModifField.ModifOperateType
 *  com.yonyoucloud.upc.utils.ExcelFileUtil
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
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.web.multipart.MultipartFile
 */
package com.yonyoucloud.upc.service.operationalTools;

import cn.hutool.core.lang.Validator;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.http.YmsHttpClient;
import com.yonyou.iuap.yms.http.YmsHttpHeader;
import com.yonyou.iuap.yms.http.YmsHttpMethod;
import com.yonyou.iuap.yms.http.YmsHttpRequest;
import com.yonyou.iuap.yms.http.YmsHttpRequestBuilder;
import com.yonyou.iuap.yms.http.YmsHttpResponse;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.upc.utils.excel.eventmodel.XLSXEventModel;
import com.yonyou.upc.utils.excel.util.ExcelType;
import com.yonyou.upc.utils.excel.util.GridExcel;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductUpdateService;
import com.yonyoucloud.iuap.upc.constants.UpcDataFormat;
import com.yonyoucloud.upc.aa.batchModifField.BatchModifFields;
import com.yonyoucloud.upc.aa.batchModifField.ModifOperateType;
import com.yonyoucloud.upc.service.UPCBillService;
import com.yonyoucloud.upc.service.operationalTools.IForceModify;
import com.yonyoucloud.upc.utils.ExcelFileUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
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
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ForceModifyService
implements IForceModify {
    private static final Logger log = LoggerFactory.getLogger(ForceModifyService.class);
    @Autowired
    IUPCProductUpdateService updateService;
    @Autowired
    @Qualifier(value="coredocYmsHttpClient")
    private YmsHttpClient ymsHttpClient;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    @Override
    @Transactional(rollbackFor={Throwable.class})
    public ResultList billBatchModify(MultipartFile file, Map<String, Object> params) throws Exception {
        params.put("batchcode", UpcDataFormat.DATE_FORMAT.format(new Date()));
        UPCBillService upcBillService = new UPCBillService();
        File excelFile = upcBillService.getExcelFile(file);
        List titles = ExcelFileUtil.fetchExcelTitle((File)excelFile, (int)0, (int)3);
        FileInputStream incheck = new FileInputStream(excelFile);
        GridExcel.readByEventModel((InputStream)incheck, Map.class, (ExcelType)ExcelType.XLSX).window(5, ts -> this.modifyHandle(params, (List<Map>)ts)).process(cs -> {
            HashMap<String, Object> map = new HashMap<String, Object>();
            if (Objects.nonNull(cs)) {
                for (int y = 0; y < titles.size(); ++y) {
                    map.put((String)titles.get(y), cs.get(y));
                }
            }
            return map;
        }, 9);
        ((InputStream)incheck).close();
        return new ResultList();
    }

    @Override
    public String checkExcelAndFields(MultipartFile file, Map<String, Object> params) {
        try {
            String yTenantIdStr = String.valueOf(params.get("toYTenantId"));
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenantCenter").eq((Object)yTenantIdStr)});
            QuerySchema querySchema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{condition});
            querySchema.setPartitionable(false);
            Map tenantmap = MetaDaoHelper.queryOne((String)"base.tenant.Tenant", (QuerySchema)querySchema);
            if (Objects.isNull(tenantmap) || tenantmap.size() == 0 || !String.valueOf(tenantmap.get("name")).equals(String.valueOf(params.get("toTenantName")))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801065);
            }
            long tenantId = Long.valueOf(String.valueOf(tenantmap.get("id")));
            params.put("toTenantId", tenantId);
            UPCBillService upcBillService = new UPCBillService();
            File excelFile = upcBillService.getExcelFile(file);
            List titles = ExcelFileUtil.fetchExcelTitle((File)excelFile, (int)0, (int)3);
            FileInputStream incheck = new FileInputStream(excelFile);
            ArrayList<Map> arrayList = new ArrayList<Map>();
            XLSXEventModel xls = new XLSXEventModel((InputStream)incheck, 9, cs -> {
                HashMap<String, Object> map = new HashMap<String, Object>();
                for (int y = 0; y < titles.size(); ++y) {
                    if (!Objects.nonNull(cs)) continue;
                    map.put((String)titles.get(y), cs.get(y));
                }
                if (!(map.containsKey("filter_flag") && Objects.nonNull(map.get("filter_flag")) && "X".equals(String.valueOf(map.get("filter_flag")).trim()))) {
                    arrayList.add(map);
                }
            });
            xls.process();
            if (arrayList.size() > UPCConstants.MAX_COUNT_IMPORT) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801066, new Object[]{UPCConstants.MAX_COUNT_IMPORT});
            }
            this.checkHandle(params, arrayList);
            ((InputStream)incheck).close();
            return null;
        }
        catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public ResultList retryOneRecords(List<String> ids) throws Exception {
        for (String idRecord : ids) {
            HashMap<String, Object> objectObjectMap = new HashMap<String, Object>();
            objectObjectMap.put("fromYTentantId", AppContext.getYTenantId());
            objectObjectMap.put("fromTentantID", AppContext.getCurrentUser().getTenant());
            objectObjectMap.put("userName", AppContext.getCurrentUser().getName());
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)idRecord)});
            QuerySchema querySchema = QuerySchema.create().addSelect("id,modifYtenant,modifStatus,lotNum,productData").appendQueryCondition(new ConditionExpression[]{condition});
            querySchema.setPartitionable(false);
            Map stringObjectMap = MetaDaoHelper.queryOne((String)"pc.batchModifFields.BatchModifFields", (QuerySchema)querySchema);
            if (ModifOperateType.sucess.getName().equals(String.valueOf(stringObjectMap.get("modifStatus")))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801067);
            }
            JSONObject jsonObject = JSONObject.parseObject((String)String.valueOf(stringObjectMap.get("productData")));
            JSONObject jsonToMap = JSONObject.parseObject((String)jsonObject.toJSONString());
            Long recordID = Long.valueOf(String.valueOf(stringObjectMap.get("id")));
            String modifYtenant = String.valueOf(stringObjectMap.get("modifYtenant"));
            objectObjectMap.put("batchcode", String.valueOf(stringObjectMap.get("lotNum")));
            objectObjectMap.put("toolMode", "1");
            RobotExecutors.runAs((String)modifYtenant, () -> this.lambda$retryOneRecords$3(objectObjectMap, (Map)jsonToMap, recordID));
        }
        return null;
    }

    private void checkHandle(Map<String, Object> params, List<Map> ts) throws Exception {
        HashSet<String> productCodes = new HashSet<String>();
        for (Map map : ts) {
            if (map.containsKey("filter_flag") && Objects.nonNull(map.get("filter_flag")) && "X".equals(String.valueOf(map.get("filter_flag")).trim())) continue;
            this.checkOneBill(params, map, productCodes);
        }
    }

    private void checkOneBill(Map<String, Object> params, Map map, HashSet<String> productCodes) throws Exception {
        String ytenantId = String.valueOf(params.get("toYTenantId"));
        String tenantName = String.valueOf(params.get("toTenantName"));
        Integer toolMode = Integer.valueOf(String.valueOf(params.get("toolMode")));
        String productCode = String.valueOf(map.get("productCode"));
        String orgCode = String.valueOf(map.get("orgCode"));
        if (!map.containsKey("modifYtenant") || Objects.isNull(map.get("modifYtenant"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801068, new Object[]{String.valueOf(map.get("productCode"))});
        }
        if (!String.valueOf(map.get("modifYtenant")).equals(ytenantId)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801069, new Object[]{String.valueOf(map.get("productCode"))});
        }
        if (Objects.nonNull(map.get("modifYtenantName")) && !String.valueOf(map.get("modifYtenantName")).equals(tenantName)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801070, new Object[]{String.valueOf(map.get("productCode"))});
        }
        if (Objects.isNull(productCode) || "null".equals(productCode)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801071);
        }
        Map<String, Object> selectMap = this.queryFieldByCode(productCode, orgCode, toolMode);
        if (null == selectMap || !selectMap.containsKey("id")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801072, new Object[]{String.valueOf(map.get("productCode"))});
        }
        if (productCodes.contains(productCode)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801073, new Object[]{String.valueOf(map.get("productCode"))});
        }
        productCodes.add(productCode);
        String checkMessage = this.checkCanModify(map, selectMap, toolMode);
        if (Objects.nonNull(checkMessage)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801074, new Object[]{checkMessage, String.valueOf(map.get("productCode"))});
        }
    }

    private String checkCanModify(Map map, Map<String, Object> selectMap, int toolMode) throws Exception {
        if (Objects.isNull(map)) {
            return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000C5", (String)"\u6821\u9a8c\u6570\u636e\u4e0d\u53ef\u4e3a\u7a7a");
        }
        if (map.containsKey("productName") && Objects.nonNull(map.get("productName")) && selectMap.containsKey("name") && Objects.nonNull(selectMap.get("name")) && !String.valueOf(map.get("productName")).equals(String.valueOf(selectMap.get("name")))) {
            return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_181E96BE05900050", (String)"\u7269\u6599\u540d\u79f0\u586b\u5199\u4e0d\u6b63\u786e\uff01");
        }
        if (map.containsKey("model") && Objects.nonNull(map.get("model")) && selectMap.containsKey("model") && !String.valueOf(map.get("model")).equals(String.valueOf(selectMap.get("model")))) {
            return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_181E96BE05900052", (String)"\u7269\u6599\u578b\u53f7\u586b\u5199\u4e0d\u6b63\u786e\uff01");
        }
        if (map.containsKey("modelDescription") && Objects.nonNull(map.get("modelDescription")) && selectMap.containsKey("modelDescription") && !String.valueOf(map.get("modelDescription")).equals(String.valueOf(selectMap.get("modelDescription")))) {
            return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_181E96BE0590004B", (String)"\u7269\u6599\u89c4\u683c\u8bf4\u660e\u586b\u5199\u4e0d\u6b63\u786e\uff01");
        }
        if (toolMode == 1) {
            if (map.get("orgCode") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801075);
            }
            QuerySchema schema = QuerySchema.create().addSelect("productId,orgId,isApplied").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId.code").eq(map.get("productCode")), QueryCondition.name((String)"orgId.code").eq(map.get("orgCode"))}));
            List productProductApplyRange = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
            if (productProductApplyRange == null || productProductApplyRange.get(0) == null || ((Map)productProductApplyRange.get(0)).get("isApplied") == null || !BooleanUtil.isTrue(((Map)productProductApplyRange.get(0)).get("isApplied"))) {
                return String.format("\u7269\u6599\u7f16\u7801\u3010%s\u3011\u5bf9\u5e94\u7684\u7ec4\u7ec7\u3010%s\u3011\u627e\u4e0d\u5230\u5bf9\u5e94\u7684\u7269\u6599\u8be6\u60c5\u4fe1\u606f\uff0c\u82e5\u6ca1\u6709\u79c1\u6709\u5316\u81ea\u5df1\u7ec4\u7ec7\u7684\u6570\u636e\u8bf7\u5148\u79c1\u6709\u5316\uff0c\u8fd8\u6709\u95ee\u9898\u8bf7\u8054\u7cfb\u5f00\u53d1\u4eba\u5458\u5904\u7406\uff01", map.get("productCode"), map.get("orgCode").toString());
            }
            if (!Objects.nonNull(map.get("isBatchManageAfter")) || !InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000BA", (String)"\u662f").equals(String.valueOf(map.get("isBatchManageAfter")).trim()) || !"0".equals(String.valueOf(selectMap.get("isBatchManage"))) && !"false".equals(String.valueOf(selectMap.get("isBatchManage")))) {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_181E96BE0590004D", (String)"\u53ea\u5141\u8bb8\u4ece\u5426\u6539\u4e3a\u662f\uff0c\u5373\u7cfb\u7edf\u4e2d\u4e3a\u5426\uff0cExcel\u4e2d\u4e3a\u662f\uff0c\u4e0d\u4e00\u81f4\u4e0d\u5141\u8bb8\u5bfc\u5165\uff01");
            }
            if (Objects.nonNull(map.get("isExpiryDateManageAfter")) && (!InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000BA", (String)"\u662f").equals(String.valueOf(map.get("isExpiryDateManageAfter")).trim()) || !"0".equals(String.valueOf(selectMap.get("isExpiryDateManage"))) && !"false".equals(String.valueOf(selectMap.get("isExpiryDateManage"))))) {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_181E96BE0590004E", (String)"\u6709\u6548\u671f\u7ba1\u7406\u4e0d\u4e3a\u7a7a\u65f6\uff0c\u53ea\u5141\u8bb8\u4ece\u5426\u6539\u4e3a\u662f\uff0c\u5373\u7cfb\u7edf\u4e2d\u4e3a\u5426\uff0cExcel\u4e2d\u4e3a\u662f\uff0c\u4e0d\u4e00\u81f4\u4e0d\u5141\u8bb8\u5bfc\u5165\uff01");
            }
            if (Objects.isNull(map.get("isExpiryDateManageAfter")) && ("0".equals(String.valueOf(selectMap.get("isExpiryDateManage"))) || "false".equals(String.valueOf(selectMap.get("isExpiryDateManage")))) && (Objects.nonNull(map.get("isExpiryDateCalculationMethodAfter")) || Objects.nonNull(map.get("expireDateNoAfter")) || Objects.nonNull(map.get("expireDateUnitAfter")) || Objects.nonNull(map.get("daysBeforeValidityRejectAfter")) || Objects.nonNull(map.get("validityWarningDaysAfter")))) {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000C8", (String)"\u6709\u6548\u671f\u7ba1\u7406\u672a\u7531\u5426\u6539\u662f\u65f6\uff0c\u4e0d\u5141\u8bb8\u8f93\u5165\u4fdd\u8d28\u671f\u3001\u4fdd\u8d28\u671f\u5355\u4f4d\u3001\u6709\u6548\u671f\u63a8\u9001\u65b9\u5f0f\u3001\u8fd1\u6548\u671f\u62d2\u6536\u5929\u6570\u3001\u8fd1\u6548\u671f\u9884\u8b66\u5929\u6570\uff01");
            }
            if (Objects.nonNull(map.get("isExpiryDateManageAfter")) && Objects.isNull(map.get("isExpiryDateCalculationMethodAfter"))) {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000C9", (String)"\u6709\u6548\u671f\u7ba1\u7406\u4e3a\u662f\u65f6\uff0c\u6709\u6548\u671f\u63a8\u9001\u65b9\u5f0f\u5fc5\u8f93\uff01");
            }
            if (Objects.nonNull(map.get("isExpiryDateCalculationMethodAfter")) && !InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B3", (String)"\u6309\u65e5").equals(String.valueOf(map.get("isExpiryDateCalculationMethodAfter"))) && !InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B7", (String)"\u6309\u6708").equals(String.valueOf(map.get("isExpiryDateCalculationMethodAfter"))) && !InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B9", (String)"\u4e0d\u63a8\u7b97").equals(String.valueOf(map.get("isExpiryDateCalculationMethodAfter")))) {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000CB", (String)"\u6709\u6548\u671f\u63a8\u7b97\u65b9\u5f0f\u8f93\u5165\u53c2\u6570\u4e0d\u5408\u6cd5\uff0c\u53ea\u5141\u8bb8\u503c\u4e3a\u201c\u6309\u65e5\u201d\u3001\u201c\u6309\u6708\u201d\u3001\u201c\u4e0d\u63a8\u7b97\u201d\u5176\u4e2d\u4e4b\u4e00");
            }
            if (Objects.nonNull(map.get("isExpiryDateManageAfter")) && Objects.isNull(map.get("expireDateNoAfter"))) {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000CC", (String)"\u6709\u6548\u671f\u7ba1\u7406\u4e3a\u662f\u65f6\uff0c\u4fdd\u8d28\u671f\u5fc5\u8f93\uff01");
            }
            if (Objects.nonNull(map.get("expireDateNoAfter")) && !String.valueOf(map.get("expireDateNoAfter")).matches("^[0-9]*$")) {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B0", (String)"\u4fdd\u8d28\u671f\u8f93\u5165\u53c2\u6570\u4e0d\u5408\u6cd5\uff0c\u53ea\u5141\u8bb8\u503c\u4e3a\u6574\u6570");
            }
            if (Objects.nonNull(map.get("isExpiryDateManageAfter")) && Objects.isNull(map.get("expireDateUnitAfter"))) {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B2", (String)"\u6709\u6548\u671f\u7ba1\u7406\u4e3a\u662f\u65f6\uff0c\u4fdd\u8d28\u671f\u5355\u4f4d\u5fc5\u8f93\uff01");
            }
            if (Objects.nonNull(map.get("expireDateUnitAfter")) && !InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B4", (String)"\u5929").equals(String.valueOf(map.get("expireDateUnitAfter"))) && !InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B5", (String)"\u6708").equals(String.valueOf(map.get("expireDateUnitAfter"))) && !InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B6", (String)"\u5e74").equals(String.valueOf(map.get("expireDateUnitAfter")))) {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B8", (String)"\u4fdd\u8d28\u671f\u5355\u4f4d\u8f93\u5165\u53c2\u6570\u4e0d\u5408\u6cd5\uff0c\u53ea\u5141\u8bb8\u503c\u4e3a\u201c\u5929\u201d\u3001\u201c\u6708\u201d\u3001\u201c\u5e74\u201d\u5176\u4e2d\u4e4b\u4e00");
            }
            if (Objects.nonNull(map.get("isExpiryDateManageAfter")) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000BA", (String)"\u662f").equals(String.valueOf(map.get("isExpiryDateManageAfter")).trim())) {
                if (Objects.nonNull(map.get("daysBeforeValidityRejectAfter")) && !String.valueOf(map.get("daysBeforeValidityRejectAfter")).matches("^[0-9]*$")) {
                    return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000BB", (String)"\u8fd1\u6548\u671f\u62d2\u6536\u5929\u6570\u8f93\u5165\u53c2\u6570\u4e0d\u5408\u6cd5\uff0c\u53ea\u5141\u8bb8\u503c\u4e3a\u6574\u6570");
                }
                if (Objects.nonNull(map.get("validityWarningDaysAfter")) && !String.valueOf(map.get("validityWarningDaysAfter")).matches("^[0-9]*$")) {
                    return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000BD", (String)"\u8fd1\u6548\u671f\u9884\u8b66\u5929\u6570\u8f93\u5165\u53c2\u6570\u4e0d\u5408\u6cd5\uff0c\u53ea\u5141\u8bb8\u503c\u4e3a\u6574\u6570");
                }
            } else {
                if (Objects.nonNull(map.get("daysBeforeValidityRejectAfter"))) {
                    return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000BF", (String)"\u6709\u6548\u671f\u7ba1\u7406\u4e3a\u662f\uff0c\u8fd1\u6548\u671f\u62d2\u6536\u5929\u6570\u624d\u53ef\u586b\u5199");
                }
                if (Objects.nonNull(map.get("validityWarningDaysAfter"))) {
                    return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000C1", (String)"\u6709\u6548\u671f\u7ba1\u7406\u4e3a\u662f\uff0c\u8fd1\u6548\u671f\u9884\u8b66\u5929\u6570\u624d\u53ef\u586b\u5199");
                }
            }
        } else if (toolMode == 2) {
            if (map.get("isSerialNoManageAfter") == null) {
                return "\u5e8f\u5217\u53f7\u7ba1\u7406\u4e3a\u7a7a\uff0c\u4e0d\u5141\u8bb8\u5bfc\u5165\uff01";
            }
            if (!Objects.nonNull(map.get("isSerialNoManageAfter")) || !InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000BA", (String)"\u662f").equals(String.valueOf(map.get("isSerialNoManageAfter")).trim()) || !"0".equals(String.valueOf(selectMap.get("isSerialNoManage"))) && !"false".equals(String.valueOf(selectMap.get("isSerialNoManage")))) {
                return "\u5e8f\u5217\u53f7\u7ba1\u7406\u53ea\u5141\u8bb8\u4ece\u5426\u6539\u4e3a\u662f\uff0c\u5373\u7cfb\u7edf\u4e2d\u4e3a\u5426\uff0cExcel\u4e2d\u4e3a\u662f\uff0c\u4e0d\u4e00\u81f4\u4e0d\u5141\u8bb8\u5bfc\u5165\uff01";
            }
        }
        return null;
    }

    private void modifyHandle(Map<String, Object> params, List<Map> ts) {
        try {
            for (Map map : ts) {
                if (map.containsKey("filter_flag") && Objects.nonNull(map.get("filter_flag")) && "X".equals(String.valueOf(map.get("filter_flag")).trim())) continue;
                this.modifyOneBill(params, map, null);
            }
        }
        catch (Exception e) {
            log.error("\u4fee\u6539\u6570\u636e\u65f6\u53d1\u751f\u5f02\u5e38\uff0c\u5177\u4f53\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(e.getMessage());
        }
    }

    private void modifyOneBill(Map<String, Object> params, Map map, Long recordsID) throws Exception {
        final Map<String, Object> selectMap = this.queryFieldByCode(map.get("productCode").toString(), map.get("orgCode").toString(), Integer.valueOf(params.get("toolMode").toString()));
        if (null == selectMap || !selectMap.containsKey("id")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801072, new Object[]{String.valueOf(map.get("productCode"))});
        }
        if (selectMap.get("orgId") != null) {
            map.put("orgId", selectMap.get("orgId"));
        }
        boolean hasData = false;
        String toolMode = params.get("toolMode").toString();
        if ("1".equals(toolMode)) {
            ArrayList idListOn = new ArrayList(){
                {
                    this.add(String.valueOf(selectMap.get("id")));
                }
            };
            ArrayList orgIdListOn = new ArrayList(){
                {
                    this.add(String.valueOf(selectMap.get("orgId")));
                }
            };
            List<Map> maps = this.getonWayProduct(idListOn, orgIdListOn);
            if (Objects.nonNull(maps) && maps.size() != 0) {
                hasData = true;
            }
            this.filterFiled(selectMap, UPCConstants.Tools_For_BatchManage);
            this.filterFiled(map, UPCConstants.Tools_For_BatchManageAfter);
        } else if ("2".equals(toolMode)) {
            this.filterFiled(selectMap, UPCConstants.Tools_For_SerialNoManage);
            this.filterFiled(map, UPCConstants.Tools_For_SerialNoManageAfter);
        }
        if (!hasData) {
            HashMap<String, Object> mapParams = new HashMap<String, Object>();
            mapParams.put("productid", selectMap.get("id"));
            mapParams.put("productApplyRangeId", selectMap.get("productApplyRangeId"));
            mapParams.put("ytenantid", params.get("toYTenantId"));
            if (Objects.nonNull(map.get("isBatchManageAfter")) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000BA", (String)"\u662f").equals(String.valueOf(map.get("isBatchManageAfter")).trim())) {
                mapParams.put("isBatchManage", true);
            }
            if (Objects.nonNull(map.get("isExpiryDateManageAfter")) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000BA", (String)"\u662f").equals(String.valueOf(map.get("isExpiryDateManageAfter")).trim())) {
                mapParams.put("isExpiryDateManage", true);
            }
            if (Objects.nonNull(map.get("isSerialNoManageAfter")) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000BA", (String)"\u662f").equals(String.valueOf(map.get("isSerialNoManageAfter")).trim())) {
                mapParams.put("isSerialNoManage", true);
            }
            if (Objects.nonNull(map.get("isExpiryDateCalculationMethodAfter")) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B3", (String)"\u6309\u65e5").equals(String.valueOf(map.get("isExpiryDateCalculationMethodAfter")).trim())) {
                mapParams.put("isExpiryDateCalculationMethod", 0);
            } else if (Objects.nonNull(map.get("isExpiryDateCalculationMethodAfter")) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B7", (String)"\u6309\u6708").equals(String.valueOf(map.get("isExpiryDateCalculationMethodAfter")).trim())) {
                mapParams.put("isExpiryDateCalculationMethod", 1);
            } else if (Objects.nonNull(map.get("isExpiryDateCalculationMethodAfter")) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B9", (String)"\u4e0d\u63a8\u7b97").equals(String.valueOf(map.get("isExpiryDateCalculationMethodAfter")).trim())) {
                mapParams.put("isExpiryDateCalculationMethod", 2);
            }
            if (Objects.nonNull(map.get("expireDateNoAfter"))) {
                mapParams.put("expireDateNo", Integer.valueOf(String.valueOf(map.get("expireDateNoAfter")).trim()));
            }
            if (Objects.nonNull(map.get("expireDateUnitAfter")) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B6", (String)"\u5e74").equals(String.valueOf(map.get("expireDateUnitAfter")).trim())) {
                mapParams.put("expireDateUnit", 1);
            } else if (Objects.nonNull(map.get("expireDateUnitAfter")) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B5", (String)"\u6708").equals(String.valueOf(map.get("expireDateUnitAfter")).trim())) {
                mapParams.put("expireDateUnit", 2);
            } else if (Objects.nonNull(map.get("expireDateUnitAfter")) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B4", (String)"\u5929").equals(String.valueOf(map.get("expireDateUnitAfter")).trim())) {
                mapParams.put("expireDateUnit", 6);
            }
            if (Objects.nonNull(map.get("daysBeforeValidityRejectAfter"))) {
                mapParams.put("daysBeforeValidityReject", Integer.valueOf(String.valueOf(map.get("daysBeforeValidityRejectAfter")).trim()));
            }
            if (Objects.nonNull(map.get("validityWarningDaysAfter"))) {
                mapParams.put("validityWarningDays", Integer.valueOf(String.valueOf(map.get("validityWarningDaysAfter")).trim()));
            }
            if (mapParams.size() > 2) {
                this.updateService.updateProductField(mapParams);
            }
        }
        params.put("hasData", hasData);
        Runnable run = () -> {
            try {
                this.saveModifRecords(selectMap, map, params, recordsID);
            }
            catch (Exception e) {
                log.error("\u4fdd\u5b58\u4fee\u6539\u8bb0\u5f55\u65f6\u53d1\u751f\u5f02\u5e38\uff0c\u5177\u4f53\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
                throw new CoreDocBusinessException(e.getMessage());
            }
        };
        RobotExecutors.runAs((String)params.get("fromYTentantId").toString(), (Runnable)run);
    }

    private void saveModifRecords(Map<String, Object> selectMapDB, Map mapFromExcel, Map<String, Object> params, Long recordsID) throws Exception {
        BizObject bizObject = new BizObject(mapFromExcel);
        String jsonString = JSON.toJSONString((Object)bizObject);
        BatchModifFields bdf = new BatchModifFields();
        if (BooleanUtil.isTrue((Object)params.get("hasData"))) {
            bdf.setModifStatus("\u4fee\u6539\u5931\u8d25");
            bdf.setReason("\u5b58\u5728\u5728\u9014\u6570\u636e");
        } else {
            Integer enumKey;
            String enumValue;
            bdf.setModifStatus("\u4fee\u6539\u6210\u529f");
            bdf.setReason("");
            if (mapFromExcel.containsKey("isBatchManageAfter") && Objects.nonNull(mapFromExcel.get("isBatchManageAfter"))) {
                bdf.setIsBatchManageAfter(String.valueOf(mapFromExcel.get("isBatchManageAfter")));
                if (InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000BA", (String)"\u662f").equals(String.valueOf(mapFromExcel.get("isBatchManageAfter")))) {
                    bdf.setIsBatchManage("\u5426->\u662f");
                }
            }
            if (mapFromExcel.containsKey("isExpiryDateManageAfter") && Objects.nonNull(mapFromExcel.get("isExpiryDateManageAfter"))) {
                bdf.setIsExpiryDateManageAfter(String.valueOf(mapFromExcel.get("isExpiryDateManageAfter")));
                if (InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000BA", (String)"\u662f").equals(String.valueOf(mapFromExcel.get("isExpiryDateManageAfter")))) {
                    bdf.setIsExpiryDateManage("\u5426->\u662f");
                }
            }
            if (mapFromExcel.containsKey("isSerialNoManageAfter") && Objects.nonNull(mapFromExcel.get("isSerialNoManageAfter"))) {
                bdf.setIsSerialNoManageAfter(String.valueOf(mapFromExcel.get("isSerialNoManageAfter")));
                if (InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000BA", (String)"\u662f").equals(String.valueOf(mapFromExcel.get("isSerialNoManageAfter")))) {
                    bdf.setIsSerialNoManage("\u5426->\u662f");
                }
            }
            if (mapFromExcel.containsKey("isExpiryDateCalculationMethodAfter") && Objects.nonNull(mapFromExcel.get("isExpiryDateCalculationMethodAfter"))) {
                enumValue = String.valueOf(mapFromExcel.get("isExpiryDateCalculationMethodAfter")).trim();
                enumKey = 0;
                if (Validator.isNotNull((Object)enumValue) && (InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B3", (String)"\u6309\u65e5").equals(enumValue.toString()) || "By Day".equals(enumValue.toString()))) {
                    enumKey = 0;
                } else if (Validator.isNotNull((Object)enumValue) && (InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B7", (String)"\u6309\u6708").equals(enumValue.toString()) || "By Month".equals(enumValue.toString()))) {
                    enumKey = 1;
                } else if (Validator.isNotNull((Object)enumValue) && (InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B9", (String)"\u4e0d\u63a8\u7b97").equals(enumValue.toString()) || "No calculation".equals(enumValue.toString()))) {
                    enumKey = 2;
                }
                bdf.setIsExpiryDateCalculationMethodAfter(String.valueOf(enumKey));
                String IsExpiryDateCalculationMethod = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B1", (String)"\u7a7a");
                if (selectMapDB.containsKey("isExpiryDateCalculationMethod")) {
                    if ("0".equals(String.valueOf(selectMapDB.containsKey("isExpiryDateCalculationMethod")))) {
                        IsExpiryDateCalculationMethod = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B3", (String)"\u6309\u65e5");
                    } else if ("1".equals(String.valueOf(selectMapDB.containsKey("isExpiryDateCalculationMethod")))) {
                        IsExpiryDateCalculationMethod = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B7", (String)"\u6309\u6708");
                    } else if ("2".equals(String.valueOf(selectMapDB.containsKey("isExpiryDateCalculationMethod")))) {
                        IsExpiryDateCalculationMethod = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B9", (String)"\u4e0d\u63a8\u7b97");
                    }
                }
                bdf.setIsExpiryDateCalculationMethod(IsExpiryDateCalculationMethod + "->" + String.valueOf(mapFromExcel.get("isExpiryDateCalculationMethodAfter")));
            }
            if (mapFromExcel.containsKey("expireDateNoAfter") && Objects.nonNull(mapFromExcel.get("expireDateNoAfter"))) {
                bdf.setExpireDateNoAfter(Integer.valueOf(String.valueOf(mapFromExcel.get("expireDateNoAfter")).trim()));
                String ExpireDateNo = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B1", (String)"\u7a7a");
                if (selectMapDB.containsKey("expireDateNo")) {
                    ExpireDateNo = String.valueOf(selectMapDB.get("expireDateNo"));
                }
                bdf.setExpireDateNo(ExpireDateNo + "->" + String.valueOf(mapFromExcel.get("expireDateNoAfter")));
            }
            if (mapFromExcel.containsKey("expireDateUnitAfter") && Objects.nonNull(mapFromExcel.get("expireDateUnitAfter"))) {
                enumValue = String.valueOf(mapFromExcel.get("expireDateUnitAfter")).trim();
                enumKey = 0;
                if (Validator.isNotNull((Object)enumValue) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B6", (String)"\u5e74").equals(enumValue.toString())) {
                    enumKey = 1;
                } else if (Validator.isNotNull((Object)enumValue) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B5", (String)"\u6708").equals(enumValue.toString())) {
                    enumKey = 2;
                } else if (Validator.isNotNull((Object)enumValue) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B4", (String)"\u5929").equals(enumValue.toString())) {
                    enumKey = 6;
                }
                bdf.setExpireDateUnitAfter(String.valueOf(enumKey));
                String ExpireDateUnit = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B1", (String)"\u7a7a");
                if (selectMapDB.containsKey("expireDateUnit")) {
                    if ("1".equals(String.valueOf(selectMapDB.containsKey("expireDateUnit")))) {
                        ExpireDateUnit = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B6", (String)"\u5e74");
                    } else if ("2".equals(String.valueOf(selectMapDB.containsKey("expireDateUnit")))) {
                        ExpireDateUnit = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B5", (String)"\u6708");
                    } else if ("6".equals(String.valueOf(selectMapDB.containsKey("expireDateUnit")))) {
                        ExpireDateUnit = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B4", (String)"\u5929");
                    }
                }
                bdf.setExpireDateUnit(ExpireDateUnit + "->" + String.valueOf(mapFromExcel.get("expireDateUnitAfter")));
            }
            if (mapFromExcel.containsKey("daysBeforeValidityRejectAfter") && Objects.nonNull(mapFromExcel.get("daysBeforeValidityRejectAfter"))) {
                bdf.setDaysBeforeValidityRejectAfter(Integer.valueOf(String.valueOf(mapFromExcel.get("daysBeforeValidityRejectAfter")).trim()));
                String daysBeforeValidityRejectAfte = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B1", (String)"\u7a7a");
                if (selectMapDB.containsKey("daysBeforeValidityReject")) {
                    daysBeforeValidityRejectAfte = String.valueOf(selectMapDB.get("daysBeforeValidityReject"));
                }
                bdf.setDaysBeforeValidityReject(daysBeforeValidityRejectAfte + "->" + String.valueOf(mapFromExcel.get("daysBeforeValidityRejectAfter")));
            }
            if (mapFromExcel.containsKey("validityWarningDaysAfter") && Objects.nonNull(mapFromExcel.get("validityWarningDaysAfter"))) {
                bdf.setValidityWarningDaysAfter(Integer.valueOf(String.valueOf(mapFromExcel.get("validityWarningDaysAfter")).trim()));
                String validityWarningDaysAfter = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000B1", (String)"\u7a7a");
                if (selectMapDB.containsKey("validityWarningDays")) {
                    validityWarningDaysAfter = String.valueOf(selectMapDB.get("validityWarningDays"));
                }
                bdf.setValidityWarningDays(validityWarningDaysAfter + "->" + String.valueOf(mapFromExcel.get("validityWarningDaysAfter")));
            }
        }
        Date createDate = new Date();
        bdf.put("modifierId", params.get("userID"));
        bdf.setModifyTime(createDate);
        bdf.setModifyTime(createDate);
        bdf.setModifier(params.get("userName").toString());
        bdf.setTenant(params.get("fromTentantID").toString());
        bdf.setYTenant(params.get("fromYTentantId").toString());
        if (Objects.isNull(recordsID)) {
            bdf.setModifYtenant(params.get("toYTenantId").toString());
            bdf.setLotNum(params.get("batchcode").toString());
            bdf.setProductId(Long.valueOf(Long.parseLong(String.valueOf(selectMapDB.get("id")))));
            bdf.setProductCode(String.valueOf(selectMapDB.get("code")));
            bdf.setProductName(String.valueOf(selectMapDB.get("name")));
            bdf.setOrgId(mapFromExcel.get("orgId") == null ? null : String.valueOf(mapFromExcel.get("orgId")));
            if (selectMapDB.containsKey("model") && selectMapDB.get("model") != null) {
                bdf.setModel(String.valueOf(selectMapDB.get("model")));
            }
            if (selectMapDB.containsKey("modelDescription") && selectMapDB.get("modelDescription") != null) {
                bdf.setModelDescription(String.valueOf(selectMapDB.get("modelDescription")));
            }
            bdf.setProductData(jsonString);
            bdf.setCreator(params.get("userName").toString());
            bdf.put("creatorId", (Object)params.get("userID").toString());
            bdf.setCreateTime(createDate);
            bdf.setCreateDate(createDate);
            bdf.setId((Object)IdManager.getInstance().nextId());
            bdf.setEntityStatus(EntityStatus.Insert);
            MetaDaoHelper.insert((String)"pc.batchModifFields.BatchModifFields", (BizObject)bdf);
        } else {
            bdf.setEntityStatus(EntityStatus.Update);
            bdf.setId((Object)recordsID);
            MetaDaoHelper.update((String)"pc.batchModifFields.BatchModifFields", (BizObject)bdf);
        }
    }

    private Map<String, Object> queryFieldByCode(String productCode, String orgCode, Integer toolMode) throws Exception {
        QueryConditionGroup conditionGroup = new QueryConditionGroup();
        conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)productCode));
        if (1 == toolMode) {
            if (Objects.isNull(orgCode)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801075);
            }
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRangeGroup.orgGroupId.orgGroupDetailList.orgId.code").eq((Object)orgCode));
        } else if (2 == toolMode) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRangeGroup.productDetailId.isCreator").eq((Object)true));
        }
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)productCode), QueryCondition.name((String)"productApplyRangeGroup.orgGroupId.orgGroupDetailList.orgId.code").eq((Object)orgCode)});
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id,code,name,model,modelDescription,productApplyRangeGroup.productDetailId.productApplyRangeId as productApplyRangeId,productApplyRangeGroup.orgGroupId.orgGroupDetailList.orgId as orgId,");
        for (String field : SupportFields) {
            stringBuilder.append("productApplyRangeGroup.productDetailId.");
            stringBuilder.append(field);
            stringBuilder.append("  as  ");
            stringBuilder.append(field);
            stringBuilder.append(",");
        }
        String selectField = stringBuilder.substring(0, stringBuilder.length() - 1).toString();
        QuerySchema querySchema = QuerySchema.create().addSelect(selectField).appendQueryCondition(new ConditionExpression[]{condition});
        return MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)querySchema);
    }

    private void filterFiled(Map needRemoveMap, String[] accordingArray) {
        HashSet<String> accordingSet = new HashSet<String>(Arrays.asList(accordingArray));
        Iterator iterator = needRemoveMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry next = iterator.next();
            Object key = next.getKey();
            if (accordingSet.contains(key) || UPCConstants.Tools_For_Common.contains(key)) continue;
            iterator.remove();
        }
    }

    private List<Map> getonWayProduct(List<String> productIds, List<String> orgIdListOn) {
        ArrayList<Map> arrayList;
        block9: {
            ArrayList<Map> onWayProductDetail = new ArrayList();
            HashMap<String, String> headers = new HashMap<String, String>();
            headers.put("Content-Type", "application/json");
            headers.put("token", InvocationInfoProxy.getYhtAccessToken());
            headers.put("Authorization", "YHT " + InvocationInfoProxy.getYhtAccessToken());
            headers.put("yht_access_token", InvocationInfoProxy.getYhtAccessToken());
            String onWayProductDomainUrl = this.ymsParamConfig.getDomainYonbipScmStock();
            String onWayProductUrl = onWayProductDomainUrl + "/bill/onWayProductsListService";
            HashMap<String, List<String>> params = new HashMap<String, List<String>>();
            params.put("product", productIds);
            params.put("orgId", orgIdListOn);
            YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
            ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
            YmsHttpRequest request = new YmsHttpRequestBuilder().url(onWayProductUrl).method(YmsHttpMethod.POST).body((Object)JSON.toJSONString(params)).addHeader(ymsHttpHeader.addAllMap(headers)).build();
            YmsHttpResponse ymsHttpResponse = this.ymsHttpClient.execute(request);
            try {
                String result = ymsHttpResponse.getBodyString();
                Map map = (Map)JSONObject.parseObject((String)result, Map.class);
                Object status = map.get("code");
                if (status == null || !"200".equals(status.toString())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801076);
                }
                Object data = map.get("data");
                onWayProductDetail = JSONObject.parseArray((String)JSON.toJSONString(data), Map.class);
                arrayList = onWayProductDetail;
                if (ymsHttpResponse == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if (ymsHttpResponse != null) {
                        try {
                            ymsHttpResponse.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception e) {
                    log.error("\u8c03\u7528\u5e93\u5b58\u5728\u9014\u6570\u636e\u6821\u9a8c\u53d1\u751f\u5f02\u5e38" + e.getMessage(), (Throwable)e);
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801077, new Object[]{e.getMessage()});
                }
            }
            ymsHttpResponse.close();
        }
        return arrayList;
    }

    private /* synthetic */ void lambda$retryOneRecords$3(Map objectObjectMap, Map jsonToMap, Long recordID) {
        try {
            this.modifyOneBill(objectObjectMap, jsonToMap, recordID);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

