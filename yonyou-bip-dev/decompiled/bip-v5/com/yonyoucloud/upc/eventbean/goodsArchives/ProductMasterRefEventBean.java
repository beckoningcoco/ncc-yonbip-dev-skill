/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.service.attachment.impl.UPCAttachmentTransService
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.filter.model.FieldEntity
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoCollectDTO
 *  com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoDTO
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.core.lang.BooleanUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.eventbean.goodsArchives;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.service.attachment.impl.UPCAttachmentTransService;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.filter.model.FieldEntity;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyoucloud.iuap.upc.constants.ProductFieldMapping;
import com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoCollectDTO;
import com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoDTO;
import com.yonyoucloud.upc.billrule.cls.ProductClsUtils;
import com.yonyoucloud.upc.service.CoordinatedRefService;
import com.yonyoucloud.upc.service.ManagementClassTreeQueryService;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.base.ConditionOperator;
import org.imeta.core.lang.BooleanUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productMasterRefEventBean")
public class ProductMasterRefEventBean
implements IRefEvent {
    @Autowired
    CooperationFileService cooperationFileService;
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;
    @Autowired
    private ManagementClassTreeQueryService managementClassTreeQueryService;
    @Autowired
    CoordinatedRefService coordinatedRefService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    private UPCAttachmentTransService attachmentTransService;
    private String regex = "^[a-zA-Z\\d,-]*$";

    public void beforeTreeData(RefEntity refEntity, Map<String, Object> refpara) {
        this.managementClassTreeQueryService.managementClassQueryCondition(refEntity, refpara);
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> refpara, Object o) {
        if (null != o && o instanceof List) {
            ProductClsUtils.getInstance().sortTree((List)o, "managementClass_Code");
        }
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> refpara) {
        FilterVO gridFilter = (FilterVO)refpara.get("condition");
        boolean isOrgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        } else {
            this.orgPermissionsUtil.ignoreOrgId(gridFilter, isOrgGlobalShare);
            if (refEntity.getCode().contains("productref")) {
                this.buildCondition(refEntity, gridFilter);
            }
        }
        LoginUser currentUser = AppContext.getCurrentUser();
        if (null == currentUser) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_NO_LOGIN);
        }
        JSONObject extMap = null;
        String extendCondition = (String)refpara.get("extendCondition");
        if (!StringUtils.isEmpty((CharSequence)extendCondition)) {
            extMap = JSON.parseObject((String)extendCondition);
        }
        if (!(extMap != null && BooleanUtils.b(extMap.get("filterByMasterOrgFlag")) || isOrgGlobalShare)) {
            List<String> orgIds = this.dealFilterOrgs(refEntity.getCode(), refpara);
            if (refEntity.getCode().contains("productref")) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productApplyRangeGroup.orgGroupId.orgGroupDetailList.orgId", "in", orgIds)});
            } else {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productApplyRange.orgId", "in", orgIds)});
            }
        }
        if (extMap != null && BooleanUtils.b(extMap.get("managementTransferFlag"))) {
            SimpleFilterVO simpleFilterVO = new SimpleFilterVO();
            FieldEntity fieldEntity = new FieldEntity("orgId");
            simpleFilterVO.setValue1((Object)fieldEntity);
            simpleFilterVO.setField("productApplyRangeGroup.orgGroupId.orgGroupDetailList.orgId");
            simpleFilterVO.setOp("eq");
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{simpleFilterVO});
        }
        refpara.put("condition", gridFilter);
    }

    private void buildCondition(RefEntity refEntity, FilterVO gridFilter) {
        SimpleFilterVO[] simpleFilterVO;
        String refCode;
        String string = refCode = refEntity.getCode().contains("productcenter") ? refEntity.getCode() : "productcenter." + refEntity.getCode();
        if (gridFilter.getQueryConditionGroup() != null && !gridFilter.getQueryConditionGroup().conditions().isEmpty()) {
            QueryConditionGroup queryConditionGroup = gridFilter.getQueryConditionGroup();
            int recurrenceNo = 1;
            this.queryConditionGroupChangeModel(refEntity, queryConditionGroup, refCode, recurrenceNo);
        }
        if ((simpleFilterVO = gridFilter.getSimpleVOs()) != null && simpleFilterVO.length != 0) {
            for (int i = 0; i < simpleFilterVO.length; ++i) {
                List SimpleFilterVOs = simpleFilterVO[i].getConditions();
                if (null != SimpleFilterVOs && !SimpleFilterVOs.isEmpty()) {
                    int recurrenceNo = 1;
                    this.querySimpleVOsChangeModel(SimpleFilterVOs, refCode, recurrenceNo);
                }
                if (simpleFilterVO[i].getField() == null) continue;
                this.replaceSimpleFilter(refCode, simpleFilterVO[i]);
            }
        }
    }

    private List<String> dealFilterOrgs(String refCode, Map<String, Object> refpara) {
        JSONObject extMap = null;
        String extendCondition = (String)refpara.get("extendCondition");
        if (!StringUtils.isEmpty((CharSequence)extendCondition)) {
            extMap = JSON.parseObject((String)extendCondition);
        }
        Object masterOrgValue = refpara.get("masterOrgValue");
        boolean useAuthOrgFlag = extMap != null && BooleanUtils.b(extMap.get("useAuthOrg")) && Objects.nonNull(masterOrgValue);
        List<String> masterOrgList = new ArrayList<String>();
        if (masterOrgValue != null && !masterOrgValue.toString().trim().isEmpty()) {
            String masterOrgs = masterOrgValue.toString();
            if (!masterOrgs.matches(this.regex)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_REFER_QUERY_MATER_ORG_ERROR);
            }
            if (masterOrgs.contains(",")) {
                masterOrgList = Arrays.asList(masterOrgs.split(","));
            } else {
                masterOrgList.add(masterOrgs);
            }
        }
        ArrayList<String> orgPermissionList = new ArrayList<String>();
        if (!useAuthOrgFlag) {
            if (refCode.contains("productref")) {
                List<String> result = this.orgPermissionsUtil.getOrgPermissionsNew(false);
                orgPermissionList.addAll(result);
            } else {
                Set<String> result = this.orgPermissionsUtil.getOrgPermissions("pc_product");
                orgPermissionList.addAll(result);
            }
        }
        return this.orgPermissionsUtil.filterCommonOrgIds(orgPermissionList, masterOrgList);
    }

    private void queryConditionGroupChangeModel(RefEntity refEntity, QueryConditionGroup queryConditionGroup, String refCode, int recurrenceNo) {
        List conditionGropList = queryConditionGroup.conditions();
        for (ConditionExpression condition : conditionGropList) {
            if (condition instanceof QueryCondition) {
                QueryCondition queryCondition = (QueryCondition)condition;
                if (condition == null || condition.toString() == null || queryCondition.field() == null || ProductFieldMapping.COORDINATED_REFCODES.get(refCode) != null && StringUtils.isEmpty((CharSequence)ProductFieldMapping.COORDINATED_REFCODES.get(refCode).get(queryCondition.field()))) continue;
                queryCondition.rename(ProductFieldMapping.COORDINATED_REFCODES.get(refCode).get(queryCondition.field()));
                continue;
            }
            if (!(condition instanceof QueryConditionGroup)) continue;
            if (recurrenceNo > UPCConstants.MAX_RECURRENCE_NO) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_REFER_QUERY_ERROR);
            }
            int innerCurrenceNo = recurrenceNo + 1;
            this.queryConditionGroupChangeModel(refEntity, (QueryConditionGroup)condition, refCode, innerCurrenceNo);
        }
    }

    private void querySimpleVOsChangeModel(List<SimpleFilterVO> SimpleFilterVOs, String refCode, int recurrenceNo) {
        for (SimpleFilterVO simpleFilter : SimpleFilterVOs) {
            if (null != simpleFilter.getConditions() && !simpleFilter.getConditions().isEmpty()) {
                if (recurrenceNo > UPCConstants.MAX_RECURRENCE_NO) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_REFER_QUERY_ERROR);
                }
                int innerCurrenceNo = recurrenceNo + 1;
                this.querySimpleVOsChangeModel(simpleFilter.getConditions(), refCode, innerCurrenceNo);
            }
            if (simpleFilter.getField() == null) continue;
            this.replaceSimpleFilter(refCode, simpleFilter);
        }
    }

    private void replaceSimpleFilter(String refCode, SimpleFilterVO simpleFilterVO) {
        if (ProductFieldMapping.COORDINATED_REFCODES.get(refCode) == null || !StringUtils.isEmpty((CharSequence)ProductFieldMapping.COORDINATED_REFCODES.get(refCode).get(simpleFilterVO.getField()))) {
            simpleFilterVO.setField(ProductFieldMapping.COORDINATED_REFCODES.get(refCode).get(simpleFilterVO.getField()));
        }
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
        boolean isCoordinated;
        Object extenalData = refpara.get("externalData");
        boolean isFilter = null != extenalData && "filter".equalsIgnoreCase(extenalData.toString());
        String masterOrgValue = refpara.get("masterOrgValue") != null ? refpara.get("masterOrgValue").toString() : "";
        JSONObject extMap = null;
        String extendCondition = (String)refpara.get("extendCondition");
        if (!StringUtils.isEmpty((CharSequence)extendCondition)) {
            extMap = JSON.parseObject((String)extendCondition);
        }
        boolean bl = isCoordinated = extMap != null && BooleanUtils.b(extMap.get("filterByMasterOrgFlag"));
        if (null != result && result instanceof Pager) {
            List productList = ((Pager)result).getRecordList();
            ArrayList<String> productIds = new ArrayList<String>();
            HashMap<String, Map> productsMap = new HashMap<String, Map>();
            if (!CollectionUtils.isEmpty((Collection)productList)) {
                for (Map data : productList) {
                    Iterator<Map<String, Object>> res = "";
                    if (data.get("name") != null) {
                        res = (String)((Object)res) + data.get("name").toString();
                    }
                    if (data.get("modelDescription") != null) {
                        res = (String)((Object)res) + "  " + data.get("modelDescription").toString();
                    }
                    data.put("productInfo", res);
                    data.remove("url");
                    if (null == data.get("id")) continue;
                    productIds.add(data.get("id").toString());
                    productsMap.put(data.get("id").toString(), data);
                }
                if (!isCoordinated) {
                    List<Map<String, Object>> productRefQueryList;
                    List<AttachmentInfoCollectDTO> attachmentInfoCollectDTOList = this.coordinatedRefService.getBtachProductUrl(productIds);
                    if (!CollectionUtils.isEmpty(attachmentInfoCollectDTOList)) {
                        Map<String, List<AttachmentInfoCollectDTO>> productHomepageMaps = attachmentInfoCollectDTOList.stream().collect(Collectors.groupingBy(AttachmentInfoCollectDTO::getBusinessId));
                        for (Map data : productList) {
                            List<AttachmentInfoCollectDTO> attachmentInfo;
                            if (CollectionUtils.isEmpty((Collection)productHomepageMaps.get(data.get("id").toString())) || CollectionUtils.isEmpty((Collection)(attachmentInfo = productHomepageMaps.get(data.get("id").toString())).get(0).getAttachmentInfoDTOList())) continue;
                            List attachmentInfoDTOS = attachmentInfo.get(0).getAttachmentInfoDTOList();
                            data.put("url", ((AttachmentInfoDTO)attachmentInfoDTOS.get(0)).getDownloadUrl());
                        }
                    }
                    if (!CollectionUtils.isEmpty((Collection)productList) && refEntity.getCode().contains("productref") && !CollectionUtils.isEmpty(productRefQueryList = this.coordinatedRefService.getproductRefDetail(productIds, null, null))) {
                        for (Map<String, Object> detailMap : productRefQueryList) {
                            String productId = detailMap.get("id").toString();
                            Map product = (Map)productsMap.get(productId);
                            if (null == product) continue;
                            product.put("orgId", detailMap.get("orgId"));
                            product.put("transType", detailMap.get("transType"));
                        }
                    }
                    if (!CollectionUtils.isEmpty((Collection)productList) && refEntity.getCode().contains("productref") && isFilter) {
                        List<Map<String, Object>> productRefQueryList2;
                        List<QueryField> queryFieldList = new ArrayList();
                        if (null != InvocationInfoProxy.getExtendAttribute((String)"originSelectFields")) {
                            queryFieldList = (List)InvocationInfoProxy.getExtendAttribute((String)"originSelectFields");
                        }
                        List<Object> extendFieldList = new ArrayList();
                        if (null != queryFieldList) {
                            extendFieldList = queryFieldList.stream().filter(Objects::nonNull).filter(f -> null != f.alias() && f.alias().contains("_userDefine_")).map(QueryField::alias).collect(Collectors.toList());
                        }
                        if (!CollectionUtils.isEmpty(productRefQueryList2 = this.coordinatedRefService.getproductRefDetail(productIds, masterOrgValue, queryFieldList))) {
                            for (Map<String, Object> detailMap : productRefQueryList2) {
                                String productId = detailMap.get("id").toString();
                                Map product = (Map)productsMap.get(productId);
                                if (null == product) continue;
                                product.put("detail!shortName", detailMap.get("detail!shortName"));
                                product.put("detail!mnemonicCode", detailMap.get("detail!mnemonicCode"));
                                if (null == extendFieldList) continue;
                                extendFieldList.forEach(alias -> {
                                    Object value = detailMap.get(alias);
                                    if (value != null) {
                                        product.put(alias, value);
                                    }
                                });
                            }
                        }
                    }
                }
            }
        }
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object result) {
    }
}

