/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.util.IrisDynamicInvokeUtil
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.api.YmsJdbcApiProvider
 *  com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory
 *  com.yonyou.iuap.yms.param.ResultSetProcessor
 *  com.yonyou.iuap.yms.processor.MapListProcessor
 *  com.yonyou.ucf.mdd.api.interfaces.rpc.IUimetaApi
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.cloud.util.IrisDynamicInvokeUtil;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.api.YmsJdbcApiProvider;
import com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory;
import com.yonyou.iuap.yms.param.ResultSetProcessor;
import com.yonyou.iuap.yms.processor.MapListProcessor;
import com.yonyou.ucf.mdd.api.interfaces.rpc.IUimetaApi;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.service.IProductCharacterUpgradeService;
import com.yonyoucloud.upc.billrule.userdefine.UserdefineClassMapperDefineId;
import com.yonyoucloud.upc.service.LogicDatasourceService;
import com.yonyoucloud.upc.service.api.dto.ArchiveDefPreCheck;
import com.yonyoucloud.upc.service.api.dto.UserDefBaseCount;
import com.yonyoucloud.upc.service.api.dto.UserDefBaseCountDetail;
import com.yonyoucloud.upc.service.api.dto.UserDefBaseDto;
import com.yonyoucloud.upc.service.api.dto.UserDefValueDto;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="productCharacterUpgradeServiceImpl")
public class ProductCharacterUpgradeServiceImpl
implements IProductCharacterUpgradeService {
    private static Logger logger = LoggerFactory.getLogger(ProductCharacterUpgradeServiceImpl.class);
    private static final String CHARACTER_BASEDOC_REPEAT_CHECK = "character.basedoc.repeat.check";
    private static final String UPGRADEMAPPER = "com.yonyoucloud.upc.mapper.product";
    public static final String UCFBASE_CHARACTER_MATERIALPROPCT = "6953cf6d-8f7b-4510-9e8d-ea50d371d4a8";
    public static final String UCFBASE_CHARACTER_SKUPROPCT = "be1edc1d-bd55-4018-af8f-4441829a3264";
    public static final String UCFBASE_CHARACTER_FREECT = "a4ac7dd4-49ae-4848-bd6a-6bc60bd55551";
    public static final String commonFields = "id";
    @Autowired
    private LogicDatasourceService logicDatasourceService;

    @Override
    public void defineDataPreCheck(List<String> ytenantList) throws Exception {
        try {
            if (!CollectionUtils.isEmpty(ytenantList)) {
                for (String ytenant : ytenantList) {
                    try {
                        RobotExecutors.runAs((String)ytenant, () -> {
                            try {
                                this.defineDataPreCheckByTenant(ytenant);
                            }
                            catch (Exception e) {
                                logger.error("\u79df\u6237" + ytenant + "\u81ea\u5b9a\u4e49\u9879\u9884\u68c0\u5f02\u5e38" + LocalDateTime.now() + e.getMessage());
                            }
                        });
                    }
                    catch (Exception ignored) {
                        logger.error("\u79df\u6237" + ytenant + "\u81ea\u5b9a\u4e49\u9879\u9884\u68c0\u5f02\u5e38" + LocalDateTime.now() + ignored.getMessage(), (Throwable)ignored);
                    }
                }
            } else {
                logger.error("\u81ea\u5b9a\u4e49\u9879\u9884\u68c0\u5f02\u5e38\uff0c\u672a\u67e5\u8be2\u5230\u9700\u8981\u5347\u7ea7\u7684\u79df\u6237\u6570\u636e");
            }
        }
        catch (Exception e) {
            logger.error("\u81ea\u5b9a\u4e49\u9879\u9884\u68c0\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
    }

    @Override
    public void defineDataPreCheck(Long beginTenantId, Long endTenantId) throws Exception {
        String quertSql = this.listQueryTenantSQL(beginTenantId, endTenantId);
        YmsJdbcApiProvider ymsJdbcApiProvider = YmsJdbcApiProviderFactory.getYmsJdbcApiProvider();
        Supplier federalYmsJdbcApi = ymsJdbcApiProvider.getFederalYmsJdbcApi("iuap-apdoc-material_main_dataSource");
        List iYmsJdbcApis = (List)federalYmsJdbcApi.get();
        for (IYmsJdbcApi ymsJdbcApi : iYmsJdbcApis) {
            List<Tenant> tenantList = ProductCharacterUpgradeServiceImpl.getTenants(ymsJdbcApi, quertSql);
            if (tenantList == null) continue;
            this.defineDataPreCheckHandle(tenantList);
        }
    }

    private String listQueryTenantSQL(Long beginTenantId, Long endTenantId) {
        String sql = "select id,tenantcenter_id,ytenant_id from tenant where id >=" + beginTenantId + " and id <" + endTenantId;
        return sql;
    }

    @Nullable
    private static List<Tenant> getTenants(IYmsJdbcApi ymsJdbcApi, String quertSql) {
        ArrayList<Tenant> tenantList = null;
        List tenantMapList = ymsJdbcApi.queryForList(quertSql, (ResultSetProcessor)new MapListProcessor());
        if (!CollectionUtils.isEmpty((Collection)tenantMapList)) {
            tenantList = new ArrayList<Tenant>();
            for (Map tenantMap : tenantMapList) {
                Tenant tenant = new Tenant();
                tenant.setId(tenantMap.get(commonFields));
                tenant.setTenantCenter(tenantMap.get("tenantcenter_id") == null ? "" : tenantMap.get("tenantcenter_id").toString());
                tenant.setYTenantId(tenantMap.get("ytenant_id") == null ? "" : tenantMap.get("ytenant_id").toString());
                tenantList.add(tenant);
            }
        }
        return tenantList;
    }

    private void defineDataPreCheckHandle(List<Tenant> tenantList) {
        try {
            if (!CollectionUtils.isEmpty(tenantList)) {
                for (Tenant tenant : tenantList) {
                    try {
                        RobotExecutors.runAs((String)tenant.getYTenantId(), () -> {
                            try {
                                this.defineDataPreCheckByTenant(tenant.getYTenantId());
                            }
                            catch (Exception e) {
                                logger.error("\u79df\u6237" + tenant.getId() + "\u81ea\u5b9a\u4e49\u9879\u9884\u68c0\u5f02\u5e38" + LocalDateTime.now() + e.getMessage());
                            }
                        });
                    }
                    catch (Exception ignored) {
                        logger.error("\u79df\u6237" + tenant.getId() + "\u81ea\u5b9a\u4e49\u9879\u9884\u68c0\u5f02\u5e38" + LocalDateTime.now() + ignored.getMessage(), (Throwable)ignored);
                    }
                }
            } else {
                logger.error("\u81ea\u5b9a\u4e49\u9879\u9884\u68c0\u5f02\u5e38\uff0c\u672a\u67e5\u8be2\u5230\u9700\u8981\u5347\u7ea7\u7684\u79df\u6237\u6570\u636e");
            }
        }
        catch (Exception e) {
            logger.error("\u81ea\u5b9a\u4e49\u9879\u9884\u68c0\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
    }

    @Override
    public Map<String, Object> defineDataPreCheckByTenant(String ytenant) throws Exception {
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        SqlHelper.update((String)"com.yonyoucloud.upc.mapper.product.clearHistoryResult", (Object)ytenant);
        resultMap.put("userDefBaseCount", this.userDefBaseCount(ytenant));
        resultMap.put("userDefBaseCountDetail", this.userDefBaseCountDetail(ytenant));
        resultMap.put("archiveDefDataPreCheck", this.archiveDefDataPreCheck(ytenant));
        resultMap.put("enumDefDataPreCheck", this.enumDefDataPreCheck(ytenant));
        this.writeEffCount(ytenant);
        return resultMap;
    }

    private void writeEffCount(String ytenant) throws Exception {
        List effCountList = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.product.queryEffCount", (Object)ytenant);
        UserDefBaseCount userDefBaseCount = new UserDefBaseCount();
        userDefBaseCount.setYtenant(ytenant);
        userDefBaseCount.setProArchiveEffCount((Integer)effCountList.get(0));
        userDefBaseCount.setProSkuEffCount((Integer)effCountList.get(1));
        userDefBaseCount.setProSpecEffCount((Integer)effCountList.get(2));
        userDefBaseCount.setProBrandEffCount((Integer)effCountList.get(3));
        userDefBaseCount.setProCustEffCount((Integer)effCountList.get(4));
        userDefBaseCount.setVendorEffCount((Integer)effCountList.get(5));
        userDefBaseCount.setErrCount((Integer)effCountList.get(6));
        userDefBaseCount.setCustApplyIncomplCount((Integer)effCountList.get(7));
        userDefBaseCount.setProApplyIncomplCount((Integer)effCountList.get(8));
        SqlHelper.update((String)"com.yonyoucloud.upc.mapper.product.updateUserDefBaseCount", (Object)userDefBaseCount);
    }

    private List<UserDefBaseCount> userDefBaseCount(String ytenant) throws Exception {
        List UDBCountList = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.product.getUDBCountList", (Object)ytenant);
        if (!CollectionUtils.isEmpty((Collection)UDBCountList)) {
            HashMap<String, UserDefBaseCount> udbCountAndYtenant = new HashMap<String, UserDefBaseCount>();
            for (UserDefBaseCountDetail userDefBaseCountDetail : UDBCountList) {
                UserDefBaseCount udbCount;
                if (udbCountAndYtenant.containsKey(ytenant)) {
                    udbCount = (UserDefBaseCount)udbCountAndYtenant.get(ytenant);
                } else {
                    udbCount = new UserDefBaseCount();
                    udbCount.setId(String.valueOf(AppContext.getOid()));
                    udbCount.setYtenant(ytenant);
                }
                udbCount.setClassCount(userDefBaseCountDetail.getClassId(), userDefBaseCountDetail.getCount());
                udbCountAndYtenant.put(ytenant, udbCount);
            }
            ArrayList<UserDefBaseCount> udbCountList = new ArrayList<UserDefBaseCount>(udbCountAndYtenant.values());
            this.saveUDBCount(udbCountList);
            return udbCountList;
        }
        UserDefBaseCount userDefBaseCount = new UserDefBaseCount();
        userDefBaseCount.setId(String.valueOf(AppContext.getOid()));
        userDefBaseCount.setYtenant(ytenant);
        List<UserDefBaseCount> udbCountList = Collections.singletonList(userDefBaseCount);
        this.saveUDBCount(udbCountList);
        return udbCountList;
    }

    private void saveUDBCount(List<UserDefBaseCount> UDBCountList) throws Exception {
        if (!CollectionUtils.isEmpty(UDBCountList)) {
            SqlHelper.update((String)"com.yonyoucloud.upc.mapper.product.saveUDBCount", UDBCountList);
        }
    }

    private List<UserDefBaseCountDetail> userDefBaseCountDetail(String ytenant) throws Exception {
        List UDBCountDetailList = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.product.getUDBCountDetailList", (Object)ytenant);
        if (!CollectionUtils.isEmpty((Collection)UDBCountDetailList)) {
            HashMap<String, UserDefBaseCountDetail> udbCountDetailAndYtenant = new HashMap<String, UserDefBaseCountDetail>();
            for (UserDefBaseCountDetail userDefBaseCountDetail : UDBCountDetailList) {
                UserDefBaseCountDetail udbCountDetail;
                String tenantClassId = ytenant + "_" + userDefBaseCountDetail.getClassId();
                if (udbCountDetailAndYtenant.containsKey(tenantClassId)) {
                    udbCountDetail = (UserDefBaseCountDetail)udbCountDetailAndYtenant.get(tenantClassId);
                } else {
                    udbCountDetail = new UserDefBaseCountDetail();
                    udbCountDetail.setId(String.valueOf(AppContext.getOid()));
                    udbCountDetail.setYtenant(ytenant);
                    udbCountDetail.setClassId(userDefBaseCountDetail.getClassId());
                }
                if ("String".equals(userDefBaseCountDetail.getType()) && 1 == userDefBaseCountDetail.getUserdefModel() || "Archive".equals(userDefBaseCountDetail.getType())) {
                    Integer count = udbCountDetail.getArchiveCount();
                    if (count != null && userDefBaseCountDetail.getCount() != null) {
                        udbCountDetail.setArchiveCount(count + userDefBaseCountDetail.getCount());
                    } else if (count == null) {
                        udbCountDetail.setArchiveCount(userDefBaseCountDetail.getCount());
                    }
                } else {
                    udbCountDetail.setCountByType(userDefBaseCountDetail.getType(), userDefBaseCountDetail.getCount());
                }
                udbCountDetailAndYtenant.put(tenantClassId, udbCountDetail);
            }
            ArrayList<UserDefBaseCountDetail> resultUserDefBaseCountDetailList = new ArrayList<UserDefBaseCountDetail>(udbCountDetailAndYtenant.values());
            this.saveUDBCountDetail(resultUserDefBaseCountDetailList);
            return resultUserDefBaseCountDetailList;
        }
        return null;
    }

    private void saveUDBCountDetail(List<UserDefBaseCountDetail> udbCountList) throws Exception {
        if (!CollectionUtils.isEmpty(udbCountList)) {
            SqlHelper.update((String)"com.yonyoucloud.upc.mapper.product.saveUDBCountDetail", udbCountList);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private List<ArchiveDefPreCheck> enumDefDataPreCheck(String ytenant) throws Exception {
        ArrayList<ArchiveDefPreCheck> archivveDefPreCheckList = new ArrayList<ArchiveDefPreCheck>();
        List userDefBaseDtoList = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.product.getEnumDefList", (Object)ytenant);
        for (UserDefBaseDto userDefBaseDto : userDefBaseDtoList) {
            ArchiveDefPreCheck archivveDefPreCheck = new ArchiveDefPreCheck();
            try {
                List<String> enumValueList = this.getEnumValueList(ytenant, userDefBaseDto);
                List<String> dataList = this.getBusinessData(userDefBaseDto.getClassId(), userDefBaseDto.getDefineId(), Long.valueOf(userDefBaseDto.getId()), ytenant);
                if (!CollectionUtils.isEmpty(dataList) && !CollectionUtils.isEmpty(enumValueList)) {
                    String errMsg = dataList.stream().filter(v -> !enumValueList.contains(v)).collect(Collectors.joining(","));
                    archivveDefPreCheck.setEnumValueLackCheck(errMsg);
                    continue;
                }
                if (CollectionUtils.isEmpty(dataList)) continue;
                archivveDefPreCheck.setEnumValueLackCheck(String.join((CharSequence)",", dataList));
            }
            catch (Exception e) {
                StringBuilder stackTraceBuilder = new StringBuilder();
                stackTraceBuilder.append(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_181E96BE05900036", (String)"\u62a5\u9519\u539f\u56e0\uff1a"));
                stackTraceBuilder.append(e.getMessage());
                stackTraceBuilder.append(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_181E96BE05900031", (String)"\u8be6\u7ec6\u5806\u6808\uff1a"));
                for (StackTraceElement element : e.getStackTrace()) {
                    stackTraceBuilder.append(element.toString());
                    stackTraceBuilder.append("\n");
                }
                archivveDefPreCheck.setErrMsg(stackTraceBuilder.toString());
            }
            finally {
                if (!StringUtils.isNotBlank((CharSequence)archivveDefPreCheck.getEnumValueLackCheck()) && !StringUtils.isNotBlank((CharSequence)archivveDefPreCheck.getErrMsg())) continue;
                archivveDefPreCheck.setId(userDefBaseDto.getId());
                archivveDefPreCheck.setClassId(userDefBaseDto.getClassId());
                archivveDefPreCheck.setDefineId(userDefBaseDto.getDefineId());
                archivveDefPreCheck.setDefineName(userDefBaseDto.getDefineName());
                archivveDefPreCheck.setType(userDefBaseDto.getType());
                archivveDefPreCheck.setYtenant(ytenant);
                archivveDefPreCheckList.add(archivveDefPreCheck);
            }
        }
        this.saveUserDefPreCheckList(archivveDefPreCheckList);
        return archivveDefPreCheckList;
    }

    private List<String> getEnumValueList(String ytenant, UserDefBaseDto userDefBaseDto) {
        HashMap<String, Object> params = new HashMap<String, Object>(2);
        params.put("userdefid", Long.valueOf(userDefBaseDto.getId()));
        params.put("ytenant", ytenant);
        List enumValueList = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.product.getEnumValueList", params);
        if (!CollectionUtils.isEmpty((Collection)enumValueList)) {
            return enumValueList.stream().map(UserDefValueDto::getName).collect(Collectors.toList());
        }
        return new ArrayList<String>();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private List<ArchiveDefPreCheck> archiveDefDataPreCheck(String ytenant) throws Exception {
        ArrayList<ArchiveDefPreCheck> archivveDefPreCheckList = new ArrayList<ArchiveDefPreCheck>();
        List userDefBaseDtoList = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.product.getArchiveDefList", (Object)ytenant);
        for (UserDefBaseDto userDefBaseDto : userDefBaseDtoList) {
            ArchiveDefPreCheck archivveDefPreCheck = new ArchiveDefPreCheck();
            String refEntityUri = null;
            String achiveDomain = userDefBaseDto.getAchiveDomain();
            String achiveRuturn = userDefBaseDto.getAchiveRuturn();
            try {
                archivveDefPreCheck.setFormatCheck(this.checkUserDef(userDefBaseDto));
                List<String> dataList = this.getBusinessData(userDefBaseDto.getClassId(), userDefBaseDto.getDefineId(), Long.valueOf(userDefBaseDto.getId()), ytenant);
                if (CollectionUtils.isEmpty(dataList)) continue;
                refEntityUri = this.getRefEntityUri(userDefBaseDto);
                List<String> checkDataList = this.getCheckDataList(achiveDomain, refEntityUri, achiveRuturn, dataList);
                if (!CollectionUtils.isEmpty(checkDataList)) {
                    String repeatErrMsg = checkDataList.stream().filter(str -> checkDataList.indexOf(str) != checkDataList.lastIndexOf(str)).collect(Collectors.toSet()).stream().collect(Collectors.joining(","));
                    archivveDefPreCheck.setRepeatDataCheck(repeatErrMsg);
                    String lackErrMsg = dataList.stream().filter(v -> !checkDataList.contains(v)).collect(Collectors.joining(","));
                    archivveDefPreCheck.setLackDataCheck(lackErrMsg);
                    continue;
                }
                archivveDefPreCheck.setLackDataCheck(String.join((CharSequence)",", dataList));
            }
            catch (Exception e) {
                StringBuilder stackTraceBuilder = new StringBuilder();
                stackTraceBuilder.append(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_181E96BE05900036", (String)"\u62a5\u9519\u539f\u56e0\uff1a"));
                stackTraceBuilder.append(e.getMessage());
                stackTraceBuilder.append(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_181E96BE05900031", (String)"\u8be6\u7ec6\u5806\u6808\uff1a"));
                for (StackTraceElement element : e.getStackTrace()) {
                    stackTraceBuilder.append(element.toString());
                    stackTraceBuilder.append("\n");
                }
                archivveDefPreCheck.setErrMsg(stackTraceBuilder.toString());
            }
            finally {
                if (!StringUtils.isNotBlank((CharSequence)archivveDefPreCheck.getFormatCheck()) && !StringUtils.isNotBlank((CharSequence)archivveDefPreCheck.getLackDataCheck()) && !StringUtils.isNotBlank((CharSequence)archivveDefPreCheck.getRepeatDataCheck()) && !StringUtils.isNotBlank((CharSequence)archivveDefPreCheck.getErrMsg())) continue;
                archivveDefPreCheck.setId(userDefBaseDto.getId());
                archivveDefPreCheck.setClassId(userDefBaseDto.getClassId());
                archivveDefPreCheck.setDefineId(userDefBaseDto.getDefineId());
                archivveDefPreCheck.setDefineName(userDefBaseDto.getDefineName());
                archivveDefPreCheck.setType(userDefBaseDto.getType());
                archivveDefPreCheck.setAchiveDomain(achiveDomain);
                archivveDefPreCheck.setAchiveCode(userDefBaseDto.getAchiveCode());
                archivveDefPreCheck.setAchiveName(userDefBaseDto.getAchiveName());
                archivveDefPreCheck.setAchiveRuturn(achiveRuturn);
                archivveDefPreCheck.setAchiveEntityUri(refEntityUri);
                archivveDefPreCheck.setYtenant(ytenant);
                archivveDefPreCheckList.add(archivveDefPreCheck);
            }
        }
        this.saveUserDefPreCheckList(archivveDefPreCheckList);
        return archivveDefPreCheckList;
    }

    private void saveUserDefPreCheckList(List<ArchiveDefPreCheck> userDefPreCheckList) throws Exception {
        if (!CollectionUtils.isEmpty(userDefPreCheckList)) {
            SqlHelper.update((String)"com.yonyoucloud.upc.mapper.product.saveUserDefPreCheck", userDefPreCheckList);
        }
    }

    @NotNull
    private List<String> getCheckDataList(String achiveDomain, String refEntityUri, String achiveRuturn, List<String> dataList) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect(new QueryField[]{new QueryField(achiveRuturn, "checkName")}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)achiveRuturn).in(dataList)}));
        schema.addSpecialScense(new String[]{CHARACTER_BASEDOC_REPEAT_CHECK});
        List archiveDataList = MetaDaoHelper.query((String)refEntityUri, (QuerySchema)schema, (String)achiveDomain);
        List<String> checkNameList = archiveDataList.stream().map(v -> v.get("checkName").toString()).collect(Collectors.toList());
        return checkNameList;
    }

    private List<String> getBusinessData(String classId, String defineId, Long userDefId, String ytenant) {
        Map<String, Object> sqlBuildSource = this.getSqlBuildSourceMap(classId, defineId);
        if (sqlBuildSource != null) {
            String sqlTemp = "select %s from %s where ytenant_id = '%s' and %s is not null group by %s";
            Map columnMap = (Map)sqlBuildSource.get("columnMap");
            String columnName = (String)columnMap.get(defineId);
            String tableName = (String)sqlBuildSource.get("table");
            String sql = String.format(sqlTemp, columnName, tableName, ytenant, columnName, columnName);
            return SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.product.getBusinessData", (Object)sql);
        }
        if ("productSpec".equals(classId)) {
            String sqlTemp = "SELECT data \nFROM\n\t(\n\tSELECT\n\t\tfreex1 data \n\tFROM\n\t\tproductsku \n\tWHERE\n\t\tfreeidx1 = %s and freex1 is not null and ytenant_id = '%s' union all\n\tSELECT\n\t\tfreex2 data \n\tFROM\n\t\tproductsku \n\tWHERE\n\t\tfreeidx2 = %s and freex2 is not null and ytenant_id = '%s' union all\n\tSELECT\n\t\tfreex3 data \n\tFROM\n\t\tproductsku \n\tWHERE\n\t\tfreeidx3 = %s and freex3 is not null and ytenant_id = '%s' union all\n\tSELECT\n\t\tfreex4 data \n\tFROM\n\t\tproductsku \n\tWHERE\n\t\tfreeidx4 = %s and freex4 is not null and ytenant_id = '%s' union all\n\tSELECT\n\t\tfreex5 data \n\tFROM\n\t\tproductsku \n\tWHERE\n\t\tfreeidx5 = %s and freex5 is not null and ytenant_id = '%s') t\n\t\t\nGROUP BY\ndata";
            String sql = String.format(sqlTemp, userDefId, ytenant, userDefId, ytenant, userDefId, ytenant, userDefId, ytenant, userDefId, ytenant);
            return SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.product.getBusinessData", (Object)sql);
        }
        return null;
    }

    private String checkUserDef(UserDefBaseDto define) {
        String errorMsg = "";
        if ("CustArchive".equalsIgnoreCase(define.getType()) || "ReferArchive".equalsIgnoreCase(define.getType())) {
            if (StringUtils.isEmpty((CharSequence)define.getAchiveDomain())) {
                errorMsg = errorMsg + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_181E96BE05900033", (String)"\u6863\u6848\u9886\u57df\uff08achiveDomain\uff09\u4e3a\u7a7a\uff1b");
            }
            if (StringUtils.isEmpty((CharSequence)define.getAchiveRuturn())) {
                errorMsg = errorMsg + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_181E96BE05900034", (String)"\u6863\u6848\u8fd4\u56de\u503c\uff08achiveReturn\uff09\u4e3a\u7a7a\uff1b");
            }
            if ("CustArchive".equalsIgnoreCase(define.getType()) && StringUtils.isEmpty((CharSequence)define.getAchiveCode())) {
                errorMsg = errorMsg + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_181E96BE05900035", (String)"\u6863\u6848\u7f16\u7801\uff08achiveDefineCode\uff09\u4e3a\u7a7a\uff1b");
            }
            if ("ReferArchive".equalsIgnoreCase(define.getType()) && StringUtils.isEmpty((CharSequence)define.getAchiveCode())) {
                errorMsg = errorMsg + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_181E96BE05900032", (String)"\u6863\u6848\u7f16\u7801\uff08achiveCode\uff09\u4e3a\u7a7a\uff1b");
            }
        }
        return errorMsg;
    }

    private String getRefEntityUri(UserDefBaseDto userDefBaseDto) throws Exception {
        IUimetaApi uimetaApi = (IUimetaApi)IrisDynamicInvokeUtil.getService((String)userDefBaseDto.getAchiveDomain(), (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IUimetaApi.class);
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("refCode", userDefBaseDto.getAchiveCode());
        RefEntity refEntity = uimetaApi.getRefEntity(params);
        String refEntityUri = "TreeTable".equals(refEntity.getCTpltype()) || "Tree".equals(refEntity.getCTpltype()) ? refEntity.getCDataClass_FullName() : ("bd.basedocdef.CustomerDocVO".equals(refEntity.getCDataGrid_FullName()) ? String.format("bd.customerdoc_%s.%s", userDefBaseDto.getAchiveCode(), userDefBaseDto.getAchiveCode()) : refEntity.getCDataGrid_FullName());
        return refEntityUri;
    }

    private Map<String, Object> getSqlBuildSourceMap(String classId, String defineId) {
        HashMap<String, Object> result = new HashMap<String, Object>();
        if (StringUtils.isBlank((CharSequence)classId)) {
            return null;
        }
        if ("productArchive".equals(classId)) {
            result.put("columnMap", UserdefineClassMapperDefineId.PRODUCT_ARCHIVE);
            result.put("table", "productdefine");
        } else if ("productSku".equals(classId)) {
            result.put("columnMap", UserdefineClassMapperDefineId.PRODUCT_SKU);
            result.put("table", "productskudefine");
        } else if ("productSpec".equals(classId)) {
            if (!UserdefineClassMapperDefineId.PRODUCT_SPEC.containsKey(defineId)) {
                return null;
            }
            result.put("table", "productsku");
            result.put("columnMap", UserdefineClassMapperDefineId.PRODUCT_SPEC);
        } else if ("productcustomer".equals(classId)) {
            result.put("columnMap", UserdefineClassMapperDefineId.PRODUCT_CUSTOMER);
            result.put("table", "customerdefine");
        } else if ("productBrand".equals(classId)) {
            result.put("columnMap", UserdefineClassMapperDefineId.PRODUCT_BRAND);
            result.put("table", "branddefine");
        } else if ("vendor".equals(classId)) {
            result.put("columnMap", UserdefineClassMapperDefineId.VENDOR);
            result.put("table", "aa_vendor_customitem");
        }
        return result;
    }
}

