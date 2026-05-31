/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.busidoc.regioncorp.service.impl.BizDocRegionCorpService
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.ucf.basedoc.model.BasedocVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.yonbip.iuap.xport.common.Action
 *  com.yonyou.yonbip.iuap.xport.common.api.pojo.ExcelActionRequest
 *  com.yonyou.yonbip.iuap.xport.common.model.WorkbookMetaInfo
 *  com.yonyou.yonbip.iuap.xport.export.extension.ExportDataPostProcessingExtension
 *  com.yonyou.yonbip.iuap.xport.mdd.export.web.MddExcelExportActionRequest
 *  com.yonyoucloud.upc.base.businesspartner.RoleClass
 *  com.yonyoucloud.upc.pc.product.SaleChannelEnum
 *  com.yonyoucloud.upc.utils.PartnerConstant
 *  io.vertx.core.impl.ConcurrentHashSet
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Primary
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.common;

import com.yonyou.iuap.apdoc.coredoc.busidoc.regioncorp.service.impl.BizDocRegionCorpService;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.ucf.basedoc.model.BasedocVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.yonbip.iuap.xport.common.Action;
import com.yonyou.yonbip.iuap.xport.common.api.pojo.ExcelActionRequest;
import com.yonyou.yonbip.iuap.xport.common.model.WorkbookMetaInfo;
import com.yonyou.yonbip.iuap.xport.export.extension.ExportDataPostProcessingExtension;
import com.yonyou.yonbip.iuap.xport.mdd.export.web.MddExcelExportActionRequest;
import com.yonyoucloud.upc.base.businesspartner.RoleClass;
import com.yonyoucloud.upc.eventbean.businesspartner.BusinessPartnerRefEventBean;
import com.yonyoucloud.upc.pc.product.SaleChannelEnum;
import com.yonyoucloud.upc.service.ProductClsService;
import com.yonyoucloud.upc.utils.PartnerConstant;
import io.vertx.core.impl.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Primary
public class ExportStreamingDataPostProcessorSelf
implements ExportDataPostProcessingExtension {
    private static final Logger log = LoggerFactory.getLogger(ExportStreamingDataPostProcessorSelf.class);
    @Autowired
    ProductClsService productClsService;
    @Autowired
    private BizDocRegionCorpService regionCorpService;
    @Autowired
    private BusinessPartnerRefEventBean businessPartnerRefEventBean;
    private static Integer DISTINCT_CUSTOMERS_SIZE = 5000;
    private ConcurrentHashSet<Long> distinctCustomers = new ConcurrentHashSet(DISTINCT_CUSTOMERS_SIZE.intValue());

    public boolean accept(ExcelActionRequest exportRequest) {
        return true;
    }

    public List<Map<String, Object>> postProcessing(ExcelActionRequest exportRequest, WorkbookMetaInfo metaInfo, List<Map<String, Object>> data) {
        if ("pc_goodsproductskuprolist".equals(exportRequest.getBillNo())) {
            this.addTagsToSku(data);
            this.dealProductMultipleItem(data);
        } else if ("pc_productlist".equals(exportRequest.getBillNo())) {
            this.addTagsToProductList(data);
            this.dealMultipleItem(data);
        } else if ("aa_salearealist".equals(exportRequest.getBillNo())) {
            data = this.productClsService.sortTree(data);
        } else if ("aa_warehouselist".equals(exportRequest.getBillNo())) {
            this.processWarehouseList(exportRequest, data);
        }
        if ("pc_presentationclasslist".equals(exportRequest.getBillNo())) {
            try {
                this.addProductCount(data);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (this.isBusinessPartnerExport(exportRequest)) {
            return this.dealPartnerRoleClass((MddExcelExportActionRequest)exportRequest, data);
        }
        this.handleMerchantDetailExport(exportRequest, data);
        return data;
    }

    private void handleMerchantDetailExport(ExcelActionRequest exportRequest, List<Map<String, Object>> data) {
        if (Action.ExportDetail == exportRequest.getAction() && "aa_merchantdetail".equals(exportRequest.getBillNo())) {
            for (Map<String, Object> datum : data) {
                if (this.distinctCustomers.contains((Object)((Long)datum.get("id")))) {
                    datum.remove("merchantAddressInfos");
                    datum.remove("merchantContacterInfos");
                    datum.remove("merchantAgentFinancialInfos");
                    datum.remove("merchantAgentInvoiceInfos");
                    continue;
                }
                if (this.distinctCustomers.size() > DISTINCT_CUSTOMERS_SIZE) {
                    this.distinctCustomers.clear();
                }
                this.distinctCustomers.add((Object)((Long)datum.get("id")));
            }
            this.distinctCustomers.clear();
        }
    }

    private void addProductCount(List<Map<String, Object>> data) throws Exception {
        ArrayList ids = new ArrayList();
        data.stream().forEach(record -> ids.add(Long.parseLong(record.get("id").toString())));
        QuerySchema schema = QuerySchema.create().addSelect(new String[]{"count(1) as count", "productClass"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productClass").in(ids)})).addGroupBy("productClass");
        List counts = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        Collections.sort(data, new Comparator<Map<String, Object>>(){

            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                Integer level1 = (Integer)o1.get("level");
                Integer level2 = (Integer)o2.get("level");
                return level2.compareTo(level1);
            }
        });
        data.stream().forEach(m -> {
            Optional<Map> optCount = counts.stream().filter(c -> ((Long)c.get("productClass")).equals((Long)m.get("id"))).findAny();
            m.put("productCount", optCount.isPresent() ? optCount.get().get("count") : Integer.valueOf(0));
        });
        data.stream().forEach(m -> m.put("productCount", this.totalProductCount((Map)m)));
        List sorted = data.stream().sorted((a, b) -> {
            int result = Integer.compare(a.get("order") == null ? 0 : (Integer)a.get("order"), b.get("order") == null ? 0 : (Integer)b.get("order"));
            if (result == 0) {
                result = StringUtils.compare((String)((String)a.get("code")), (String)((String)b.get("code")));
            }
            return result;
        }).collect(Collectors.toList());
        data.clear();
        data.addAll(sorted);
    }

    public long totalProductCount(Map m) {
        long totalCount = Long.parseLong(m.get("productCount").toString());
        if (m.get("children") != null) {
            List chidren = (List)m.get("children");
            for (Map map : chidren) {
                totalCount += this.totalProductCount(map);
            }
        }
        return totalCount;
    }

    private void dealMultipleItem(List<Map<String, Object>> list) {
        if (ObjectUtils.isNotEmpty(list)) {
            for (Map<String, Object> data : list) {
                if (data.get("detail!saleChannel") == null) continue;
                String saleChannel = data.get("detail!saleChannel").toString();
                for (SaleChannelEnum value : SaleChannelEnum.values()) {
                    saleChannel = saleChannel.replaceAll(value.getValue(), value.getName());
                }
                data.put("detail!saleChannel", saleChannel);
            }
        }
    }

    private void dealProductMultipleItem(List<Map<String, Object>> list) {
        if (ObjectUtils.isNotEmpty(list)) {
            for (Map<String, Object> data : list) {
                if (data.get("productId_detail_saleChannel") == null) continue;
                String saleChannel = data.get("productId_detail_saleChannel").toString();
                for (SaleChannelEnum value : SaleChannelEnum.values()) {
                    saleChannel = saleChannel.replaceAll(value.getValue(), value.getName());
                }
                data.put("productId_detail_saleChannel", saleChannel);
            }
        }
    }

    public List<Map<String, Object>> postProcessingSumData(ExcelActionRequest exportRequest, WorkbookMetaInfo metaInfo, List<Map<String, Object>> sumData) {
        return null;
    }

    private void addTagsToProductList(List<Map<String, Object>> list) {
        ArrayList productAndRangeIdList = new ArrayList();
        list.forEach(record -> {
            if (null != record.get("productApplyRangeId")) {
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("productId", record.get("id").toString());
                map.put("productApplyRangeId", record.get("productApplyRangeId").toString());
                map.put("productDetailId", record.get("detail!id").toString());
                productAndRangeIdList.add(map);
            }
        });
        if (!CollectionUtils.isEmpty(productAndRangeIdList)) {
            HashMap<String, Object> queryParam = new HashMap<String, Object>();
            queryParam.put("ytenant", AppContext.getYTenantId());
            queryParam.put("productAndRangeIdList", productAndRangeIdList);
            List tags = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductQuery.getProductTagNew", queryParam);
            Map<String, List<Map>> tagsMap = tags.stream().collect(Collectors.groupingBy(a -> a.get("productId").toString() + a.get("productApplyRangeId").toString()));
            list.stream().forEach(record -> {
                if (null != record.get("id") && null != record.get("productApplyRangeId")) {
                    List productTagNames;
                    String id = record.get("id").toString();
                    String productApplyRangeId = record.get("productApplyRangeId").toString();
                    List tagList = (List)tagsMap.get(id + productApplyRangeId);
                    if (!CollectionUtils.isEmpty((Collection)tagList) && !CollectionUtils.isEmpty(productTagNames = tagList.stream().filter(itemTag -> itemTag.get("tagId_name") != null).map(itemTag -> itemTag.get("tagId_name").toString()).collect(Collectors.toList()))) {
                        record.put("productTag", StringUtils.join(productTagNames, (String)","));
                    }
                }
            });
        }
    }

    private void addTagsToSku(List<Map<String, Object>> list) {
        ArrayList skuAndRangeIdList = new ArrayList();
        list.forEach(record -> {
            if (null != record.get("id") && null != record.get("productApplyRangeId")) {
                HashMap map = new HashMap();
                map.put("skuId", record.get("id"));
                map.put("productApplyRangeId", record.get("productApplyRangeId"));
                skuAndRangeIdList.add(map);
            }
        });
        if (!CollectionUtils.isEmpty(skuAndRangeIdList)) {
            HashMap<String, Object> queryParam = new HashMap<String, Object>();
            queryParam.put("ytenant", AppContext.getYTenantId());
            queryParam.put("skuAndRangeIdList", skuAndRangeIdList);
            List tags = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductQuery.getSKUTagNew", queryParam);
            list.stream().forEach(record -> {
                List skuTagNames;
                List itemTags = tags.stream().filter(tag -> tag.get("skuId").toString().equals(record.get("id").toString()) && tag.get("productApplyRangeId").toString().equals(record.get("productApplyRangeId").toString())).collect(Collectors.toList());
                if (!itemTags.isEmpty() && !(skuTagNames = itemTags.stream().filter(itemTag -> itemTag.get("tagId_name") != null).map(itemTag -> itemTag.get("tagId_name").toString()).collect(Collectors.toList())).isEmpty()) {
                    record.put("skuTag", StringUtils.join(skuTagNames, (String)","));
                }
            });
        }
    }

    private void processWarehouseList(ExcelActionRequest exportRequest, List<Map<String, Object>> list) {
        if (exportRequest.getAction() != null && Action.Export.equals((Object)exportRequest.getAction())) {
            if (list == null || list.size() == 0) {
                return;
            }
            ArrayList<String> waitRegionIdList = new ArrayList<String>();
            for (int i = 0; i < list.size(); ++i) {
                Map<String, Object> warehouse = list.get(i);
                if (warehouse.get("regionCode") == null) continue;
                waitRegionIdList.add(warehouse.get("regionCode").toString());
            }
            Map pathNameMap = this.regionCorpService.buildPathName(waitRegionIdList, ",", BasedocVO::getName);
            for (Map<String, Object> warehouse : list) {
                String pathName = (String)pathNameMap.get(warehouse.get("regionCode") == null ? null : warehouse.get("regionCode").toString());
                if (StringUtils.isBlank((CharSequence)pathName)) continue;
                warehouse.put("regionCode", pathName);
            }
        }
    }

    private boolean isBusinessPartnerExport(@NotNull ExcelActionRequest exportRequest) {
        return Action.Export == exportRequest.getAction() && "base_businesspartnerlist".equals(exportRequest.getBillNo());
    }

    @Nullable
    private List<Map<String, Object>> dealPartnerRoleClass(MddExcelExportActionRequest exportRequest, @NotNull List<Map<String, Object>> data) {
        BillDataDto bill = exportRequest.getBill();
        if (bill != null && bill.getIds() != null) {
            return data;
        }
        String locale = InvocationInfoProxy.getLocale() == null ? "zh_CN" : InvocationInfoProxy.getLocale();
        for (List idBatch : ListSplitUtil.splitListByCapacity(data, (int)500)) {
            List<RoleClass> roleClasses;
            List<String> currentIds = idBatch.stream().map(map -> map.get("id").toString()).collect(Collectors.toList());
            try {
                roleClasses = ExportStreamingDataPostProcessorSelf.getRoleClasses(currentIds, true);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u89d2\u8272\u4fe1\u606f\u6709\u8bef\uff1a", (Object)e.getMessage(), (Object)e);
                return data;
            }
            Map partnerIdToRoleClassNames = roleClasses.stream().collect(Collectors.groupingBy(RoleClass::getPartnerId, Collectors.mapping(roleClass -> roleClass.getRoleClassName().getValue(), Collectors.toList())));
            HashMap partnerIdToMergedRoleClassNames = new HashMap();
            partnerIdToRoleClassNames.forEach((partnerId, roleClassNames) -> {
                String mergedRoleClassNames = roleClassNames.stream().map(roleClassName -> this.businessPartnerRefEventBean.roleClassMultilingualName(locale, (Short)roleClassName)).collect(Collectors.joining(";"));
                partnerIdToMergedRoleClassNames.put(partnerId, mergedRoleClassNames);
            });
            idBatch.stream().forEach(datum -> {
                String partnerId = datum.get("id").toString();
                datum.put("roleClass", partnerIdToMergedRoleClassNames.get(partnerId));
            });
        }
        return data;
    }

    private static List<RoleClass> getRoleClasses(List<String> idBatch, Boolean check) throws Exception {
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)PartnerConstant.PARTNER_ID).in(idBatch));
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"dr").eq((Object)0));
        if (check != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isCheck").eq((Object)check));
        }
        QuerySchema schemaRole = QuerySchema.create().addSelect(PartnerConstant.ROLE_CLASS_NAME_FIELD).addCondition((ConditionExpression)queryConditionGroup);
        return MetaDaoHelper.queryObject((String)"base.businesspartner.RoleClass", (QuerySchema)schemaRole, (String)null);
    }
}

